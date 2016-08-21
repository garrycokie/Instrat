package com.smartfren.instrat.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;

public class Blok4Activity extends BaseStepsActivity {

    private CheckBox _cbQ38ASmartfren;
    private CheckBox _cbQ38AAdvan;
    private CheckBox _cbQ38AAsus;
    private CheckBox _cbQ38ABlackberry;
    private CheckBox _cbQ38AEvercoss;
    private CheckBox _cbQ38AIndosat;
    private CheckBox _cbQ38ALenovo;
    private CheckBox _cbQ38AMito;
    private CheckBox _cbQ38ANokia;
    private CheckBox _cbQ38AOppo;
    private CheckBox _cbQ38ASamsung;
    private CheckBox _cbQ38ASony;
    private CheckBox _cbQ38ATelkomsel;
    private CheckBox _cbQ38AXL;
    private CheckBox _cbQ38A3;
    private CheckBox _cbQ38ATidakAda;
    private CheckBox _cbQ38ALainnya;

    private CheckBox _cbQ39ASmartfren;
    private CheckBox _cbQ39AAdvan;
    private CheckBox _cbQ39AAsus;
    private CheckBox _cbQ39ABlackberry;
    private CheckBox _cbQ39AEvercoss;
    private CheckBox _cbQ39AIndosat;
    private CheckBox _cbQ39ALenovo;
    private CheckBox _cbQ39AMito;
    private CheckBox _cbQ39ANokia;
    private CheckBox _cbQ39AOppo;
    private CheckBox _cbQ39ASamsung;
    private CheckBox _cbQ39ASony;
    private CheckBox _cbQ39ATelkomsel;
    private CheckBox _cbQ39AXL;
    private CheckBox _cbQ39A3;
    private CheckBox _cbQ39ATidakAda;
    private CheckBox _cbQ39ALainnya;

    private CheckBox _cbQ40ASmartfren;
    private CheckBox _cbQ40AAdvan;
    private CheckBox _cbQ40AAsus;
    private CheckBox _cbQ40ABlackberry;
    private CheckBox _cbQ40AEvercoss;
    private CheckBox _cbQ40AIndosat;
    private CheckBox _cbQ40ALenovo;
    private CheckBox _cbQ40AMito;
    private CheckBox _cbQ40ANokia;
    private CheckBox _cbQ40AOppo;
    private CheckBox _cbQ40ASamsung;
    private CheckBox _cbQ40ASony;
    private CheckBox _cbQ40ATelkomsel;
    private CheckBox _cbQ40AXL;
    private CheckBox _cbQ40A3;
    private CheckBox _cbQ40ATidakAda;
    private CheckBox _cbQ40ALainnya;

    private CheckBox _cbQ41ASmartfren;
    private CheckBox _cbQ41AAdvan;
    private CheckBox _cbQ41AAsus;
    private CheckBox _cbQ41ABlackberry;
    private CheckBox _cbQ41AEvercoss;
    private CheckBox _cbQ41AIndosat;
    private CheckBox _cbQ41ALenovo;
    private CheckBox _cbQ41AMito;
    private CheckBox _cbQ41ANokia;
    private CheckBox _cbQ41AOppo;
    private CheckBox _cbQ41ASamsung;
    private CheckBox _cbQ41ASony;
    private CheckBox _cbQ41ATelkomsel;
    private CheckBox _cbQ41AXL;
    private CheckBox _cbQ41A3;
    private CheckBox _cbQ41ATidakAda;
    private CheckBox _cbQ41ALainnya;

    private CheckBox _cbQ42ASmartfren;
    private CheckBox _cbQ42AAdvan;
    private CheckBox _cbQ42AAsus;
    private CheckBox _cbQ42ABlackberry;
    private CheckBox _cbQ42AEvercoss;
    private CheckBox _cbQ42AIndosat;
    private CheckBox _cbQ42ALenovo;
    private CheckBox _cbQ42AMito;
    private CheckBox _cbQ42ANokia;
    private CheckBox _cbQ42AOppo;
    private CheckBox _cbQ42ASamsung;
    private CheckBox _cbQ42ASony;
    private CheckBox _cbQ42ATelkomsel;
    private CheckBox _cbQ42AXL;
    private CheckBox _cbQ42A3;
    private CheckBox _cbQ42ATidakAda;
    private CheckBox _cbQ42ALainnya;

