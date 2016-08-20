package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok8Activity extends BaseStepsActivity {

    private Spinner _spQ121A;
    private EditText _txtQ122A;
    private EditText _txtQ123A;
    private EditText _txtQ1224;
    private EditText _txtQ125A;
    private EditText _txtQ126A;
    private Spinner _spQ127A;


    private String _Q121AValue;
    private String _Q122AValue;
    private String _Q123AValue;
    private String _Q1224Value;
    private String _Q125AValue;
    private String _Q126AValue;
    private String _Q127AValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok8);

        _spQ121A = (Spinner) findViewById(R.id.spQ121A);
        _txtQ122A = (EditText) findViewById(R.id.txtQ122A);
        _txtQ123A = (EditText) findViewById(R.id.txtQ123A);
        _txtQ1224 = (EditText) findViewById(R.id.txtQ1224);
        _txtQ125A = (EditText) findViewById(R.id.txtQ125A);
        _txtQ126A = (EditText) findViewById(R.id.txtQ126A);
        _spQ127A = (Spinner) findViewById(R.id.spQ127A);

        _spQ121A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                _Q121AValue = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        _spQ127A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                _Q127AValue = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {

            }

            @Override
            public void onContinueClicked() {
                _Q122AValue = _txtQ122A.getText().toString();
                _Q123AValue = _txtQ123A.getText().toString();
                _Q1224Value = _txtQ1224.getText().toString();
                _Q125AValue = _txtQ126A.getText().toString();
                _Q126AValue = _txtQ126A.getText().toString();

                Intent intent = new Intent(Blok8Activity.this, Blok9Activity.class);
                intent.putExtra("NO_121", _Q121AValue);
                intent.putExtra("NO_122", _Q122AValue);
                intent.putExtra("NO_123", _Q123AValue);
                intent.putExtra("NO_124", _Q122AValue);
                intent.putExtra("NO_125", _Q125AValue);
                intent.putExtra("NO_126", _Q126AValue);
                intent.putExtra("NO_127", _Q127AValue);
                intent.putExtra("NO_127", _Q127AValue);
                startActivity(intent);
            }
        });
    }
}
