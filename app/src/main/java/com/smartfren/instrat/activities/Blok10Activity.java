package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.smartfren.instrat.R;

public class Blok10Activity extends BaseStepsActivity {

    private CheckBox _cbQ129A1;
    private CheckBox _cbQ129A2;
    private CheckBox _cbQ129A3;
    private CheckBox _cbQ129A4;
    private CheckBox _cbQ129A5;
    private CheckBox _cbQ129A6;
    private CheckBox _cbQ129A7;
    private CheckBox _cbQ129A8;
    private CheckBox _cbQ129A9;
    private CheckBox _cbQ129A10;
    private CheckBox _cbQ129A11;
    private CheckBox _cbQ129A12;

    private String _Q129Value;

    protected String GetCheckBoxValue(CheckBox cb, String result)
    {
        if(cb.isChecked())
        {
            result = result + ";"+ cb.getText().toString();
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok10);

        _cbQ129A1 = (CheckBox) findViewById(R.id.cbQ129A1);
        _cbQ129A2 = (CheckBox) findViewById(R.id.cbQ129A2);
        _cbQ129A3 = (CheckBox) findViewById(R.id.cbQ129A3);
        _cbQ129A4 = (CheckBox) findViewById(R.id.cbQ129A4);
        _cbQ129A5 = (CheckBox) findViewById(R.id.cbQ129A5);
        _cbQ129A6 = (CheckBox) findViewById(R.id.cbQ129A6);
        _cbQ129A7 = (CheckBox) findViewById(R.id.cbQ129A7);
        _cbQ129A8 = (CheckBox) findViewById(R.id.cbQ129A8);
        _cbQ129A9 = (CheckBox) findViewById(R.id.cbQ129A9);
        _cbQ129A10 = (CheckBox) findViewById(R.id.cbQ129A10);
        _cbQ129A11 = (CheckBox) findViewById(R.id.cbQ129A11);
        _cbQ129A12 = (CheckBox) findViewById(R.id.cbQ129A12);

        _Q129Value = GetCheckBoxValue(_cbQ129A1, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A2, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A3, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A4, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A5, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A6, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A7, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A8, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A9, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A10, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A11, _Q129Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A12, _Q129Value);

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {

            }

            @Override
            public void onContinueClicked() {
                Intent intent = new Intent(Blok10Activity.this, Block11Activity.class);
                intent.putExtra("NO_129", _Q129Value);

                startActivity(intent);
            }
        });

    }
}
