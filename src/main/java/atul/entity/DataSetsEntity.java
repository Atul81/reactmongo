package atul.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("dataSets")
public class DataSetsEntity {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "DataSetsEntity{" +
                "_id='" + _id + '\'' +
                ", client='" + client + '\'' +
                ", command=" + command +
                ", keyUpdates=" + keyUpdates +
                ", lockStatus=" + lockStatus +
                ", milliSeconds=" + milliSeconds +
                ", nreturned=" + nreturned +
                ", namingShort='" + namingShort + '\'' +
                ", queryDesc=" + queryDesc +
                ", pageCount=" + pageCount +
                ", nToReturn=" + nToReturn +
                ", skipOrNot=" + skipOrNot +
                ", numYield=" + numYield +
                ", responseLength=" + responseLength +
                ", operation='" + operation + '\'' +
                ", date=" + date +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Id
    private String _id;

    @Field("client")
    private String client;

    @Field("command")
    private Object command;

    @Field("keyUpdates")
    private Integer keyUpdates;

    @Field("lockStats")
    private Object lockStatus;

    @Field("millis")
    private Integer milliSeconds;

    @Field("nreturned")
    private Integer nreturned;

    @Field("ns")
    private String namingShort;

    @Field("query")
    private Object queryDesc;

    @Field("nscanned")
    private Integer pageCount;

    @Field("ntoreturn")
    private Integer nToReturn;

    @Field("ntoskip")
    private Integer skipOrNot;

    @Field("numYield")
    private Integer numYield;

    @Field("responseLength")
    private Integer responseLength;

    @Field("op")
    private String operation;

    @Field("ts")
    private Object date;

    @Field("user")
    private String userName;

    public DataSetsEntity(String _id, String client, Object command, Integer keyUpdates, Object lockStatus, Integer milliSeconds, Integer nreturned, String namingShort, Object queryDesc, Integer pageCount, Integer nToReturn, Integer skipOrNot, Integer numYield, Integer responseLength, String operation, Object date, String userName) {
        this._id = _id;
        this.client = client;
        this.command = command;
        this.keyUpdates = keyUpdates;
        this.lockStatus = lockStatus;
        this.milliSeconds = milliSeconds;
        this.nreturned = nreturned;
        this.namingShort = namingShort;
        this.queryDesc = queryDesc;
        this.pageCount = pageCount;
        this.nToReturn = nToReturn;
        this.skipOrNot = skipOrNot;
        this.numYield = numYield;
        this.responseLength = responseLength;
        this.operation = operation;
        this.date = date;
        this.userName = userName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Object getCommand() {
        return command;
    }

    public void setCommand(Object command) {
        this.command = command;
    }

    public Integer getKeyUpdates() {
        return keyUpdates;
    }

    public void setKeyUpdates(Integer keyUpdates) {
        this.keyUpdates = keyUpdates;
    }

    public Object getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Object lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getMilliSeconds() {
        return milliSeconds;
    }

    public void setMilliSeconds(Integer milliSeconds) {
        this.milliSeconds = milliSeconds;
    }

    public Integer getNreturned() {
        return nreturned;
    }

    public void setNreturned(Integer nreturned) {
        this.nreturned = nreturned;
    }

    public String getNamingShort() {
        return namingShort;
    }

    public void setNamingShort(String namingShort) {
        this.namingShort = namingShort;
    }

    public Object getQueryDesc() {
        return queryDesc;
    }

    public void setQueryDesc(Object queryDesc) {
        this.queryDesc = queryDesc;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getnToReturn() {
        return nToReturn;
    }

    public void setnToReturn(Integer nToReturn) {
        this.nToReturn = nToReturn;
    }

    public Integer getSkipOrNot() {
        return skipOrNot;
    }

    public void setSkipOrNot(Integer skipOrNot) {
        this.skipOrNot = skipOrNot;
    }

    public Integer getNumYield() {
        return numYield;
    }

    public void setNumYield(Integer numYield) {
        this.numYield = numYield;
    }

    public Integer getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(Integer responseLength) {
        this.responseLength = responseLength;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
