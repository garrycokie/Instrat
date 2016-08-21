package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;

public class Blok3CActivity extends BaseStepsActivity {

    private Spinner _spQ27A;
    private Spinner _spQ32A;

    private EditText _txtQ27A;
    private EditText _txtQ28A;
    private EditText _txtQ29A;
    private EditText _txtQ30A1;
    private EditText _txtQ30A2;
    private EditText _txtQ30A3;
    private EditText _txtQ31A1;
    private EditText _txtQ31A2;
    private EditText _txtQ31A3;

    private EditText _txtQ32A;
    private EditText _txtQ33A;
    private EditText _txtQ34A;
    private EditText _txtQ35A1;
    private EditText _txtQ35A2;
    private EditText _txtQ35A3;
    private EditText _txtQ36A1;
    private EditText _txtQ36A2;
    private EditText _txtQ36A3;

    private TextView _lblQ31;
    private TextView _lblQ36;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_blok3c);
        extras = getIntent().getExtras();

        _spQ27A = (Spinner) findViewById(R.id.spQ27A);
        _spQ32A = (Spinner) findViewById(R.id.spQ32A);

        _txtQ27A = (EditText) findViewById(R.id.txtQ27A);
        _txtQ28A = (EditText) findViewById(R.id.txtQ28A);
        _txtQ29A = (EditText) findViewById(R.id.txtQ29A);
        _txtQ30A1 = (EditText) findViewById(R.id.txtQ30A1);
        _txtQ30A2 = (EditText) findViewById(R.id.txtQ30A2);
        _txtQ30A3 = (EditText) findViewById(R.id.txtQ30A3);
        _txtQ31A1 = (EditText) findViewById(R.id.txtQ31A1);
        _txtQ31A2 = (EditText) findViewById(R.id.txtQ31A2);
        _txtQ31A3 = (EditText) findViewById(R.id.txtQ31A3);

        _txtQ32A = (EditText) findViewById(R.id.txtQ32A);
        _txtQ33A = (EditText) findViewById(R.id.txtQ33A);
        _txtQ34A = (EditText) findViewById(R.id.txtQ34A);
        _txtQ35A1 = (EditText) findViewById(R.id.txtQ35A1);
        _txtQ35A2 = (EditText) findViewById(R.id.txtQ35A2);
        _txtQ35A3 = (EditText) findViewById(R.id.txtQ35A3);
        _txtQ36A1 = (EditText) findViewById(R.id.txtQ36A1);
        _txtQ36A2 = (EditText) findViewById(R.id.txtQ36A2);
        _txtQ36A3 = (EditText) findViewById(R.id.txtQ36A3);

        _lblQ31 = (TextView) findViewById(R.id.lblQ31);
        _lblQ36 = (TextView) findViewById(R.id.lblQ36);

        _txtQ27A.setVisibility(View.GONE);
        _txtQ31A1.setVisibility(View.GONE);
        _txtQ31A2.setVisibility(View.GONE);
        _txtQ31A3.setVisibility(View.GONE);
        _lblQ31.setVisibility(View.GONE);

        _txtQ32A.setVisibility(View.GONE);
        _txtQ36A1.setVisibility(View.GONE);
        _txtQ36A2.setVisibility(View.GONE);
        _txtQ36A3.setVisibility(View.GONE);
        _lblQ36.setVisibility(View.GONE);

        _spQ27A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ27A.setVisibility(View.VISIBLE);
                    _txtQ31A1.setVisibility(View.VISIBLE);
                    _txtQ31A2.setVisibility(View.VISIBLE);
                    _txtQ31A3.setVisibility(View.VISIBLE);
                    _lblQ31.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ27A.setVisibility(View.GONE);
                    _txtQ31A1.setVisibility(View.GONE);
                    _txtQ31A2.setVisibility(View.GONE);
                    _txtQ31A3.setVisibility(View.GONE);
                    _lblQ31.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ27A.setVisibility(View.GONE);
                    _txtQ31A1.setVisibility(View.VISIBLE);
                    _txtQ31A2.setVisibility(View.VISIBLE);
                    _txtQ31A3.setVisibility(View.VISIBLE);
                    _lblQ31.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ32A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ32A.setVisibility(View.VISIBLE);
                    _txtQ36A1.setVisibility(View.VISIBLE);
                    _txtQ36A2.setVisibility(View.VISIBLE);
                    _txtQ36A3.setVisibility(View.VISIBLE);
                    _lblQ36.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ32A.setVisibility(View.GONE);
                    _txtQ36A1.setVisibility(View.GONE);
                    _txtQ36A2.setVisibility(View.GONE);
                    _txtQ36A3.setVisibility(View.GONE);
                    _lblQ36.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ32A.setVisibility(View.GONE);
                    _txtQ36A1.setVisibility(View.VISIBLE);
                    _txtQ36A2.setVisibility(View.VISIBLE);
                    _txtQ36A3.setVisibility(View.VISIBLE);
                    _lblQ36.setVisibility(View.VISIBLE);
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
                String A27 = "";
                if(String.valueOf(_spQ27A.getSelectedItem()).equals("Lainnya"))
                {
                    A27 = _txtQ27A.getText().toString();
                }
                else
                {
                    A27 = String.valueOf(_spQ27A.getSelectedItem());
                }

                String A28 = _txtQ28A.getText().toString();
                String A29 = _txtQ29A.getText().toString();
                String A30 = _txtQ30A1.getText().toString() + ";" +_txtQ30A2.getText().toString() + ";" +_txtQ30A3.getText().toString();
                String A31 = _txtQ31A1.getText().toString() + ";" +_txtQ31A2.getText().toString() + ";" +_txtQ31A3.getText().toString();

                String A32 = "";
                if(String.valueOf(_spQ32A.getSelectedItem()).equals("Lainnya"))
                {
                    A32 = _txtQ32A.getText().toString();
                }
                else
                {
                    A32 = String.valueOf(_spQ32A.getSelectedItem());
                }

                String A33 = _txtQ33A.getText().toString();
                String A34 = _txtQ34A.getText().toString();
                String A35 = _txtQ35A1.getText().toString() + ";" +_txtQ35A2.getText().toString() + ";" +_txtQ35A3.getText().toString();
                String A36 = _txtQ36A1.getText().toString() + ";" +_txtQ36A2.getText().toString() + ";" +_txtQ36A3.getText().toString();

                Intent intent = new Intent(Blok3CActivity.this, Blok4Activity.class);
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
                intent.putExtra("NO_7", "");
                intent.putExtra("NO_8", "");
                intent.putExtra("NO_9", "");
                intent.putExtra("NO_10", "");
                intent.putExtra("NO_11", "");
                intent.putExtra("NO_12", "");
                intent.putExtra("NO_13", "");
                intent.putExtra("NO_14", "");
                intent.putExtra("NO_15", "");
                intent.putExtra("NO_16", "");
                intent.putExtra("NO_17", "");
                intent.putExtra("NO_18", "");
                intent.putExtra("NO_19", "");
                intent.putExtra("NO_20", "");
                intent.putExtra("NO_21", "");
                intent.putExtra("NO_22", "");
                intent.putExtra("NO_23", "");
                intent.putExtra("NO_24", "");
                intent.putExtra("NO_25", "");
                intent.putExtra("NO_26", "");
                intent.putExtra("NO_27", A27);
                intent.putExtra("NO_28", A28);
                intent.putExtra("NO_29", A29);
                intent.putExtra("NO_30", A30);
                intent.putExtra("NO_31", A31);
                intent.putExtra("NO_32", A32);
                intent.putExtra("NO_33", A33);
                intent.putExtra("NO_34", A34);
                intent.putExtra("NO_35", A35);
                intent.putExtra("NO_36", A36);
                startActivity(intent);
            }
        });

    }


}
