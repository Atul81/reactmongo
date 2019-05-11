package atul.service;

import atul.entity.BooksCatalogEntity;
import org.bson.types.ObjectId;

import java.util.List;

public interface BooksCatalogService {

    List<BooksCatalogEntity> getAllBooks() throws Exception;

    BooksCatalogEntity getBookByParam(Integer param) throws Exception;
}
