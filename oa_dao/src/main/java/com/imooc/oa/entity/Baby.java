package com.imooc.oa.entity;

public class Baby {
    private Integer b_id;
    private String b_name;
    private String b_age;
    private String room;
    private String bed;
    private String b_companyid;
    private String info;

    @Override
    public String toString() {
        return "Baby{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_age='" + b_age + '\'' +
                ", room='" + room + '\'' +
                ", bed='" + bed + '\'' +
                ", b_companyid='" + b_companyid + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_age() {
        return b_age;
    }

    public void setB_age(String b_age) {
        this.b_age = b_age;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getB_companyid() {
        return b_companyid;
    }

    public void setB_companyid(String b_companyid) {
        this.b_companyid = b_companyid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
