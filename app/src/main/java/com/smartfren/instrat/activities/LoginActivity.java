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
import com.smartfren.instrat.entities.LoginEntity;
import com.smartfren.instrat.entities.LoginRequest;
import com.smartfren.instrat.entities.LoginResponse;

import org.json.JSONException;
import org.json.JSONObject;

import io.realm.Realm;
import io.realm.RealmResults;

public class LoginActivity extends Activity {

    private String TAG = "LoginActivity";

    private Button _btnLogin;
    /*private EditText _txtUserName;
    private EditText _txtPassword;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Realm realm = Realm.getDefaultInstance();
        RealmResults<LoginEntity> loginData = realm.where(LoginEntity.class).findAll();
        if(loginData.size() > 0) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }

        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextInputLayout usernameWrapper = (TextInputLayout) findViewById(R.id.usernameWrapper);
        final TextInputLayout passwordWrapper = (TextInputLayout) findViewById(R.id.passwordWrapper);

        usernameWrapper.setHint("Username");
        passwordWrapper.setHint("Password");

        _btnLogin = (Button) findViewById(R.id.btnLogin);
        /*_txtUserName = (EditText) findViewById(R.id.txtUserName);
        _txtPassword = (EditText) findViewById(R.id.txtPassword);*/

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
        hideKeyboard();
        progress = new ProgressDialog(this);
        progress.setMessage("Logging in...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);
        progress.show();

        Log.d(TAG, "Username: " + username + ", Password: " + password);

        final LoginResponse[] result = new LoginResponse[1];

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.userID = username;
        loginRequest.signature = "ca63206adb43724b4c7f92d2e0fd9d77";
        loginRequest.token = "token";
        //loginRequest.signature = md5(_token + md5(_password)) ;
        Gson gson = new Gson();
        String json = gson.toJson(loginRequest);

        String url = "http://192.168.1.106/Instrat2/login.php"; // change to api url
        JSONObject param = null;
        try {
            param = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        final JsonObjectRequest jsonRequest = new JsonObjectRequest
                (Request.Method.POST, url, param, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // the response is already constructed as a JSONObject!
                        try {
                            String userID = response.getString("userID");
                            String status = response.getString("status");
                            String accessToken = response.getString("accessToken");

                            result[0] = new LoginResponse();
                            result[0].userID = userID;
                            result[0].status = status;
                            result[0].accessToken = accessToken;

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

        LoginEntity entity = new LoginEntity();
        entity.userID = response.userID;
        entity.accessToken = response.accessToken;

        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealm(entity);
        realm.commitTransaction();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void OnLoginFailed() {
        progress.dismiss();
        Log.d(TAG, "Login failed");
        Toast.makeText(getApplicationContext(), "Login failed! Username or Password incorrect!", Toast.LENGTH_LONG).show();
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}




/*package com.smartfren.instrat.activities;

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


                Intent intent = new Intent(LoginActivity.this, LoginProgressActivity.class);
                intent.putExtra("LOGIN_USERNAME", username);
                intent.putExtra("LOGIN_PASSWORD", password);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


                /*Intent intent2 = new Intent(LoginActivity.this, Blok3Activity.class);
                startActivity(intent2);*/
/*
            }
        });
    }
}
*/