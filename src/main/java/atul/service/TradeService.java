package atul.service;

import atul.entity.TradeEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface TradeService {

    List<TradeEntity> getAllTradeData() throws Exception;

    Boolean newTradeInsertion(TradeEntity tradeEntity) throws Exception;

    Boolean deleteOneTrade(String tradeId) throws Exception;
}
