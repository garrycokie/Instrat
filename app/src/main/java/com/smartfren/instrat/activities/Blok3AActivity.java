package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;

public class Blok3AActivity extends BaseStepsActivity {

    private Spinner _spQ7A;
    private Spinner _spQ12A;

    private TextView _lblQ8;
    private EditText _txtQ8A;
    private EditText _txtQ9A;
    private EditText _txtQ10A1;
    private EditText _txtQ10A2;
    private EditText _txtQ10A3;
    private EditText _txtQ11A1;
    private EditText _txtQ11A2;
    private EditText _txtQ11A3;

    private TextView _lblQ13;
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

    private TextView _errorQ8A;
    private TextView _errorQ9A;
    private TextView _errorQ10A;
    private TextView _errorQ11A;
    private TextView _errorQ13A;
    private TextView _errorQ14A;
    private TextView _errorQ15A;
    private TextView _errorQ16A;

    private Bundle extras;

    public int SetSelectedSpinner(ArrayAdapter<CharSequence> adapter, String value)
    {
        if (!value.equals(null)) {
            int spinnerPosition = adapter.getPosition(value);
            return spinnerPosition;
        }
        else
        {
            return 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_blok3a);
        extras = getIntent().getExtras();

        _spQ7A = (Spinner) findViewById(R.id.spQ7A);
        _spQ12A = (Spinner) findViewById(R.id.spQ12A);

        _lblQ8 = (TextView) findViewById(R.id.lblQ8);
        _txtQ8A = (EditText) findViewById(R.id.txtQ8A);
        _txtQ9A = (EditText) findViewById(R.id.txtQ9A);
        _txtQ10A1 = (EditText) findViewById(R.id.txtQ10A1);
        _txtQ10A2 = (EditText) findViewById(R.id.txtQ10A2);
        _txtQ10A3 = (EditText) findViewById(R.id.txtQ10A3);
        _txtQ11A1 = (EditText) findViewById(R.id.txtQ11A1);
        _txtQ11A2 = (EditText) findViewById(R.id.txtQ11A2);
        _txtQ11A3 = (EditText) findViewById(R.id.txtQ11A3);

        _lblQ13 = (TextView) findViewById(R.id.lblQ13);
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

        _errorQ8A = (TextView) findViewById(R.id.errorQ8A);
        _errorQ9A = (TextView) findViewById(R.id.errorQ9A);
        _errorQ10A = (TextView) findViewById(R.id.errorQ10A);
        _errorQ11A = (TextView) findViewById(R.id.errorQ11A);
        _errorQ13A = (TextView) findViewById(R.id.errorQ13A);
        _errorQ14A = (TextView) findViewById(R.id.errorQ14A);
        _errorQ15A = (TextView) findViewById(R.id.errorQ15A);
        _errorQ16A = (TextView) findViewById(R.id.errorQ16A);


        _lblQ8.setVisibility(View.GONE);
        _txtQ8A.setVisibility(View.GONE);
        _txtQ11A1.setVisibility(View.GONE);
        _txtQ11A2.setVisibility(View.GONE);
        _txtQ11A3.setVisibility(View.GONE);
        _lblQ11.setVisibility(View.GONE);

        _lblQ13.setVisibility(View.GONE);
        _txtQ13A.setVisibility(View.GONE);
        _txtQ16A1.setVisibility(View.GONE);
        _txtQ16A2.setVisibility(View.GONE);
        _txtQ16A3.setVisibility(View.GONE);
        _lblQ16.setVisibility(View.GONE);

        ArrayAdapter<CharSequence> adapterQ7 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_lower500_list, android.R.layout.simple_spinner_item);
        adapterQ7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _spQ7A.setAdapter(adapterQ7);

        if(extras.getString("NO_7") != null)
        {
            int position = SetSelectedSpinner(adapterQ7, extras.getString("NO_7"));
            if(position > 0) {
                _spQ7A.setSelection(position);
            }
        }

