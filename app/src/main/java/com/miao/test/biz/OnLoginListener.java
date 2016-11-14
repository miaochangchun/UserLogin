package com.miao.test.biz;

import com.miao.test.bean.User;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
