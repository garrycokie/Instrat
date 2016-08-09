package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    // TODO: add more field based on need

    @SerializedName("Status")
    public int status;
    @SerializedName("UserID")
    public String userID;

    @Override
    public String toString() {
        return "LoginResponse: [status=" + status + ", userID=" + userID + "]";
    }
}
