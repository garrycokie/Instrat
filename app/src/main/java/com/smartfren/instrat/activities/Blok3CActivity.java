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

public class Blok3CActivity extends BaseStepsActivity {
    private TextView _lblQ27;
    private TextView _lblQ29;
    private TextView _lblQ30;

    private Spinner _spQ27A;
    private Spinner _spQ32A;

    private TextView _lblQ28;
    private EditText _txtQ28A;
    private EditText _txtQ29A;
    private EditText _txtQ30A1;
    private EditText _txtQ30A2;
    private EditText _txtQ30A3;
    private EditText _txtQ31A1;
    private EditText _txtQ31A2;
    private EditText _txtQ31A3;

    private TextView _lblQ33;
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

    private TextView _errorQ27A;
    private TextView _errorQ28A;
    private TextView _errorQ29A;
    private TextView _errorQ30A;
    private TextView _errorQ31A;
    private TextView _errorQ32A;
    private TextView _errorQ33A;
    private TextView _errorQ34A;
    private TextView _errorQ35A;
    private TextView _errorQ36A;

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
        super.initActivity(R.layout.activity_blok3c);
        extras = getIntent().getExtras();

        _lblQ27 = (TextView) findViewById(R.id.lblQ27);
        _lblQ29 = (TextView) findViewById(R.id.lblQ29);
        _lblQ30 = (TextView) findViewById(R.id.lblQ30);

        _spQ27A = (Spinner) findViewById(R.id.spQ27A);
        _spQ32A = (Spinner) findViewById(R.id.spQ32A);

        _lblQ28 = (TextView) findViewById(R.id.lblQ28);
        _txtQ28A = (EditText) findViewById(R.id.txtQ28A);
        _txtQ29A = (EditText) findViewById(R.id.txtQ29A);
        _txtQ30A1 = (EditText) findViewById(R.id.txtQ30A1);
        _txtQ30A2 = (EditText) findViewById(R.id.txtQ30A2);
        _txtQ30A3 = (EditText) findViewById(R.id.txtQ30A3);
        _txtQ31A1 = (EditText) findViewById(R.id.txtQ31A1);
        _txtQ31A2 = (EditText) findViewById(R.id.txtQ31A2);
        _txtQ31A3 = (EditText) findViewById(R.id.txtQ31A3);

        _lblQ33 = (TextView) findViewById(R.id.lblQ33);
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

        _errorQ27A = (TextView) findViewById(R.id.errorQ27A);
        _errorQ28A = (TextView) findViewById(R.id.errorQ28A);
        _errorQ29A = (TextView) findViewById(R.id.errorQ29A);
        _errorQ30A = (TextView) findViewById(R.id.errorQ30A);
        _errorQ31A = (TextView) findViewById(R.id.errorQ31A);
        _errorQ32A = (TextView) findViewById(R.id.errorQ32A);
        _errorQ33A = (TextView) findViewById(R.id.errorQ33A);
        _errorQ34A = (TextView) findViewById(R.id.errorQ34A);
        _errorQ35A = (TextView) findViewById(R.id.errorQ35A);
        _errorQ36A = (TextView) findViewById(R.id.errorQ36A);

        Helper.Hide(_lblQ28);
        Helper.Hide(_txtQ28A);
        Helper.Hide(_errorQ28A);

        Helper.Hide(_txtQ31A1);
        Helper.Hide(_txtQ31A2);
        Helper.Hide(_txtQ31A3);
        Helper.Hide(_lblQ31);
        Helper.Hide(_errorQ31A);

        Helper.Hide(_lblQ33);
        Helper.Hide(_txtQ33A);
        Helper.Hide(_errorQ33A);

        Helper.Hide(_txtQ36A1);
        Helper.Hide(_txtQ36A2);
        Helper.Hide(_txtQ36A3);
        Helper.Hide(_lblQ36);
        Helper.Hide(_errorQ36A);

