package com.smartfren.instrat.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    public static final String DATABASE_NAME = "instrat.db";
    public static final int DATABASE_VERSION = 100;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        // TODO: create table, use example below
        /*
        --> Example simple table
        database.execSQL("CREATE TABLE " + TBL_ANNOUNCEMENT + " ("
                + ANNOUNCEMENT_ID + " INTEGER PRIMARY KEY NOT NULL, "
                + ANOUNCED_ON + " DATETIME,"
                + MESSAGES + " TEXT"
                + ");");

        --> Example table with foreign key
        database.execSQL("CREATE TABLE " + TBL_PAYMENT_ADDITIONAL_INFO + " ("
                + ADDITIONAL_INFO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PAYMENT_ID + " INTEGER, "
                + INFO_NAME + " VARCHAR(100) NOT NULL, "
                + INFO_DATATYPE + " CHAR(20), "
                + INFO_VALUE + " VARCHAR(100), "
                + INFO_STATUS + " SMALLINT, "
                + INFO_SENT_TO_SERVER + " SMALLINT, "
                + INFO_WEBID + " INTEGER, "
                + " FOREIGN KEY (" + PAYMENT_ID + ") REFERENCES " + TBL_PAYMENT + "(" + PAYMENT_ID + ") "
                + ");");
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVer, int newVer) {
        if (oldVer != newVer) {
            Log.d(TAG,
                    "Upgrading database from version " + oldVer + " to "
                            + newVer + ", which will destroy all old data");
            // TODO: drop all existing table, use example below
            // database.execSQL("DROP TABLE IF EXISTS " + TBL_ANNOUNCEMENT);

            onCreate(database);
        }
    }
}