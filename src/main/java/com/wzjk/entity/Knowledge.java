package com.wzjk.entity;

import java.util.Date;

public class Knowledge {
    private Integer id;

    private String bt;

    private String tp;

    private String xj;

    private Date sj;

    private String nr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt == null ? null : bt.trim();
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp == null ? null : tp.trim();
    }

    public String getXj() {
        return xj;
    }

    public void setXj(String xj) {
        this.xj = xj == null ? null : xj.trim();
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr == null ? null : nr.trim();
    }
}