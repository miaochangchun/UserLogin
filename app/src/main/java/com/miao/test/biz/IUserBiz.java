package com.miao.test.biz;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface IUserBiz {
    public void login(String username, String password, OnLoginListener listener);
}
