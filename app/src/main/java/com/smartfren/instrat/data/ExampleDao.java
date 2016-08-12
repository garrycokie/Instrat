package com.smartfren.instrat.data;

import com.smartfren.instrat.entities.ExampleEntity;

import io.realm.Realm;
import io.realm.RealmResults;

public class ExampleDao {

    private static final String TAG = "ExampleDao";
    private Realm _realm;

    public ExampleDao() {
        _realm = Realm.getDefaultInstance();
    }

    public void InsertOrUpdateExample(ExampleEntity entity) {
        _realm.beginTransaction();
        _realm.copyToRealmOrUpdate(entity);
        _realm.commitTransaction();
    }

    public RealmResults<ExampleEntity> RetrieveAllData() {
        return _realm.where(ExampleEntity.class)
                .equalTo("status", 1)
                .findAll();
    }
}
