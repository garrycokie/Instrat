package com.smartfren.instrat.data;

import java.util.Map;

import io.realm.*;

public class BaseDao<T extends RealmObject> {

    private Class<T> _genericType;

    protected Realm _realm;

    public BaseDao(Class<T> genericType) {
        _genericType = genericType;
        _realm = Realm.getDefaultInstance();
    }

    public void CopyOrUpdateEntity(T entity) {
        _realm.beginTransaction();
        // copy or update hanya bisa digunakan untuk entity yang ada anotasi @PrimaryKey
        _realm.copyToRealmOrUpdate(entity);
        _realm.commitTransaction();
    }

    public RealmResults<T> RetrieveAll(Map<String, String> params) {
        RealmQuery<T> query = _realm.where(_genericType);
        for(Map.Entry<String, String> entry : params.entrySet()) {
            query.equalTo(entry.getKey(), entry.getValue());
        }
        return query.findAll();
    }

    public void closeDatabase() {
        _realm.close();
    }
}
