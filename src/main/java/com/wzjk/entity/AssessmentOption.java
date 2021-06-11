package com.wzjk.entity;

public class AssessmentOption {
    private Integer id;

    private Integer pgld;

    private String xxmr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPgld() {
        return pgld;
    }

    public void setPgld(Integer pgld) {
        this.pgld = pgld;
    }

    public String getXxmr() {
        return xxmr;
    }

    public void setXxmr(String xxmr) {
        this.xxmr = xxmr == null ? null : xxmr.trim();
    }
}