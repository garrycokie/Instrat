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

public class Blok7FActivity extends AppCompatActivity {
    private Spinner _spQ119A;

    private CheckBox _cbQ118A1;
    private CheckBox _cbQ118A2;
    private CheckBox _cbQ118A3;
    private CheckBox _cbQ118A4;
    private CheckBox _cbQ118A5;

    private CheckBox _cbQ120A1;
    private CheckBox _cbQ120A2;
    private CheckBox _cbQ120A3;
    private CheckBox _cbQ120A4;
    private CheckBox _cbQ120A5;
    private CheckBox _cbQ120A6;
    private CheckBox _cbQ120A7;
    private CheckBox _cbQ120A8;
    private CheckBox _cbQ120A9;
    private CheckBox _cbQ120A10;
    private CheckBox _cbQ120A11;
    private CheckBox _cbQ120A12;
    private CheckBox _cbQ120A13;
    private CheckBox _cbQ120A14;
    private CheckBox _cbQ120A15;

    private EditText _txtQ120A;

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
        setContentView(R.layout.activity_blok7f);

        _cbQ118A1 = (CheckBox) findViewById(R.id.cbQ118A1);
        _cbQ118A2 = (CheckBox) findViewById(R.id.cbQ118A2);
        _cbQ118A3 = (CheckBox) findViewById(R.id.cbQ118A3);
        _cbQ118A4 = (CheckBox) findViewById(R.id.cbQ118A4);
        _cbQ118A5 = (CheckBox) findViewById(R.id.cbQ118A5);

        _spQ119A = (Spinner) findViewById(R.id.spQ119A);

        _cbQ120A1 = (CheckBox) findViewById(R.id.cbQ120A1);
        _cbQ120A2 = (CheckBox) findViewById(R.id.cbQ120A2);
        _cbQ120A3 = (CheckBox) findViewById(R.id.cbQ120A3);
        _cbQ120A4 = (CheckBox) findViewById(R.id.cbQ120A4);
        _cbQ120A5 = (CheckBox) findViewById(R.id.cbQ120A5);
        _cbQ120A6 = (CheckBox) findViewById(R.id.cbQ120A6);
        _cbQ120A7 = (CheckBox) findViewById(R.id.cbQ120A7);
        _cbQ120A8 = (CheckBox) findViewById(R.id.cbQ120A8);
        _cbQ120A9 = (CheckBox) findViewById(R.id.cbQ120A9);
        _cbQ120A10 = (CheckBox) findViewById(R.id.cbQ120A10);
        _cbQ120A11 = (CheckBox) findViewById(R.id.cbQ120A11);
        _cbQ120A12 = (CheckBox) findViewById(R.id.cbQ120A12);
        _cbQ120A13 = (CheckBox) findViewById(R.id.cbQ120A13);
        _cbQ120A14 = (CheckBox) findViewById(R.id.cbQ120A14);
        _cbQ120A15 = (CheckBox) findViewById(R.id.cbQ120A15);

        _cbQ120A1.setVisibility(View.VISIBLE);
        _cbQ120A2.setVisibility(View.VISIBLE);
        _cbQ120A3.setVisibility(View.VISIBLE);
        _cbQ120A4.setVisibility(View.VISIBLE);
        _cbQ120A5.setVisibility(View.VISIBLE);
        _cbQ120A6.setVisibility(View.VISIBLE);
        _cbQ120A7.setVisibility(View.VISIBLE);
        _cbQ120A8.setVisibility(View.VISIBLE);
        _cbQ120A9.setVisibility(View.VISIBLE);
        _cbQ120A10.setVisibility(View.VISIBLE);
        _cbQ120A11.setVisibility(View.VISIBLE);
        _cbQ120A12.setVisibility(View.VISIBLE);
        _cbQ120A13.setVisibility(View.VISIBLE);
        _cbQ120A14.setVisibility(View.VISIBLE);
        _cbQ120A15.setVisibility(View.VISIBLE);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _txtQ120A = (EditText) findViewById(R.id.txtQ120A);

