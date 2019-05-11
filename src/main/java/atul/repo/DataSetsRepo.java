package atul.repo;

import atul.entity.DataSetsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataSetsRepo extends MongoRepository<DataSetsEntity, String> {
}
