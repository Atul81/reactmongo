package atul.controller;

import atul.entity.TradeEntity;
import atul.misc.FindAllGenerics;
import atul.model.Response;
import atul.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/trade")
public class TradeController {

    private static final Logger tradeLog = Logger.getLogger("TradeController");

    private final static FindAllGenerics findAllGenericsInst = new FindAllGenerics();

    @Autowired
    private TradeService tradeService;

    @GetMapping("/findAllTrades")
    public ResponseEntity<Response<List<TradeEntity>>> getAllTradingList() throws Exception {
        tradeLog.info("Inside fetching all trades and Share Market");
        List<TradeEntity> tradeEntityList = tradeService.getAllTradeData();
        // tradeLog.info(findAllGenericsInst.getObjectPrinting(tradeEntityList));
        if (null != tradeEntityList) {
            tradeLog.info("Fetched all trades and Share");
            return findAllGenericsInst.findAllResponseEntity(tradeEntityList);
        } else
            throw new Exception("Null Value Expected");
    }

    @PostMapping("/newTradeInit")
    public ResponseEntity<Response<List<TradeEntity>>> insertNewTrade(@Valid @RequestBody TradeEntity tradeEntity) throws Exception {
        tradeLog.config("Entering new trade insertion");
        if (tradeService.newTradeInsertion(tradeEntity)) {
            tradeLog.info("Insertion Successful");
            return getAllTradingList();
        } else
            throw new Exception("Insertion was unsuccessful");
    }

    @DeleteMapping("/deleteTradingSequence/{tradeId}")
    public ResponseEntity<Response<List<TradeEntity>>> deleteExistingTrade(@PathVariable @NotNull String tradeId) throws Exception {
        tradeLog.info("Inside deleting the trade");
        if(tradeService.deleteOneTrade(tradeId)) {
            tradeLog.info("Deletion of " + tradeId + " is successful");
            return getAllTradingList();
        } else
            throw new Exception("Deletion of " + tradeId + " is failed");
    }
}
