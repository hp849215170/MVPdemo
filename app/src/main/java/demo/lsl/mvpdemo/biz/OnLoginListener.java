package demo.lsl.mvpdemo.biz;

import demo.lsl.mvpdemo.bean.User;

/**
 * Created by lishoulin on 2016/4/14.
 */
public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();

}
