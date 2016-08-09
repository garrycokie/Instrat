package com.smartfren.instrat.data;

import android.content.Context;

public class ExampleDao extends BaseDao {
    private static final String TAG = "AdvanceDao";

    public ExampleDao(Context context) {
        super(context);
    }

    // TODO: add CRUD, use example below
    /*
    public void AddOrUpdateAdvance(Advance adv) {
        Log.d(TAG, "Insert or Update Advance : " + adv);

        ContentValues values = new ContentValues();
        values.put(ADVANCE_NOMINAL, adv.Nominal);
        values.put(ADVANCE_STARTDATE, adv.StartDate.getTime());
        values.put(ADVANCE_ENDDATE, adv.EndDate.getTime());
        values.put(ADVANCE_STATUS, adv.Status);
        values.put(ADVANCE_SEND_TO_SERVER, adv.SendToServer);
        values.put(WEB_ID, adv.WebID);

        if (adv.AdvanceID > 0) {
            String whereClause = ADVANCE_ID + "=?";
            String[] whereArgs = {"" + adv.AdvanceID};
            database.update(TBL_ADVANCE, values, whereClause, whereArgs);
        } else {
            database.insertOrThrow(TBL_ADVANCE, null, values);
        }
    }

    public void InsertOrUpdateAdvanceFromWeb(AdvanceRetrieveModel adv) {
        Log.d(TAG, "Insert or Update Advance from Web : " + adv);

        ContentValues values = new ContentValues();
        values.put(ADVANCE_NOMINAL, adv.Nominal);
        values.put(ADVANCE_STARTDATE, adv.StartDate.getTime());
        values.put(ADVANCE_ENDDATE, adv.EndDate.getTime());
        values.put(ADVANCE_STATUS, adv.Status);
        values.put(ADVANCE_SEND_TO_SERVER, 3);
        values.put(WEB_ID, adv._ID);

        if (adv.AndroidID == 0) {
            database.insert(TBL_ADVANCE, null, values);
        } else {
            String whereClause = WEB_ID + "=?";
            String[] whereArgs = {"" + adv._ID};
            database.update(TBL_ADVANCE, values, whereClause, whereArgs);
        }
    }

    public void DeleteAdvance(long advanceId) {
        ContentValues values = new ContentValues();
        values.put(ADVANCE_STATUS, 255);
        values.put(ADVANCE_SEND_TO_SERVER, 1);

        String whereClause = ADVANCE_ID + "=?";
        String[] whereArgs = {"" + advanceId};

        database.update(TBL_ADVANCE, values, whereClause, whereArgs);
    }

    public Cursor GetAdvanceByWebId(long webId) {
        String sql = "SELECT * FROM " + TBL_ADVANCE + " WHERE " + WEB_ID + " = " + webId;
        Log.i(TAG, sql);
        Cursor cursor = database.rawQuery(sql, null);

        return cursor;
    }

    public List<Advance> RetrieveSyncAdvance() {
        Log.d(TAG, "Retrieve Advance Sync Item List");
        List<Advance> result = new ArrayList<Advance>();

        String sql = "SELECT * FROM " + TBL_ADVANCE + " WHERE " + ADVANCE_SEND_TO_SERVER + "=1 OR " + ADVANCE_SEND_TO_SERVER + "=2";
        Log.d(TAG, sql);
        Cursor cursor = database.rawQuery(sql, null);
        while (cursor.moveToNext()) {
            Advance newAdvItem = new Advance();
            newAdvItem.AdvanceID = cursor.getLong(0);
            newAdvItem.StartDate = new Date(cursor.getLong(1));
            newAdvItem.EndDate = new Date(cursor.getLong(2));
            newAdvItem.Nominal = cursor.getDouble(3);
            newAdvItem.Status = cursor.getInt(4);
            newAdvItem.SendToServer = cursor.getInt(5);
            newAdvItem.WebID = cursor.getLong(6);
            result.add(newAdvItem);
        }
        cursor.close();

        return result;
    }
    */
}
