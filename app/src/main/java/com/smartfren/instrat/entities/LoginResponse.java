package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    // TODO: add more field based on need

    @SerializedName("userID")
    public String userID;
    @SerializedName("status")
    public String status;
    @SerializedName("accessToken")
    public String accessToken;
    @SerializedName("idKota")
    public String idKota;
    @SerializedName("namaKota")
    public String namaKota;

    @Override
    public String toString() {
        return "LoginResponse: [status=" + status + ", userID=" + userID + ", accessToken=" + accessToken+ "]";
    }
}
