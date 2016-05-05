package demo.lsl.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import demo.lsl.mvpdemo.R;
import demo.lsl.mvpdemo.bean.User;
import demo.lsl.mvpdemo.biz.IUserLoginView;
import demo.lsl.mvpdemo.presenter.UserLoginPresenter;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    private EditText mName;
    private EditText mPassword;

    private Button mButton;


    private UserLoginPresenter mLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniview();
    }

    private void iniview() {
        mName = (EditText) findViewById(R.id.et_name);
        mPassword = (EditText) findViewById(R.id.et_paw);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.login();
            }
        });

    }

    @Override
    public String getUserName() {
        return mName.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void clearUserName() {
        mName.setText("");
    }

    @Override
    public void clearPassword() {
        mPassword.setText("");
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void toMainActivity(User user) {
        Toast.makeText(this,
                " login success , to MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this,
                "login failed", Toast.LENGTH_SHORT).show();
    }
}
