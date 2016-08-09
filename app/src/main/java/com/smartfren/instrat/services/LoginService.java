package com.smartfren.instrat.services;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.smartfren.instrat.entities.LoginRequest;
import com.smartfren.instrat.entities.LoginResponse;

import org.json.JSONException;
import org.json.JSONObject;


public class LoginService {

    private static final String TAG = "LoginService";

    private Context _context;

    public LoginService(Context context) {
        _context = context;
    }

    public LoginResponse loginToServer(String username, String password) throws Exception {

        final LoginResponse[] result = new LoginResponse[1];

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.username = username;
        loginRequest.password = password;

        Gson gson = new Gson();
        String json = gson.toJson(loginRequest);

        String url = "http://httpbin.org/get?site=code&network=tutsplus"; // change to api url
        JSONObject param = new JSONObject(json);
        JsonObjectRequest jsonRequest = new JsonObjectRequest
                (Request.Method.GET, url, param, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // the response is already constructed as a JSONObject!
                        try {
                            response = response.getJSONObject("responseClassName");

                            // TODO: get other properties
                            // use example below
                            String userID = response.getString("UserID");
                            // int status = response.getInt("Status");

                            result[0] = new LoginResponse();
                            result[0].userID = userID;
                            // TODO: set other properties
                            // result.status = status;

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

        Volley.newRequestQueue(_context).add(jsonRequest);

        if (result.length > 0) {
            return result[0];
        }

        return null;
    }
}
