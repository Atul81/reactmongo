package atul.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Document(collection = "booksCatalog")
public class BooksCatalogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer _id;

    @Override
    public String toString() {
        return "BooksCatalogEntity{" +
                "_id=" + _id +
                ", authorList=" + authorList +
                ", categoryList=" + categoryList +
                ", isbn='" + isbn + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", pageCount=" + pageCount +
                ", publishedDate=" + publishedDate +
                ", shortDescription='" + shortDescription + '\'' +
                ", status='" + status + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Field("authors")
    private List authorList;

    @Field("categories")
    private List categoryList;

    @Indexed
    @Field("isbn")
    private String isbn;

    @Field("longDescription")
    private String longDescription;

    @Field("pageCount")
    private Integer pageCount;

    @Field("publishedDate")
    private Object publishedDate;

    @Field("shortDescription")
    private String shortDescription;

    @Field("status")
    private String status;

    @Field("thumbnailUrl")
    private String thumbnailUrl;

    @Field("title")
    private String title;

    public BooksCatalogEntity(Integer _id, List authorList, List categoryList, String isbn, String longDescription, Integer pageCount, Object publishedDate, String shortDescription, String status, String thumbnailUrl, String title) {
        this._id = _id;
        this.authorList = authorList;
        this.categoryList = categoryList;
        this.isbn = isbn;
        this.longDescription = longDescription;
        this.pageCount = pageCount;
        this.publishedDate = publishedDate;
        this.shortDescription = shortDescription;
        this.status = status;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public List getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List authorList) {
        this.authorList = authorList;
    }

    public List getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List categoryList) {
        this.categoryList = categoryList;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Object getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Object publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
