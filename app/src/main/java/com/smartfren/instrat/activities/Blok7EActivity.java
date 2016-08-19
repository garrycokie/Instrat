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

public class Blok7EActivity extends BaseStepsActivity {
    private Spinner _spQ116A;

    private CheckBox _cbQ115A1;
    private CheckBox _cbQ115A2;
    private CheckBox _cbQ115A3;
    private CheckBox _cbQ115A4;
    private CheckBox _cbQ115A5;

    private CheckBox _cbQ117A1;
    private CheckBox _cbQ117A2;
    private CheckBox _cbQ117A3;
    private CheckBox _cbQ117A4;
    private CheckBox _cbQ117A5;
    private CheckBox _cbQ117A6;
    private CheckBox _cbQ117A7;
    private CheckBox _cbQ117A8;
    private CheckBox _cbQ117A9;
    private CheckBox _cbQ117A10;
    private CheckBox _cbQ117A11;
    private CheckBox _cbQ117A12;
    private CheckBox _cbQ117A13;
    private CheckBox _cbQ117A14;
    private CheckBox _cbQ117A15;

    private EditText _txtQ117A;

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
        setContentView(R.layout.activity_blok7e);

        _cbQ115A1 = (CheckBox) findViewById(R.id.cbQ115A1);
        _cbQ115A2 = (CheckBox) findViewById(R.id.cbQ115A2);
        _cbQ115A3 = (CheckBox) findViewById(R.id.cbQ115A3);
        _cbQ115A4 = (CheckBox) findViewById(R.id.cbQ115A4);
        _cbQ115A5 = (CheckBox) findViewById(R.id.cbQ115A5);

        _spQ116A = (Spinner) findViewById(R.id.spQ116A);

        _cbQ117A1 = (CheckBox) findViewById(R.id.cbQ117A1);
        _cbQ117A2 = (CheckBox) findViewById(R.id.cbQ117A2);
        _cbQ117A3 = (CheckBox) findViewById(R.id.cbQ117A3);
        _cbQ117A4 = (CheckBox) findViewById(R.id.cbQ117A4);
        _cbQ117A5 = (CheckBox) findViewById(R.id.cbQ117A5);
        _cbQ117A6 = (CheckBox) findViewById(R.id.cbQ117A6);
        _cbQ117A7 = (CheckBox) findViewById(R.id.cbQ117A7);
        _cbQ117A8 = (CheckBox) findViewById(R.id.cbQ117A8);
        _cbQ117A9 = (CheckBox) findViewById(R.id.cbQ117A9);
        _cbQ117A10 = (CheckBox) findViewById(R.id.cbQ117A10);
        _cbQ117A11 = (CheckBox) findViewById(R.id.cbQ117A11);
        _cbQ117A12 = (CheckBox) findViewById(R.id.cbQ117A12);
        _cbQ117A13 = (CheckBox) findViewById(R.id.cbQ117A13);
        _cbQ117A14 = (CheckBox) findViewById(R.id.cbQ117A14);
        _cbQ117A15 = (CheckBox) findViewById(R.id.cbQ117A15);

        _cbQ117A1.setVisibility(View.VISIBLE);
        _cbQ117A2.setVisibility(View.VISIBLE);
        _cbQ117A3.setVisibility(View.VISIBLE);
        _cbQ117A4.setVisibility(View.VISIBLE);
        _cbQ117A5.setVisibility(View.VISIBLE);
        _cbQ117A6.setVisibility(View.VISIBLE);
        _cbQ117A7.setVisibility(View.VISIBLE);
        _cbQ117A8.setVisibility(View.VISIBLE);
        _cbQ117A9.setVisibility(View.VISIBLE);
        _cbQ117A10.setVisibility(View.VISIBLE);
        _cbQ117A11.setVisibility(View.VISIBLE);
        _cbQ117A12.setVisibility(View.VISIBLE);
        _cbQ117A13.setVisibility(View.VISIBLE);
        _cbQ117A14.setVisibility(View.VISIBLE);
        _cbQ117A15.setVisibility(View.VISIBLE);

        _txtQ117A = (EditText) findViewById(R.id.txtQ117A);

