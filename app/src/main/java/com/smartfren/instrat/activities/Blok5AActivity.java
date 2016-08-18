package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.smartfren.instrat.R;

public class Blok5AActivity extends AppCompatActivity {

    private Spinner _spQ48A;
    private Spinner _spQ49A;
    private Spinner _spQ50A;
    private Spinner _spQ51A;
    private Spinner _spQ52A;
    private Spinner _spQ52BA;
    private Spinner _spQ52CA;
    private Spinner _spQ52DA;
    private Spinner _spQ52EA;
    private Spinner _spQ54A;
    private Spinner _spQ55A;

    private CheckBox _cbQ56ASmartfren;
    private CheckBox _cbQ56AAsus;
    private CheckBox _cbQ56ABlackberry;
    private CheckBox _cbQ56AEcercoss;
    private CheckBox _cbQ56ALenovo;
    private CheckBox _cbQ56AMito;
    private CheckBox _cbQ56ANokia;
    private CheckBox _cbQ56AOppo;
    private CheckBox _cbQ56ASamsung;
    private CheckBox _cbQ56ASony;
    private CheckBox _cbQ56ATidakAda;
    private CheckBox _cbQ56ALainnya;

    private CheckBox _cbQ53A1;
    private CheckBox _cbQ53A2;
    private CheckBox _cbQ53A3;
    private CheckBox _cbQ53A4;
    private CheckBox _cbQ53A5;
    private CheckBox _cbQ53A6;
    private CheckBox _cbQ53A7;
    private CheckBox _cbQ53A8;
    private CheckBox _cbQ53A9;
    private CheckBox _cbQ53A10;

    private EditText _txtQ53A;
    private EditText _txtQ56A;

    private Button _btnNext;

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
        setContentView(R.layout.activity_blok5a);

        _spQ48A = (Spinner) findViewById(R.id.spQ48A);
        _spQ49A = (Spinner) findViewById(R.id.spQ49A);
        _spQ50A = (Spinner) findViewById(R.id.spQ50A);
        _spQ51A = (Spinner) findViewById(R.id.spQ51A);
        _spQ52A = (Spinner) findViewById(R.id.spQ52A);
        _spQ52BA = (Spinner) findViewById(R.id.spQ52BA);
        _spQ52CA = (Spinner) findViewById(R.id.spQ52CA);
        _spQ52DA = (Spinner) findViewById(R.id.spQ52DA);
        _spQ52EA = (Spinner) findViewById(R.id.spQ52EA);
        _spQ54A = (Spinner) findViewById(R.id.spQ54A);
        _spQ55A = (Spinner) findViewById(R.id.spQ55A);

        _cbQ53A1 = (CheckBox) findViewById(R.id.cbQ53A1);
        _cbQ53A2 = (CheckBox) findViewById(R.id.cbQ53A2);
        _cbQ53A3 = (CheckBox) findViewById(R.id.cbQ53A3);
        _cbQ53A4 = (CheckBox) findViewById(R.id.cbQ53A4);
        _cbQ53A5 = (CheckBox) findViewById(R.id.cbQ53A5);
        _cbQ53A6 = (CheckBox) findViewById(R.id.cbQ53A6);
        _cbQ53A7 = (CheckBox) findViewById(R.id.cbQ53A7);
        _cbQ53A8 = (CheckBox) findViewById(R.id.cbQ53A8);
        _cbQ53A9 = (CheckBox) findViewById(R.id.cbQ53A9);
        _cbQ53A10 = (CheckBox) findViewById(R.id.cbQ53A10);

        _txtQ53A = (EditText) findViewById(R.id.txtQ53A);
        _txtQ56A = (EditText) findViewById(R.id.txtQ56A);

        _txtQ53A.setVisibility(View.GONE);
        _txtQ56A.setVisibility(View.GONE);

