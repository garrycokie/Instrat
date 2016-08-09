package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("Username")
    public String username;
    @SerializedName("Password")
    public String password;

    public String toString() {
        return "LoginRequest: [username=" + username + ", password=" + password + "]";
    }
}
