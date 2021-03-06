package com.imooc.oa.entity;

public class Administer {
    private int id;
    private String ad_name;
    private String ad_password;

    public Administer() {
    }

    public Administer(int id, String ad_name, String ad_password) {
        this.id = id;
        this.ad_name = ad_name;
        this.ad_password = ad_password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getAd_password() {
        return ad_password;
    }

    public void setAd_password(String ad_password) {
        this.ad_password = ad_password;
    }

    @Override
    public String toString() {
        return "Administer{" +
                "id=" + id +
                ", ad_name='" + ad_name + '\'' +
                ", ad_password='" + ad_password + '\'' +
                '}';
    }
}
