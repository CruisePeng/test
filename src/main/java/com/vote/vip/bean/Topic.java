package com.vote.vip.bean;

import java.util.Date;

public class Topic {
    private String topicId;

    private String topicTitle;

    private String topicCategoryid;

    private String topicIspwd;

    private String topicPassword;

    private String topicResultid;

    private Date topicExpiredtime;

    private String topicCheckstatus;

    private Date topicPublishtime;

    private Integer topicView;

    private String topicUserid;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicCategoryid() {
        return topicCategoryid;
    }

    public void setTopicCategoryid(String topicCategoryid) {
        this.topicCategoryid = topicCategoryid == null ? null : topicCategoryid.trim();
    }

    public String getTopicIspwd() {
        return topicIspwd;
    }

    public void setTopicIspwd(String topicIspwd) {
        this.topicIspwd = topicIspwd == null ? null : topicIspwd.trim();
    }

    public String getTopicPassword() {
        return topicPassword;
    }

    public void setTopicPassword(String topicPassword) {
        this.topicPassword = topicPassword == null ? null : topicPassword.trim();
    }

    public String getTopicResultid() {
        return topicResultid;
    }

    public void setTopicResultid(String topicResultid) {
        this.topicResultid = topicResultid == null ? null : topicResultid.trim();
    }

    public Date getTopicExpiredtime() {
        return topicExpiredtime;
    }

    public void setTopicExpiredtime(Date topicExpiredtime) {
        this.topicExpiredtime = topicExpiredtime;
    }

    public String getTopicCheckstatus() {
        return topicCheckstatus;
    }

    public void setTopicCheckstatus(String topicCheckstatus) {
        this.topicCheckstatus = topicCheckstatus == null ? null : topicCheckstatus.trim();
    }

    public Date getTopicPublishtime() {
        return topicPublishtime;
    }

    public void setTopicPublishtime(Date topicPublishtime) {
        this.topicPublishtime = topicPublishtime;
    }

    public Integer getTopicView() {
        return topicView;
    }

    public void setTopicView(Integer topicView) {
        this.topicView = topicView;
    }

    public String getTopicUserid() {
        return topicUserid;
    }

    public void setTopicUserid(String topicUserid) {
        this.topicUserid = topicUserid == null ? null : topicUserid.trim();
    }
}