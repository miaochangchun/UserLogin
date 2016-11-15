package com.miao.test.biz;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface IUserBiz {
    /**
     * 登录的接口
     * @param username  用户名
     * @param password  密码
     * @param listener  监听
     */
    void login(String username, String password, OnLoginListener listener);
}
