package com.smartfren.instrat.data;

import com.smartfren.instrat.entities.ExampleEntity;

import java.util.Map;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class ExampleDao extends BaseDao<ExampleEntity> {

    private static final String TAG = "ExampleDao";
    private Realm _realm;

    public ExampleDao() {
        super(ExampleEntity.class);
        _realm = Realm.getDefaultInstance();
    }

    // Contoh klo mau override methodnya
    @Override
    public RealmResults<ExampleEntity> RetrieveAll(Map<String, String> params) {
        RealmQuery<ExampleEntity> query = _realm.where(ExampleEntity.class);
        query.equalTo("status", params.get("status"));
        return query.findAll();
    }
}