package atul.service.serviceImpl;

import atul.entity.ProductEntity;
import atul.repo.ProductRepo;
import atul.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() throws Exception {
        List<ProductEntity> allProducts = productRepo.findAll();
        if (!allProducts.isEmpty())
            return allProducts;
        else
            throw new Exception("Books Catalog is Empty");
    }
}
