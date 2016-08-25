package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Spinner;

import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.LoginEntity;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;

public class Block0Activity extends Activity {
    private static final String TAG = "NewSurveyFragment";

    private Button _btnNext;
    private Spinner _spQTipeSurvey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block0);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        _btnNext = (Button) findViewById(R.id.btnNext);
        _spQTipeSurvey = (Spinner) findViewById(R.id.spQTipeSurvey);

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tipeSurvey = _spQTipeSurvey.getSelectedItem().toString();
                Intent intent = new Intent(getApplicationContext(), Block1Activity.class);

                Realm realm = Realm.getDefaultInstance();
                RealmResults<LoginEntity> loginData = realm.where(LoginEntity.class).findAll();
                LoginEntity loginEntity = loginData.first();

                String deviceSurveyID = UUID.randomUUID().toString();
                intent.putExtra("DeviceSurveyID",deviceSurveyID);
                intent.putExtra("TipeSurvey", tipeSurvey);
                intent.putExtra("UserID", loginEntity.userID);
                intent.putExtra("AccessToken", loginEntity.accessToken);
                startActivity(intent);
            }
        });
    }
}
