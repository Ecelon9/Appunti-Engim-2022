package com.provalogin.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String userPsw;

    public User(String name, String psw) {
        this.userName = name;
        this.userPsw = psw;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserPsw() {
        return userPsw;
    }



}
