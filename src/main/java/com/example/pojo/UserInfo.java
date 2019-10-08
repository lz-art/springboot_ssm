package com.example.pojo;


import java.io.Serializable;

public  class UserInfo implements Serializable {
    private  String username;
    private  String id;
    private  String pasword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}
