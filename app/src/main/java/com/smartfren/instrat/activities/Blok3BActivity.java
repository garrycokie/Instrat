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

public class Blok3BActivity extends BaseStepsActivity {

    private Spinner _spQ17A;
    private Spinner _spQ22A;

    private EditText _txtQ17A;
    private EditText _txtQ18A;
    private EditText _txtQ19A;
    private EditText _txtQ20A1;
    private EditText _txtQ20A2;
    private EditText _txtQ20A3;
    private EditText _txtQ21A1;
    private EditText _txtQ21A2;
    private EditText _txtQ21A3;

    private EditText _txtQ22A;
    private EditText _txtQ23A;
    private EditText _txtQ24A;
    private EditText _txtQ25A1;
    private EditText _txtQ25A2;
    private EditText _txtQ25A3;
    private EditText _txtQ26A1;
    private EditText _txtQ26A2;
    private EditText _txtQ26A3;

    private TextView _lblQ21;
    private TextView _lblQ26;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok3b);

        _spQ17A = (Spinner) findViewById(R.id.spQ17A);
        _spQ22A = (Spinner) findViewById(R.id.spQ22A);

        _txtQ17A = (EditText) findViewById(R.id.txtQ17A);
        _txtQ18A = (EditText) findViewById(R.id.txtQ18A);
        _txtQ19A = (EditText) findViewById(R.id.txtQ19A);
        _txtQ20A1 = (EditText) findViewById(R.id.txtQ20A1);
        _txtQ20A2 = (EditText) findViewById(R.id.txtQ20A2);
        _txtQ20A3 = (EditText) findViewById(R.id.txtQ20A3);
        _txtQ21A1 = (EditText) findViewById(R.id.txtQ21A1);
        _txtQ21A2 = (EditText) findViewById(R.id.txtQ21A2);
        _txtQ21A3 = (EditText) findViewById(R.id.txtQ21A3);

        _txtQ22A = (EditText) findViewById(R.id.txtQ22A);
        _txtQ23A = (EditText) findViewById(R.id.txtQ23A);
        _txtQ24A = (EditText) findViewById(R.id.txtQ24A);
        _txtQ25A1 = (EditText) findViewById(R.id.txtQ25A1);
        _txtQ25A2 = (EditText) findViewById(R.id.txtQ25A2);
        _txtQ25A3 = (EditText) findViewById(R.id.txtQ25A3);
        _txtQ26A1 = (EditText) findViewById(R.id.txtQ26A1);
        _txtQ26A2 = (EditText) findViewById(R.id.txtQ26A2);
        _txtQ26A3 = (EditText) findViewById(R.id.txtQ26A3);

        _lblQ21 = (TextView) findViewById(R.id.lblQ21);
        _lblQ26 = (TextView) findViewById(R.id.lblQ26);

        _txtQ17A.setVisibility(View.GONE);
        _txtQ21A1.setVisibility(View.GONE);
        _txtQ21A2.setVisibility(View.GONE);
        _txtQ21A3.setVisibility(View.GONE);
        _lblQ21.setVisibility(View.GONE);

        _txtQ22A.setVisibility(View.GONE);
        _txtQ26A1.setVisibility(View.GONE);
        _txtQ26A2.setVisibility(View.GONE);
        _txtQ26A3.setVisibility(View.GONE);
        _lblQ26.setVisibility(View.GONE);

        _spQ17A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ17A.setVisibility(View.VISIBLE);
                    _txtQ21A1.setVisibility(View.VISIBLE);
                    _txtQ21A2.setVisibility(View.VISIBLE);
                    _txtQ21A3.setVisibility(View.VISIBLE);
                    _lblQ21.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ17A.setVisibility(View.GONE);
                    _txtQ21A1.setVisibility(View.GONE);
                    _txtQ21A2.setVisibility(View.GONE);
                    _txtQ21A3.setVisibility(View.GONE);
                    _lblQ21.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ17A.setVisibility(View.GONE);
                    _txtQ21A1.setVisibility(View.VISIBLE);
                    _txtQ21A2.setVisibility(View.VISIBLE);
                    _txtQ21A3.setVisibility(View.VISIBLE);
                    _lblQ21.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ22A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ22A.setVisibility(View.VISIBLE);
                    _txtQ26A1.setVisibility(View.VISIBLE);
                    _txtQ26A2.setVisibility(View.VISIBLE);
                    _txtQ26A3.setVisibility(View.VISIBLE);
                    _lblQ26.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _txtQ22A.setVisibility(View.GONE);
                    _txtQ26A1.setVisibility(View.GONE);
                    _txtQ26A2.setVisibility(View.GONE);
                    _txtQ26A3.setVisibility(View.GONE);
                    _lblQ26.setVisibility(View.GONE);
                }
                else
                {
                    _txtQ22A.setVisibility(View.GONE);
                    _txtQ26A1.setVisibility(View.VISIBLE);
                    _txtQ26A2.setVisibility(View.VISIBLE);
                    _txtQ26A3.setVisibility(View.VISIBLE);
                    _lblQ26.setVisibility(View.VISIBLE);
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
                String A17 = "";
                if(String.valueOf(_spQ17A.getSelectedItem()).equals("Lainnya"))
                {
                    A17 = _txtQ17A.getText().toString();
                }
                else
                {
                    A17 = String.valueOf(_spQ17A.getSelectedItem());
                }

                String A18 = _txtQ18A.getText().toString();
                String A19 = _txtQ19A.getText().toString();
                String A20 = _txtQ20A1.getText().toString() + ";" +_txtQ20A2.getText().toString() + ";" +_txtQ20A3.getText().toString();
                String A21 = _txtQ21A1.getText().toString() + ";" +_txtQ21A2.getText().toString() + ";" +_txtQ21A3.getText().toString();

                String A22 = "";
                if(String.valueOf(_spQ22A.getSelectedItem()).equals("Lainnya"))
                {
                    A22 = _txtQ22A.getText().toString();
                }
                else
                {
                    A22 = String.valueOf(_spQ22A.getSelectedItem());
                }

                String A23 = _txtQ23A.getText().toString();
                String A24 = _txtQ24A.getText().toString();
                String A25 = _txtQ25A1.getText().toString() + ";" +_txtQ25A2.getText().toString() + ";" +_txtQ25A3.getText().toString();
                String A26 = _txtQ26A1.getText().toString() + ";" +_txtQ26A2.getText().toString() + ";" +_txtQ26A3.getText().toString();

                Intent intent = new Intent(Blok3BActivity.this, Blok4Activity.class);
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
                intent.putExtra("NO_17", A17);
                intent.putExtra("NO_18", A18);
                intent.putExtra("NO_19", A19);
                intent.putExtra("NO_20", A20);
                intent.putExtra("NO_21", A21);
                intent.putExtra("NO_22", A22);
                intent.putExtra("NO_23", A23);
                intent.putExtra("NO_24", A24);
                intent.putExtra("NO_25", A25);
                intent.putExtra("NO_26", A26);
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