        _cbQ56ASmartfren = (CheckBox) findViewById(R.id.cbQ56ASmartfren);
        _cbQ56AAsus = (CheckBox) findViewById(R.id.cbQ56AAsus);
        _cbQ56ABlackberry = (CheckBox) findViewById(R.id.cbQ56ABlackberry);
        _cbQ56AEcercoss = (CheckBox) findViewById(R.id.cbQ56AEvercoss);
        _cbQ56ALenovo = (CheckBox) findViewById(R.id.cbQ56ALenovo);
        _cbQ56AMito = (CheckBox) findViewById(R.id.cbQ56AMito);
        _cbQ56ANokia = (CheckBox) findViewById(R.id.cbQ56ANokia);
        _cbQ56AOppo = (CheckBox) findViewById(R.id.cbQ56AOppo);
        _cbQ56ASamsung = (CheckBox) findViewById(R.id.cbQ56ASamsung);
        _cbQ56ASony = (CheckBox) findViewById(R.id.cbQ56ASony);
        _cbQ56ATidakAda = (CheckBox) findViewById(R.id.cbQ56ATidakAda);
        _cbQ56ALainnya = (CheckBox) findViewById(R.id.cbQ56ALainnya);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _cbQ53A10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _txtQ53A.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtQ53A.setVisibility(View.GONE);
                }

            }
        });

        _cbQ56ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _txtQ56A.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtQ56A.setVisibility(View.GONE);
                }

            }
        });


        _cbQ53A9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ53A1.setChecked(false);
                    _cbQ53A2.setChecked(false);
                    _cbQ53A3.setChecked(false);
                    _cbQ53A4.setChecked(false);
                    _cbQ53A5.setChecked(false);
                    _cbQ53A6.setChecked(false);
                    _cbQ53A7.setChecked(false);
                    _cbQ53A8.setChecked(false);
                    _cbQ53A10.setChecked(false);
                }
            }
        });

        _cbQ56ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ56ASmartfren.setChecked(false);
                    _cbQ56AAsus.setChecked(false);
                    _cbQ56ABlackberry.setChecked(false);
                    _cbQ56AEcercoss.setChecked(false);
                    _cbQ56ALenovo.setChecked(false);
                    _cbQ56AMito.setChecked(false);
                    _cbQ56ANokia.setChecked(false);
                    _cbQ56AOppo.setChecked(false);
                    _cbQ56ASamsung.setChecked(false);
                    _cbQ56ASony.setChecked(false);
                    _cbQ56ALainnya.setChecked(false);
                }
            }
        });


        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A48 = _spQ48A.getSelectedItem().toString();
                String A49 = _spQ49A.getSelectedItem().toString();
                String A50 = _spQ50A.getSelectedItem().toString();
                String A51 = _spQ51A.getSelectedItem().toString();
                String A52 = _spQ52A.getSelectedItem().toString();
                String A52B = _spQ52BA.getSelectedItem().toString();
                String A52C = _spQ52CA.getSelectedItem().toString();
                String A52D = _spQ52DA.getSelectedItem().toString();
                String A52E = _spQ52EA.getSelectedItem().toString();

                String A53 = "";
                A53 = GetCheckBoxValue(_cbQ53A1, A53);
                A53 = GetCheckBoxValue(_cbQ53A2, A53);
                A53 = GetCheckBoxValue(_cbQ53A3, A53);
                A53 = GetCheckBoxValue(_cbQ53A4, A53);
                A53 = GetCheckBoxValue(_cbQ53A5, A53);
                A53 = GetCheckBoxValue(_cbQ53A6, A53);
                A53 = GetCheckBoxValue(_cbQ53A7, A53);
                A53 = GetCheckBoxValue(_cbQ53A8, A53);

                if(_cbQ53A10.isChecked())
                {
                    A53 = A53 + ";" + _txtQ53A.getText().toString();
                }
                if(_cbQ53A9.isChecked())
                {
                    A53 = "";
                }

                String A54 = _spQ54A.getSelectedItem().toString();
                String A55 = _spQ55A.getSelectedItem().toString();

                String A56 = "";
                A56 = GetCheckBoxValue(_cbQ56ASmartfren, A56);
                A56 = GetCheckBoxValue(_cbQ56AAsus, A56);
                A56 = GetCheckBoxValue(_cbQ56ABlackberry, A56);
                A56 = GetCheckBoxValue(_cbQ56AEcercoss, A56);
                A56 = GetCheckBoxValue(_cbQ56ALenovo, A56);
                A56 = GetCheckBoxValue(_cbQ56AMito, A56);
                A56 = GetCheckBoxValue(_cbQ56ANokia, A56);
                A56 = GetCheckBoxValue(_cbQ56AOppo, A56);
                A56 = GetCheckBoxValue(_cbQ56ASamsung, A56);
                A56 = GetCheckBoxValue(_cbQ56ASony, A56);

                if(_cbQ56ALainnya.isChecked())
                {
                    A56 = A56 + ";" + _txtQ56A.getText().toString();
                }
                if(_cbQ56ATidakAda.isChecked())
                {
                    A56 = "";
                }

                Intent intent = new Intent(Blok5AActivity.this, Blok5BActivity.class);
                intent.putExtra("NO_48", A48);
                intent.putExtra("NO_49", A49);
                intent.putExtra("NO_50", A50);
                intent.putExtra("NO_51", A51);
                intent.putExtra("NO_52", A52);
                intent.putExtra("NO_52B", A52B);
                intent.putExtra("NO_52C", A52C);
                intent.putExtra("NO_52D", A52D);
                intent.putExtra("NO_52E", A52E);
                intent.putExtra("NO_53", A53);
                intent.putExtra("NO_54", A54);
                intent.putExtra("NO_55", A55);
                intent.putExtra("NO_56", A56);
                intent.putExtra("NO_52", A52);
                startActivity(intent);

            }
        });

    }
}
