package com.miao.test.view;

import com.miao.test.bean.User;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface IUserLoginView {
    /**
     * 获取用户名
     * @return  用户名
     */
    String getUsername();

    /**
     * 获取密码
     * @return  密码
     */
    String getPassword();

    /**
     * 清空用户名
     */
    void clearUsername();

    /**
     * 清空密码
     */
    void clearPassword();

    /**
     * 显示ProgressBar
     */
    void showLoading();

    /**
     * 隐藏ProgressBar
     */
    void hideLoading();

    /**
     * 登录成功，跳转到MainActivity
     * @param user
     */
    void toMainActivity(User user);

    /**
     * 登录失败，给个提示错误
     */
    void showFailedError();
}
