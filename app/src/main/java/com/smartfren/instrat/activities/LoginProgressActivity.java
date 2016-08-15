package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.smartfren.instrat.entities.LoginRequest;
import com.smartfren.instrat.entities.LoginResponse;

import com.smartfren.instrat.R;

import org.json.JSONException;
import org.json.JSONObject;

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

            final LoginResponse[] result = new LoginResponse[1];

            LoginRequest loginRequest = new LoginRequest();
            loginRequest.username = _username;
            loginRequest.password = _password;

            Gson gson = new Gson();
            String json = gson.toJson(loginRequest);

            String url = "http://httpbin.org/get?site=code&network=tutsplus"; // change to api url
            JSONObject param = null;
            try {
                param = new JSONObject(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            final JsonObjectRequest jsonRequest = new JsonObjectRequest
                    (Request.Method.GET, url, param, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            // the response is already constructed as a JSONObject!
                            try {
                                String userID = response.getString("UserID");
                                int status = response.getInt("Status");

                                result[0] = new LoginResponse();
                                result[0].userID = userID;
                                result[0].status = status;

                                OnLoginSuccess(result[0]);

                            } catch (JSONException e) {
                                e.printStackTrace();
                                OnLoginFailed();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });

            Volley.newRequestQueue(getApplicationContext()).add(jsonRequest);
        }
    }

    private void OnLoginSuccess(LoginResponse response) {
        Log.d(TAG, "Login success");

        /*ExampleDao dao = new ExampleDao();
        dao.InsertOrUpdateExample(entity);*/
        // TODO: save login information into local db, so later when open application no need to login anymore
        // TODO: go to where ? with transition
    }

    private void OnLoginFailed() {
        Log.d(TAG, "Login failed");
        Intent intent = new Intent(LoginProgressActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
