package com.vote.vip.bean;

public class Link {
    private String linkId;

    private String linkName;

    private String linkUrl;

    private String linkLogourl;

    private Integer linkOrder;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkLogourl() {
        return linkLogourl;
    }

    public void setLinkLogourl(String linkLogourl) {
        this.linkLogourl = linkLogourl == null ? null : linkLogourl.trim();
    }

    public Integer getLinkOrder() {
        return linkOrder;
    }

    public void setLinkOrder(Integer linkOrder) {
        this.linkOrder = linkOrder;
    }
}