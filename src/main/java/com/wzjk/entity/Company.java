package com.wzjk.entity;

public class Company {
    private Integer id;

    private String qymc;

    private String qyyqm;

    private String qykh;

    private String lxfs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc == null ? null : qymc.trim();
    }

    public String getQyyqm() {
        return qyyqm;
    }

    public void setQyyqm(String qyyqm) {
        this.qyyqm = qyyqm == null ? null : qyyqm.trim();
    }

    public String getQykh() {
        return qykh;
    }

    public void setQykh(String qykh) {
        this.qykh = qykh == null ? null : qykh.trim();
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs == null ? null : lxfs.trim();
    }
}