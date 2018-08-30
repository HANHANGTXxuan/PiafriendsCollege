package com.hanhangproject.demo.entity;

public class PScript {
    private Integer id;
    private Integer userId;
    private String simpleData;
    private String peopleData;
    private String contentData;
    private char released;
    private char toexamined;
    private Integer browse;
    private String updatedAt;
    private String createdAt;
    private PUser user;

    public PUser getUser() {
        return user;
    }

    public void setUser(PUser user) {
        this.user = user;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSimpleData() {
        return simpleData;
    }

    public void setSimpleData(String simpleData) {
        this.simpleData = simpleData;
    }

    public String getPeopleData() {
        return peopleData;
    }

    public void setPeopleData(String peopleData) {
        this.peopleData = peopleData;
    }

    public String getContentData() {
        return contentData;
    }

    public void setContentData(String contentData) {
        this.contentData = contentData;
    }

    public char getReleased() {
        return released;
    }

    public void setReleased(char released) {
        this.released = released;
    }

    public char getToexamined() {
        return toexamined;
    }

    public void setToexamined(char toexamined) {
        this.toexamined = toexamined;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