        String surveyType = extras.getString("TipeSurvey");
        if(surveyType.equals("Full Audit Modem"))
        {
            Helper.Hide(_lblQ27);
            Helper.Hide(_spQ27A);
            Helper.Hide(_errorQ27A);

            Helper.Hide(_lblQ29);
            Helper.Hide(_txtQ29A);
            Helper.Hide(_errorQ29A);

            Helper.Hide(_txtQ30A1);
            Helper.Hide(_txtQ30A2);
            Helper.Hide(_txtQ30A3);
            Helper.Hide(_lblQ30);
            Helper.Hide(_errorQ30A);
        }
        else
        {
            Helper.Show(_lblQ27);
            Helper.Show(_spQ27A);
            Helper.Show(_errorQ27A);

            Helper.Show(_lblQ29);
            Helper.Show(_txtQ29A);
            Helper.Show(_errorQ29A);

            Helper.Show(_txtQ30A1);
            Helper.Show(_txtQ30A2);
            Helper.Show(_txtQ30A3);
            Helper.Show(_lblQ30);
            Helper.Show(_errorQ30A);
        }

        ArrayAdapter<CharSequence> adapterQ27 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_2000to3000k_list, R.layout.spinner_item);
        adapterQ27.setDropDownViewResource(R.layout.spinner_item);
        _spQ27A.setAdapter(adapterQ27);

        if(extras.getString("NO_27") != null)
        {
            int position = SetSelectedSpinner(adapterQ27, extras.getString("NO_27"));
            if(position > 0) {
                _spQ27A.setSelection(position);
            }
        }

        if(extras.getString("NO_28") != null)
        {
            _txtQ28A.setText(extras.getString("NO_28"));
        }

        if(extras.getString("NO_29") != null)
        {
            _txtQ29A.setText(extras.getString("NO_29"));
        }

        if(extras.getString("NO_30") != null)
        {
            String[] splitAnswer = extras.getString("NO_30").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ30A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ30A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ30A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_31") != null)
        {
            String[] splitAnswer = extras.getString("NO_31").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ31A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ31A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ31A3.setText(splitAnswer[2]);
                }
            }
        }

        ArrayAdapter<CharSequence> adapterQ32 = ArrayAdapter.createFromResource(this, R.array.page_blok3_modem_list, R.layout.spinner_item);
        adapterQ32.setDropDownViewResource(R.layout.spinner_item);
        _spQ32A.setAdapter(adapterQ32);

        if(extras.getString("NO_32") != null)
        {
            int position = SetSelectedSpinner(adapterQ32, extras.getString("NO_32"));
            if(position > 0) {
                _spQ32A.setSelection(position);
            }
        }

        if(extras.getString("NO_33") != null)
        {
            _txtQ33A.setText(extras.getString("NO_33"));
        }

        if(extras.getString("NO_34") != null)
        {
            _txtQ34A.setText(extras.getString("NO_34"));
        }

        if(extras.getString("NO_35") != null)
        {
            String[] splitAnswer = extras.getString("NO_35").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ35A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ35A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ35A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_36") != null) {
            String[] splitAnswer = extras.getString("NO_36").split(";");
            if (splitAnswer != null && splitAnswer.length > 0) {
                if (splitAnswer.length >= 1) {
                    _txtQ36A1.setText(splitAnswer[0]);
                }
                if (splitAnswer.length >= 2) {
                    _txtQ36A2.setText(splitAnswer[1]);
                }
                if (splitAnswer.length >= 3) {
                    _txtQ36A3.setText(splitAnswer[2]);
                }
            }
        }

        _spQ27A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    Helper.Show(_lblQ28);
                    Helper.Show(_txtQ28A);
                    Helper.Show(_errorQ28A);

                    Helper.Show(_txtQ31A1);
                    Helper.Show(_txtQ31A2);
                    Helper.Show(_txtQ31A3);
                    Helper.Show(_lblQ31);
                    Helper.Show(_errorQ31A);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    Helper.Hide(_lblQ28);
                    Helper.Hide(_txtQ28A);
                    Helper.Hide(_errorQ28A);

                    Helper.Hide(_txtQ31A1);
                    Helper.Hide(_txtQ31A2);
                    Helper.Hide(_txtQ31A3);
                    Helper.Hide(_lblQ31);
                    Helper.Hide(_errorQ31A);

                    _txtQ28A.setText("");
                    _txtQ31A1.setText("");
                    _txtQ31A2.setText("");
                    _txtQ31A3.setText("");
                }
                else
                {
                    Helper.Hide(_lblQ28);
                    Helper.Hide(_txtQ28A);
                    Helper.Hide(_errorQ28A);

                    Helper.Show(_txtQ31A1);
                    Helper.Show(_txtQ31A2);
                    Helper.Show(_txtQ31A3);
                    Helper.Show(_lblQ31);
                    Helper.Show(_errorQ31A);

                    _txtQ28A.setText("");
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
                    Helper.Show(_lblQ33);
                    Helper.Show(_txtQ33A);
                    Helper.Show(_errorQ33A);

                    Helper.Show(_txtQ36A1);
                    Helper.Show(_txtQ36A2);
                    Helper.Show(_txtQ36A3);
                    Helper.Show(_lblQ36);
                    Helper.Show(_errorQ36A);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    Helper.Hide(_lblQ33);
                    Helper.Hide(_txtQ33A);
                    Helper.Hide(_errorQ33A);

                    Helper.Hide(_txtQ36A1);
                    Helper.Hide(_txtQ36A2);
                    Helper.Hide(_txtQ36A3);
                    Helper.Hide(_lblQ36);
                    Helper.Hide(_errorQ36A);

                    _txtQ33A.setText("");
                    _txtQ36A1.setText("");
                    _txtQ36A2.setText("");
                    _txtQ36A3.setText("");
                }
                else
                {
                    Helper.Hide(_lblQ33);
                    Helper.Hide(_txtQ33A);
                    Helper.Hide(_errorQ33A);

                    Helper.Show(_txtQ36A1);
                    Helper.Show(_txtQ36A2);
                    Helper.Show(_txtQ36A3);
                    Helper.Show(_lblQ36);
                    Helper.Show(_errorQ36A);

                    _txtQ33A.setText("");
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
                String surveyType = extras.getString("TipeSurvey");
                if(surveyType.equals("Full Audit Modem"))
                {
                    Intent intent = new Intent(Blok3CActivity.this, Block2Activity.class);
                    intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                    intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                    intent.putExtra("UserID", extras.getString("UserID"));
                    intent.putExtra("AccessToken", extras.getString("AccessToken"));
                    intent.putExtra("NO_1", extras.getString("NO_1"));
                    intent.putExtra("NO_2", extras.getString("NO_2"));
                    intent.putExtra("NO_3", extras.getString("NO_3"));
                    intent.putExtra("NO_4", extras.getString("NO_4"));
                    intent.putExtra("NO_5", extras.getString("NO_5"));
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Blok3CActivity.this, Blok3Activity.class);
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
            }

            @Override
            public void onContinueClicked() {
                String surveyType = extras.getString("TipeSurvey");

                String A27 = String.valueOf(_spQ27A.getSelectedItem());

                String A28 = _txtQ28A.getText().toString();
                String A29 = _txtQ29A.getText().toString();
                String A30 = _txtQ30A1.getText().toString() + ";" +_txtQ30A2.getText().toString() + ";" +_txtQ30A3.getText().toString();
                String A31 = _txtQ31A1.getText().toString() + ";" +_txtQ31A2.getText().toString() + ";" +_txtQ31A3.getText().toString();

                if(A30.equals(";;"))
                {
                    A30 = "";
                }
                if(A31.equals(";;"))
                {
                    A31 = "";
                }

                String A32 = String.valueOf(_spQ32A.getSelectedItem());

                String A33 = _txtQ33A.getText().toString();
                String A34 = _txtQ34A.getText().toString();
                String A35 = _txtQ35A1.getText().toString() + ";" +_txtQ35A2.getText().toString() + ";" +_txtQ35A3.getText().toString();
                String A36 = _txtQ36A1.getText().toString() + ";" +_txtQ36A2.getText().toString() + ";" +_txtQ36A3.getText().toString();

                if(A35.equals(";;"))
                {
                    A35 = "";
                }
                if(A36.equals(";;"))
                {
                    A36 = "";
                }

                int validatedAnswer = 0;
                if( !surveyType.equals("Full Audit Modem") && (A27.equals("--Pilih Jawaban--") || A27 == null || A27.equals("") || A27.isEmpty()))
                {
                    _errorQ27A.setError("error");
                    _errorQ27A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ27A.setError(null);
                    _errorQ27A.setText("");
                    validatedAnswer++;
                }

                if(!surveyType.equals("Full Audit Modem") && (A27.equals("Lainnya") && (A28 == null || A28.equals("") || A28.isEmpty())))
                {
                    _errorQ28A.setError("error");
                    _errorQ28A.setText("merk smartphone lainnya harus terisi");
                }
                else if(!surveyType.equals("Full Audit Modem") && (A27.equals("Lainnya") && A28 != null && !A28.equals("") && !A28.isEmpty() && A28.length() > 50))
                {
                    _errorQ28A.setError("error");
                    _errorQ28A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ28A.setError(null);
                    _errorQ28A.setText("");
                    validatedAnswer++;
                }

                if(!surveyType.equals("Full Audit Modem") && (A29 == null || A29.equals("") || A29.isEmpty()))
                {
                    _errorQ29A.setError("error");
                    _errorQ29A.setText("model harus diisi");
                }
                else if(!surveyType.equals("Full Audit Modem") && (A29 != null && !A29.equals("") && !A29.isEmpty() && A29.length() > 50))
                {
                    _errorQ29A.setError("error");
                    _errorQ29A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ29A.setError(null);
                    _errorQ29A.setText("");
                    validatedAnswer++;
                }

                if(!surveyType.equals("Full Audit Modem") && (A30 == null || A30.equals("") || A30.isEmpty()))
                {
                    _errorQ30A.setError("error");
                    _errorQ30A.setText("alasan rekomendasi harus diisi");
                }
                else if(!surveyType.equals("Full Audit Modem") && (A30 != null && !A30.equals("") && !A30.isEmpty() &&
                        (_txtQ30A1.getText() != null && !_txtQ30A1.getText().toString().equals("") &&  _txtQ30A1.getText().toString().length() > 50)
                        || (_txtQ30A2.getText() != null && !_txtQ30A2.getText().toString().equals("") &&  _txtQ30A2.getText().toString().length() > 50)
                        || (_txtQ30A3.getText() != null && !_txtQ30A3.getText().toString().equals("") &&  _txtQ30A3.getText().toString().length() > 50))
                        )
                {
                    _errorQ30A.setError("error");
                    _errorQ30A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ30A.setError(null);
                    _errorQ30A.setText("");
                    validatedAnswer++;
                }

                if( !surveyType.equals("Full Audit Modem") && (!A27.equals("Smartfren") && (A31 == null || A31.equals("") || A31.isEmpty())) )
                {
                    _errorQ31A.setError("error");
                    _errorQ31A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!surveyType.equals("Full Audit Modem") && (!A27.equals("Smartfren") && A31 != null && !A31.equals("") && !A31.isEmpty() &&
                        (_txtQ31A1.getText() != null && !_txtQ31A1.getText().toString().equals("") &&  _txtQ31A1.getText().toString().length() > 50)
                        || (_txtQ31A2.getText() != null && !_txtQ31A2.getText().toString().equals("") &&  _txtQ31A2.getText().toString().length() > 50)
                        || (_txtQ31A3.getText() != null && !_txtQ31A3.getText().toString().equals("") &&  _txtQ31A3.getText().toString().length() > 50))
                        )
                {
                    _errorQ31A.setError("error");
                    _errorQ31A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ31A.setError(null);
                    _errorQ31A.setText("");
                    validatedAnswer++;
                }

                if(A32.equals("--Pilih Jawaban--") || A32 == null || A32.equals("") || A32.isEmpty())
                {
                    _errorQ32A.setError("error");
                    _errorQ32A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ32A.setError(null);
                    _errorQ32A.setText("");
                    validatedAnswer++;
                }

                if(A32.equals("Lainnya") && (A33 == null || A33.equals("") || A33.isEmpty()))
                {
                    _errorQ33A.setError("error");
                    _errorQ33A.setText("merk smartphone lainnya harus terisi");
                }
                else if(A32.equals("Lainnya") && A33 != null && !A33.equals("") && !A33.isEmpty() && A33.length() > 50)
                {
                    _errorQ33A.setError("error");
                    _errorQ33A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ33A.setError(null);
                    _errorQ33A.setText("");
                    validatedAnswer++;
                }

                if(A34 == null || A34.equals("") || A34.isEmpty())
                {
                    _errorQ34A.setError("error");
                    _errorQ34A.setText("model harus diisi");
                }
                else if(A34 != null && !A34.equals("") && !A34.isEmpty() && A34.length() > 50)
                {
                    _errorQ34A.setError("error");
                    _errorQ34A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ34A.setError(null);
                    _errorQ34A.setText("");
                    validatedAnswer++;
                }

                if(A35 == null || A35.equals("") || A35.isEmpty())
                {
                    _errorQ35A.setError("error");
                    _errorQ35A.setText("alasan rekomendasi harus diisi");
                }
                else if(A35 != null && !A35.equals("") && !A35.isEmpty() &&
                        (_txtQ35A1.getText() != null && !_txtQ35A1.getText().toString().equals("") &&  _txtQ35A1.getText().toString().length() > 50)
                        || (_txtQ35A2.getText() != null && !_txtQ35A2.getText().toString().equals("") &&  _txtQ35A2.getText().toString().length() > 50)
                        || (_txtQ35A3.getText() != null && !_txtQ35A3.getText().toString().equals("") &&  _txtQ35A3.getText().toString().length() > 50))
                {
                    _errorQ35A.setError("error");
                    _errorQ35A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ35A.setError(null);
                    _errorQ35A.setText("");
                    validatedAnswer++;
                }

                if(!A32.equals("Smartfren") && (A36 == null || A36.equals("") || A36.isEmpty()))
                {
                    _errorQ36A.setError("error");
                    _errorQ36A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!A32.equals("Smartfren") && A36 != null && !A36.equals("") && !A36.isEmpty() &&
                        (_txtQ36A1.getText() != null && !_txtQ36A1.getText().toString().equals("") &&  _txtQ36A1.getText().toString().length() > 50)
                        || (_txtQ36A2.getText() != null && !_txtQ36A2.getText().toString().equals("") &&  _txtQ36A2.getText().toString().length() > 50)
                        || (_txtQ36A3.getText() != null && !_txtQ36A3.getText().toString().equals("") &&  _txtQ36A3.getText().toString().length() > 50))
                {
                    _errorQ36A.setError("error");
                    _errorQ36A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ36A.setError(null);
                    _errorQ36A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 10)
                {
                    //String surveyType = extras.getString("TipeSurvey");

                    if(surveyType.equals("Advocacy Harga"))
                    {
                        Intent intent = new Intent(Blok3CActivity.this, Blok8Activity.class);
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

                }


            }
        });

    }


}
