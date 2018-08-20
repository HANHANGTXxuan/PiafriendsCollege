package com.hanhangproject.demo.entity;

public class PFollows {
    private int id;
    private int PiaUserId;
    private int PiaFollowId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPiaUserId() {
        return PiaUserId;
    }

    public void setPiaUserId(int piaUserId) {
        PiaUserId = piaUserId;
    }

    public int getPiaFollowId() {
        return PiaFollowId;
    }

    public void setPiaFollowId(int piaFollowId) {
        PiaFollowId = piaFollowId;
    }
}
