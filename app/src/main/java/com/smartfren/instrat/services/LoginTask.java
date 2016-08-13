package com.smartfren.instrat.services;

import android.os.AsyncTask;

import com.smartfren.instrat.activities.LoginProgressActivity;
import com.smartfren.instrat.entities.LoginResponse;

public class LoginTask extends AsyncTask<String, Integer, LoginResponse> {

    private LoginProgressActivity _parent;

    public LoginTask(LoginProgressActivity parent) {
        _parent = parent;
    }

    @Override
    protected LoginResponse doInBackground(String... params) {
        LoginService service = new LoginService(_parent.getApplicationContext());

        try {
            return service.loginToServer(params[0], params[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(LoginResponse result) {
        if (result != null) {
            _parent.OnLoginSuccess(result);
        } else {
            _parent.OnLoginFailed();
        }
    }
}
