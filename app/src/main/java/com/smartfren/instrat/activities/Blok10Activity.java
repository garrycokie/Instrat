package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.smartfren.instrat.R;

public class Blok10Activity extends AppCompatActivity {

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

    private Button _btnNext;

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

        _btnNext = (Button) findViewById(R.id.btnNext);

        _Q129Value = GetCheckBoxValue(_cbQ129A1, cbQ129A1Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A2, cbQ129A2Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A3, cbQ129A3Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A4, cbQ129A4Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A5, cbQ129A5Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A6, cbQ129A6Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A7, cbQ129A7Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A8, cbQ129A8Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A9, cbQ129A9Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A10, cbQ129A10Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A11, cbQ129A11Value);
        _Q129Value = GetCheckBoxValue(_cbQ129A12, cbQ129A12Value);

        _btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Blok10Activity.this, Block11Activity.class);
                intent.putExtra("NO_129", _Q129Value);

                startActivity(intent);
            }
        });

    }
}
