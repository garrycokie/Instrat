package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.smartfren.instrat.R;

/**
 * Created by FluffyBunny on 8/7/2016.
 */
public class Block2Activity extends BaseStepsActivity {

    private String[] _operatorSpinnerItems;

    private Spinner _spOperator;
    private Spinner _spOperator4G;
    private String _spOperatorValue;
    private String _spOperator4GValue;
    private EditText _txt4GReason;
    private String _4GReasonValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block2);

        this._operatorSpinnerItems = new String[] {
                "Smartfren",
                "Axis",
                "Bolt",
                "Indosat",
                "Telkomsel",
                "Tri (3)",
                "XL",
                "Tidak tahu"
        };

        _spOperator= (Spinner) findViewById(R.id.spinOperatorType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._operatorSpinnerItems);
        _spOperator.setAdapter(adapter);

        _spOperator4G= (Spinner) findViewById(R.id.spinOperator4G);
        ArrayAdapter<String> adapter4G = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._operatorSpinnerItems);
        _spOperator4G.setAdapter(adapter4G);
        _txt4GReason = (EditText) findViewById(R.id.txtReason4G);

        //_spOperator4G.setVisibility(View.GONE);

        _spOperator.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                _spOperatorValue = selectedItem;
                //_spOperator4G.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //_spOperator4G.setVisibility(View.GONE);
            }
        });


        _spOperator4G.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                _spOperator4GValue = selectedItem;
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
                _4GReasonValue = _txt4GReason.getText().toString();
                Intent intent = new Intent(Block2Activity.this, Blok3AActivity.class);

                Bundle extras = intent.getExtras();

                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", extras.getString("NO_1"));
                intent.putExtra("NO_2", extras.getString("NO_2"));
                intent.putExtra("NO_3", _spOperatorValue);
                intent.putExtra("NO_4", _spOperator4GValue);
                intent.putExtra("NO_5", _4GReasonValue);

                startActivity(intent);
            }
        });
    }
}
