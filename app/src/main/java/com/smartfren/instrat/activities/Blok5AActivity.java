package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.smartfren.instrat.R;

public class Blok5AActivity extends BaseStepsActivity {

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

    private TextView _lblQ53;
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
        super.initActivity(R.layout.activity_blok5a);
        extras = getIntent().getExtras();

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

        _lblQ53 = (TextView) findViewById(R.id.lblQ53);

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

        _lblQ53.setVisibility(View.GONE);
        _cbQ53A1.setVisibility(View.GONE);
        _cbQ53A2.setVisibility(View.GONE);
        _cbQ53A3.setVisibility(View.GONE);
        _cbQ53A4.setVisibility(View.GONE);
        _cbQ53A5.setVisibility(View.GONE);
        _cbQ53A6.setVisibility(View.GONE);
        _cbQ53A7.setVisibility(View.GONE);
        _cbQ53A8.setVisibility(View.GONE);
        _cbQ53A9.setVisibility(View.GONE);
        _cbQ53A10.setVisibility(View.GONE);

        _spQ48A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                    )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ49A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ50A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ51A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ52A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ52BA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ52CA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ52DA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52EA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        _spQ52EA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Tidak ada stok / tidak jual sama sekali"))
                {
                    if(
                            _spQ48A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ49A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ50A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ51A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52A.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52BA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52CA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali") &&
                                    _spQ52DA.getSelectedItem().toString().equals("Tidak ada stok / tidak jual sama sekali")
                            )
                    {
                        _lblQ53.setVisibility(View.VISIBLE);
                        _cbQ53A1.setVisibility(View.VISIBLE);
                        _cbQ53A2.setVisibility(View.VISIBLE);
                        _cbQ53A3.setVisibility(View.VISIBLE);
                        _cbQ53A4.setVisibility(View.VISIBLE);
                        _cbQ53A5.setVisibility(View.VISIBLE);
                        _cbQ53A6.setVisibility(View.VISIBLE);
                        _cbQ53A7.setVisibility(View.VISIBLE);
                        _cbQ53A8.setVisibility(View.VISIBLE);
                        _cbQ53A9.setVisibility(View.VISIBLE);
                        _cbQ53A10.setVisibility(View.VISIBLE);
                    }
                }
                else
                {
                    _lblQ53.setVisibility(View.GONE);
                    _cbQ53A1.setVisibility(View.GONE);
                    _cbQ53A2.setVisibility(View.GONE);
                    _cbQ53A3.setVisibility(View.GONE);
                    _cbQ53A4.setVisibility(View.GONE);
                    _cbQ53A5.setVisibility(View.GONE);
                    _cbQ53A6.setVisibility(View.GONE);
                    _cbQ53A7.setVisibility(View.GONE);
                    _cbQ53A8.setVisibility(View.GONE);
                    _cbQ53A9.setVisibility(View.GONE);
                    _cbQ53A10.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

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
                    _txtQ53A.setText("");
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
                    _txtQ56A.setText("");
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
                    _txtQ53A.setText("");
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
                    _txtQ56A.setText("");
                }
            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
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
                intent.putExtra("NO_38", extras.getString("NO_38"));
                intent.putExtra("NO_39", extras.getString("NO_39"));
                intent.putExtra("NO_40", extras.getString("NO_40"));
                intent.putExtra("NO_41", extras.getString("NO_41"));
                intent.putExtra("NO_42", extras.getString("NO_42"));
                intent.putExtra("NO_43", extras.getString("NO_43"));
                intent.putExtra("NO_44", extras.getString("NO_44"));
                intent.putExtra("NO_45", extras.getString("NO_45"));
                intent.putExtra("NO_46", extras.getString("NO_46"));
                intent.putExtra("NO_47", extras.getString("NO_47"));
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
                startActivity(intent);
            }
        });

    }
}
