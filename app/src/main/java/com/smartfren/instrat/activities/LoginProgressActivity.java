package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.LoginResponse;
import com.smartfren.instrat.services.LoginTask;

public class LoginProgressActivity extends Activity {

    private String TAG = "LoginProgressActivity";

    private String _username;
    private String _password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_progress);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Bundle receiveBundle = this.getIntent().getExtras();
        if(receiveBundle != null) {
            _username = receiveBundle.getString("LOGIN_USERNAME");
            _password = receiveBundle.getString("LOGIN_PASSWORD");

            Log.d(TAG, "Logging In -- Username: " + _username + ", Password: " + _password);

            new LoginTask(this).execute(_username, _password);
        }
    }

    public void OnLoginSuccess(LoginResponse response) {
        Log.d(TAG, "Login success");
        // TODO: save login information into local db, so later when open application no need to login anymore
        // TODO: go to where ? with transition
    }

    public void OnLoginFailed() {
        Log.d(TAG, "Login failed");
        Intent intent = new Intent(LoginProgressActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
