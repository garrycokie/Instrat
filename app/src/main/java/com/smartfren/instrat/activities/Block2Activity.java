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
import android.widget.TextView;

import com.smartfren.instrat.R;

import org.w3c.dom.Text;

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
    private TextView _txt4GQuestionLabel;
    private TextView _error4GReason;

    private Bundle extras;

    private TextView _errorOperatorType;
    private TextView _errorOperator4G;

    public int SetSelectedSpinner(ArrayAdapter<CharSequence> adapter, String value)
    {
        if (value != null) {
            int spinnerPosition = adapter.getPosition(value);
            return spinnerPosition;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block2);
        extras = getIntent().getExtras();

        this._operatorSpinnerItems = new String[] {
                "--Pilih Jawaban--",
                "Smartfren",
                "Axis",
                "Bolt",
                "Indosat",
                "Telkomsel",
                "Tri (3)",
                "XL",
                "Tidak tahu"
        };

        _errorOperatorType = (TextView) findViewById(R.id.errorOperatorType);
        _errorOperator4G = (TextView) findViewById(R.id.errorOperator4G);

        _spOperator= (Spinner) findViewById(R.id.spinOperatorType);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._operatorSpinnerItems);
        _spOperator.setAdapter(adapter);

        _spOperator4G= (Spinner) findViewById(R.id.spinOperator4G);
        ArrayAdapter<CharSequence> adapter4G = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._operatorSpinnerItems);
        _spOperator4G.setAdapter(adapter4G);
        _txt4GQuestionLabel = (TextView) findViewById(R.id.txtquestion4G);
        _txt4GReason = (EditText) findViewById(R.id.txtReason4G);
        _txt4GQuestionLabel.setVisibility(View.GONE);
        _txt4GReason.setVisibility(View.GONE);
        _error4GReason = (TextView) findViewById(R.id.errorReason4G);

        //_spOperator4G.setVisibility(View.GONE);

        _spOperatorValue =  extras.getString("NO_3");
        _spOperator4GValue = extras.getString("NO_4");
        _4GReasonValue = extras.getString("NO_5");
        if(_4GReasonValue != null){
            _txt4GReason.setText(_4GReasonValue);
        }

        _spOperator.setSelection(SetSelectedSpinner(adapter, _spOperatorValue));
        _spOperator4G.setSelection(SetSelectedSpinner(adapter, _spOperator4GValue));

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
                if(selectedItem != "Tidak tahu"){
                    _txt4GQuestionLabel.setVisibility(View.VISIBLE);
                    _txt4GReason.setVisibility(View.VISIBLE);
                    _txt4GQuestionLabel.setText("Mengapa Anda bilang "+ selectedItem +" itu bagus untuk operator 4G?");
                }
                else
                {
                    _txt4GQuestionLabel.setVisibility(View.GONE);
                    _txt4GReason.setVisibility(View.GONE);
                }
                _spOperator4GValue = selectedItem;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                _txt4GQuestionLabel.setText("Mengapa Anda bilang ________ itu bagus untuk operator 4G?");
            }
        });



        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {

                Intent intent = new Intent(Block2Activity.this, Block1Activity.class);

                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", extras.getString("NO_1"));
                intent.putExtra("NO_2", extras.getString("NO_2"));

                startActivity(intent);
            }

            @Override
            public void onContinueClicked() {

                int validatedAnswer = 0;
                if(_spOperatorValue.equals("--Pilih Jawaban--") || _spOperatorValue == null || _spOperatorValue.equals("") || _spOperatorValue.isEmpty())
                {
                    _errorOperatorType.setError("error");
                    _errorOperatorType.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorOperatorType.setError(null);
                    _errorOperatorType.setText("");
                    validatedAnswer++;
                }

                if(_spOperator4GValue.equals("--Pilih Jawaban--") || _spOperator4GValue == null || _spOperator4GValue.equals("") || _spOperator4GValue.isEmpty())
                {
                    _errorOperator4G.setError("error");
                    _errorOperator4G.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorOperator4G.setError(null);
                    _errorOperator4G.setText("");
                    validatedAnswer++;
                }
                if(_spOperator4GValue == "Tidak tahu") {
                    _error4GReason.setError(null);
                    _error4GReason.setText("");
                    _4GReasonValue = "";
                    validatedAnswer ++;
                }
                else
                {
                    _4GReasonValue = _txt4GReason.getText().toString();

                    if (_4GReasonValue == null || _4GReasonValue.equals("") || _4GReasonValue.isEmpty()) {
                        _error4GReason.setError("error");
                        _error4GReason.setText("Alasan harus diisi");
                    } else if (_4GReasonValue != null && !_4GReasonValue.equals("") && !_4GReasonValue.isEmpty() && _4GReasonValue.length() > 50) {
                        _error4GReason.setError("error");
                        _error4GReason.setText("Alasan tidak boleh lebih dari 50 karakter");
                    } else {
                        _error4GReason.setError(null);
                        _error4GReason.setText("");
                        validatedAnswer++;
                    }
                }


                if(validatedAnswer == 3)
                {
                    Intent intent = new Intent(Block2Activity.this, Blok3Activity.class);

                    intent.putExtra("DeviceSurveyID", extras.getString("DeviceSurveyID"));
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
            }
        });
    }
}
