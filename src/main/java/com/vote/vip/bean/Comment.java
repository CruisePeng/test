package com.vote.vip.bean;

import java.util.Date;

public class Comment {
    private String commentId;

    private String commentFromuserid;

    private String commentTouserid;

    private String commentTopicId;

    private Date commentTime;

    private String commentIsread;

    private String commentIp;

    private String commentCheckstatus;

    private String commentContent;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getCommentFromuserid() {
        return commentFromuserid;
    }

    public void setCommentFromuserid(String commentFromuserid) {
        this.commentFromuserid = commentFromuserid == null ? null : commentFromuserid.trim();
    }

    public String getCommentTouserid() {
        return commentTouserid;
    }

    public void setCommentTouserid(String commentTouserid) {
        this.commentTouserid = commentTouserid == null ? null : commentTouserid.trim();
    }

    public String getCommentTopicId() {
        return commentTopicId;
    }

    public void setCommentTopicId(String commentTopicId) {
        this.commentTopicId = commentTopicId == null ? null : commentTopicId.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentIsread() {
        return commentIsread;
    }

    public void setCommentIsread(String commentIsread) {
        this.commentIsread = commentIsread == null ? null : commentIsread.trim();
    }

    public String getCommentIp() {
        return commentIp;
    }

    public void setCommentIp(String commentIp) {
        this.commentIp = commentIp == null ? null : commentIp.trim();
    }

    public String getCommentCheckstatus() {
        return commentCheckstatus;
    }

    public void setCommentCheckstatus(String commentCheckstatus) {
        this.commentCheckstatus = commentCheckstatus == null ? null : commentCheckstatus.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}