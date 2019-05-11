package atul.repo;

import atul.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<ProductEntity, String> {
}
