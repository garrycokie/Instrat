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
import com.smartfren.instrat.utilities.Helper;

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

    private TextView _errorQ7A;
    private TextView _errorQ8A;
    private TextView _errorQ9A;
    private TextView _errorQ10A;
    private TextView _errorQ11A;
    private TextView _errorQ12A;
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

        _errorQ7A = (TextView) findViewById(R.id.errorQ7A);
        _errorQ8A = (TextView) findViewById(R.id.errorQ8A);
        _errorQ9A = (TextView) findViewById(R.id.errorQ9A);
        _errorQ10A = (TextView) findViewById(R.id.errorQ10A);
        _errorQ11A = (TextView) findViewById(R.id.errorQ11A);
        _errorQ12A = (TextView) findViewById(R.id.errorQ12A);
        _errorQ13A = (TextView) findViewById(R.id.errorQ13A);
        _errorQ14A = (TextView) findViewById(R.id.errorQ14A);
        _errorQ15A = (TextView) findViewById(R.id.errorQ15A);
        _errorQ16A = (TextView) findViewById(R.id.errorQ16A);

        Helper.Hide(_lblQ8);
        Helper.Hide(_txtQ8A);
        Helper.Hide(_errorQ8A);

        Helper.Hide(_txtQ11A1);
        Helper.Hide(_txtQ11A2);
        Helper.Hide(_txtQ11A3);
        Helper.Hide(_lblQ11);
        Helper.Hide(_errorQ11A);

        Helper.Hide(_lblQ13);
        Helper.Hide(_txtQ13A);
        Helper.Hide(_errorQ13A);

        Helper.Hide(_txtQ16A1);
        Helper.Hide(_txtQ16A2);
        Helper.Hide(_txtQ16A3);
        Helper.Hide(_lblQ16);
        Helper.Hide(_errorQ16A);

        ArrayAdapter<CharSequence> adapterQ7 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_lower500_list, R.layout.spinner_item);
        adapterQ7.setDropDownViewResource(R.layout.spinner_item);
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

        ArrayAdapter<CharSequence> adapterQ12 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_500to1000k_list, R.layout.spinner_item);
        adapterQ12.setDropDownViewResource(R.layout.spinner_item);
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
                    Helper.Show(_lblQ8);
                    Helper.Show(_txtQ8A);
                    Helper.Show(_errorQ8A);

                    Helper.Show(_txtQ11A1);
                    Helper.Show(_txtQ11A2);
                    Helper.Show(_txtQ11A3);
                    Helper.Show(_lblQ11);
                    Helper.Show(_errorQ11A);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    Helper.Hide(_lblQ8);
                    Helper.Hide(_txtQ8A);
                    Helper.Hide(_errorQ8A);

                    Helper.Hide(_txtQ11A1);
                    Helper.Hide(_txtQ11A2);
                    Helper.Hide(_txtQ11A3);
                    Helper.Hide(_lblQ11);
                    Helper.Hide(_errorQ11A);

                    _txtQ8A.setText("");
                    _txtQ11A1.setText("");
                    _txtQ11A2.setText("");
                    _txtQ11A3.setText("");
                }
                else
                {
                    Helper.Hide(_lblQ8);
                    Helper.Hide(_txtQ8A);
                    Helper.Hide(_errorQ8A);

                    Helper.Show(_txtQ11A1);
                    Helper.Show(_txtQ11A2);
                    Helper.Show(_txtQ11A3);
                    Helper.Show(_lblQ11);
                    Helper.Show(_errorQ11A);

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
                    Helper.Show(_lblQ13);
                    Helper.Show(_txtQ13A);
                    Helper.Show(_errorQ13A);

                    Helper.Show(_txtQ16A1);
                    Helper.Show(_txtQ16A2);
                    Helper.Show(_txtQ16A3);
                    Helper.Show(_lblQ16);
                    Helper.Show(_errorQ16A);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    Helper.Hide(_lblQ13);
                    Helper.Hide(_txtQ13A);
                    Helper.Hide(_errorQ13A);

                    Helper.Hide(_txtQ16A1);
                    Helper.Hide(_txtQ16A2);
                    Helper.Hide(_txtQ16A3);
                    Helper.Hide(_lblQ16);
                    Helper.Hide(_errorQ16A);

                    _txtQ13A.setText("");
                    _txtQ16A1.setText("");
                    _txtQ16A2.setText("");
                    _txtQ16A3.setText("");
                }
                else
                {
                    Helper.Hide(_lblQ13);
                    Helper.Hide(_txtQ13A);
                    Helper.Hide(_errorQ13A);

                    Helper.Show(_txtQ16A1);
                    Helper.Show(_txtQ16A2);
                    Helper.Show(_txtQ16A3);
                    Helper.Show(_lblQ16);
                    Helper.Show(_errorQ16A);

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
                if(A7.equals("--Pilih Jawaban--") || A7 == null || A7.equals("") || A7.isEmpty())
                {
                    _errorQ7A.setError("error");
                    _errorQ7A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ7A.setError(null);
                    _errorQ7A.setText("");
                    validatedAnswer++;
                }

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

                if(A12.equals("--Pilih Jawaban--") || A12 == null || A12.equals("") || A12.isEmpty())
                {
                    _errorQ12A.setError("error");
                    _errorQ12A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ12A.setError(null);
                    _errorQ12A.setText("");
                    validatedAnswer++;
                }

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
                    String surveyType = extras.getString("TipeSurvey");

                    if(surveyType.equals("Advocacy Harga"))
                    {
                        Intent intent = new Intent(Blok3AActivity.this, Blok8Activity.class);
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
                        intent.putExtra("NO_38", "");
                        intent.putExtra("NO_39", "");
                        intent.putExtra("NO_40", "");
                        intent.putExtra("NO_41", "");
                        intent.putExtra("NO_42", "");
                        intent.putExtra("NO_43", "");
                        intent.putExtra("NO_44", "");
                        intent.putExtra("NO_45", "");
                        intent.putExtra("NO_46", "");
                        intent.putExtra("NO_47", "");
                        intent.putExtra("NO_48", "");
                        intent.putExtra("NO_49", "");
                        intent.putExtra("NO_50", "");
                        intent.putExtra("NO_51", "");
                        intent.putExtra("NO_52", "");
                        intent.putExtra("NO_52B", "");
                        intent.putExtra("NO_52C", "");
                        intent.putExtra("NO_52D", "");
                        intent.putExtra("NO_52E", "");
                        intent.putExtra("NO_53", "");
                        intent.putExtra("NO_54", "");
                        intent.putExtra("NO_55", "");
                        intent.putExtra("NO_56", "");
                        intent.putExtra("NO_57", "");
                        intent.putExtra("NO_58", "");
                        intent.putExtra("NO_59", "");
                        intent.putExtra("NO_60", "");
                        intent.putExtra("NO_60B", "");
                        intent.putExtra("NO_60C", "");
                        intent.putExtra("NO_61", "");
                        intent.putExtra("NO_61B", "");
                        intent.putExtra("NO_61C", "");
                        intent.putExtra("NO_62", "");
                        intent.putExtra("NO_63", "");
                        intent.putExtra("NO_64", "");
                        intent.putExtra("NO_65", "");
                        intent.putExtra("NO_66", "");
                        intent.putExtra("NO_67", "");
                        intent.putExtra("NO_68", "");
                        intent.putExtra("NO_69", "");
                        intent.putExtra("NO_70", "");
                        intent.putExtra("NO_71", "");
                        intent.putExtra("NO_72", "");
                        intent.putExtra("NO_73", "");
                        intent.putExtra("NO_74", "");
                        intent.putExtra("NO_75", "");
                        intent.putExtra("NO_76", "");
                        intent.putExtra("NO_77", "");
                        intent.putExtra("NO_78", "");
                        intent.putExtra("NO_79", "");
                        intent.putExtra("NO_80", "");
                        intent.putExtra("NO_81", "");
                        intent.putExtra("NO_82", "");
                        intent.putExtra("NO_83", "");
                        intent.putExtra("NO_84", "");
                        intent.putExtra("NO_85", "");
                        intent.putExtra("NO_86", "");
                        intent.putExtra("NO_87", "");
                        intent.putExtra("NO_88", "");
                        intent.putExtra("NO_89", "");
                        intent.putExtra("NO_90", "");
                        intent.putExtra("NO_91", "");
                        intent.putExtra("NO_92", "");
                        intent.putExtra("NO_93", "");
                        intent.putExtra("NO_94", "");
                        intent.putExtra("NO_95", "");
                        intent.putExtra("NO_96", "");
                        intent.putExtra("NO_97", "");
                        intent.putExtra("NO_98", "");
                        intent.putExtra("NO_99", "");
                        intent.putExtra("NO_100", "");
                        intent.putExtra("NO_101", "");
                        intent.putExtra("NO_102", "");
                        intent.putExtra("NO_103", "");
                        intent.putExtra("NO_104", "");
                        intent.putExtra("NO_105", "");
                        intent.putExtra("NO_106", "");
                        intent.putExtra("NO_107", "");
                        intent.putExtra("NO_108", "");
                        intent.putExtra("NO_109", "");
                        intent.putExtra("NO_110", "");
                        intent.putExtra("NO_111", "");
                        intent.putExtra("NO_112", "");
                        intent.putExtra("NO_113", "");
                        intent.putExtra("NO_114", "");
                        intent.putExtra("NO_115", "");
                        intent.putExtra("NO_116", "");
                        intent.putExtra("NO_117", "");
                        intent.putExtra("NO_118", "");
                        intent.putExtra("NO_119", "");
                        intent.putExtra("NO_120", "");
                        startActivity(intent);
                        startActivity(intent);
                    }
                    else
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

            }
        });
    }


}
