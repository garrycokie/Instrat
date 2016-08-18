package com.smartfren.instrat.entities;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.annotations.RealmModule;

/**
 * Created by Garry Cokie on 8/18/2016.
 */
public class InstratApplication extends Application {
    @RealmModule(classes = {LoginEntity.class})
    public class LoginModule {}

    private static InstratApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        RealmConfiguration config = new RealmConfiguration.Builder(this).name("Instrat.DB").build();
        Realm.setDefaultConfiguration(config);
    }
}
