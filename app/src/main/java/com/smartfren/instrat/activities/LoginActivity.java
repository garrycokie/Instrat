package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.smartfren.instrat.R;

public class LoginActivity extends Activity {

    private String TAG = "LoginActivity";

    private Button _btnLogin;
    private EditText _txtUserName;
    private EditText _txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // TODO: check local db if user already login
        // if yes, go to main activity

        _btnLogin = (Button) findViewById(R.id.btnLogin);
        _txtUserName = (EditText) findViewById(R.id.txtUserName);
        _txtPassword = (EditText) findViewById(R.id.txtPassword);

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = _txtUserName.getText().toString();
                String password = _txtPassword.getText().toString();

                Log.d(TAG, "Username: " + username + ", Password: " + password);

/*
                Intent intent = new Intent(LoginActivity.this, LoginProgressActivity.class);
                intent.putExtra("LOGIN_USERNAME", username);
                intent.putExtra("LOGIN_PASSWORD", password);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

*/
                Intent intent2 = new Intent(LoginActivity.this, Blok3Activity.class);
                startActivity(intent2);

            }
        });
    }
}
