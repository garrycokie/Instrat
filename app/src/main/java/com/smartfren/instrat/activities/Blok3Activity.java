package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok3Activity extends BaseStepsActivity {

    private RadioButton _rbQ6A1;
    private RadioButton _rbQ6A2;
    private RadioButton _rbQ6A3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok3);

        _rbQ6A1 = (RadioButton) findViewById((R.id.rbQ6A1));
        _rbQ6A2 = (RadioButton) findViewById((R.id.rbQ6A2));
        _rbQ6A3 = (RadioButton) findViewById((R.id.rbQ6A3));

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
                Bundle extras = getIntent().getExtras();
                if(_rbQ6A1.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3AActivity.class);
                    intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                    intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                    intent.putExtra("UserID", extras.getString("UserID"));
                    intent.putExtra("AccessToken", extras.getString("AccessToken"));
                    intent.putExtra("NO_1", extras.getString("NO_1"));
                    intent.putExtra("NO_2", extras.getString("NO_2"));
                    intent.putExtra("NO_3", extras.getString("NO_3"));
                    intent.putExtra("NO_4", extras.getString("NO_4"));
                    intent.putExtra("NO_5", extras.getString("NO_5"));
                    intent.putExtra("NO_6", _rbQ6A1.getText());
                    startActivity(intent);
                }
                else if(_rbQ6A2.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3BActivity.class);
                    intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                    intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                    intent.putExtra("UserID", extras.getString("UserID"));
                    intent.putExtra("AccessToken", extras.getString("AccessToken"));
                    intent.putExtra("NO_1", extras.getString("NO_1"));
                    intent.putExtra("NO_2", extras.getString("NO_2"));
                    intent.putExtra("NO_3", extras.getString("NO_3"));
                    intent.putExtra("NO_4", extras.getString("NO_4"));
                    intent.putExtra("NO_5", extras.getString("NO_5"));
                    intent.putExtra("NO_6", _rbQ6A2.getText());
                    startActivity(intent);
                }
                else if(_rbQ6A3.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3CActivity.class);
                    intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                    intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                    intent.putExtra("UserID", extras.getString("UserID"));
                    intent.putExtra("AccessToken", extras.getString("AccessToken"));
                    intent.putExtra("NO_1", extras.getString("NO_1"));
                    intent.putExtra("NO_2", extras.getString("NO_2"));
                    intent.putExtra("NO_3", extras.getString("NO_3"));
                    intent.putExtra("NO_4", extras.getString("NO_4"));
                    intent.putExtra("NO_5", extras.getString("NO_5"));
                    intent.putExtra("NO_6", _rbQ6A3.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }


}
