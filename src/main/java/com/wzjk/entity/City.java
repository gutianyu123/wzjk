package com.wzjk.entity;

public class City {
    private Integer id;

    private String zzmc;

    private Integer sjzz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZzmc() {
        return zzmc;
    }

    public void setZzmc(String zzmc) {
        this.zzmc = zzmc == null ? null : zzmc.trim();
    }

    public Integer getSjzz() {
        return sjzz;
    }

    public void setSjzz(Integer sjzz) {
        this.sjzz = sjzz;
    }
}