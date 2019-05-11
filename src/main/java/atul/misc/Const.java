package atul.misc;

import atul.model.HeaderModel;

import java.util.Date;

public class Const {

    public interface DBQueries {
        }

    public interface KeyWords {
    }

    public interface Status {
        String SUCCESS = "0000";

    }

    public HeaderModel headerModel() {
        HeaderModel headerModel = new HeaderModel();
        headerModel.setAppName("Full Stack Development");
        headerModel.setLanguage("English");
        headerModel.setResponseDateTime(new Date().toString());
        headerModel.setStatus(Const.Status.SUCCESS);
        headerModel.setUserId("94252");
        headerModel.setUserAction("Request Mapping Operation");
        return headerModel;
    }
}
