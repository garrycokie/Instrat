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

public class Blok7AActivity extends BaseStepsActivity {
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

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
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
                Bundle extras = intent.getExtras();
                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", extras.getString("NO_1"));
                intent.putExtra("NO_2", extras.getString("NO_2"));
                intent.putExtra("NO_3", extras.getString("NO_3"));
                intent.putExtra("NO_4", extras.getString("NO_4"));
                intent.putExtra("NO_5", extras.getString("NO_5"));
                intent.putExtra("NO_6", extras.getString("NO_6"));
                intent.putExtra("NO_7", extras.getString("NO_7"));
                intent.putExtra("NO_8", extras.getString("NO_8"));
                intent.putExtra("NO_9", extras.getString("NO_9"));
                intent.putExtra("NO_10", extras.getString("NO_10"));
                intent.putExtra("NO_11", extras.getString("NO_11"));
                intent.putExtra("NO_12", extras.getString("NO_12"));
                intent.putExtra("NO_13", extras.getString("NO_13"));
                intent.putExtra("NO_14", extras.getString("NO_14"));
                intent.putExtra("NO_15", extras.getString("NO_15"));
                intent.putExtra("NO_16", extras.getString("NO_16"));
                intent.putExtra("NO_17", extras.getString("NO_17"));
                intent.putExtra("NO_18", extras.getString("NO_18"));
                intent.putExtra("NO_19", extras.getString("NO_19"));
                intent.putExtra("NO_20", extras.getString("NO_20"));
                intent.putExtra("NO_21", extras.getString("NO_21"));
                intent.putExtra("NO_22", extras.getString("NO_22"));
                intent.putExtra("NO_23", extras.getString("NO_23"));
                intent.putExtra("NO_24", extras.getString("NO_24"));
                intent.putExtra("NO_25", extras.getString("NO_25"));
                intent.putExtra("NO_26", extras.getString("NO_26"));
                intent.putExtra("NO_27", extras.getString("NO_27"));
                intent.putExtra("NO_28", extras.getString("NO_28"));
                intent.putExtra("NO_29", extras.getString("NO_29"));
                intent.putExtra("NO_30", extras.getString("NO_30"));
                intent.putExtra("NO_31", extras.getString("NO_31"));
                intent.putExtra("NO_32", extras.getString("NO_32"));
                intent.putExtra("NO_33", extras.getString("NO_33"));
                intent.putExtra("NO_34", extras.getString("NO_34"));
                intent.putExtra("NO_35", extras.getString("NO_35"));
                intent.putExtra("NO_36", extras.getString("NO_36"));
                intent.putExtra("NO_38", extras.getString("NO_38"));
                intent.putExtra("NO_39", extras.getString("NO_39"));
                intent.putExtra("NO_40", extras.getString("NO_40"));
                intent.putExtra("NO_41", extras.getString("NO_41"));
                intent.putExtra("NO_42", extras.getString("NO_42"));
                intent.putExtra("NO_43", extras.getString("NO_43"));
                intent.putExtra("NO_44", extras.getString("NO_44"));
                intent.putExtra("NO_45", extras.getString("NO_45"));
                intent.putExtra("NO_46", extras.getString("NO_46"));
                intent.putExtra("NO_47", extras.getString("NO_47"));
                intent.putExtra("NO_48", extras.getString("NO_48"));
                intent.putExtra("NO_49", extras.getString("NO_49"));
                intent.putExtra("NO_50", extras.getString("NO_50"));
                intent.putExtra("NO_51", extras.getString("NO_51"));
                intent.putExtra("NO_52", extras.getString("NO_52"));
                intent.putExtra("NO_52B", extras.getString("NO_52B"));
                intent.putExtra("NO_52C", extras.getString("NO_52C"));
                intent.putExtra("NO_52D", extras.getString("NO_52D"));
                intent.putExtra("NO_52E", extras.getString("NO_52E"));
                intent.putExtra("NO_53", extras.getString("NO_53"));
                intent.putExtra("NO_54", extras.getString("NO_54"));
                intent.putExtra("NO_55", extras.getString("NO_55"));
                intent.putExtra("NO_56", extras.getString("NO_56"));
                intent.putExtra("NO_57", extras.getString("NO_57"));
                intent.putExtra("NO_58", extras.getString("NO_58"));
                intent.putExtra("NO_59", extras.getString("NO_59"));
                intent.putExtra("NO_60", extras.getString("NO_60"));
                intent.putExtra("NO_60B", extras.getString("NO_60B"));
                intent.putExtra("NO_60C", extras.getString("NO_60C"));
                intent.putExtra("NO_61", extras.getString("NO_61"));
                intent.putExtra("NO_101", extras.getString("NO_101"));
                intent.putExtra("NO_102", extras.getString("NO_102"));
                intent.putExtra("NO_103", A103);
                intent.putExtra("NO_104", A104);
                intent.putExtra("NO_105", A105);
                startActivity(intent);
            }
        });
    }
}