    private CheckBox _cbQ43ASmartfren;
    private CheckBox _cbQ43AAdvan;
    private CheckBox _cbQ43AAsus;
    private CheckBox _cbQ43ABlackberry;
    private CheckBox _cbQ43AEvercoss;
    private CheckBox _cbQ43AIndosat;
    private CheckBox _cbQ43ALenovo;
    private CheckBox _cbQ43AMito;
    private CheckBox _cbQ43ANokia;
    private CheckBox _cbQ43AOppo;
    private CheckBox _cbQ43ASamsung;
    private CheckBox _cbQ43ASony;
    private CheckBox _cbQ43ATelkomsel;
    private CheckBox _cbQ43AXL;
    private CheckBox _cbQ43A3;
    private CheckBox _cbQ43ATidakAda;
    private CheckBox _cbQ43ALainnya;

    private CheckBox _cbQ44ASmartfren;
    private CheckBox _cbQ44AAdvan;
    private CheckBox _cbQ44AAsus;
    private CheckBox _cbQ44ABlackberry;
    private CheckBox _cbQ44AEvercoss;
    private CheckBox _cbQ44AIndosat;
    private CheckBox _cbQ44ALenovo;
    private CheckBox _cbQ44AMito;
    private CheckBox _cbQ44ANokia;
    private CheckBox _cbQ44AOppo;
    private CheckBox _cbQ44ASamsung;
    private CheckBox _cbQ44ASony;
    private CheckBox _cbQ44ATelkomsel;
    private CheckBox _cbQ44AXL;
    private CheckBox _cbQ44A3;
    private CheckBox _cbQ44ATidakAda;
    private CheckBox _cbQ44ALainnya;

    private CheckBox _cbQ45ASmartfren;
    private CheckBox _cbQ45AAdvan;
    private CheckBox _cbQ45AAsus;
    private CheckBox _cbQ45ABlackberry;
    private CheckBox _cbQ45AEvercoss;
    private CheckBox _cbQ45AIndosat;
    private CheckBox _cbQ45ALenovo;
    private CheckBox _cbQ45AMito;
    private CheckBox _cbQ45ANokia;
    private CheckBox _cbQ45AOppo;
    private CheckBox _cbQ45ASamsung;
    private CheckBox _cbQ45ASony;
    private CheckBox _cbQ45ATelkomsel;
    private CheckBox _cbQ45AXL;
    private CheckBox _cbQ45A3;
    private CheckBox _cbQ45ATidakAda;
    private CheckBox _cbQ45ALainnya;

    private EditText _txtQ38A;
    private EditText _txtQ39A;
    private EditText _txtQ40A;
    private EditText _txtQ41A;
    private EditText _txtQ42A;
    private EditText _txtQ43A;
    private EditText _txtQ44A;
    private EditText _txtQ45A;

    private Spinner _spQ46A;
    private Spinner _spQ47A;

    private TextView _txtQ46A;
    private Bundle extras;

