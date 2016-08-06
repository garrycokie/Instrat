package com.smartfren.instrat.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.smartfren.instrat.R;

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

            // TODO: check if user name valid
            // Nanti klo database dan web api untuk login udah pake source code contoh

            // TODO: when not valid back to login page
        }
    }
}
