package atul.repo;

import atul.entity.BooksCatalogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksCatalogRepo extends MongoRepository<BooksCatalogEntity, Integer> {
}
