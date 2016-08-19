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

public class Blok3AActivity extends BaseStepsActivity {

    private Spinner _spQ7A;
    private Spinner _spQ12A;

    private EditText _txtQ7A;
    private EditText _txtQ8A;
    private EditText _txtQ9A;
    private EditText _txtQ10A1;
    private EditText _txtQ10A2;
    private EditText _txtQ10A3;
    private EditText _txtQ11A1;
    private EditText _txtQ11A2;
    private EditText _txtQ11A3;

    private EditText _txtQ12A;
    private EditText _txtQ13A;
    private EditText _txtQ14A;
    private EditText _txtQ15A1;
    private EditText _txtQ15A2;
    private EditText _txtQ15A3;
    private EditText _txtQ16A1;
    private EditText _txtQ16A2;
    private EditText _txtQ16A3;

    private TextView _lblQ11;
    private TextView _lblQ16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok3a);

        _spQ7A = (Spinner) findViewById(R.id.spQ7A);
        _spQ12A = (Spinner) findViewById(R.id.spQ12A);

        _txtQ7A = (EditText) findViewById(R.id.txtQ7A);
        _txtQ8A = (EditText) findViewById(R.id.txtQ8A);
        _txtQ9A = (EditText) findViewById(R.id.txtQ9A);
        _txtQ10A1 = (EditText) findViewById(R.id.txtQ10A1);
        _txtQ10A2 = (EditText) findViewById(R.id.txtQ10A2);
        _txtQ10A3 = (EditText) findViewById(R.id.txtQ10A3);
        _txtQ11A1 = (EditText) findViewById(R.id.txtQ11A1);
        _txtQ11A2 = (EditText) findViewById(R.id.txtQ11A2);
        _txtQ11A3 = (EditText) findViewById(R.id.txtQ11A3);

        _txtQ12A = (EditText) findViewById(R.id.txtQ12A);
        _txtQ13A = (EditText) findViewById(R.id.txtQ13A);
        _txtQ14A = (EditText) findViewById(R.id.txtQ14A);
        _txtQ15A1 = (EditText) findViewById(R.id.txtQ15A1);
        _txtQ15A2 = (EditText) findViewById(R.id.txtQ15A2);
        _txtQ15A3 = (EditText) findViewById(R.id.txtQ15A3);
        _txtQ16A1 = (EditText) findViewById(R.id.txtQ16A1);
        _txtQ16A2 = (EditText) findViewById(R.id.txtQ16A2);
        _txtQ16A3 = (EditText) findViewById(R.id.txtQ16A3);

        _lblQ11 = (TextView) findViewById(R.id.lblQ11);
        _lblQ16 = (TextView) findViewById(R.id.lblQ16);

        _txtQ7A.setVisibility(View.GONE);
        _txtQ11A1.setVisibility(View.GONE);
        _txtQ11A2.setVisibility(View.GONE);
        _txtQ11A3.setVisibility(View.GONE);
        _lblQ11.setVisibility(View.GONE);

        _txtQ12A.setVisibility(View.GONE);
        _txtQ16A1.setVisibility(View.GONE);
        _txtQ16A2.setVisibility(View.GONE);
        _txtQ16A3.setVisibility(View.GONE);
        _lblQ16.setVisibility(View.GONE);

        _spQ7A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ7A.setVisibility(View.VISIBLE);
                    _txtQ11A1.setVisibility(View.VISIBLE);
                    _txtQ11A2.setVisibility(View.VISIBLE);
                    _txtQ11A3.setVisibility(View.VISIBLE);
                    _lblQ11.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ7A.setVisibility(View.GONE);
                    _txtQ11A1.setVisibility(View.GONE);
                    _txtQ11A2.setVisibility(View.GONE);
                    _txtQ11A3.setVisibility(View.GONE);
                    _lblQ11.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ7A.setVisibility(View.GONE);
                    _txtQ11A1.setVisibility(View.VISIBLE);
                    _txtQ11A2.setVisibility(View.VISIBLE);
                    _txtQ11A3.setVisibility(View.VISIBLE);
                    _lblQ11.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ12A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ12A.setVisibility(View.VISIBLE);
                    _txtQ16A1.setVisibility(View.VISIBLE);
                    _txtQ16A2.setVisibility(View.VISIBLE);
                    _txtQ16A3.setVisibility(View.VISIBLE);
                    _lblQ16.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ12A.setVisibility(View.GONE);
                    _txtQ16A1.setVisibility(View.GONE);
                    _txtQ16A2.setVisibility(View.GONE);
                    _txtQ16A3.setVisibility(View.GONE);
                    _lblQ16.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ12A.setVisibility(View.GONE);
                    _txtQ16A1.setVisibility(View.VISIBLE);
                    _txtQ16A2.setVisibility(View.VISIBLE);
                    _txtQ16A3.setVisibility(View.VISIBLE);
                    _lblQ16.setVisibility(View.VISIBLE);
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
                String A7 = "";
                if(String.valueOf(_spQ7A.getSelectedItem()).equals("Lainnya"))
                {
                    A7 = _txtQ7A.getText().toString();
                }
                else
                {
                    A7 = String.valueOf(_spQ7A.getSelectedItem());
                }

                String A8 = _txtQ8A.getText().toString();
                String A9 = _txtQ9A.getText().toString();
                String A10 = _txtQ10A1.getText().toString() + ";" +_txtQ10A2.getText().toString() + ";" +_txtQ10A3.getText().toString();
                String A11 = _txtQ11A1.getText().toString() + ";" +_txtQ11A2.getText().toString() + ";" +_txtQ11A3.getText().toString();

                String A12 = "";
                if(String.valueOf(_spQ12A.getSelectedItem()).equals("Lainnya"))
                {
                    A12 = _txtQ12A.getText().toString();
                }
                else
                {
                    A12 = String.valueOf(_spQ12A.getSelectedItem());
                }

                String A13 = _txtQ13A.getText().toString();
                String A14 = _txtQ14A.getText().toString();
                String A15 = _txtQ15A1.getText().toString() + ";" +_txtQ15A2.getText().toString() + ";" +_txtQ15A3.getText().toString();
                String A16 = _txtQ16A1.getText().toString() + ";" +_txtQ16A2.getText().toString() + ";" +_txtQ16A3.getText().toString();

                Intent intent = new Intent(Blok3AActivity.this, Blok4Activity.class);
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
                intent.putExtra("NO_7", A7);
                intent.putExtra("NO_8", A8);
                intent.putExtra("NO_9", A9);
                intent.putExtra("NO_10", A10);
                intent.putExtra("NO_11", A11);
                intent.putExtra("NO_12", A12);
                intent.putExtra("NO_13", A13);
                intent.putExtra("NO_14", A14);
                intent.putExtra("NO_15", A15);
                intent.putExtra("NO_16", A16);
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
                intent.putExtra("NO_27", "");
                intent.putExtra("NO_28", "");
                intent.putExtra("NO_29", "");
                intent.putExtra("NO_30", "");
                intent.putExtra("NO_31", "");
                intent.putExtra("NO_32", "");
                intent.putExtra("NO_33", "");
                intent.putExtra("NO_34", "");
                intent.putExtra("NO_35", "");
                intent.putExtra("NO_36", "");
                startActivity(intent);
            }
        });
    }


}
