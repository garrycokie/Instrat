package com.smartfren.instrat.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.LoginRequest;
import com.smartfren.instrat.entities.LoginResponse;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends Activity {

    private String TAG = "LoginActivity";

    private Button _btnLogin;
    private EditText _txtUserName;
    private EditText _txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextInputLayout usernameWrapper = (TextInputLayout) findViewById(R.id.usernameWrapper);
        final TextInputLayout passwordWrapper = (TextInputLayout) findViewById(R.id.passwordWrapper);

        usernameWrapper.setHint("Username");
        passwordWrapper.setHint("Password");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // TODO: check local db if user already login
        // if yes, go to main activity
        // else do below:
        _btnLogin = (Button) findViewById(R.id.btnLogin);
        _txtUserName = (EditText) findViewById(R.id.txtUserName);
        _txtPassword = (EditText) findViewById(R.id.txtPassword);

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameWrapper.getEditText().getText().toString();
                String password = passwordWrapper.getEditText().getText().toString();

                if (username.isEmpty()) {
                    usernameWrapper.setError("Username required!");
                } else if (password.isEmpty()) {
                    passwordWrapper.setError("Password required!");
                } else {
                    usernameWrapper.setErrorEnabled(false);
                    passwordWrapper.setErrorEnabled(false);
                    doLogin(username, password);
                }
            }
        });
    }

    private ProgressDialog progress;

    private void doLogin(String username, String password) {
        progress = new ProgressDialog(this);
        progress.setMessage("Logging in...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);
        progress.show();

        Log.d(TAG, "Username: " + username + ", Password: " + password);

        final LoginResponse[] result = new LoginResponse[1];

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.username = username;
        loginRequest.password = password;

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
                        OnLoginFailed();
                    }
                });

        Volley.newRequestQueue(getApplicationContext()).add(jsonRequest);
    }

    private void OnLoginSuccess(LoginResponse response) {
        progress.dismiss();
        Log.d(TAG, "Login success");

        /*ExampleDao dao = new ExampleDao();
        dao.InsertOrUpdateExample(entity);*/
        // TODO: save login information into local db, so later when open application no need to login anymore
        // TODO: go to where ? with transition

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void OnLoginFailed() {
        progress.dismiss();
        Log.d(TAG, "Login failed");
        Toast.makeText(getApplicationContext(), "Login failed! Username or Password incorrect!", Toast.LENGTH_LONG).show();

        // only for test purpose
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
