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

public class Blok3BActivity extends BaseStepsActivity {

    private Spinner _spQ17A;
    private Spinner _spQ22A;

    private TextView _lblQ18;
    private EditText _txtQ18A;
    private EditText _txtQ19A;
    private EditText _txtQ20A1;
    private EditText _txtQ20A2;
    private EditText _txtQ20A3;
    private EditText _txtQ21A1;
    private EditText _txtQ21A2;
    private EditText _txtQ21A3;

    private TextView _lblQ23;
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

    private TextView _errorQ18A;
    private TextView _errorQ19A;
    private TextView _errorQ20A;
    private TextView _errorQ21A;
    private TextView _errorQ23A;
    private TextView _errorQ24A;
    private TextView _errorQ25A;
    private TextView _errorQ26A;

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
        super.initActivity(R.layout.activity_blok3b);
        extras = getIntent().getExtras();

        _spQ17A = (Spinner) findViewById(R.id.spQ17A);
        _spQ22A = (Spinner) findViewById(R.id.spQ22A);

        _lblQ18 = (TextView) findViewById(R.id.lblQ18);
        _txtQ18A = (EditText) findViewById(R.id.txtQ18A);
        _txtQ19A = (EditText) findViewById(R.id.txtQ19A);
        _txtQ20A1 = (EditText) findViewById(R.id.txtQ20A1);
        _txtQ20A2 = (EditText) findViewById(R.id.txtQ20A2);
        _txtQ20A3 = (EditText) findViewById(R.id.txtQ20A3);
        _txtQ21A1 = (EditText) findViewById(R.id.txtQ21A1);
        _txtQ21A2 = (EditText) findViewById(R.id.txtQ21A2);
        _txtQ21A3 = (EditText) findViewById(R.id.txtQ21A3);

        _lblQ23 = (TextView) findViewById(R.id.lblQ23);
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

        _errorQ18A = (TextView) findViewById(R.id.errorQ18A);
        _errorQ19A = (TextView) findViewById(R.id.errorQ19A);
        _errorQ20A = (TextView) findViewById(R.id.errorQ20A);
        _errorQ21A = (TextView) findViewById(R.id.errorQ21A);
        _errorQ23A = (TextView) findViewById(R.id.errorQ23A);
        _errorQ24A = (TextView) findViewById(R.id.errorQ24A);
        _errorQ25A = (TextView) findViewById(R.id.errorQ25A);
        _errorQ26A = (TextView) findViewById(R.id.errorQ26A);

        _lblQ18.setVisibility(View.GONE);
        _txtQ18A.setVisibility(View.GONE);
        _txtQ21A1.setVisibility(View.GONE);
        _txtQ21A2.setVisibility(View.GONE);
        _txtQ21A3.setVisibility(View.GONE);
        _lblQ21.setVisibility(View.GONE);

        _lblQ23.setVisibility(View.GONE);
        _txtQ23A.setVisibility(View.GONE);
        _txtQ26A1.setVisibility(View.GONE);
        _txtQ26A2.setVisibility(View.GONE);
        _txtQ26A3.setVisibility(View.GONE);
        _lblQ26.setVisibility(View.GONE);

