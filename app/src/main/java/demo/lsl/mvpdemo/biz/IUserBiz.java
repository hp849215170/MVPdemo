package demo.lsl.mvpdemo.biz;

/**
 * Created by lishoulin on 2016/4/14.
 */
public interface IUserBiz {
     void login(String username, String userpassword, OnLoginListener listener);

}
