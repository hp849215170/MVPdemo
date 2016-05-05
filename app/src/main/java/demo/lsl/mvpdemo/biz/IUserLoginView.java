package demo.lsl.mvpdemo.biz;

import demo.lsl.mvpdemo.bean.User;

/**
 * Created by lishoulin on 2016/4/14.
 */
public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
