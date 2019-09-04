package com.imooc.oa.entity;

public class BabyHum {
    private int bh_id;
    private String bh_time;
    private String bh_data;
    private String bf_room;
    private String bh_bed;
    private String bh_companyid;

    public BabyHum() {
    }

    public BabyHum(int bh_id, String bh_time, String bh_data, String bf_room, String bh_bed, String bh_companyid) {
        this.bh_id = bh_id;
        this.bh_time = bh_time;
        this.bh_data = bh_data;
        this.bf_room = bf_room;
        this.bh_bed = bh_bed;
        this.bh_companyid = bh_companyid;
    }

    public int getBh_id() {
        return bh_id;
    }

    public void setBh_id(int bh_id) {
        this.bh_id = bh_id;
    }

    public String getBh_time() {
        return bh_time;
    }

    public void setBh_time(String bh_time) {
        this.bh_time = bh_time;
    }

    public String getBh_data() {
        return bh_data;
    }

    public void setBh_data(String bh_data) {
        this.bh_data = bh_data;
    }

    public String getBf_room() {
        return bf_room;
    }

    public void setBf_room(String bf_room) {
        this.bf_room = bf_room;
    }

    public String getBh_bed() {
        return bh_bed;
    }

    public void setBh_bed(String bh_bed) {
        this.bh_bed = bh_bed;
    }

    public String getBh_companyid() {
        return bh_companyid;
    }

    public void setBh_companyid(String bh_companyid) {
        this.bh_companyid = bh_companyid;
    }

    @Override
    public String toString() {
        return "BabyHum{" +
                "bh_id=" + bh_id +
                ", bh_time='" + bh_time + '\'' +
                ", bh_data='" + bh_data + '\'' +
                ", bf_room='" + bf_room + '\'' +
                ", bh_bed='" + bh_bed + '\'' +
                ", bh_companyid='" + bh_companyid + '\'' +
                '}';
    }
}
