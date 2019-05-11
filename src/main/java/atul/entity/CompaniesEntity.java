package atul.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Document("companies")
public class CompaniesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String _id;

    @Field("acquisition")
    private Object acquisition;

    @Field("acquisitions")
    private List acquisitionList;

    @Field("alias_list")
    private String aliasList;

    @Field("blog_feed_url")
    private String blogFeedUrl;

    @Field("blog_url")
    private String blogUrl;

    @Field("category_code")
    private String categoryCode;

    @Field("competitions")
    private List competitionCompanies;

    @Field("created_at")
    private String createdStamp;

    @Field("crunchbase_url")
    private String crunchBaseUrl;

    @Field("deadpooled_day")
    private Object deadPooledDay;

    @Field("deadpooled_month")
    private Object deadPooledMonth;

    @Field("deadpooled_url")
    private String deadPooledUrl;

    @Field("deadpooled_year")
    private Object deadPooledYear;

    @Field("description")
    private String description;

    @Field("email_address")
    private String emailAddress;

    @Field("external_links")
    private List ecternalLinks;

    @Field("founded_day")
    private Integer foundedDay;

    @Field("founded_month")
    private Integer foundedMonth;

    @Field("founded_year")
    private Integer foundedYear;

    @Field("funding_rounds")
    private List fundingRounds;

    @Field("homepage_url")
    private String homePageUrl;

    @Field("image")
    private Object image;

    @Field("investments")
    private List investments;

    @Field("ipo")
    private Object shareValues;

    @Field("milestones")
    private List milestones;

    @Field("name")
    private String companyName;

    @Field("number_of_employees")
    private Integer totalEmployees;

    @Field("offices")
    private List allOffices;

    @Field("overview")
    private String companyOverview;

    @Field("partners")
    private List companyParteners;

    @Field("permalink")
    private String permanenedLink;

    @Field("phone_number")
    private String phoneNumber;

    @Field("products")
    private List productList;

    @Field("providerships")
    private List providersList;

    @Field("screenshots")
    private List allScreenShots;

    @Field("tag_list")
    private String tagList;

    @Field("total_money_raised")
    private String totalMoneyRaised;

    @Field("twitter_username")
    private String twitName;

    @Field("updated_at")
    private String updatedStamp;

    @Override
    public String toString() {
        return "CompaniesEntity{" +
                "_id='" + _id + '\'' +
                ", acquisition=" + acquisition +
                ", acquisitionList=" + acquisitionList +
                ", aliasList='" + aliasList + '\'' +
                ", blogFeedUrl='" + blogFeedUrl + '\'' +
                ", blogUrl='" + blogUrl + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", competitionCompanies=" + competitionCompanies +
                ", createdStamp='" + createdStamp + '\'' +
                ", crunchBaseUrl='" + crunchBaseUrl + '\'' +
                ", deadPooledDay=" + deadPooledDay +
                ", deadPooledMonth=" + deadPooledMonth +
                ", deadPooledUrl='" + deadPooledUrl + '\'' +
                ", deadPooledYear=" + deadPooledYear +
                ", description='" + description + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", ecternalLinks=" + ecternalLinks +
                ", foundedDay=" + foundedDay +
                ", foundedMonth=" + foundedMonth +
                ", foundedYear=" + foundedYear +
                ", fundingRounds=" + fundingRounds +
                ", homePageUrl='" + homePageUrl + '\'' +
                ", image=" + image +
                ", investments=" + investments +
                ", shareValues=" + shareValues +
                ", milestones=" + milestones +
                ", companyName='" + companyName + '\'' +
                ", totalEmployees=" + totalEmployees +
                ", allOffices=" + allOffices +
                ", companyOverview='" + companyOverview + '\'' +
                ", companyParteners=" + companyParteners +
                ", permanenedLink='" + permanenedLink + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", productList=" + productList +
                ", providersList=" + providersList +
                ", allScreenShots=" + allScreenShots +
                ", tagList='" + tagList + '\'' +
                ", totalMoneyRaised='" + totalMoneyRaised + '\'' +
                ", twitName='" + twitName + '\'' +
                ", updatedStamp='" + updatedStamp + '\'' +
                ", videoInsertions=" + videoInsertions +
                '}';
    }

    public CompaniesEntity(String _id, Object acquisition, List acquisitionList, String aliasList, String blogFeedUrl, String blogUrl, String categoryCode, List competitionCompanies, String createdStamp, String crunchBaseUrl, Object deadPooledDay, Object deadPooledMonth, String deadPooledUrl, Object deadPooledYear, String description, String emailAddress, List ecternalLinks, Integer foundedDay, Integer foundedMonth, Integer foundedYear, List fundingRounds, String homePageUrl, Object image, List investments, Object shareValues, List milestones, String companyName, Integer totalEmployees, List allOffices, String companyOverview, List companyParteners, String permanenedLink, String phoneNumber, List productList, List providersList, List allScreenShots, String tagList, String totalMoneyRaised, String twitName, String updatedStamp, List videoInsertions) {
        this._id = _id;
        this.acquisition = acquisition;
        this.acquisitionList = acquisitionList;
        this.aliasList = aliasList;
        this.blogFeedUrl = blogFeedUrl;
        this.blogUrl = blogUrl;
        this.categoryCode = categoryCode;
        this.competitionCompanies = competitionCompanies;
        this.createdStamp = createdStamp;
        this.crunchBaseUrl = crunchBaseUrl;
        this.deadPooledDay = deadPooledDay;
        this.deadPooledMonth = deadPooledMonth;
        this.deadPooledUrl = deadPooledUrl;
        this.deadPooledYear = deadPooledYear;
        this.description = description;
        this.emailAddress = emailAddress;
        this.ecternalLinks = ecternalLinks;
        this.foundedDay = foundedDay;
        this.foundedMonth = foundedMonth;
        this.foundedYear = foundedYear;
        this.fundingRounds = fundingRounds;
        this.homePageUrl = homePageUrl;
        this.image = image;
        this.investments = investments;
        this.shareValues = shareValues;
        this.milestones = milestones;
        this.companyName = companyName;
        this.totalEmployees = totalEmployees;
        this.allOffices = allOffices;
        this.companyOverview = companyOverview;
        this.companyParteners = companyParteners;
        this.permanenedLink = permanenedLink;
        this.phoneNumber = phoneNumber;
        this.productList = productList;
        this.providersList = providersList;
        this.allScreenShots = allScreenShots;
        this.tagList = tagList;
        this.totalMoneyRaised = totalMoneyRaised;
        this.twitName = twitName;
        this.updatedStamp = updatedStamp;
        this.videoInsertions = videoInsertions;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Object getAcquisition() {
        return acquisition;
    }

    public void setAcquisition(Object acquisition) {
        this.acquisition = acquisition;
    }

    public List getAcquisitionList() {
        return acquisitionList;
    }

    public void setAcquisitionList(List acquisitionList) {
        this.acquisitionList = acquisitionList;
    }

    public String getAliasList() {
        return aliasList;
    }

    public void setAliasList(String aliasList) {
        this.aliasList = aliasList;
    }

    public String getBlogFeedUrl() {
        return blogFeedUrl;
    }

    public void setBlogFeedUrl(String blogFeedUrl) {
        this.blogFeedUrl = blogFeedUrl;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public List getCompetitionCompanies() {
        return competitionCompanies;
    }

    public void setCompetitionCompanies(List competitionCompanies) {
        this.competitionCompanies = competitionCompanies;
    }

    public String getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(String createdStamp) {
        this.createdStamp = createdStamp;
    }

    public String getCrunchBaseUrl() {
        return crunchBaseUrl;
    }

    public void setCrunchBaseUrl(String crunchBaseUrl) {
        this.crunchBaseUrl = crunchBaseUrl;
    }

    public Object getDeadPooledDay() {
        return deadPooledDay;
    }

    public void setDeadPooledDay(Object deadPooledDay) {
        this.deadPooledDay = deadPooledDay;
    }

    public Object getDeadPooledMonth() {
        return deadPooledMonth;
    }

    public void setDeadPooledMonth(Object deadPooledMonth) {
        this.deadPooledMonth = deadPooledMonth;
    }

    public String getDeadPooledUrl() {
        return deadPooledUrl;
    }

    public void setDeadPooledUrl(String deadPooledUrl) {
        this.deadPooledUrl = deadPooledUrl;
    }

    public Object getDeadPooledYear() {
        return deadPooledYear;
    }

    public void setDeadPooledYear(Object deadPooledYear) {
        this.deadPooledYear = deadPooledYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List getEcternalLinks() {
        return ecternalLinks;
    }

    public void setEcternalLinks(List ecternalLinks) {
        this.ecternalLinks = ecternalLinks;
    }

    public Integer getFoundedDay() {
        return foundedDay;
    }

    public void setFoundedDay(Integer foundedDay) {
        this.foundedDay = foundedDay;
    }

    public Integer getFoundedMonth() {
        return foundedMonth;
    }

    public void setFoundedMonth(Integer foundedMonth) {
        this.foundedMonth = foundedMonth;
    }

    public Integer getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(Integer foundedYear) {
        this.foundedYear = foundedYear;
    }

    public List getFundingRounds() {
        return fundingRounds;
    }

    public void setFundingRounds(List fundingRounds) {
        this.fundingRounds = fundingRounds;
    }

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public List getInvestments() {
        return investments;
    }

    public void setInvestments(List investments) {
        this.investments = investments;
    }

    public Object getShareValues() {
        return shareValues;
    }

    public void setShareValues(Object shareValues) {
        this.shareValues = shareValues;
    }

    public List getMilestones() {
        return milestones;
    }

    public void setMilestones(List milestones) {
        this.milestones = milestones;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public List getAllOffices() {
        return allOffices;
    }

    public void setAllOffices(List allOffices) {
        this.allOffices = allOffices;
    }

    public String getCompanyOverview() {
        return companyOverview;
    }

    public void setCompanyOverview(String companyOverview) {
        this.companyOverview = companyOverview;
    }

    public List getCompanyParteners() {
        return companyParteners;
    }

    public void setCompanyParteners(List companyParteners) {
        this.companyParteners = companyParteners;
    }

    public String getPermanenedLink() {
        return permanenedLink;
    }

    public void setPermanenedLink(String permanenedLink) {
        this.permanenedLink = permanenedLink;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List getProductList() {
        return productList;
    }

    public void setProductList(List productList) {
        this.productList = productList;
    }

    public List getProvidersList() {
        return providersList;
    }

    public void setProvidersList(List providersList) {
        this.providersList = providersList;
    }

    public List getAllScreenShots() {
        return allScreenShots;
    }

    public void setAllScreenShots(List allScreenShots) {
        this.allScreenShots = allScreenShots;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public String getTotalMoneyRaised() {
        return totalMoneyRaised;
    }

    public void setTotalMoneyRaised(String totalMoneyRaised) {
        this.totalMoneyRaised = totalMoneyRaised;
    }

    public String getTwitName() {
        return twitName;
    }

    public void setTwitName(String twitName) {
        this.twitName = twitName;
    }

    public String getUpdatedStamp() {
        return updatedStamp;
    }

    public void setUpdatedStamp(String updatedStamp) {
        this.updatedStamp = updatedStamp;
    }

    public List getVideoInsertions() {
        return videoInsertions;
    }

    public void setVideoInsertions(List videoInsertions) {
        this.videoInsertions = videoInsertions;
    }

    @Field("video_embeds")
    private List videoInsertions;

}
