package atul.service.serviceImpl;


import atul.entity.BooksCatalogEntity;
import atul.repo.BooksCatalogRepo;
import atul.service.BooksCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class BooksCatalogServiceImpl implements BooksCatalogService {

    private static final Logger booksCatalogServiceLog = Logger.getLogger("BooksCatalogServiceImpl");

    @Autowired
    private BooksCatalogRepo booksCatalogRepo;

    @Override
    public List<BooksCatalogEntity> getAllBooks() throws Exception {
        List<BooksCatalogEntity> booksCatalogAll = booksCatalogRepo.findAll();
        if (!booksCatalogAll.isEmpty())
            return booksCatalogAll;
        else
            throw new Exception("Books Catalog is Empty");
    }

    @Override
    public BooksCatalogEntity getBookByParam(Integer param) throws Exception {
        Optional<BooksCatalogEntity> getByParam = booksCatalogRepo.findById(param);
        booksCatalogServiceLog.info(getByParam.toString());
        if (getByParam.isPresent()) {
            return getByParam.get();
        } else
            throw new Exception("No Book with " + param + " such search criterion exists");
    }
}
