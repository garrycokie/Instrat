package com.smartfren.instrat.entities;

import io.realm.RealmObject;

/**
 * Created by Garry Cokie on 8/18/2016.
 */
public class LoginEntity  extends RealmObject {
    public String userID;
    public String accessToken;
    public String idKota;
    public String namaKota;
}