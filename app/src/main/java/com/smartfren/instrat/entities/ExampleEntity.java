package com.smartfren.instrat.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ExampleEntity extends RealmObject {

    @SerializedName("ExampleID")
    // ini harus ada biar di detect sebagai primary key
    @PrimaryKey
    public long ExampleID;

    @SerializedName("StartDate")
    public Date StartDate;

    @SerializedName("EndDate")
    public Date EndDate;

    // 1 -> Active, -1 -> Deleted
    @SerializedName("Status")
    public Integer Status;

    @SerializedName("SendToServer")
    public Integer SendToServer; // 1 -> Not Send, 2 -> Sending, 3 -> Sent
}
