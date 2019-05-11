package atul.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document("trade")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String _id;
    @Field("details")
    private Object details;
    @Field("price")
    private Integer price;
    @Field("shares")
    private Integer shares;
    @Field("ticker")
    private String ticker;
    @Field("ticket")
    private String ticket;
    @Field("time")
    private Object timeStamp;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "TradeEntity{" +
                "_id='" + _id + '\'' +
                ", details=" + details +
                ", price=" + price +
                ", shares=" + shares +
                ", ticker='" + ticker + '\'' +
                ", ticket='" + ticket + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }


}
