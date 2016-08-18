package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("userID")
    public String userID;
    @SerializedName("signature")
    public String signature;
    @SerializedName("token")
    public String token;

    public String toString() {
        return "LoginRequest: [userID=" + userID + ", signature=" + signature +", token=" + token + "]";
    }
}
