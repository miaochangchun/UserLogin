package com.miao.test.biz;

import com.miao.test.bean.User;

/**
 * Created by 10048 on 2016/11/14.
 */
public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //模拟正常登录，在此等待2秒
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ("zhy".equals(username) && "123".equals(password)) {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    listener.loginSuccess(user);
                } else {
                    listener.loginFailed();
                }
            }
        }).start();
    }
}
