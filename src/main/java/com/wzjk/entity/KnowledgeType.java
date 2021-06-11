package com.wzjk.entity;

public class KnowledgeType {
    private Integer id;

    private String zslb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZslb() {
        return zslb;
    }

    public void setZslb(String zslb) {
        this.zslb = zslb == null ? null : zslb.trim();
    }
}