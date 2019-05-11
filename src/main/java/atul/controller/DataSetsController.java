package atul.controller;

import atul.entity.DataSetsEntity;
import atul.misc.FindAllGenerics;
import atul.model.Response;
import atul.service.DataSetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/dataSets")
public class DataSetsController {

    private static final Logger dataSetsLog = Logger.getLogger("DataSetsController");

    private final static FindAllGenerics findAllGenericsInst = new FindAllGenerics();

    @Autowired
    private DataSetsService dataSetsService;

    @GetMapping("/findAllDataSets")
    public ResponseEntity<Response<List<DataSetsEntity>>> getAllDataSets() throws Exception {
        dataSetsLog.info("Inside fetching all data sets");
        List<DataSetsEntity> allDataSets = dataSetsService.getAllDataSets();
        dataSetsLog.info(findAllGenericsInst.getObjectPrinting(allDataSets));
        if (null != allDataSets) {
            dataSetsLog.info("Fetched all Data Sets");
            return findAllGenericsInst.findAllResponseEntity(allDataSets);
        } else
            throw new Exception("Null Value Expected");
    }
}
