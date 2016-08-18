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

public class Blok7AActivity extends AppCompatActivity {
    private Spinner _spQ104A;

    private CheckBox _cbQ103A1;
    private CheckBox _cbQ103A2;
    private CheckBox _cbQ103A3;
    private CheckBox _cbQ103A4;
    private CheckBox _cbQ103A5;

    private CheckBox _cbQ105A1;
    private CheckBox _cbQ105A2;
    private CheckBox _cbQ105A3;
    private CheckBox _cbQ105A4;
    private CheckBox _cbQ105A5;
    private CheckBox _cbQ105A6;
    private CheckBox _cbQ105A7;
    private CheckBox _cbQ105A8;
    private CheckBox _cbQ105A9;
    private CheckBox _cbQ105A10;
    private CheckBox _cbQ105A11;
    private CheckBox _cbQ105A12;
    private CheckBox _cbQ105A13;
    private CheckBox _cbQ105A14;
    private CheckBox _cbQ105A15;

    private EditText _txtQ105A;

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
        setContentView(R.layout.activity_blok7a);

        _cbQ103A1 = (CheckBox) findViewById(R.id.cbQ103A1);
        _cbQ103A2 = (CheckBox) findViewById(R.id.cbQ103A2);
        _cbQ103A3 = (CheckBox) findViewById(R.id.cbQ103A3);
        _cbQ103A4 = (CheckBox) findViewById(R.id.cbQ103A4);
        _cbQ103A5 = (CheckBox) findViewById(R.id.cbQ103A5);

        _spQ104A = (Spinner) findViewById(R.id.spQ104A);

        _cbQ105A1 = (CheckBox) findViewById(R.id.cbQ105A1);
        _cbQ105A2 = (CheckBox) findViewById(R.id.cbQ105A2);
        _cbQ105A3 = (CheckBox) findViewById(R.id.cbQ105A3);
        _cbQ105A4 = (CheckBox) findViewById(R.id.cbQ105A4);
        _cbQ105A5 = (CheckBox) findViewById(R.id.cbQ105A5);
        _cbQ105A6 = (CheckBox) findViewById(R.id.cbQ105A6);
        _cbQ105A7 = (CheckBox) findViewById(R.id.cbQ105A7);
        _cbQ105A8 = (CheckBox) findViewById(R.id.cbQ105A8);
        _cbQ105A9 = (CheckBox) findViewById(R.id.cbQ105A9);
        _cbQ105A10 = (CheckBox) findViewById(R.id.cbQ105A10);
        _cbQ105A11 = (CheckBox) findViewById(R.id.cbQ105A11);
        _cbQ105A12 = (CheckBox) findViewById(R.id.cbQ105A12);
        _cbQ105A13 = (CheckBox) findViewById(R.id.cbQ105A13);
        _cbQ105A14 = (CheckBox) findViewById(R.id.cbQ105A14);
        _cbQ105A15 = (CheckBox) findViewById(R.id.cbQ105A15);

        _cbQ105A1.setVisibility(View.VISIBLE);
        _cbQ105A2.setVisibility(View.VISIBLE);
        _cbQ105A3.setVisibility(View.VISIBLE);
        _cbQ105A4.setVisibility(View.VISIBLE);
        _cbQ105A5.setVisibility(View.VISIBLE);
        _cbQ105A6.setVisibility(View.VISIBLE);
        _cbQ105A7.setVisibility(View.VISIBLE);
        _cbQ105A8.setVisibility(View.VISIBLE);
        _cbQ105A9.setVisibility(View.VISIBLE);
        _cbQ105A10.setVisibility(View.VISIBLE);
        _cbQ105A11.setVisibility(View.VISIBLE);
        _cbQ105A12.setVisibility(View.VISIBLE);
        _cbQ105A13.setVisibility(View.VISIBLE);
        _cbQ105A14.setVisibility(View.VISIBLE);
        _cbQ105A15.setVisibility(View.VISIBLE);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _txtQ105A = (EditText) findViewById(R.id.txtQ105A);

