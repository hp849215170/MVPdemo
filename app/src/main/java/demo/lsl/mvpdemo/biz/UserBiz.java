package demo.lsl.mvpdemo.biz;

import demo.lsl.mvpdemo.bean.User;

/**
 * Created by lishoulin on 2016/4/14.
 */
public class UserBiz implements IUserBiz {


    @Override
    public void login(final String username, final String userpassword, final OnLoginListener listener) {

        //模拟子线程耗时操作
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟登录成功
                if ("zhy".equals(username) && "123".equals(userpassword)) {
                    User user = new User();
                    user.setUsername(username);
                    user.setUserpassword(userpassword);
                    listener.loginSuccess(user);
                } else {
                    listener.loginFailed();
                }
            }
        }.start();
    }
}
