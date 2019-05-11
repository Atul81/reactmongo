package atul.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Document(collection = "product")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "ProductEntity{" +
                "_id='" + _id + '\'' +
                ", additionalTariifs=" + additionalTariifs +
                ", forDocument=" + forDocument +
                ", isAvailable=" + isAvailable +
                ", brandType='" + brandType + '\'' +
                ", pageCount=" + pageCount +
                ", cancelPenalty=" + cancelPenalty +
                ", color='" + color + '\'' +
                ", limits=" + limits +
                ", monthlyPrice=" + monthlyPrice +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", salesTax=" + salesTax +
                ", termYears=" + termYears +
                ", warrantyYears=" + warrantyYears +
                ", typeCategory=" + typeCategory +
                '}';
    }

    @Id
    private String _id;

    @Field("additional_tarriffs")
    private List additionalTariifs;

    @Field("for")
    private List forDocument;

    @Field("available")
    private Boolean isAvailable;

    @Field("brand")
    private String brandType;

    @Field("pageCount")
    private Integer pageCount;

    @Field("cancel_penalty")
    private Integer cancelPenalty;

    @Field("color")
    private String color;

    @Field("limits")
    private Object limits;

    @Field("monthly_price")
    private Integer monthlyPrice;

    @Field("name")
    private String name;

    @Field("price")
    private Integer price;

    @Field("rating")
    private Integer rating;

    @Field("sales_tax")
    private Boolean salesTax;
    @Field("term_years")
    private Object termYears;
    @Field("warranty_years")
    private Integer warrantyYears;
    @Field("type")
    private List typeCategory;

    public ProductEntity(String _id, List additionalTariifs, List forDocument, Boolean isAvailable, String brandType, Integer pageCount, Integer cancelPenalty, String color, Object limits, Integer monthlyPrice, String name, Integer price, Integer rating, Boolean salesTax, Object termYears, Integer warrantyYears, List typeCategory) {
        this._id = _id;
        this.additionalTariifs = additionalTariifs;
        this.forDocument = forDocument;
        this.isAvailable = isAvailable;
        this.brandType = brandType;
        this.pageCount = pageCount;
        this.cancelPenalty = cancelPenalty;
        this.color = color;
        this.limits = limits;
        this.monthlyPrice = monthlyPrice;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.salesTax = salesTax;
        this.termYears = termYears;
        this.warrantyYears = warrantyYears;
        this.typeCategory = typeCategory;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List getAdditionalTariifs() {
        return additionalTariifs;
    }

    public void setAdditionalTariifs(List additionalTariifs) {
        this.additionalTariifs = additionalTariifs;
    }

    public List getForDocument() {
        return forDocument;
    }

    public void setForDocument(List forDocument) {
        this.forDocument = forDocument;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCancelPenalty() {
        return cancelPenalty;
    }

    public void setCancelPenalty(Integer cancelPenalty) {
        this.cancelPenalty = cancelPenalty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getLimits() {
        return limits;
    }

    public void setLimits(Object limits) {
        this.limits = limits;
    }

    public Integer getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(Integer monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Boolean getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(Boolean salesTax) {
        this.salesTax = salesTax;
    }

    public Object getTermYears() {
        return termYears;
    }

    public void setTermYears(Object termYears) {
        this.termYears = termYears;
    }

    public Integer getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(Integer warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public List getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(List typeCategory) {
        this.typeCategory = typeCategory;
    }
}
