package atul.repo;

import atul.entity.TradeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradeRepo extends MongoRepository<TradeEntity, String> {
}