        _spQ104A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ105A1.setVisibility(View.VISIBLE);
                    _cbQ105A2.setVisibility(View.VISIBLE);
                    _cbQ105A3.setVisibility(View.VISIBLE);
                    _cbQ105A4.setVisibility(View.VISIBLE);
                    _cbQ105A5.setVisibility(View.VISIBLE);
                    _cbQ105A6.setVisibility(View.VISIBLE);
                    _cbQ105A7.setVisibility(View.VISIBLE);
                    _cbQ105A8.setVisibility(View.GONE);
                    _cbQ105A9.setVisibility(View.GONE);
                    _cbQ105A10.setVisibility(View.GONE);
                    _cbQ105A11.setVisibility(View.GONE);
                    _cbQ105A12.setVisibility(View.GONE);
                    _cbQ105A13.setVisibility(View.GONE);
                    _cbQ105A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ105A1.setVisibility(View.VISIBLE);
                    _cbQ105A2.setVisibility(View.VISIBLE);
                    _cbQ105A3.setVisibility(View.VISIBLE);
                    _cbQ105A4.setVisibility(View.VISIBLE);
                    _cbQ105A5.setVisibility(View.VISIBLE);
                    _cbQ105A6.setVisibility(View.VISIBLE);
                    _cbQ105A7.setVisibility(View.VISIBLE);
                    _cbQ105A8.setVisibility(View.VISIBLE);
                    _cbQ105A9.setVisibility(View.VISIBLE);
                    _cbQ105A10.setVisibility(View.VISIBLE);
                    _cbQ105A11.setVisibility(View.VISIBLE);
                    _cbQ105A12.setVisibility(View.VISIBLE);
                    _cbQ105A13.setVisibility(View.VISIBLE);
                    _cbQ105A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ105A1.setVisibility(View.GONE);
                    _cbQ105A2.setVisibility(View.GONE);
                    _cbQ105A3.setVisibility(View.GONE);
                    _cbQ105A4.setVisibility(View.GONE);
                    _cbQ105A5.setVisibility(View.GONE);
                    _cbQ105A6.setVisibility(View.GONE);
                    _cbQ105A7.setVisibility(View.GONE);
                    _cbQ105A8.setVisibility(View.VISIBLE);
                    _cbQ105A9.setVisibility(View.VISIBLE);
                    _cbQ105A10.setVisibility(View.VISIBLE);
                    _cbQ105A11.setVisibility(View.VISIBLE);
                    _cbQ105A12.setVisibility(View.VISIBLE);
                    _cbQ105A13.setVisibility(View.VISIBLE);
                    _cbQ105A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String A103 = "";
                A103 = GetCheckBoxValue(_cbQ103A1, A103);
                A103 = GetCheckBoxValue(_cbQ103A2, A103);
                A103 = GetCheckBoxValue(_cbQ103A3, A103);
                A103 = GetCheckBoxValue(_cbQ103A4, A103);
                A103 = GetCheckBoxValue(_cbQ103A5, A103);

                String A104 = _spQ104A.getSelectedItem().toString();

                String A105 = "";
                if(_spQ104A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A105 = GetCheckBoxValue(_cbQ105A1, A105);
                    A105 = GetCheckBoxValue(_cbQ105A2, A105);
                    A105 = GetCheckBoxValue(_cbQ105A3, A105);
                    A105 = GetCheckBoxValue(_cbQ105A4, A105);
                    A105 = GetCheckBoxValue(_cbQ105A5, A105);
                    A105 = GetCheckBoxValue(_cbQ105A6, A105);
                    A105 = GetCheckBoxValue(_cbQ105A7, A105);
                }
                else if(_spQ104A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A105 = GetCheckBoxValue(_cbQ105A1, A105);
                    A105 = GetCheckBoxValue(_cbQ105A2, A105);
                    A105 = GetCheckBoxValue(_cbQ105A3, A105);
                    A105 = GetCheckBoxValue(_cbQ105A4, A105);
                    A105 = GetCheckBoxValue(_cbQ105A5, A105);
                    A105 = GetCheckBoxValue(_cbQ105A6, A105);
                    A105 = GetCheckBoxValue(_cbQ105A7, A105);
                    A105 = GetCheckBoxValue(_cbQ105A8, A105);
                    A105 = GetCheckBoxValue(_cbQ105A9, A105);
                    A105 = GetCheckBoxValue(_cbQ105A10, A105);
                    A105 = GetCheckBoxValue(_cbQ105A11, A105);
                    A105 = GetCheckBoxValue(_cbQ105A12, A105);
                    A105 = GetCheckBoxValue(_cbQ105A13, A105);
                    A105 = GetCheckBoxValue(_cbQ105A14, A105);
                }
                else
                {
                    A105 = GetCheckBoxValue(_cbQ105A8, A105);
                    A105 = GetCheckBoxValue(_cbQ105A9, A105);
                    A105 = GetCheckBoxValue(_cbQ105A10, A105);
                    A105 = GetCheckBoxValue(_cbQ105A11, A105);
                    A105 = GetCheckBoxValue(_cbQ105A12, A105);
                    A105 = GetCheckBoxValue(_cbQ105A13, A105);
                    A105 = GetCheckBoxValue(_cbQ105A14, A105);
                }

                if(_cbQ105A15.isChecked())
                {
                    A105 = A105 + ";" + _txtQ105A.getText().toString();
                }

                Intent intent = new Intent(Blok7AActivity.this, Blok7BActivity.class);
                intent.putExtra("NO_103", A103);
                intent.putExtra("NO_104", A104);
                intent.putExtra("NO_105", A105);


            }
        });
    }
}
