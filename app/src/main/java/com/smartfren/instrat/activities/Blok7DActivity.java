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

public class Blok7DActivity extends AppCompatActivity {
    private Spinner _spQ113A;

    private CheckBox _cbQ112A1;
    private CheckBox _cbQ112A2;
    private CheckBox _cbQ112A3;
    private CheckBox _cbQ112A4;
    private CheckBox _cbQ112A5;

    private CheckBox _cbQ114A1;
    private CheckBox _cbQ114A2;
    private CheckBox _cbQ114A3;
    private CheckBox _cbQ114A4;
    private CheckBox _cbQ114A5;
    private CheckBox _cbQ114A6;
    private CheckBox _cbQ114A7;
    private CheckBox _cbQ114A8;
    private CheckBox _cbQ114A9;
    private CheckBox _cbQ114A10;
    private CheckBox _cbQ114A11;
    private CheckBox _cbQ114A12;
    private CheckBox _cbQ114A13;
    private CheckBox _cbQ114A14;
    private CheckBox _cbQ114A15;

    private EditText _txtQ114A;

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
        setContentView(R.layout.activity_blok7d);

        _cbQ112A1 = (CheckBox) findViewById(R.id.cbQ112A1);
        _cbQ112A2 = (CheckBox) findViewById(R.id.cbQ112A2);
        _cbQ112A3 = (CheckBox) findViewById(R.id.cbQ112A3);
        _cbQ112A4 = (CheckBox) findViewById(R.id.cbQ112A4);
        _cbQ112A5 = (CheckBox) findViewById(R.id.cbQ112A5);

        _spQ113A = (Spinner) findViewById(R.id.spQ113A);

        _cbQ114A1 = (CheckBox) findViewById(R.id.cbQ114A1);
        _cbQ114A2 = (CheckBox) findViewById(R.id.cbQ114A2);
        _cbQ114A3 = (CheckBox) findViewById(R.id.cbQ114A3);
        _cbQ114A4 = (CheckBox) findViewById(R.id.cbQ114A4);
        _cbQ114A5 = (CheckBox) findViewById(R.id.cbQ114A5);
        _cbQ114A6 = (CheckBox) findViewById(R.id.cbQ114A6);
        _cbQ114A7 = (CheckBox) findViewById(R.id.cbQ114A7);
        _cbQ114A8 = (CheckBox) findViewById(R.id.cbQ114A8);
        _cbQ114A9 = (CheckBox) findViewById(R.id.cbQ114A9);
        _cbQ114A10 = (CheckBox) findViewById(R.id.cbQ114A10);
        _cbQ114A11 = (CheckBox) findViewById(R.id.cbQ114A11);
        _cbQ114A12 = (CheckBox) findViewById(R.id.cbQ114A12);
        _cbQ114A13 = (CheckBox) findViewById(R.id.cbQ114A13);
        _cbQ114A14 = (CheckBox) findViewById(R.id.cbQ114A14);
        _cbQ114A15 = (CheckBox) findViewById(R.id.cbQ114A15);

        _cbQ114A1.setVisibility(View.VISIBLE);
        _cbQ114A2.setVisibility(View.VISIBLE);
        _cbQ114A3.setVisibility(View.VISIBLE);
        _cbQ114A4.setVisibility(View.VISIBLE);
        _cbQ114A5.setVisibility(View.VISIBLE);
        _cbQ114A6.setVisibility(View.VISIBLE);
        _cbQ114A7.setVisibility(View.VISIBLE);
        _cbQ114A8.setVisibility(View.VISIBLE);
        _cbQ114A9.setVisibility(View.VISIBLE);
        _cbQ114A10.setVisibility(View.VISIBLE);
        _cbQ114A11.setVisibility(View.VISIBLE);
        _cbQ114A12.setVisibility(View.VISIBLE);
        _cbQ114A13.setVisibility(View.VISIBLE);
        _cbQ114A14.setVisibility(View.VISIBLE);
        _cbQ114A15.setVisibility(View.VISIBLE);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _txtQ114A = (EditText) findViewById(R.id.txtQ114A);

