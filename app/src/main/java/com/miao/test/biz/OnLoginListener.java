package com.miao.test.biz;

import com.miao.test.bean.User;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface OnLoginListener {
    /**
     * 登录成功的回调
     * @param user  bean类
     */
    void loginSuccess(User user);

    /**
     * 登录失败的回调
     */
    void loginFailed();
}