        _spQ119A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ120A1.setVisibility(View.VISIBLE);
                    _cbQ120A2.setVisibility(View.VISIBLE);
                    _cbQ120A3.setVisibility(View.VISIBLE);
                    _cbQ120A4.setVisibility(View.VISIBLE);
                    _cbQ120A5.setVisibility(View.VISIBLE);
                    _cbQ120A6.setVisibility(View.VISIBLE);
                    _cbQ120A7.setVisibility(View.VISIBLE);
                    _cbQ120A8.setVisibility(View.GONE);
                    _cbQ120A9.setVisibility(View.GONE);
                    _cbQ120A10.setVisibility(View.GONE);
                    _cbQ120A11.setVisibility(View.GONE);
                    _cbQ120A12.setVisibility(View.GONE);
                    _cbQ120A13.setVisibility(View.GONE);
                    _cbQ120A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ120A1.setVisibility(View.VISIBLE);
                    _cbQ120A2.setVisibility(View.VISIBLE);
                    _cbQ120A3.setVisibility(View.VISIBLE);
                    _cbQ120A4.setVisibility(View.VISIBLE);
                    _cbQ120A5.setVisibility(View.VISIBLE);
                    _cbQ120A6.setVisibility(View.VISIBLE);
                    _cbQ120A7.setVisibility(View.VISIBLE);
                    _cbQ120A8.setVisibility(View.VISIBLE);
                    _cbQ120A9.setVisibility(View.VISIBLE);
                    _cbQ120A10.setVisibility(View.VISIBLE);
                    _cbQ120A11.setVisibility(View.VISIBLE);
                    _cbQ120A12.setVisibility(View.VISIBLE);
                    _cbQ120A13.setVisibility(View.VISIBLE);
                    _cbQ120A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ120A1.setVisibility(View.GONE);
                    _cbQ120A2.setVisibility(View.GONE);
                    _cbQ120A3.setVisibility(View.GONE);
                    _cbQ120A4.setVisibility(View.GONE);
                    _cbQ120A5.setVisibility(View.GONE);
                    _cbQ120A6.setVisibility(View.GONE);
                    _cbQ120A7.setVisibility(View.GONE);
                    _cbQ120A8.setVisibility(View.VISIBLE);
                    _cbQ120A9.setVisibility(View.VISIBLE);
                    _cbQ120A10.setVisibility(View.VISIBLE);
                    _cbQ120A11.setVisibility(View.VISIBLE);
                    _cbQ120A12.setVisibility(View.VISIBLE);
                    _cbQ120A13.setVisibility(View.VISIBLE);
                    _cbQ120A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String A118 = "";
                A118 = GetCheckBoxValue(_cbQ118A1, A118);
                A118 = GetCheckBoxValue(_cbQ118A2, A118);
                A118 = GetCheckBoxValue(_cbQ118A3, A118);
                A118 = GetCheckBoxValue(_cbQ118A4, A118);
                A118 = GetCheckBoxValue(_cbQ118A5, A118);

                String A119 = _spQ119A.getSelectedItem().toString();

                String A120 = "";
                if(_spQ119A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A120 = GetCheckBoxValue(_cbQ120A1, A120);
                    A120 = GetCheckBoxValue(_cbQ120A2, A120);
                    A120 = GetCheckBoxValue(_cbQ120A3, A120);
                    A120 = GetCheckBoxValue(_cbQ120A4, A120);
                    A120 = GetCheckBoxValue(_cbQ120A5, A120);
                    A120 = GetCheckBoxValue(_cbQ120A6, A120);
                    A120 = GetCheckBoxValue(_cbQ120A7, A120);
                }
                else if(_spQ119A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A120 = GetCheckBoxValue(_cbQ120A1, A120);
                    A120 = GetCheckBoxValue(_cbQ120A2, A120);
                    A120 = GetCheckBoxValue(_cbQ120A3, A120);
                    A120 = GetCheckBoxValue(_cbQ120A4, A120);
                    A120 = GetCheckBoxValue(_cbQ120A5, A120);
                    A120 = GetCheckBoxValue(_cbQ120A6, A120);
                    A120 = GetCheckBoxValue(_cbQ120A7, A120);
                    A120 = GetCheckBoxValue(_cbQ120A8, A120);
                    A120 = GetCheckBoxValue(_cbQ120A9, A120);
                    A120 = GetCheckBoxValue(_cbQ120A10, A120);
                    A120 = GetCheckBoxValue(_cbQ120A11, A120);
                    A120 = GetCheckBoxValue(_cbQ120A12, A120);
                    A120 = GetCheckBoxValue(_cbQ120A13, A120);
                    A120 = GetCheckBoxValue(_cbQ120A14, A120);
                }
                else
                {
                    A120 = GetCheckBoxValue(_cbQ120A8, A120);
                    A120 = GetCheckBoxValue(_cbQ120A9, A120);
                    A120 = GetCheckBoxValue(_cbQ120A10, A120);
                    A120 = GetCheckBoxValue(_cbQ120A11, A120);
                    A120 = GetCheckBoxValue(_cbQ120A12, A120);
                    A120 = GetCheckBoxValue(_cbQ120A13, A120);
                    A120 = GetCheckBoxValue(_cbQ120A14, A120);
                }

                if(_cbQ120A15.isChecked())
                {
                    A120 = A120 + ";" + _txtQ120A.getText().toString();
                }

                Intent intent = new Intent(Blok7FActivity.this, Blok8Activity.class);
                intent.putExtra("NO_118", A118);
                intent.putExtra("NO_119", A119);
                intent.putExtra("NO_120", A120);


            }
        });
    }
}
