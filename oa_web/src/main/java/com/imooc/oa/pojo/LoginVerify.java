package com.imooc.oa.pojo;

public class LoginVerify {
    private String uname;
    private String passwd;

    @Override
    public String toString() {
        return "LoginVerify{" +
                "name='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public String getName() {
        return uname;
    }

    public void setName(String name) {
        this.uname = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