    protected String GetCheckBoxValue(CheckBox cb, String result)
    {
        if(cb.isChecked())
        {
            result = result + ";"+ cb.getText().toString();
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_blok4);
        extras = getIntent().getExtras();

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
                // TODO: continue;
            }
        });

        _cbQ38ASmartfren = (CheckBox) findViewById(R.id.cbQ38ASmartfren);
        _cbQ38AAdvan = (CheckBox) findViewById(R.id.cbQ38AAdvan);
        _cbQ38AAsus = (CheckBox) findViewById(R.id.cbQ38AAsus);
        _cbQ38ABlackberry = (CheckBox) findViewById(R.id.cbQ38ABlackberry);
        _cbQ38AEvercoss = (CheckBox) findViewById(R.id.cbQ38AEvercoss);
        _cbQ38AIndosat = (CheckBox) findViewById(R.id.cbQ38AIndosat);
        _cbQ38ALenovo = (CheckBox) findViewById(R.id.cbQ38ALenovo);
        _cbQ38AMito = (CheckBox) findViewById(R.id.cbQ38AMito);
        _cbQ38ANokia = (CheckBox) findViewById(R.id.cbQ38ANokia);
        _cbQ38AOppo = (CheckBox) findViewById(R.id.cbQ38AOppo);
        _cbQ38ASamsung = (CheckBox) findViewById(R.id.cbQ38ASamsung);
        _cbQ38ASony = (CheckBox) findViewById(R.id.cbQ38ASony);
        _cbQ38ATelkomsel = (CheckBox) findViewById(R.id.cbQ38ATelkomsel);
        _cbQ38A3 = (CheckBox) findViewById(R.id.cbQ38A3);
        _cbQ38AXL = (CheckBox) findViewById(R.id.cbQ38AXL);
        _cbQ38ATidakAda = (CheckBox) findViewById(R.id.cbQ38ATidakAda);
        _cbQ38ALainnya = (CheckBox) findViewById(R.id.cbQ38ALainnya);

        _cbQ39ASmartfren = (CheckBox) findViewById(R.id.cbQ39ASmartfren);
        _cbQ39AAdvan = (CheckBox) findViewById(R.id.cbQ39AAdvan);
        _cbQ39AAsus = (CheckBox) findViewById(R.id.cbQ39AAsus);
        _cbQ39ABlackberry = (CheckBox) findViewById(R.id.cbQ39ABlackberry);
        _cbQ39AEvercoss = (CheckBox) findViewById(R.id.cbQ39AEvercoss);
        _cbQ39AIndosat = (CheckBox) findViewById(R.id.cbQ39AIndosat);
        _cbQ39ALenovo = (CheckBox) findViewById(R.id.cbQ39ALenovo);
        _cbQ39AMito = (CheckBox) findViewById(R.id.cbQ39AMito);
        _cbQ39ANokia = (CheckBox) findViewById(R.id.cbQ39ANokia);
        _cbQ39AOppo = (CheckBox) findViewById(R.id.cbQ39AOppo);
        _cbQ39ASamsung = (CheckBox) findViewById(R.id.cbQ39ASamsung);
        _cbQ39ASony = (CheckBox) findViewById(R.id.cbQ39ASony);
        _cbQ39ATelkomsel = (CheckBox) findViewById(R.id.cbQ39ATelkomsel);
        _cbQ39A3 = (CheckBox) findViewById(R.id.cbQ39A3);
        _cbQ39AXL = (CheckBox) findViewById(R.id.cbQ39AXL);
        _cbQ39ATidakAda = (CheckBox) findViewById(R.id.cbQ39ATidakAda);
        _cbQ39ALainnya = (CheckBox) findViewById(R.id.cbQ39ALainnya);

        _cbQ40ASmartfren = (CheckBox) findViewById(R.id.cbQ40ASmartfren);
        _cbQ40AAdvan = (CheckBox) findViewById(R.id.cbQ40AAdvan);
        _cbQ40AAsus = (CheckBox) findViewById(R.id.cbQ40AAsus);
        _cbQ40ABlackberry = (CheckBox) findViewById(R.id.cbQ40ABlackberry);
        _cbQ40AEvercoss = (CheckBox) findViewById(R.id.cbQ40AEvercoss);
        _cbQ40AIndosat = (CheckBox) findViewById(R.id.cbQ40AIndosat);
        _cbQ40ALenovo = (CheckBox) findViewById(R.id.cbQ40ALenovo);
        _cbQ40AMito = (CheckBox) findViewById(R.id.cbQ40AMito);
        _cbQ40ANokia = (CheckBox) findViewById(R.id.cbQ40ANokia);
        _cbQ40AOppo = (CheckBox) findViewById(R.id.cbQ40AOppo);
        _cbQ40ASamsung = (CheckBox) findViewById(R.id.cbQ40ASamsung);
        _cbQ40ASony = (CheckBox) findViewById(R.id.cbQ40ASony);
        _cbQ40ATelkomsel = (CheckBox) findViewById(R.id.cbQ40ATelkomsel);
        _cbQ40A3 = (CheckBox) findViewById(R.id.cbQ40A3);
        _cbQ40AXL = (CheckBox) findViewById(R.id.cbQ40AXL);
        _cbQ40ATidakAda = (CheckBox) findViewById(R.id.cbQ40ATidakAda);
        _cbQ40ALainnya = (CheckBox) findViewById(R.id.cbQ40ALainnya);

        _cbQ41ASmartfren = (CheckBox) findViewById(R.id.cbQ41ASmartfren);
        _cbQ41AAdvan = (CheckBox) findViewById(R.id.cbQ41AAdvan);
        _cbQ41AAsus = (CheckBox) findViewById(R.id.cbQ41AAsus);
        _cbQ41ABlackberry = (CheckBox) findViewById(R.id.cbQ41ABlackberry);
        _cbQ41AEvercoss = (CheckBox) findViewById(R.id.cbQ41AEvercoss);
        _cbQ41AIndosat = (CheckBox) findViewById(R.id.cbQ41AIndosat);
        _cbQ41ALenovo = (CheckBox) findViewById(R.id.cbQ41ALenovo);
        _cbQ41AMito = (CheckBox) findViewById(R.id.cbQ41AMito);
        _cbQ41ANokia = (CheckBox) findViewById(R.id.cbQ41ANokia);
        _cbQ41AOppo = (CheckBox) findViewById(R.id.cbQ41AOppo);
        _cbQ41ASamsung = (CheckBox) findViewById(R.id.cbQ41ASamsung);
        _cbQ41ASony = (CheckBox) findViewById(R.id.cbQ41ASony);
        _cbQ41ATelkomsel = (CheckBox) findViewById(R.id.cbQ41ATelkomsel);
        _cbQ41A3 = (CheckBox) findViewById(R.id.cbQ41A3);
        _cbQ41AXL = (CheckBox) findViewById(R.id.cbQ41AXL);
        _cbQ41ATidakAda = (CheckBox) findViewById(R.id.cbQ41ATidakAda);
        _cbQ41ALainnya = (CheckBox) findViewById(R.id.cbQ41ALainnya);

        _cbQ42ASmartfren = (CheckBox) findViewById(R.id.cbQ42ASmartfren);
        _cbQ42AAdvan = (CheckBox) findViewById(R.id.cbQ42AAdvan);
        _cbQ42AAsus = (CheckBox) findViewById(R.id.cbQ42AAsus);
        _cbQ42ABlackberry = (CheckBox) findViewById(R.id.cbQ42ABlackberry);
        _cbQ42AEvercoss = (CheckBox) findViewById(R.id.cbQ42AEvercoss);
        _cbQ42AIndosat = (CheckBox) findViewById(R.id.cbQ42AIndosat);
        _cbQ42ALenovo = (CheckBox) findViewById(R.id.cbQ42ALenovo);
        _cbQ42AMito = (CheckBox) findViewById(R.id.cbQ42AMito);
        _cbQ42ANokia = (CheckBox) findViewById(R.id.cbQ42ANokia);
        _cbQ42AOppo = (CheckBox) findViewById(R.id.cbQ42AOppo);
        _cbQ42ASamsung = (CheckBox) findViewById(R.id.cbQ42ASamsung);
        _cbQ42ASony = (CheckBox) findViewById(R.id.cbQ42ASony);
        _cbQ42ATelkomsel = (CheckBox) findViewById(R.id.cbQ42ATelkomsel);
        _cbQ42A3 = (CheckBox) findViewById(R.id.cbQ42A3);
        _cbQ42AXL = (CheckBox) findViewById(R.id.cbQ42AXL);
        _cbQ42ATidakAda = (CheckBox) findViewById(R.id.cbQ42ATidakAda);
        _cbQ42ALainnya = (CheckBox) findViewById(R.id.cbQ42ALainnya);

        _cbQ43ASmartfren = (CheckBox) findViewById(R.id.cbQ43ASmartfren);
        _cbQ43AAdvan = (CheckBox) findViewById(R.id.cbQ43AAdvan);
        _cbQ43AAsus = (CheckBox) findViewById(R.id.cbQ43AAsus);
        _cbQ43ABlackberry = (CheckBox) findViewById(R.id.cbQ43ABlackberry);
        _cbQ43AEvercoss = (CheckBox) findViewById(R.id.cbQ43AEvercoss);
        _cbQ43AIndosat = (CheckBox) findViewById(R.id.cbQ43AIndosat);
        _cbQ43ALenovo = (CheckBox) findViewById(R.id.cbQ43ALenovo);
        _cbQ43AMito = (CheckBox) findViewById(R.id.cbQ43AMito);
        _cbQ43ANokia = (CheckBox) findViewById(R.id.cbQ43ANokia);
        _cbQ43AOppo = (CheckBox) findViewById(R.id.cbQ43AOppo);
        _cbQ43ASamsung = (CheckBox) findViewById(R.id.cbQ43ASamsung);
        _cbQ43ASony = (CheckBox) findViewById(R.id.cbQ43ASony);
        _cbQ43ATelkomsel = (CheckBox) findViewById(R.id.cbQ43ATelkomsel);
        _cbQ43A3 = (CheckBox) findViewById(R.id.cbQ43A3);
        _cbQ43AXL = (CheckBox) findViewById(R.id.cbQ43AXL);
        _cbQ43ATidakAda = (CheckBox) findViewById(R.id.cbQ43ATidakAda);
        _cbQ43ALainnya = (CheckBox) findViewById(R.id.cbQ43ALainnya);

        _cbQ44ASmartfren = (CheckBox) findViewById(R.id.cbQ44ASmartfren);
        _cbQ44AAdvan = (CheckBox) findViewById(R.id.cbQ44AAdvan);
        _cbQ44AAsus = (CheckBox) findViewById(R.id.cbQ44AAsus);
        _cbQ44ABlackberry = (CheckBox) findViewById(R.id.cbQ44ABlackberry);
        _cbQ44AEvercoss = (CheckBox) findViewById(R.id.cbQ44AEvercoss);
        _cbQ44AIndosat = (CheckBox) findViewById(R.id.cbQ44AIndosat);
        _cbQ44ALenovo = (CheckBox) findViewById(R.id.cbQ44ALenovo);
        _cbQ44AMito = (CheckBox) findViewById(R.id.cbQ44AMito);
        _cbQ44ANokia = (CheckBox) findViewById(R.id.cbQ44ANokia);
        _cbQ44AOppo = (CheckBox) findViewById(R.id.cbQ44AOppo);
        _cbQ44ASamsung = (CheckBox) findViewById(R.id.cbQ44ASamsung);
        _cbQ44ASony = (CheckBox) findViewById(R.id.cbQ44ASony);
        _cbQ44ATelkomsel = (CheckBox) findViewById(R.id.cbQ44ATelkomsel);
        _cbQ44A3 = (CheckBox) findViewById(R.id.cbQ44A3);
        _cbQ44AXL = (CheckBox) findViewById(R.id.cbQ44AXL);
        _cbQ44ATidakAda = (CheckBox) findViewById(R.id.cbQ44ATidakAda);
        _cbQ44ALainnya = (CheckBox) findViewById(R.id.cbQ44ALainnya);

        _cbQ45ASmartfren = (CheckBox) findViewById(R.id.cbQ45ASmartfren);
        _cbQ45AAdvan = (CheckBox) findViewById(R.id.cbQ45AAdvan);
        _cbQ45AAsus = (CheckBox) findViewById(R.id.cbQ45AAsus);
        _cbQ45ABlackberry = (CheckBox) findViewById(R.id.cbQ45ABlackberry);
        _cbQ45AEvercoss = (CheckBox) findViewById(R.id.cbQ45AEvercoss);
        _cbQ45AIndosat = (CheckBox) findViewById(R.id.cbQ45AIndosat);
        _cbQ45ALenovo = (CheckBox) findViewById(R.id.cbQ45ALenovo);
        _cbQ45AMito = (CheckBox) findViewById(R.id.cbQ45AMito);
        _cbQ45ANokia = (CheckBox) findViewById(R.id.cbQ45ANokia);
        _cbQ45AOppo = (CheckBox) findViewById(R.id.cbQ45AOppo);
        _cbQ45ASamsung = (CheckBox) findViewById(R.id.cbQ45ASamsung);
        _cbQ45ASony = (CheckBox) findViewById(R.id.cbQ45ASony);
        _cbQ45ATelkomsel = (CheckBox) findViewById(R.id.cbQ45ATelkomsel);
        _cbQ45A3 = (CheckBox) findViewById(R.id.cbQ45A3);
        _cbQ45AXL = (CheckBox) findViewById(R.id.cbQ45AXL);
        _cbQ45ATidakAda = (CheckBox) findViewById(R.id.cbQ45ATidakAda);
        _cbQ45ALainnya = (CheckBox) findViewById(R.id.cbQ45ALainnya);

        _txtQ38A = (EditText) findViewById(R.id.txtQ38A);
        _txtQ39A = (EditText) findViewById(R.id.txtQ39A);
        _txtQ40A = (EditText) findViewById(R.id.txtQ40A);
        _txtQ41A = (EditText) findViewById(R.id.txtQ41A);
        _txtQ42A = (EditText) findViewById(R.id.txtQ42A);
        _txtQ43A = (EditText) findViewById(R.id.txtQ43A);
        _txtQ44A = (EditText) findViewById(R.id.txtQ44A);
        _txtQ45A = (EditText) findViewById(R.id.txtQ45A);

        _spQ46A = (Spinner) findViewById(R.id.spQ46A);
        _spQ47A = (Spinner) findViewById(R.id.spQ47A);

        _txtQ46A = (EditText) findViewById(R.id.txtQ46A);

        _txtQ46A.setVisibility(View.GONE);

        _spQ46A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    _txtQ46A.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtQ46A.setVisibility(View.GONE);
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
                String A38 = "";
                A38 = GetCheckBoxValue(_cbQ38ASmartfren, A38);
                A38 = GetCheckBoxValue(_cbQ38AAdvan, A38);
                A38 = GetCheckBoxValue(_cbQ38AAsus, A38);
                A38 = GetCheckBoxValue(_cbQ38ABlackberry, A38);
                A38 = GetCheckBoxValue(_cbQ38AEvercoss, A38);
                A38 = GetCheckBoxValue(_cbQ38AIndosat, A38);
                A38 = GetCheckBoxValue(_cbQ38ALenovo, A38);
                A38 = GetCheckBoxValue(_cbQ38AMito, A38);
                A38 = GetCheckBoxValue(_cbQ38ANokia, A38);
                A38 = GetCheckBoxValue(_cbQ38AOppo, A38);
                A38 = GetCheckBoxValue(_cbQ38ASamsung, A38);
                A38 = GetCheckBoxValue(_cbQ38ASony, A38);
                A38 = GetCheckBoxValue(_cbQ38ATelkomsel, A38);
                A38 = GetCheckBoxValue(_cbQ38A3, A38);
                A38 = GetCheckBoxValue(_cbQ38AXL, A38);

                if(_cbQ38ALainnya.isChecked())
                {
                    A38 = A38 + ";" + _txtQ38A.getText().toString();
                }
                if(_cbQ38ATidakAda.isChecked())
                {
                    A38 = "";
                }

                String A39 = "";
                A39 = GetCheckBoxValue(_cbQ39ASmartfren, A39);
                A39 = GetCheckBoxValue(_cbQ39AAdvan, A39);
                A39 = GetCheckBoxValue(_cbQ39AAsus, A39);
                A39 = GetCheckBoxValue(_cbQ39ABlackberry, A39);
                A39 = GetCheckBoxValue(_cbQ39AEvercoss, A39);
                A39 = GetCheckBoxValue(_cbQ39AIndosat, A39);
                A39 = GetCheckBoxValue(_cbQ39ALenovo, A39);
                A39 = GetCheckBoxValue(_cbQ39AMito, A39);
                A39 = GetCheckBoxValue(_cbQ39ANokia, A39);
                A39 = GetCheckBoxValue(_cbQ39AOppo, A39);
                A39 = GetCheckBoxValue(_cbQ39ASamsung, A39);
                A39 = GetCheckBoxValue(_cbQ39ASony, A39);
                A39 = GetCheckBoxValue(_cbQ39ATelkomsel, A39);
                A39 = GetCheckBoxValue(_cbQ39A3, A39);
                A39 = GetCheckBoxValue(_cbQ39AXL, A39);

                if(_cbQ39ALainnya.isChecked())
                {
                    A39 = A39 + ";" + _txtQ39A.getText().toString();
                }
                if(_cbQ39ATidakAda.isChecked())
                {
                    A39 = "";
                }

                String A40 = "";
                A40 = GetCheckBoxValue(_cbQ40ASmartfren, A40);
                A40 = GetCheckBoxValue(_cbQ40AAdvan, A40);
                A40 = GetCheckBoxValue(_cbQ40AAsus, A40);
                A40 = GetCheckBoxValue(_cbQ40ABlackberry, A40);
                A40 = GetCheckBoxValue(_cbQ40AEvercoss, A40);
                A40 = GetCheckBoxValue(_cbQ40AIndosat, A40);
                A40 = GetCheckBoxValue(_cbQ40ALenovo, A40);
                A40 = GetCheckBoxValue(_cbQ40AMito, A40);
                A40 = GetCheckBoxValue(_cbQ40ANokia, A40);
                A40 = GetCheckBoxValue(_cbQ40AOppo, A40);
                A40 = GetCheckBoxValue(_cbQ40ASamsung, A40);
                A40 = GetCheckBoxValue(_cbQ40ASony, A40);
                A40 = GetCheckBoxValue(_cbQ40ATelkomsel, A40);
                A40 = GetCheckBoxValue(_cbQ40A3, A40);
                A40 = GetCheckBoxValue(_cbQ40AXL, A40);

                if(_cbQ40ALainnya.isChecked())
                {
                    A40 = A40 + ";" + _txtQ40A.getText().toString();
                }
                if(_cbQ40ATidakAda.isChecked())
                {
                    A40 = "";
                }

                String A41 = "";
                A41 = GetCheckBoxValue(_cbQ41ASmartfren, A41);
                A41 = GetCheckBoxValue(_cbQ41AAdvan, A41);
                A41 = GetCheckBoxValue(_cbQ41AAsus, A41);
                A41 = GetCheckBoxValue(_cbQ41ABlackberry, A41);
                A41 = GetCheckBoxValue(_cbQ41AEvercoss, A41);
                A41 = GetCheckBoxValue(_cbQ41AIndosat, A41);
                A41 = GetCheckBoxValue(_cbQ41ALenovo, A41);
                A41 = GetCheckBoxValue(_cbQ41AMito, A41);
                A41 = GetCheckBoxValue(_cbQ41ANokia, A41);
                A41 = GetCheckBoxValue(_cbQ41AOppo, A41);
                A41 = GetCheckBoxValue(_cbQ41ASamsung, A41);
                A41 = GetCheckBoxValue(_cbQ41ASony, A41);
                A41 = GetCheckBoxValue(_cbQ41ATelkomsel, A41);
                A41 = GetCheckBoxValue(_cbQ41A3, A41);
                A41 = GetCheckBoxValue(_cbQ41AXL, A41);

                if(_cbQ41ALainnya.isChecked())
                {
                    A41 = A41 + ";" + _txtQ41A.getText().toString();
                }
                if(_cbQ41ATidakAda.isChecked())
                {
                    A41 = "";
                }

                String A42 = "";
                A42 = GetCheckBoxValue(_cbQ42ASmartfren, A42);
                A42 = GetCheckBoxValue(_cbQ42AAdvan, A42);
                A42 = GetCheckBoxValue(_cbQ42AAsus, A42);
                A42 = GetCheckBoxValue(_cbQ42ABlackberry, A42);
                A42 = GetCheckBoxValue(_cbQ42AEvercoss, A42);
                A42 = GetCheckBoxValue(_cbQ42AIndosat, A42);
                A42 = GetCheckBoxValue(_cbQ42ALenovo, A42);
                A42 = GetCheckBoxValue(_cbQ42AMito, A42);
                A42 = GetCheckBoxValue(_cbQ42ANokia, A42);
                A42 = GetCheckBoxValue(_cbQ42AOppo, A42);
                A42 = GetCheckBoxValue(_cbQ42ASamsung, A42);
                A42 = GetCheckBoxValue(_cbQ42ASony, A42);
                A42 = GetCheckBoxValue(_cbQ42ATelkomsel, A42);
                A42 = GetCheckBoxValue(_cbQ42A3, A42);
                A42 = GetCheckBoxValue(_cbQ42AXL, A42);

                if(_cbQ42ALainnya.isChecked())
                {
                    A42 = A42 + ";" + _txtQ42A.getText().toString();
                }
                if(_cbQ42ATidakAda.isChecked())
                {
                    A42 = "";
                }

                String A43 = "";
                A43 = GetCheckBoxValue(_cbQ43ASmartfren, A43);
                A43 = GetCheckBoxValue(_cbQ43AAdvan, A43);
                A43 = GetCheckBoxValue(_cbQ43AAsus, A43);
                A43 = GetCheckBoxValue(_cbQ43ABlackberry, A43);
                A43 = GetCheckBoxValue(_cbQ43AEvercoss, A43);
                A43 = GetCheckBoxValue(_cbQ43AIndosat, A43);
                A43 = GetCheckBoxValue(_cbQ43ALenovo, A43);
                A43 = GetCheckBoxValue(_cbQ43AMito, A43);
                A43 = GetCheckBoxValue(_cbQ43ANokia, A43);
                A43 = GetCheckBoxValue(_cbQ43AOppo, A43);
                A43 = GetCheckBoxValue(_cbQ43ASamsung, A43);
                A43 = GetCheckBoxValue(_cbQ43ASony, A43);
                A43 = GetCheckBoxValue(_cbQ43ATelkomsel, A43);
                A43 = GetCheckBoxValue(_cbQ43A3, A43);
                A43 = GetCheckBoxValue(_cbQ43AXL, A43);

                if(_cbQ43ALainnya.isChecked())
                {
                    A43 = A43 + ";" + _txtQ43A.getText().toString();
                }
                if(_cbQ43ATidakAda.isChecked())
                {
                    A43 = "";
                }

                String A44 = "";
                A44 = GetCheckBoxValue(_cbQ44ASmartfren, A44);
                A44 = GetCheckBoxValue(_cbQ44AAdvan, A44);
                A44 = GetCheckBoxValue(_cbQ44AAsus, A44);
                A44 = GetCheckBoxValue(_cbQ44ABlackberry, A44);
                A44 = GetCheckBoxValue(_cbQ44AEvercoss, A44);
                A44 = GetCheckBoxValue(_cbQ44AIndosat, A44);
                A44 = GetCheckBoxValue(_cbQ44ALenovo, A44);
                A44 = GetCheckBoxValue(_cbQ44AMito, A44);
                A44 = GetCheckBoxValue(_cbQ44ANokia, A44);
                A44 = GetCheckBoxValue(_cbQ44AOppo, A44);
                A44 = GetCheckBoxValue(_cbQ44ASamsung, A44);
                A44 = GetCheckBoxValue(_cbQ44ASony, A44);
                A44 = GetCheckBoxValue(_cbQ44ATelkomsel, A44);
                A44 = GetCheckBoxValue(_cbQ44A3, A44);
                A44 = GetCheckBoxValue(_cbQ44AXL, A44);

                if(_cbQ44ALainnya.isChecked())
                {
                    A44 = A44 + ";" + _txtQ44A.getText().toString();
                }
                if(_cbQ44ATidakAda.isChecked())
                {
                    A44 = "";
                }

                String A45 = "";
                A45 = GetCheckBoxValue(_cbQ45ASmartfren, A45);
                A45 = GetCheckBoxValue(_cbQ45AAdvan, A45);
                A45 = GetCheckBoxValue(_cbQ45AAsus, A45);
                A45 = GetCheckBoxValue(_cbQ45ABlackberry, A45);
                A45 = GetCheckBoxValue(_cbQ45AEvercoss, A45);
                A45 = GetCheckBoxValue(_cbQ45AIndosat, A45);
                A45 = GetCheckBoxValue(_cbQ45ALenovo, A45);
                A45 = GetCheckBoxValue(_cbQ45AMito, A45);
                A45 = GetCheckBoxValue(_cbQ45ANokia, A45);
                A45 = GetCheckBoxValue(_cbQ45AOppo, A45);
                A45 = GetCheckBoxValue(_cbQ45ASamsung, A45);
                A45 = GetCheckBoxValue(_cbQ45ASony, A45);
                A45 = GetCheckBoxValue(_cbQ45ATelkomsel, A45);
                A45 = GetCheckBoxValue(_cbQ45A3, A45);
                A45 = GetCheckBoxValue(_cbQ45AXL, A45);

                if(_cbQ45ALainnya.isChecked())
                {
                    A45 = A45 + ";" + _txtQ45A.getText().toString();
                }
                if(_cbQ45ATidakAda.isChecked())
                {
                    A45 = "";
                }

                String A46 = "";
                if(String.valueOf(_spQ46A.getSelectedItem()).equals("Lainnya"))
                {
                    A46 = _txtQ46A.getText().toString();
                }
                else
                {
                    A46 = String.valueOf(_spQ46A.getSelectedItem());
                }

                String A47 = String.valueOf(_spQ47A.getSelectedItem());

                Intent intent = new Intent(Blok4Activity.this, Blok5AActivity.class);
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
                intent.putExtra("NO_7", extras.getString("NO_7"));
                intent.putExtra("NO_8", extras.getString("NO_8"));
                intent.putExtra("NO_9", extras.getString("NO_9"));
                intent.putExtra("NO_10", extras.getString("NO_10"));
                intent.putExtra("NO_11", extras.getString("NO_11"));
                intent.putExtra("NO_12", extras.getString("NO_12"));
                intent.putExtra("NO_13", extras.getString("NO_13"));
                intent.putExtra("NO_14", extras.getString("NO_14"));
                intent.putExtra("NO_15", extras.getString("NO_15"));
                intent.putExtra("NO_16", extras.getString("NO_16"));
                intent.putExtra("NO_17", extras.getString("NO_17"));
                intent.putExtra("NO_18", extras.getString("NO_18"));
                intent.putExtra("NO_19", extras.getString("NO_19"));
                intent.putExtra("NO_20", extras.getString("NO_20"));
                intent.putExtra("NO_21", extras.getString("NO_21"));
                intent.putExtra("NO_22", extras.getString("NO_22"));
                intent.putExtra("NO_23", extras.getString("NO_23"));
                intent.putExtra("NO_24", extras.getString("NO_24"));
                intent.putExtra("NO_25", extras.getString("NO_25"));
                intent.putExtra("NO_26", extras.getString("NO_26"));
                intent.putExtra("NO_27", extras.getString("NO_27"));
                intent.putExtra("NO_28", extras.getString("NO_28"));
                intent.putExtra("NO_29", extras.getString("NO_29"));
                intent.putExtra("NO_30", extras.getString("NO_30"));
                intent.putExtra("NO_31", extras.getString("NO_31"));
                intent.putExtra("NO_32", extras.getString("NO_32"));
                intent.putExtra("NO_33", extras.getString("NO_33"));
                intent.putExtra("NO_34", extras.getString("NO_34"));
                intent.putExtra("NO_35", extras.getString("NO_35"));
                intent.putExtra("NO_36", extras.getString("NO_36"));
                intent.putExtra("NO_38", A38);
                intent.putExtra("NO_39", A39);
                intent.putExtra("NO_40", A40);
                intent.putExtra("NO_41", A41);
                intent.putExtra("NO_42", A42);
                intent.putExtra("NO_43", A43);
                intent.putExtra("NO_44", A44);
                intent.putExtra("NO_45", A45);
                intent.putExtra("NO_46", A46);
                intent.putExtra("NO_47", A47);
                startActivity(intent);
            }
        });
    }
}
