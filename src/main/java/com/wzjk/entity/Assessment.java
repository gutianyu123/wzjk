package com.wzjk.entity;

public class Assessment {
    private Integer id;

    private Integer pglxid;

    private String tmmc;

    private Integer tmlx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPglxid() {
        return pglxid;
    }

    public void setPglxid(Integer pglxid) {
        this.pglxid = pglxid;
    }

    public String getTmmc() {
        return tmmc;
    }

    public void setTmmc(String tmmc) {
        this.tmmc = tmmc == null ? null : tmmc.trim();
    }

    public Integer getTmlx() {
        return tmlx;
    }

    public void setTmlx(Integer tmlx) {
        this.tmlx = tmlx;
    }
}