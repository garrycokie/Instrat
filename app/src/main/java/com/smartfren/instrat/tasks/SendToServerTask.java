package com.smartfren.instrat.tasks;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import com.smartfren.instrat.activities.MainActivity;

/**
 * Created by ASUS on 1/5/2017.
 */

public class SendToServerTask extends AsyncTask<Void, Integer, Boolean> {
    private static final String TAG = "SendToServerTask";
    private final MainActivity _activity;
    ProgressDialog dialog;

    public SendToServerTask(MainActivity activity){
        this._activity = activity;
    }

    @Override
    protected void onPreExecute() {
        dialog = new ProgressDialog(_activity);
        dialog.setTitle("Send data to server");
        dialog.setMessage("Please wait while sending...");
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.show();
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        SendToServerWs ws = new SendToServerWs(_activity.getApplicationContext());
        return ws.sendData(this);
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        dialog.setMessage("Please wait while sending...");
    }

    @Override
    protected void onPostExecute(Boolean result) {
        Log.d(TAG, "result:" + result);
        _activity.SendComplete(result);
        dialog.dismiss();
    }
}