        ArrayAdapter<CharSequence> adapterQ17 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_1000to1500k_list, android.R.layout.simple_spinner_item);
        adapterQ17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _spQ17A.setAdapter(adapterQ17);

        if(extras.getString("NO_17") != null)
        {
            int position = SetSelectedSpinner(adapterQ17, extras.getString("NO_17"));
            if(position > 0) {
                _spQ17A.setSelection(position);
            }
        }

        if(extras.getString("NO_18") != null)
        {
            _txtQ18A.setText(extras.getString("NO_18"));
        }

        if(extras.getString("NO_19") != null)
        {
            _txtQ19A.setText(extras.getString("NO_19"));
        }

        if(extras.getString("NO_20") != null)
        {
            String[] splitAnswer = extras.getString("NO_20").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ20A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ20A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ20A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_21") != null)
        {
            String[] splitAnswer = extras.getString("NO_21").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ21A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ21A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ21A3.setText(splitAnswer[2]);
                }
            }
        }

        ArrayAdapter<CharSequence> adapterQ22 = ArrayAdapter.createFromResource(this, R.array.page_blok3_phone_1500to2000k_list, android.R.layout.simple_spinner_item);
        adapterQ22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _spQ22A.setAdapter(adapterQ22);

        if(extras.getString("NO_22") != null)
        {
            int position = SetSelectedSpinner(adapterQ22, extras.getString("NO_22"));
            if(position > 0) {
                _spQ22A.setSelection(position);
            }
        }

        if(extras.getString("NO_23") != null)
        {
            _txtQ23A.setText(extras.getString("NO_23"));
        }

        if(extras.getString("NO_24") != null)
        {
            _txtQ24A.setText(extras.getString("NO_24"));
        }

        if(extras.getString("NO_25") != null)
        {
            String[] splitAnswer = extras.getString("NO_25").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ25A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ25A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ25A3.setText(splitAnswer[2]);
                }
            }
        }

        if(extras.getString("NO_26") != null)
        {
            String[] splitAnswer = extras.getString("NO_26").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                if(splitAnswer.length >= 1)
                {
                    _txtQ26A1.setText(splitAnswer[0]);
                }
                if(splitAnswer.length >= 2)
                {
                    _txtQ26A2.setText(splitAnswer[1]);
                }
                if(splitAnswer.length >= 3)
                {
                    _txtQ26A3.setText(splitAnswer[2]);
                }
            }
        }

        _spQ17A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _lblQ18.setVisibility(View.VISIBLE);
                    _txtQ18A.setVisibility(View.VISIBLE);
                    _txtQ21A1.setVisibility(View.VISIBLE);
                    _txtQ21A2.setVisibility(View.VISIBLE);
                    _txtQ21A3.setVisibility(View.VISIBLE);
                    _lblQ21.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _lblQ18.setVisibility(View.GONE);
                    _txtQ18A.setVisibility(View.GONE);
                    _txtQ21A1.setVisibility(View.GONE);
                    _txtQ21A2.setVisibility(View.GONE);
                    _txtQ21A3.setVisibility(View.GONE);
                    _lblQ21.setVisibility(View.GONE);

                    _txtQ18A.setText("");
                    _txtQ21A1.setText("");
                    _txtQ21A2.setText("");
                    _txtQ21A3.setText("");
                }
                else
                {
                    _lblQ18.setVisibility(View.GONE);
                    _txtQ18A.setVisibility(View.GONE);
                    _txtQ21A1.setVisibility(View.VISIBLE);
                    _txtQ21A2.setVisibility(View.VISIBLE);
                    _txtQ21A3.setVisibility(View.VISIBLE);
                    _lblQ21.setVisibility(View.VISIBLE);

                    _txtQ18A.setText("");
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
                    _lblQ23.setVisibility(View.VISIBLE);
                    _txtQ23A.setVisibility(View.VISIBLE);
                    _txtQ26A1.setVisibility(View.VISIBLE);
                    _txtQ26A2.setVisibility(View.VISIBLE);
                    _txtQ26A3.setVisibility(View.VISIBLE);
                    _lblQ26.setVisibility(View.VISIBLE);
                }
                else if(selectedItem.equals("Smartfren"))
                {
                    _lblQ23.setVisibility(View.GONE);
                    _txtQ23A.setVisibility(View.GONE);
                    _txtQ26A1.setVisibility(View.GONE);
                    _txtQ26A2.setVisibility(View.GONE);
                    _txtQ26A3.setVisibility(View.GONE);
                    _lblQ26.setVisibility(View.GONE);

                    _txtQ23A.setText("");
                    _txtQ26A1.setText("");
                    _txtQ26A2.setText("");
                    _txtQ26A3.setText("");
                }
                else
                {
                    _lblQ23.setVisibility(View.GONE);
                    _txtQ23A.setVisibility(View.GONE);
                    _txtQ26A1.setVisibility(View.VISIBLE);
                    _txtQ26A2.setVisibility(View.VISIBLE);
                    _txtQ26A3.setVisibility(View.VISIBLE);
                    _lblQ26.setVisibility(View.VISIBLE);

                    _txtQ23A.setText("");
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
                Intent intent = new Intent(Blok3BActivity.this, Blok3Activity.class);
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
                String A17 = String.valueOf(_spQ17A.getSelectedItem());

                String A18 = _txtQ18A.getText().toString();
                String A19 = _txtQ19A.getText().toString();
                String A20 = _txtQ20A1.getText().toString() + ";" +_txtQ20A2.getText().toString() + ";" +_txtQ20A3.getText().toString();
                String A21 = _txtQ21A1.getText().toString() + ";" +_txtQ21A2.getText().toString() + ";" +_txtQ21A3.getText().toString();

                if(A20.equals(";;"))
                {
                    A20 = "";
                }
                if(A21.equals(";;"))
                {
                    A21 = "";
                }

                String A22 = String.valueOf(_spQ22A.getSelectedItem());

                String A23 = _txtQ23A.getText().toString();
                String A24 = _txtQ24A.getText().toString();
                String A25 = _txtQ25A1.getText().toString() + ";" +_txtQ25A2.getText().toString() + ";" +_txtQ25A3.getText().toString();
                String A26 = _txtQ26A1.getText().toString() + ";" +_txtQ26A2.getText().toString() + ";" +_txtQ26A3.getText().toString();

                if(A25.equals(";;"))
                {
                    A25 = "";
                }
                if(A26.equals(";;"))
                {
                    A26 = "";
                }

                int validatedAnswer = 0;
                validatedAnswer++; //no 17 always validated cause of spinner

                if(A17.equals("Lainnya") && (A18 == null || A18.equals("") || A18.isEmpty()))
                {
                    _errorQ18A.setError("error");
                    _errorQ18A.setText("merk smartphone lainnya harus terisi");
                }
                else if(A17.equals("Lainnya") && A18 != null && !A18.equals("") && !A18.isEmpty() && A18.length() > 50)
                {
                    _errorQ18A.setError("error");
                    _errorQ18A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ18A.setError(null);
                    _errorQ18A.setText("");
                    validatedAnswer++;
                }

                if(A19 == null || A19.equals("") || A19.isEmpty())
                {
                    _errorQ19A.setError("error");
                    _errorQ19A.setText("model harus diisi");
                }
                else if(A19 != null && !A19.equals("") && !A19.isEmpty() && A19.length() > 50)
                {
                    _errorQ19A.setError("error");
                    _errorQ19A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ19A.setError(null);
                    _errorQ19A.setText("");
                    validatedAnswer++;
                }

                if(A20 == null || A20.equals("") || A20.isEmpty())
                {
                    _errorQ20A.setError("error");
                    _errorQ20A.setText("alasan rekomendasi harus diisi");
                }
                else if(A20 != null && !A20.equals("") && !A20.isEmpty() &&
                        (_txtQ20A1.getText() != null && !_txtQ20A1.getText().toString().equals("") &&  _txtQ20A1.getText().toString().length() > 50)
                        || (_txtQ20A2.getText() != null && !_txtQ20A2.getText().toString().equals("") &&  _txtQ20A2.getText().toString().length() > 50)
                        || (_txtQ20A3.getText() != null && !_txtQ20A3.getText().toString().equals("") &&  _txtQ20A3.getText().toString().length() > 50))
                {
                    _errorQ20A.setError("error");
                    _errorQ20A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ20A.setError(null);
                    _errorQ20A.setText("");
                    validatedAnswer++;
                }

                if(!A17.equals("Smartfren") && (A21 == null || A21.equals("") || A21.isEmpty()))
                {
                    _errorQ21A.setError("error");
                    _errorQ21A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!A17.equals("Smartfren") && A21 != null && !A21.equals("") && !A21.isEmpty() &&
                        (_txtQ21A1.getText() != null && !_txtQ21A1.getText().toString().equals("") &&  _txtQ21A1.getText().toString().length() > 50)
                        || (_txtQ21A2.getText() != null && !_txtQ21A2.getText().toString().equals("") &&  _txtQ21A2.getText().toString().length() > 50)
                        || (_txtQ21A3.getText() != null && !_txtQ21A3.getText().toString().equals("") &&  _txtQ21A3.getText().toString().length() > 50))
                {
                    _errorQ21A.setError("error");
                    _errorQ21A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ21A.setError(null);
                    _errorQ21A.setText("");
                    validatedAnswer++;
                }

                validatedAnswer++; //no 22 always validated cause of spinner

                if(A22.equals("Lainnya") && (A23 == null || A23.equals("") || A23.isEmpty()))
                {
                    _errorQ23A.setError("error");
                    _errorQ23A.setText("merk smartphone lainnya harus terisi");
                }
                else if(A22.equals("Lainnya") && A23 != null && !A23.equals("") && !A23.isEmpty() && A23.length() > 50)
                {
                    _errorQ23A.setError("error");
                    _errorQ23A.setText("merk smartphone lainnya tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ23A.setError(null);
                    _errorQ23A.setText("");
                    validatedAnswer++;
                }

                if(A24 == null || A24.equals("") || A24.isEmpty())
                {
                    _errorQ24A.setError("error");
                    _errorQ24A.setText("model harus diisi");
                }
                else if(A24 != null && !A24.equals("") && !A24.isEmpty() && A24.length() > 50)
                {
                    _errorQ24A.setError("error");
                    _errorQ24A.setText("model tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ24A.setError(null);
                    _errorQ24A.setText("");
                    validatedAnswer++;
                }

                if(A25 == null || A25.equals("") || A25.isEmpty())
                {
                    _errorQ25A.setError("error");
                    _errorQ25A.setText("alasan rekomendasi harus diisi");
                }
                else if(A25 != null && !A25.equals("") && !A25.isEmpty() &&
                        (_txtQ25A1.getText() != null && !_txtQ25A1.getText().toString().equals("") &&  _txtQ25A1.getText().toString().length() > 50)
                        || (_txtQ25A2.getText() != null && !_txtQ25A2.getText().toString().equals("") &&  _txtQ25A2.getText().toString().length() > 50)
                        || (_txtQ25A3.getText() != null && !_txtQ25A3.getText().toString().equals("") &&  _txtQ25A3.getText().toString().length() > 50))
                {
                    _errorQ25A.setError("error");
                    _errorQ25A.setText("alasan rekomendasi pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ25A.setError(null);
                    _errorQ25A.setText("");
                    validatedAnswer++;
                }

                if(!A22.equals("Smartfren") && (A26 == null || A26.equals("") || A26.isEmpty()))
                {
                    _errorQ26A.setError("error");
                    _errorQ26A.setText("alasan tidak rekomendasi smartfren harus diisi");
                }
                else if(!A22.equals("Smartfren") && A26 != null && !A26.equals("") && !A26.isEmpty() &&
                        (_txtQ26A1.getText() != null && !_txtQ26A1.getText().toString().equals("") &&  _txtQ26A1.getText().toString().length() > 50)
                        || (_txtQ26A2.getText() != null && !_txtQ26A2.getText().toString().equals("") &&  _txtQ26A2.getText().toString().length() > 50)
                        || (_txtQ26A3.getText() != null && !_txtQ26A3.getText().toString().equals("") &&  _txtQ26A3.getText().toString().length() > 50))
                {
                    _errorQ26A.setError("error");
                    _errorQ26A.setText("alasan tidak rekomendasi smartfren pada tiap text tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ26A.setError(null);
                    _errorQ26A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 10)
                {
                    Intent intent = new Intent(Blok3BActivity.this, Blok4Activity.class);
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


            }
        });
    }


}
