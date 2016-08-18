package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok7BActivity extends AppCompatActivity {
    private Spinner _spQ107A;

    private CheckBox _cbQ106A1;
    private CheckBox _cbQ106A2;
    private CheckBox _cbQ106A3;
    private CheckBox _cbQ106A4;
    private CheckBox _cbQ106A5;

    private CheckBox _cbQ108A1;
    private CheckBox _cbQ108A2;
    private CheckBox _cbQ108A3;
    private CheckBox _cbQ108A4;
    private CheckBox _cbQ108A5;
    private CheckBox _cbQ108A6;
    private CheckBox _cbQ108A7;
    private CheckBox _cbQ108A8;
    private CheckBox _cbQ108A9;
    private CheckBox _cbQ108A10;
    private CheckBox _cbQ108A11;
    private CheckBox _cbQ108A12;
    private CheckBox _cbQ108A13;
    private CheckBox _cbQ108A14;
    private CheckBox _cbQ108A15;

    private EditText _txtQ108A;

    private Button _btnNext;

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
        setContentView(R.layout.activity_blok7b);

        _cbQ106A1 = (CheckBox) findViewById(R.id.cbQ106A1);
        _cbQ106A2 = (CheckBox) findViewById(R.id.cbQ106A2);
        _cbQ106A3 = (CheckBox) findViewById(R.id.cbQ106A3);
        _cbQ106A4 = (CheckBox) findViewById(R.id.cbQ106A4);
        _cbQ106A5 = (CheckBox) findViewById(R.id.cbQ106A5);

        _spQ107A = (Spinner) findViewById(R.id.spQ107A);

        _cbQ108A1 = (CheckBox) findViewById(R.id.cbQ108A1);
        _cbQ108A2 = (CheckBox) findViewById(R.id.cbQ108A2);
        _cbQ108A3 = (CheckBox) findViewById(R.id.cbQ108A3);
        _cbQ108A4 = (CheckBox) findViewById(R.id.cbQ108A4);
        _cbQ108A5 = (CheckBox) findViewById(R.id.cbQ108A5);
        _cbQ108A6 = (CheckBox) findViewById(R.id.cbQ108A6);
        _cbQ108A7 = (CheckBox) findViewById(R.id.cbQ108A7);
        _cbQ108A8 = (CheckBox) findViewById(R.id.cbQ108A8);
        _cbQ108A9 = (CheckBox) findViewById(R.id.cbQ108A9);
        _cbQ108A10 = (CheckBox) findViewById(R.id.cbQ108A10);
        _cbQ108A11 = (CheckBox) findViewById(R.id.cbQ108A11);
        _cbQ108A12 = (CheckBox) findViewById(R.id.cbQ108A12);
        _cbQ108A13 = (CheckBox) findViewById(R.id.cbQ108A13);
        _cbQ108A14 = (CheckBox) findViewById(R.id.cbQ108A14);
        _cbQ108A15 = (CheckBox) findViewById(R.id.cbQ108A15);

        _cbQ108A1.setVisibility(View.VISIBLE);
        _cbQ108A2.setVisibility(View.VISIBLE);
        _cbQ108A3.setVisibility(View.VISIBLE);
        _cbQ108A4.setVisibility(View.VISIBLE);
        _cbQ108A5.setVisibility(View.VISIBLE);
        _cbQ108A6.setVisibility(View.VISIBLE);
        _cbQ108A7.setVisibility(View.VISIBLE);
        _cbQ108A8.setVisibility(View.VISIBLE);
        _cbQ108A9.setVisibility(View.VISIBLE);
        _cbQ108A10.setVisibility(View.VISIBLE);
        _cbQ108A11.setVisibility(View.VISIBLE);
        _cbQ108A12.setVisibility(View.VISIBLE);
        _cbQ108A13.setVisibility(View.VISIBLE);
        _cbQ108A14.setVisibility(View.VISIBLE);
        _cbQ108A15.setVisibility(View.VISIBLE);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _txtQ108A = (EditText) findViewById(R.id.txtQ108A);

        _spQ107A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ108A1.setVisibility(View.VISIBLE);
                    _cbQ108A2.setVisibility(View.VISIBLE);
                    _cbQ108A3.setVisibility(View.VISIBLE);
                    _cbQ108A4.setVisibility(View.VISIBLE);
                    _cbQ108A5.setVisibility(View.VISIBLE);
                    _cbQ108A6.setVisibility(View.VISIBLE);
                    _cbQ108A7.setVisibility(View.VISIBLE);
                    _cbQ108A8.setVisibility(View.GONE);
                    _cbQ108A9.setVisibility(View.GONE);
                    _cbQ108A10.setVisibility(View.GONE);
                    _cbQ108A11.setVisibility(View.GONE);
                    _cbQ108A12.setVisibility(View.GONE);
                    _cbQ108A13.setVisibility(View.GONE);
                    _cbQ108A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ108A1.setVisibility(View.VISIBLE);
                    _cbQ108A2.setVisibility(View.VISIBLE);
                    _cbQ108A3.setVisibility(View.VISIBLE);
                    _cbQ108A4.setVisibility(View.VISIBLE);
                    _cbQ108A5.setVisibility(View.VISIBLE);
                    _cbQ108A6.setVisibility(View.VISIBLE);
                    _cbQ108A7.setVisibility(View.VISIBLE);
                    _cbQ108A8.setVisibility(View.VISIBLE);
                    _cbQ108A9.setVisibility(View.VISIBLE);
                    _cbQ108A10.setVisibility(View.VISIBLE);
                    _cbQ108A11.setVisibility(View.VISIBLE);
                    _cbQ108A12.setVisibility(View.VISIBLE);
                    _cbQ108A13.setVisibility(View.VISIBLE);
                    _cbQ108A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ108A1.setVisibility(View.GONE);
                    _cbQ108A2.setVisibility(View.GONE);
                    _cbQ108A3.setVisibility(View.GONE);
                    _cbQ108A4.setVisibility(View.GONE);
                    _cbQ108A5.setVisibility(View.GONE);
                    _cbQ108A6.setVisibility(View.GONE);
                    _cbQ108A7.setVisibility(View.GONE);
                    _cbQ108A8.setVisibility(View.VISIBLE);
                    _cbQ108A9.setVisibility(View.VISIBLE);
                    _cbQ108A10.setVisibility(View.VISIBLE);
                    _cbQ108A11.setVisibility(View.VISIBLE);
                    _cbQ108A12.setVisibility(View.VISIBLE);
                    _cbQ108A13.setVisibility(View.VISIBLE);
                    _cbQ108A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String A106 = "";
                A106 = GetCheckBoxValue(_cbQ106A1, A106);
                A106 = GetCheckBoxValue(_cbQ106A2, A106);
                A106 = GetCheckBoxValue(_cbQ106A3, A106);
                A106 = GetCheckBoxValue(_cbQ106A4, A106);
                A106 = GetCheckBoxValue(_cbQ106A5, A106);

                String A107 = _spQ107A.getSelectedItem().toString();

                String A108 = "";
                if(_spQ107A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A108 = GetCheckBoxValue(_cbQ108A1, A108);
                    A108 = GetCheckBoxValue(_cbQ108A2, A108);
                    A108 = GetCheckBoxValue(_cbQ108A3, A108);
                    A108 = GetCheckBoxValue(_cbQ108A4, A108);
                    A108 = GetCheckBoxValue(_cbQ108A5, A108);
                    A108 = GetCheckBoxValue(_cbQ108A6, A108);
                    A108 = GetCheckBoxValue(_cbQ108A7, A108);
                }
                else if(_spQ107A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A108 = GetCheckBoxValue(_cbQ108A1, A108);
                    A108 = GetCheckBoxValue(_cbQ108A2, A108);
                    A108 = GetCheckBoxValue(_cbQ108A3, A108);
                    A108 = GetCheckBoxValue(_cbQ108A4, A108);
                    A108 = GetCheckBoxValue(_cbQ108A5, A108);
                    A108 = GetCheckBoxValue(_cbQ108A6, A108);
                    A108 = GetCheckBoxValue(_cbQ108A7, A108);
                    A108 = GetCheckBoxValue(_cbQ108A8, A108);
                    A108 = GetCheckBoxValue(_cbQ108A9, A108);
                    A108 = GetCheckBoxValue(_cbQ108A10, A108);
                    A108 = GetCheckBoxValue(_cbQ108A11, A108);
                    A108 = GetCheckBoxValue(_cbQ108A12, A108);
                    A108 = GetCheckBoxValue(_cbQ108A13, A108);
                    A108 = GetCheckBoxValue(_cbQ108A14, A108);
                }
                else
                {
                    A108 = GetCheckBoxValue(_cbQ108A8, A108);
                    A108 = GetCheckBoxValue(_cbQ108A9, A108);
                    A108 = GetCheckBoxValue(_cbQ108A10, A108);
                    A108 = GetCheckBoxValue(_cbQ108A11, A108);
                    A108 = GetCheckBoxValue(_cbQ108A12, A108);
                    A108 = GetCheckBoxValue(_cbQ108A13, A108);
                    A108 = GetCheckBoxValue(_cbQ108A14, A108);
                }

                if(_cbQ108A15.isChecked())
                {
                    A108 = A108 + ";" + _txtQ108A.getText().toString();
                }

                Intent intent = new Intent(Blok7BActivity.this, Blok7CActivity.class);
                intent.putExtra("NO_106", A106);
                intent.putExtra("NO_107", A107);
                intent.putExtra("NO_108", A108);


            }
        });
    }
}
