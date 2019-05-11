package atul.service;

import atul.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getAllProducts() throws Exception;
}
