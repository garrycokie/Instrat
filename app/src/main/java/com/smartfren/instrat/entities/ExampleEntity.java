package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;

public class ExampleEntity extends RealmObject {
    @SerializedName("ExampleID")
    public long ExampleID;
    @SerializedName("StartDate")
    public Date StartDate;
    @SerializedName("EndDate")
    public Date EndDate;
    @SerializedName("Status")
    public Integer Status; // 1 -> Active, -1 -> Deleted
    @SerializedName("SendToServer")
    public Integer SendToServer; // 1 -> Not Send, 2 -> Sending, 3 -> Sent
}
