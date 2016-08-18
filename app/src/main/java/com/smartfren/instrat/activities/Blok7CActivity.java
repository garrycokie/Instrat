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

public class Blok7CActivity extends AppCompatActivity {
    private Spinner _spQ110A;

    private CheckBox _cbQ109A1;
    private CheckBox _cbQ109A2;
    private CheckBox _cbQ109A3;
    private CheckBox _cbQ109A4;
    private CheckBox _cbQ109A5;

    private CheckBox _cbQ111A1;
    private CheckBox _cbQ111A2;
    private CheckBox _cbQ111A3;
    private CheckBox _cbQ111A4;
    private CheckBox _cbQ111A5;
    private CheckBox _cbQ111A6;
    private CheckBox _cbQ111A7;
    private CheckBox _cbQ111A8;
    private CheckBox _cbQ111A9;
    private CheckBox _cbQ111A10;
    private CheckBox _cbQ111A11;
    private CheckBox _cbQ111A12;
    private CheckBox _cbQ111A13;
    private CheckBox _cbQ111A14;
    private CheckBox _cbQ111A15;

    private EditText _txtQ111A;

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
        setContentView(R.layout.activity_blok7c);

        _cbQ109A1 = (CheckBox) findViewById(R.id.cbQ109A1);
        _cbQ109A2 = (CheckBox) findViewById(R.id.cbQ109A2);
        _cbQ109A3 = (CheckBox) findViewById(R.id.cbQ109A3);
        _cbQ109A4 = (CheckBox) findViewById(R.id.cbQ109A4);
        _cbQ109A5 = (CheckBox) findViewById(R.id.cbQ109A5);

        _spQ110A = (Spinner) findViewById(R.id.spQ110A);

        _cbQ111A1 = (CheckBox) findViewById(R.id.cbQ111A1);
        _cbQ111A2 = (CheckBox) findViewById(R.id.cbQ111A2);
        _cbQ111A3 = (CheckBox) findViewById(R.id.cbQ111A3);
        _cbQ111A4 = (CheckBox) findViewById(R.id.cbQ111A4);
        _cbQ111A5 = (CheckBox) findViewById(R.id.cbQ111A5);
        _cbQ111A6 = (CheckBox) findViewById(R.id.cbQ111A6);
        _cbQ111A7 = (CheckBox) findViewById(R.id.cbQ111A7);
        _cbQ111A8 = (CheckBox) findViewById(R.id.cbQ111A8);
        _cbQ111A9 = (CheckBox) findViewById(R.id.cbQ111A9);
        _cbQ111A10 = (CheckBox) findViewById(R.id.cbQ111A10);
        _cbQ111A11 = (CheckBox) findViewById(R.id.cbQ111A11);
        _cbQ111A12 = (CheckBox) findViewById(R.id.cbQ111A12);
        _cbQ111A13 = (CheckBox) findViewById(R.id.cbQ111A13);
        _cbQ111A14 = (CheckBox) findViewById(R.id.cbQ111A14);
        _cbQ111A15 = (CheckBox) findViewById(R.id.cbQ111A15);

        _cbQ111A1.setVisibility(View.VISIBLE);
        _cbQ111A2.setVisibility(View.VISIBLE);
        _cbQ111A3.setVisibility(View.VISIBLE);
        _cbQ111A4.setVisibility(View.VISIBLE);
        _cbQ111A5.setVisibility(View.VISIBLE);
        _cbQ111A6.setVisibility(View.VISIBLE);
        _cbQ111A7.setVisibility(View.VISIBLE);
        _cbQ111A8.setVisibility(View.VISIBLE);
        _cbQ111A9.setVisibility(View.VISIBLE);
        _cbQ111A10.setVisibility(View.VISIBLE);
        _cbQ111A11.setVisibility(View.VISIBLE);
        _cbQ111A12.setVisibility(View.VISIBLE);
        _cbQ111A13.setVisibility(View.VISIBLE);
        _cbQ111A14.setVisibility(View.VISIBLE);
        _cbQ111A15.setVisibility(View.VISIBLE);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _txtQ111A = (EditText) findViewById(R.id.txtQ111A);

