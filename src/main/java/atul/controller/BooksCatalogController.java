package atul.controller;


import atul.entity.BooksCatalogEntity;
import atul.misc.FindAllGenerics;
import atul.model.Response;
import atul.service.BooksCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/booksCatalog")
public class BooksCatalogController {

    private static final Logger booksCatalogLog = Logger.getLogger("BooksCatalogController");
    private final static FindAllGenerics findAllGenericsInst = new FindAllGenerics();
    @Autowired
    private BooksCatalogService booksCatalogService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<Response<List<BooksCatalogEntity>>> getAllBookList() throws Exception {
        booksCatalogLog.info("Inside fetching books catalog");
        List<BooksCatalogEntity> allBooks = booksCatalogService.getAllBooks();
        booksCatalogLog.info(findAllGenericsInst.getObjectPrinting(allBooks));
        if (null != allBooks) {
            return findAllGenericsInst.findAllResponseEntity(allBooks);
        } else
            throw new Exception("Null Value Expected");
    }

    @PostMapping("/getBookById/{userParam}")
    public ResponseEntity<Response<BooksCatalogEntity>> getAnalysisData(@PathVariable String userParam) throws Exception {
        booksCatalogLog.info("Inside By Id format");
        BooksCatalogEntity bookByParam = booksCatalogService.getBookByParam((int) Double.parseDouble(userParam));
        booksCatalogLog.info(findAllGenericsInst.getObjectPrinting(bookByParam));
        if (null != bookByParam) {
            return findAllGenericsInst.findAllResponseEntity(bookByParam);
        } else
            throw new Exception("Error in fetching book with mentioned param");
    }

}
