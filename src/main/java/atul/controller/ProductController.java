package atul.controller;

import atul.entity.ProductEntity;
import atul.misc.FindAllGenerics;
import atul.model.Response;
import atul.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private static final Logger productLog = Logger.getLogger("ProductController");

    private final static FindAllGenerics findAllGenericsInst = new FindAllGenerics();

    @Autowired
    private ProductService productService;

    @GetMapping("/findAllProducts")
    public ResponseEntity<Response<List<ProductEntity>>> getAllBookList() throws Exception {
        productLog.info("Inside fetching all products detail");
        List<ProductEntity> allProducts = productService.getAllProducts();
        productLog.info(findAllGenericsInst.getObjectPrinting(allProducts));
        if (null != allProducts) {
            productLog.info("Fetched all Products");
            return findAllGenericsInst.findAllResponseEntity(allProducts);
        } else
            throw new Exception("Null Value Expected");
    }
}
