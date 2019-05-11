package atul.repo;

import atul.entity.CompaniesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompaniesRepo extends MongoRepository<CompaniesEntity, String> {
}
