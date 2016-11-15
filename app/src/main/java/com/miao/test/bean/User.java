package com.miao.test.bean;

/**
 * Created by 10048 on 2016/11/14.
 */
public class User {
    private String username;        //用户名
    private String password;        //密码

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "username = " + this.getUsername() + ";"
                + "password = " + this.getPassword();

    }
}
