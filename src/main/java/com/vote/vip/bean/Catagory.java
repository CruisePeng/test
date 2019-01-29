package com.vote.vip.bean;

public class Catagory {
    private String catagoryId;

    private String catagoryName;

    private String catagoryDesc;

    private Integer catagoryOrder;

    public String getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId == null ? null : catagoryId.trim();
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName == null ? null : catagoryName.trim();
    }

    public String getCatagoryDesc() {
        return catagoryDesc;
    }

    public void setCatagoryDesc(String catagoryDesc) {
        this.catagoryDesc = catagoryDesc == null ? null : catagoryDesc.trim();
    }

    public Integer getCatagoryOrder() {
        return catagoryOrder;
    }

    public void setCatagoryOrder(Integer catagoryOrder) {
        this.catagoryOrder = catagoryOrder;
    }
}