        _spQ113A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ114A1.setVisibility(View.VISIBLE);
                    _cbQ114A2.setVisibility(View.VISIBLE);
                    _cbQ114A3.setVisibility(View.VISIBLE);
                    _cbQ114A4.setVisibility(View.VISIBLE);
                    _cbQ114A5.setVisibility(View.VISIBLE);
                    _cbQ114A6.setVisibility(View.VISIBLE);
                    _cbQ114A7.setVisibility(View.VISIBLE);
                    _cbQ114A8.setVisibility(View.GONE);
                    _cbQ114A9.setVisibility(View.GONE);
                    _cbQ114A10.setVisibility(View.GONE);
                    _cbQ114A11.setVisibility(View.GONE);
                    _cbQ114A12.setVisibility(View.GONE);
                    _cbQ114A13.setVisibility(View.GONE);
                    _cbQ114A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ114A1.setVisibility(View.VISIBLE);
                    _cbQ114A2.setVisibility(View.VISIBLE);
                    _cbQ114A3.setVisibility(View.VISIBLE);
                    _cbQ114A4.setVisibility(View.VISIBLE);
                    _cbQ114A5.setVisibility(View.VISIBLE);
                    _cbQ114A6.setVisibility(View.VISIBLE);
                    _cbQ114A7.setVisibility(View.VISIBLE);
                    _cbQ114A8.setVisibility(View.VISIBLE);
                    _cbQ114A9.setVisibility(View.VISIBLE);
                    _cbQ114A10.setVisibility(View.VISIBLE);
                    _cbQ114A11.setVisibility(View.VISIBLE);
                    _cbQ114A12.setVisibility(View.VISIBLE);
                    _cbQ114A13.setVisibility(View.VISIBLE);
                    _cbQ114A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ114A1.setVisibility(View.GONE);
                    _cbQ114A2.setVisibility(View.GONE);
                    _cbQ114A3.setVisibility(View.GONE);
                    _cbQ114A4.setVisibility(View.GONE);
                    _cbQ114A5.setVisibility(View.GONE);
                    _cbQ114A6.setVisibility(View.GONE);
                    _cbQ114A7.setVisibility(View.GONE);
                    _cbQ114A8.setVisibility(View.VISIBLE);
                    _cbQ114A9.setVisibility(View.VISIBLE);
                    _cbQ114A10.setVisibility(View.VISIBLE);
                    _cbQ114A11.setVisibility(View.VISIBLE);
                    _cbQ114A12.setVisibility(View.VISIBLE);
                    _cbQ114A13.setVisibility(View.VISIBLE);
                    _cbQ114A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String A112 = "";
                A112 = GetCheckBoxValue(_cbQ112A1, A112);
                A112 = GetCheckBoxValue(_cbQ112A2, A112);
                A112 = GetCheckBoxValue(_cbQ112A3, A112);
                A112 = GetCheckBoxValue(_cbQ112A4, A112);
                A112 = GetCheckBoxValue(_cbQ112A5, A112);

                String A113 = _spQ113A.getSelectedItem().toString();

                String A114 = "";
                if(_spQ113A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A114 = GetCheckBoxValue(_cbQ114A1, A114);
                    A114 = GetCheckBoxValue(_cbQ114A2, A114);
                    A114 = GetCheckBoxValue(_cbQ114A3, A114);
                    A114 = GetCheckBoxValue(_cbQ114A4, A114);
                    A114 = GetCheckBoxValue(_cbQ114A5, A114);
                    A114 = GetCheckBoxValue(_cbQ114A6, A114);
                    A114 = GetCheckBoxValue(_cbQ114A7, A114);
                }
                else if(_spQ113A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A114 = GetCheckBoxValue(_cbQ114A1, A114);
                    A114 = GetCheckBoxValue(_cbQ114A2, A114);
                    A114 = GetCheckBoxValue(_cbQ114A3, A114);
                    A114 = GetCheckBoxValue(_cbQ114A4, A114);
                    A114 = GetCheckBoxValue(_cbQ114A5, A114);
                    A114 = GetCheckBoxValue(_cbQ114A6, A114);
                    A114 = GetCheckBoxValue(_cbQ114A7, A114);
                    A114 = GetCheckBoxValue(_cbQ114A8, A114);
                    A114 = GetCheckBoxValue(_cbQ114A9, A114);
                    A114 = GetCheckBoxValue(_cbQ114A10, A114);
                    A114 = GetCheckBoxValue(_cbQ114A11, A114);
                    A114 = GetCheckBoxValue(_cbQ114A12, A114);
                    A114 = GetCheckBoxValue(_cbQ114A13, A114);
                    A114 = GetCheckBoxValue(_cbQ114A14, A114);
                }
                else
                {
                    A114 = GetCheckBoxValue(_cbQ114A8, A114);
                    A114 = GetCheckBoxValue(_cbQ114A9, A114);
                    A114 = GetCheckBoxValue(_cbQ114A10, A114);
                    A114 = GetCheckBoxValue(_cbQ114A11, A114);
                    A114 = GetCheckBoxValue(_cbQ114A12, A114);
                    A114 = GetCheckBoxValue(_cbQ114A13, A114);
                    A114 = GetCheckBoxValue(_cbQ114A14, A114);
                }

                if(_cbQ114A15.isChecked())
                {
                    A114 = A114 + ";" + _txtQ114A.getText().toString();
                }

                Intent intent = new Intent(Blok7DActivity.this, Blok7EActivity.class);
                intent.putExtra("NO_112", A112);
                intent.putExtra("NO_113", A113);
                intent.putExtra("NO_114", A114);


            }
        });
    }
}
