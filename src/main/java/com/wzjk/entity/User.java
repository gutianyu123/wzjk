package com.wzjk.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String sjh;

    private String gh;

    private String yx;

    private String mm;

    private Integer qyid;

    private String tx;

    private String nc;

    private String xm;

    private Date csrq;

    private Integer xb;

    private Integer hf;

    private Integer zzid;

    private Integer zt;

    private String wxh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSjh() {
        return sjh;
    }

    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh == null ? null : gh.trim();
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx == null ? null : yx.trim();
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    public Integer getQyid() {
        return qyid;
    }

    public void setQyid(Integer qyid) {
        this.qyid = qyid;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc == null ? null : nc.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    public Integer getXb() {
        return xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }

    public Integer getHf() {
        return hf;
    }

    public void setHf(Integer hf) {
        this.hf = hf;
    }

    public Integer getZzid() {
        return zzid;
    }

    public void setZzid(Integer zzid) {
        this.zzid = zzid;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getWxh() {
        return wxh;
    }

    public void setWxh(String wxh) {
        this.wxh = wxh == null ? null : wxh.trim();
    }
}