        _spQ110A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ111A1.setVisibility(View.VISIBLE);
                    _cbQ111A2.setVisibility(View.VISIBLE);
                    _cbQ111A3.setVisibility(View.VISIBLE);
                    _cbQ111A4.setVisibility(View.VISIBLE);
                    _cbQ111A5.setVisibility(View.VISIBLE);
                    _cbQ111A6.setVisibility(View.VISIBLE);
                    _cbQ111A7.setVisibility(View.VISIBLE);
                    _cbQ111A8.setVisibility(View.GONE);
                    _cbQ111A9.setVisibility(View.GONE);
                    _cbQ111A10.setVisibility(View.GONE);
                    _cbQ111A11.setVisibility(View.GONE);
                    _cbQ111A12.setVisibility(View.GONE);
                    _cbQ111A13.setVisibility(View.GONE);
                    _cbQ111A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ111A1.setVisibility(View.VISIBLE);
                    _cbQ111A2.setVisibility(View.VISIBLE);
                    _cbQ111A3.setVisibility(View.VISIBLE);
                    _cbQ111A4.setVisibility(View.VISIBLE);
                    _cbQ111A5.setVisibility(View.VISIBLE);
                    _cbQ111A6.setVisibility(View.VISIBLE);
                    _cbQ111A7.setVisibility(View.VISIBLE);
                    _cbQ111A8.setVisibility(View.VISIBLE);
                    _cbQ111A9.setVisibility(View.VISIBLE);
                    _cbQ111A10.setVisibility(View.VISIBLE);
                    _cbQ111A11.setVisibility(View.VISIBLE);
                    _cbQ111A12.setVisibility(View.VISIBLE);
                    _cbQ111A13.setVisibility(View.VISIBLE);
                    _cbQ111A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ111A1.setVisibility(View.GONE);
                    _cbQ111A2.setVisibility(View.GONE);
                    _cbQ111A3.setVisibility(View.GONE);
                    _cbQ111A4.setVisibility(View.GONE);
                    _cbQ111A5.setVisibility(View.GONE);
                    _cbQ111A6.setVisibility(View.GONE);
                    _cbQ111A7.setVisibility(View.GONE);
                    _cbQ111A8.setVisibility(View.VISIBLE);
                    _cbQ111A9.setVisibility(View.VISIBLE);
                    _cbQ111A10.setVisibility(View.VISIBLE);
                    _cbQ111A11.setVisibility(View.VISIBLE);
                    _cbQ111A12.setVisibility(View.VISIBLE);
                    _cbQ111A13.setVisibility(View.VISIBLE);
                    _cbQ111A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String A109 = "";
                A109 = GetCheckBoxValue(_cbQ109A1, A109);
                A109 = GetCheckBoxValue(_cbQ109A2, A109);
                A109 = GetCheckBoxValue(_cbQ109A3, A109);
                A109 = GetCheckBoxValue(_cbQ109A4, A109);
                A109 = GetCheckBoxValue(_cbQ109A5, A109);

                String A110 = _spQ110A.getSelectedItem().toString();

                String A111 = "";
                if(_spQ110A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A111 = GetCheckBoxValue(_cbQ111A1, A111);
                    A111 = GetCheckBoxValue(_cbQ111A2, A111);
                    A111 = GetCheckBoxValue(_cbQ111A3, A111);
                    A111 = GetCheckBoxValue(_cbQ111A4, A111);
                    A111 = GetCheckBoxValue(_cbQ111A5, A111);
                    A111 = GetCheckBoxValue(_cbQ111A6, A111);
                    A111 = GetCheckBoxValue(_cbQ111A7, A111);
                }
                else if(_spQ110A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A111 = GetCheckBoxValue(_cbQ111A1, A111);
                    A111 = GetCheckBoxValue(_cbQ111A2, A111);
                    A111 = GetCheckBoxValue(_cbQ111A3, A111);
                    A111 = GetCheckBoxValue(_cbQ111A4, A111);
                    A111 = GetCheckBoxValue(_cbQ111A5, A111);
                    A111 = GetCheckBoxValue(_cbQ111A6, A111);
                    A111 = GetCheckBoxValue(_cbQ111A7, A111);
                    A111 = GetCheckBoxValue(_cbQ111A8, A111);
                    A111 = GetCheckBoxValue(_cbQ111A9, A111);
                    A111 = GetCheckBoxValue(_cbQ111A10, A111);
                    A111 = GetCheckBoxValue(_cbQ111A11, A111);
                    A111 = GetCheckBoxValue(_cbQ111A12, A111);
                    A111 = GetCheckBoxValue(_cbQ111A13, A111);
                    A111 = GetCheckBoxValue(_cbQ111A14, A111);
                }
                else
                {
                    A111 = GetCheckBoxValue(_cbQ111A8, A111);
                    A111 = GetCheckBoxValue(_cbQ111A9, A111);
                    A111 = GetCheckBoxValue(_cbQ111A10, A111);
                    A111 = GetCheckBoxValue(_cbQ111A11, A111);
                    A111 = GetCheckBoxValue(_cbQ111A12, A111);
                    A111 = GetCheckBoxValue(_cbQ111A13, A111);
                    A111 = GetCheckBoxValue(_cbQ111A14, A111);
                }

                if(_cbQ111A15.isChecked())
                {
                    A111 = A111 + ";" + _txtQ111A.getText().toString();
                }

                Intent intent = new Intent(Blok7CActivity.this, Blok7DActivity.class);
                intent.putExtra("NO_109", A109);
                intent.putExtra("NO_110", A110);
                intent.putExtra("NO_111", A111);


            }
        });
    }
}
