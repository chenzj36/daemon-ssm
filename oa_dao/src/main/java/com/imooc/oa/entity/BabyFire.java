package com.imooc.oa.entity;

public class BabyFire {
    private Integer bf_id;
    private String bf_time;
    private String bf_data;
    private String bf_room;
    private String bf_bed;
    private String bf_companyid;

    @Override
    public String toString() {
        return "BabyFire{" +
                "bg_id=" + bf_id +
                ", bf_time='" + bf_time + '\'' +
                ", bf_date='" + bf_data + '\'' +
                ", bf_room='" + bf_room + '\'' +
                ", bf_bed='" + bf_bed + '\'' +
                ", bf_companyid='" + bf_companyid + '\'' +
                '}';
    }

    public Integer getBf_id() {
        return bf_id;
    }

    public void setBf_id(Integer bg_id) {
        this.bf_id = bg_id;
    }

    public String getBf_time() {
        return bf_time;
    }

    public void setBf_time(String bf_time) {
        this.bf_time = bf_time;
    }

    public String getBf_data() {
        return bf_data;
    }

    public void setBf_data(String bf_date) {
        this.bf_data = bf_date;
    }

    public String getBf_room() {
        return bf_room;
    }

    public void setBf_room(String bf_room) {
        this.bf_room = bf_room;
    }

    public String getBf_bed() {
        return bf_bed;
    }

    public void setBf_bed(String bf_bed) {
        this.bf_bed = bf_bed;
    }

    public String getBf_companyid() {
        return bf_companyid;
    }

    public void setBf_companyid(String bf_companyid) {
        this.bf_companyid = bf_companyid;
    }
}
