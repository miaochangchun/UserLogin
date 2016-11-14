package com.miao.test.view;

import com.miao.test.bean.User;

/**
 * Created by 10048 on 2016/11/14.
 */
public interface IUserLoginView {
    String getUsername();

    String getPassword();

    void clearUsername();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