        _spQ116A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ117A1.setVisibility(View.VISIBLE);
                    _cbQ117A2.setVisibility(View.VISIBLE);
                    _cbQ117A3.setVisibility(View.VISIBLE);
                    _cbQ117A4.setVisibility(View.VISIBLE);
                    _cbQ117A5.setVisibility(View.VISIBLE);
                    _cbQ117A6.setVisibility(View.VISIBLE);
                    _cbQ117A7.setVisibility(View.VISIBLE);
                    _cbQ117A8.setVisibility(View.GONE);
                    _cbQ117A9.setVisibility(View.GONE);
                    _cbQ117A10.setVisibility(View.GONE);
                    _cbQ117A11.setVisibility(View.GONE);
                    _cbQ117A12.setVisibility(View.GONE);
                    _cbQ117A13.setVisibility(View.GONE);
                    _cbQ117A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ117A1.setVisibility(View.VISIBLE);
                    _cbQ117A2.setVisibility(View.VISIBLE);
                    _cbQ117A3.setVisibility(View.VISIBLE);
                    _cbQ117A4.setVisibility(View.VISIBLE);
                    _cbQ117A5.setVisibility(View.VISIBLE);
                    _cbQ117A6.setVisibility(View.VISIBLE);
                    _cbQ117A7.setVisibility(View.VISIBLE);
                    _cbQ117A8.setVisibility(View.VISIBLE);
                    _cbQ117A9.setVisibility(View.VISIBLE);
                    _cbQ117A10.setVisibility(View.VISIBLE);
                    _cbQ117A11.setVisibility(View.VISIBLE);
                    _cbQ117A12.setVisibility(View.VISIBLE);
                    _cbQ117A13.setVisibility(View.VISIBLE);
                    _cbQ117A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ117A1.setVisibility(View.GONE);
                    _cbQ117A2.setVisibility(View.GONE);
                    _cbQ117A3.setVisibility(View.GONE);
                    _cbQ117A4.setVisibility(View.GONE);
                    _cbQ117A5.setVisibility(View.GONE);
                    _cbQ117A6.setVisibility(View.GONE);
                    _cbQ117A7.setVisibility(View.GONE);
                    _cbQ117A8.setVisibility(View.VISIBLE);
                    _cbQ117A9.setVisibility(View.VISIBLE);
                    _cbQ117A10.setVisibility(View.VISIBLE);
                    _cbQ117A11.setVisibility(View.VISIBLE);
                    _cbQ117A12.setVisibility(View.VISIBLE);
                    _cbQ117A13.setVisibility(View.VISIBLE);
                    _cbQ117A14.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
                String A115 = "";
                A115 = GetCheckBoxValue(_cbQ115A1, A115);
                A115 = GetCheckBoxValue(_cbQ115A2, A115);
                A115 = GetCheckBoxValue(_cbQ115A3, A115);
                A115 = GetCheckBoxValue(_cbQ115A4, A115);
                A115 = GetCheckBoxValue(_cbQ115A5, A115);

                String A116 = _spQ116A.getSelectedItem().toString();

                String A117 = "";
                if(_spQ116A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A117 = GetCheckBoxValue(_cbQ117A1, A117);
                    A117 = GetCheckBoxValue(_cbQ117A2, A117);
                    A117 = GetCheckBoxValue(_cbQ117A3, A117);
                    A117 = GetCheckBoxValue(_cbQ117A4, A117);
                    A117 = GetCheckBoxValue(_cbQ117A5, A117);
                    A117 = GetCheckBoxValue(_cbQ117A6, A117);
                    A117 = GetCheckBoxValue(_cbQ117A7, A117);
                }
                else if(_spQ116A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A117 = GetCheckBoxValue(_cbQ117A1, A117);
                    A117 = GetCheckBoxValue(_cbQ117A2, A117);
                    A117 = GetCheckBoxValue(_cbQ117A3, A117);
                    A117 = GetCheckBoxValue(_cbQ117A4, A117);
                    A117 = GetCheckBoxValue(_cbQ117A5, A117);
                    A117 = GetCheckBoxValue(_cbQ117A6, A117);
                    A117 = GetCheckBoxValue(_cbQ117A7, A117);
                    A117 = GetCheckBoxValue(_cbQ117A8, A117);
                    A117 = GetCheckBoxValue(_cbQ117A9, A117);
                    A117 = GetCheckBoxValue(_cbQ117A10, A117);
                    A117 = GetCheckBoxValue(_cbQ117A11, A117);
                    A117 = GetCheckBoxValue(_cbQ117A12, A117);
                    A117 = GetCheckBoxValue(_cbQ117A13, A117);
                    A117 = GetCheckBoxValue(_cbQ117A14, A117);
                }
                else
                {
                    A117 = GetCheckBoxValue(_cbQ117A8, A117);
                    A117 = GetCheckBoxValue(_cbQ117A9, A117);
                    A117 = GetCheckBoxValue(_cbQ117A10, A117);
                    A117 = GetCheckBoxValue(_cbQ117A11, A117);
                    A117 = GetCheckBoxValue(_cbQ117A12, A117);
                    A117 = GetCheckBoxValue(_cbQ117A13, A117);
                    A117 = GetCheckBoxValue(_cbQ117A14, A117);
                }

                if(_cbQ117A15.isChecked())
                {
                    A117 = A117 + ";" + _txtQ117A.getText().toString();
                }

                Intent intent = new Intent(Blok7EActivity.this, Blok7FActivity.class);
                intent.putExtra("NO_115", A115);
                intent.putExtra("NO_116", A116);
                intent.putExtra("NO_117", A117);
                startActivity(intent);
            }
        });
    }
}
