package com.miao.test.presenter;

import android.os.Handler;

import com.miao.test.bean.User;
import com.miao.test.biz.IUserBiz;
import com.miao.test.biz.OnLoginListener;
import com.miao.test.biz.UserBiz;
import com.miao.test.view.IUserLoginView;

/**
 * Created by 10048 on 2016/11/14.
 */
public class UserLoginPresenter {
    private IUserLoginView userLoginView;
    private IUserBiz userBiz;
    private Handler mHander = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();
    }

    public void login() {
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUsername(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                mHander.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toMainActivity(user);
                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHander.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedError();
                        userLoginView.hideLoading();
                    }
                });
            }
        });
    }

    public void clear() {
        userLoginView.clearPassword();
        userLoginView.clearUsername();
    }
}