        if(extras.getString("NO_8") != null)
        {
            _txtQ8A.setText(extras.getString("NO_8"));
        }

        if(extras.getString("NO_9") != null)
        {
            _txtQ9A.setText(extras.getString("NO_9"));
        }

        if(extras.getString("NO_10") != null)
        {
            String[] splitAnswer = extras.getString("NO_10").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ10A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ10A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ10A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_11") != null)
        {
            String[] splitAnswer = extras.getString("NO_11").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ11A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ11A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ11A3.setText(splitAnswer[2]);
                }
            }
        }

        ArrayAdapter<CharSequence> adapterQ12 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_500to1000k_list, android.R.layout.simple_spinner_item);
        adapterQ12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _spQ12A.setAdapter(adapterQ12);

        if(extras.getString("NO_12") != null)
        {
            int position = SetSelectedSpinner(adapterQ12, extras.getString("NO_12"));
            if(position > 0) {
                _spQ12A.setSelection(position);
            }
        }

        if(extras.getString("NO_13") != null)
        {
            _txtQ13A.setText(extras.getString("NO_13"));
        }

        if(extras.getString("NO_14") != null)
        {
            _txtQ14A.setText(extras.getString("NO_14"));
        }

        if(extras.getString("NO_15") != null)
        {
            String[] splitAnswer = extras.getString("NO_15").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ15A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ15A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ15A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_16") != null)
        {
            String[] splitAnswer = extras.getString("NO_16").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ16A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ16A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ16A3.setText(splitAnswer[2]);
                }
            }
        }

        _spQ7A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _lblQ8.setVisibility(View.VISIBLE);
                    _txtQ8A.setVisibility(View.VISIBLE);
                    _txtQ11A1.setVisibility(View.VISIBLE);
                    _txtQ11A2.setVisibility(View.VISIBLE);
                    _txtQ11A3.setVisibility(View.VISIBLE);
                    _lblQ11.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _lblQ8.setVisibility(View.GONE);
                    _txtQ8A.setVisibility(View.GONE);
                    _txtQ11A1.setVisibility(View.GONE);
                    _txtQ11A2.setVisibility(View.GONE);
                    _txtQ11A3.setVisibility(View.GONE);
                    _lblQ11.setVisibility(View.GONE);

                    _txtQ8A.setText("");
                    _txtQ11A1.setText("");
                    _txtQ11A2.setText("");
                    _txtQ11A3.setText("");
                }
                else
                {
                    _lblQ8.setVisibility(View.GONE);
                    _txtQ8A.setVisibility(View.GONE);
                    _txtQ11A1.setVisibility(View.VISIBLE);
                    _txtQ11A2.setVisibility(View.VISIBLE);
                    _txtQ11A3.setVisibility(View.VISIBLE);
                    _lblQ11.setVisibility(View.VISIBLE);

                    _txtQ8A.setText("");
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
                    _lblQ13.setVisibility(View.VISIBLE);
                    _txtQ13A.setVisibility(View.VISIBLE);
                    _txtQ16A1.setVisibility(View.VISIBLE);
                    _txtQ16A2.setVisibility(View.VISIBLE);
                    _txtQ16A3.setVisibility(View.VISIBLE);
                    _lblQ16.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _lblQ13.setVisibility(View.GONE);
                    _txtQ13A.setVisibility(View.GONE);
                    _txtQ16A1.setVisibility(View.GONE);
                    _txtQ16A2.setVisibility(View.GONE);
                    _txtQ16A3.setVisibility(View.GONE);
                    _lblQ16.setVisibility(View.GONE);

                    _txtQ13A.setText("");
                    _txtQ16A1.setText("");
                    _txtQ16A2.setText("");
                    _txtQ16A3.setText("");
                }
                else
                {
                    _lblQ13.setVisibility(View.GONE);
                    _txtQ13A.setVisibility(View.GONE);
                    _txtQ16A1.setVisibility(View.VISIBLE);
                    _txtQ16A2.setVisibility(View.VISIBLE);
                    _txtQ16A3.setVisibility(View.VISIBLE);
                    _lblQ16.setVisibility(View.VISIBLE);

                    _txtQ13A.setText("");
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
                Intent intent = new Intent(Blok3AActivity.this, Blok3Activity.class);
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
                startActivity(intent);
            }

            @Override
            public void onContinueClicked() {
                String A7 = String.valueOf(_spQ7A.getSelectedItem());

                String A8 = _txtQ8A.getText().toString();
                String A9 = _txtQ9A.getText().toString();
                String A10 = _txtQ10A1.getText().toString() + ";" +_txtQ10A2.getText().toString() + ";" +_txtQ10A3.getText().toString();
                String A11 = _txtQ11A1.getText().toString() + ";" +_txtQ11A2.getText().toString() + ";" +_txtQ11A3.getText().toString();

                if(A10.equals(";;"))
                {
                    A10 = "";
                }
                if(A11.equals(";;"))
                {
                    A11 = "";
                }

                String A12 = String.valueOf(_spQ12A.getSelectedItem());

                String A13 = _txtQ13A.getText().toString();
                String A14 = _txtQ14A.getText().toString();
                String A15 = _txtQ15A1.getText().toString() + ";" +_txtQ15A2.getText().toString() + ";" +_txtQ15A3.getText().toString();
                String A16 = _txtQ16A1.getText().toString() + ";" +_txtQ16A2.getText().toString() + ";" +_txtQ16A3.getText().toString();

                if(A15.equals(";;"))
                {
                    A15 = "";
                }
                if(A16.equals(";;"))
                {
                    A16 = "";
                }

                int validatedAnswer = 0;
                validatedAnswer++; //no 7 always validated cause of spinner

                if(A7.equals("Lainnya") && (A8 == null || A8.equals("") || A8.isEmpty()))
                {
                    _errorQ8A.setError("error");
                    _errorQ8A.setText("merk smartphone lainnya harus terisi");
                }
                else if(A7.equals("Lainnya") && A8 != null && !A8.equals("") && !A8.isEmpty() && A8.length() > 50)
                {
                    _errorQ8A.setError("error");
                    _errorQ8A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ8A.setError(null);
                    _errorQ8A.setText("");
                    validatedAnswer++;
                }

                if(A9 == null || A9.equals("") || A9.isEmpty())
                {
                    _errorQ9A.setError("error");
                    _errorQ9A.setText("model harus diisi");
                }
                else if(A9 != null && !A9.equals("") && !A9.isEmpty() && A9.length() > 50)
                {
                    _errorQ9A.setError("error");
                    _errorQ9A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ9A.setError(null);
                    _errorQ9A.setText("");
                    validatedAnswer++;
                }

                if(A10 == null || A10.equals("") || A10.isEmpty())
                {
                    _errorQ10A.setError("error");
                    _errorQ10A.setText("alasan rekomendasi harus diisi");
                }
                else if(A10 != null && !A10.equals("") && !A10.isEmpty() &&
                        (_txtQ10A1.getText() != null && !_txtQ10A1.getText().toString().equals("") &&  _txtQ10A1.getText().toString().length() > 50)
                        || (_txtQ10A2.getText() != null && !_txtQ10A2.getText().toString().equals("") &&  _txtQ10A2.getText().toString().length() > 50)
                        || (_txtQ10A3.getText() != null && !_txtQ10A3.getText().toString().equals("") &&  _txtQ10A3.getText().toString().length() > 50))
                {
                    _errorQ10A.setError("error");
                    _errorQ10A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ10A.setError(null);
                    _errorQ10A.setText("");
                    validatedAnswer++;
                }

                if(!A7.equals("Smartfren") && (A11 == null || A11.equals("") || A11.isEmpty()))
                {
                    _errorQ11A.setError("error");
                    _errorQ11A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!A7.equals("Smartfren") && A11 != null && !A11.equals("") && !A11.isEmpty() &&
                        (_txtQ11A1.getText() != null && !_txtQ11A1.getText().toString().equals("") &&  _txtQ11A1.getText().toString().length() > 50)
                        || (_txtQ11A2.getText() != null && !_txtQ11A2.getText().toString().equals("") &&  _txtQ11A2.getText().toString().length() > 50)
                        || (_txtQ11A3.getText() != null && !_txtQ11A3.getText().toString().equals("") &&  _txtQ11A3.getText().toString().length() > 50))
                {
                    _errorQ11A.setError("error");
                    _errorQ11A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ11A.setError(null);
                    _errorQ11A.setText("");
                    validatedAnswer++;
                }

                validatedAnswer++; //no 12 always validated cause of spinner

                if(A12.equals("Lainnya") && (A13 == null || A13.equals("") || A13.isEmpty()))
                {
                    _errorQ13A.setError("error");
                    _errorQ13A.setText("merk smartphone lainnya harus terisi");
                }
                else if(A12.equals("Lainnya") && A13 != null && !A13.equals("") && !A13.isEmpty() && A13.length() > 50)
                {
                    _errorQ13A.setError("error");
                    _errorQ13A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ13A.setError(null);
                    _errorQ13A.setText("");
                    validatedAnswer++;
                }

                if(A14 == null || A14.equals("") || A14.isEmpty())
                {
                    _errorQ14A.setError("error");
                    _errorQ14A.setText("model harus diisi");
                }
                else if(A14 != null && !A14.equals("") && !A14.isEmpty() && A14.length() > 50)
                {
                    _errorQ14A.setError("error");
                    _errorQ14A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ14A.setError(null);
                    _errorQ14A.setText("");
                    validatedAnswer++;
                }

                if(A15 == null || A15.equals("") || A15.isEmpty())
                {
                    _errorQ15A.setError("error");
                    _errorQ15A.setText("alasan rekomendasi harus diisi");
                }
                else if(A15 != null && !A15.equals("") && !A15.isEmpty() &&
                        (_txtQ15A1.getText() != null && !_txtQ15A1.getText().toString().equals("") &&  _txtQ15A1.getText().toString().length() > 50)
                        || (_txtQ15A2.getText() != null && !_txtQ15A2.getText().toString().equals("") &&  _txtQ15A2.getText().toString().length() > 50)
                        || (_txtQ15A3.getText() != null && !_txtQ15A3.getText().toString().equals("") &&  _txtQ15A3.getText().toString().length() > 50))
                {
                    _errorQ15A.setError("error");
                    _errorQ15A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ15A.setError(null);
                    _errorQ15A.setText("");
                    validatedAnswer++;
                }

                if(!A12.equals("Smartfren") && (A16 == null || A16.equals("") || A16.isEmpty()))
                {
                    _errorQ16A.setError("error");
                    _errorQ16A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!A12.equals("Smartfren") && A16 != null && !A16.equals("") && !A16.isEmpty() &&
                        (_txtQ16A1.getText() != null && !_txtQ16A1.getText().toString().equals("") &&  _txtQ16A1.getText().toString().length() > 50)
                        || (_txtQ16A2.getText() != null && !_txtQ16A2.getText().toString().equals("") &&  _txtQ16A2.getText().toString().length() > 50)
                        || (_txtQ16A3.getText() != null && !_txtQ16A3.getText().toString().equals("") &&  _txtQ16A3.getText().toString().length() > 50))
                {
                    _errorQ16A.setError("error");
                    _errorQ16A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ16A.setError(null);
                    _errorQ16A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 10)
                {
                    Intent intent = new Intent(Blok3AActivity.this, Blok4Activity.class);
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

            }
        });
    }


}
