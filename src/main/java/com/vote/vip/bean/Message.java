package com.vote.vip.bean;

import java.util.Date;

public class Message {
    private String messageId;

    private String messageTargetid;

    private String messageIsread;

    private Date messageReadtime;

    private String messageReadip;

    private String messageContent;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getMessageTargetid() {
        return messageTargetid;
    }

    public void setMessageTargetid(String messageTargetid) {
        this.messageTargetid = messageTargetid == null ? null : messageTargetid.trim();
    }

    public String getMessageIsread() {
        return messageIsread;
    }

    public void setMessageIsread(String messageIsread) {
        this.messageIsread = messageIsread == null ? null : messageIsread.trim();
    }

    public Date getMessageReadtime() {
        return messageReadtime;
    }

    public void setMessageReadtime(Date messageReadtime) {
        this.messageReadtime = messageReadtime;
    }

    public String getMessageReadip() {
        return messageReadip;
    }

    public void setMessageReadip(String messageReadip) {
        this.messageReadip = messageReadip == null ? null : messageReadip.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}