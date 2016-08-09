package com.smartfren.instrat.data;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class BaseDao {

    DatabaseHelper dbHelper;
    SQLiteDatabase database;

    public BaseDao(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() throws SQLException {
        open(false);
    }

    public void open(Boolean isReadOnly) throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void beginTx(){
        database.beginTransaction();
    }

    public void setTxSuccess(){
        database.setTransactionSuccessful();
    }

    public void endTx(){
        database.endTransaction();
    }
}
