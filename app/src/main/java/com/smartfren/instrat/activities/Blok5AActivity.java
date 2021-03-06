package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.Helper;

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
    private CheckBox _cbQ56AEvercoss;
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

    private TextView _errorQ48A;
    private TextView _errorQ49A;
    private TextView _errorQ50A;
    private TextView _errorQ51A;
    private TextView _errorQ52A;
    private TextView _errorQ52BA;
    private TextView _errorQ52CA;
    private TextView _errorQ52DA;
    private TextView _errorQ52EA;
    private TextView _errorQ53A;
    private TextView _errorQ54A;
    private TextView _errorQ55A;
    private TextView _errorQ56A;

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

        Helper.Hide(_txtQ53A);
        Helper.Hide(_txtQ56A);

        _cbQ56ASmartfren = (CheckBox) findViewById(R.id.cbQ56ASmartfren);
        _cbQ56AAsus = (CheckBox) findViewById(R.id.cbQ56AAsus);
        _cbQ56ABlackberry = (CheckBox) findViewById(R.id.cbQ56ABlackberry);
        _cbQ56AEvercoss = (CheckBox) findViewById(R.id.cbQ56AEvercoss);
        _cbQ56ALenovo = (CheckBox) findViewById(R.id.cbQ56ALenovo);
        _cbQ56AMito = (CheckBox) findViewById(R.id.cbQ56AMito);
        _cbQ56ANokia = (CheckBox) findViewById(R.id.cbQ56ANokia);
        _cbQ56AOppo = (CheckBox) findViewById(R.id.cbQ56AOppo);
        _cbQ56ASamsung = (CheckBox) findViewById(R.id.cbQ56ASamsung);
        _cbQ56ASony = (CheckBox) findViewById(R.id.cbQ56ASony);
        _cbQ56ATidakAda = (CheckBox) findViewById(R.id.cbQ56ATidakAda);
        _cbQ56ALainnya = (CheckBox) findViewById(R.id.cbQ56ALainnya);

        _errorQ48A = (TextView) findViewById(R.id.errorQ48A);
        _errorQ49A = (TextView) findViewById(R.id.errorQ49A);
        _errorQ50A = (TextView) findViewById(R.id.errorQ50A);
        _errorQ51A = (TextView) findViewById(R.id.errorQ51A);
        _errorQ52A = (TextView) findViewById(R.id.errorQ52A);
        _errorQ52BA = (TextView) findViewById(R.id.errorQ52BA);
        _errorQ52CA = (TextView) findViewById(R.id.errorQ52CA);
        _errorQ52DA = (TextView) findViewById(R.id.errorQ52DA);
        _errorQ52EA = (TextView) findViewById(R.id.errorQ52EA);
        _errorQ53A = (TextView) findViewById(R.id.errorQ53A);
        _errorQ54A = (TextView) findViewById(R.id.errorQ54A);
        _errorQ55A = (TextView) findViewById(R.id.errorQ55A);
        _errorQ53A = (TextView) findViewById(R.id.errorQ53A);
        _errorQ56A = (TextView) findViewById(R.id.errorQ56A);

        Helper.Hide(_lblQ53);
        Helper.Hide(_cbQ53A1);
        Helper.Hide(_cbQ53A2);
        Helper.Hide(_cbQ53A3);
        Helper.Hide(_cbQ53A4);
        Helper.Hide(_cbQ53A5);
        Helper.Hide(_cbQ53A6);
        Helper.Hide(_cbQ53A7);
        Helper.Hide(_cbQ53A8);
        Helper.Hide(_cbQ53A9);
        Helper.Hide(_cbQ53A10);
        Helper.Hide(_errorQ53A);

        ArrayAdapter<CharSequence> adapterQBlok5 = ArrayAdapter.createFromResource(this, R.array.page_blok5_produkterlihat_list, R.layout.spinner_item);
        adapterQBlok5.setDropDownViewResource(R.layout.spinner_item);
        _spQ48A.setAdapter(adapterQBlok5);
        _spQ49A.setAdapter(adapterQBlok5);
        _spQ50A.setAdapter(adapterQBlok5);
        _spQ50A.setAdapter(adapterQBlok5);
        _spQ51A.setAdapter(adapterQBlok5);
        _spQ52A.setAdapter(adapterQBlok5);
        _spQ52BA.setAdapter(adapterQBlok5);
        _spQ52CA.setAdapter(adapterQBlok5);
        _spQ52DA.setAdapter(adapterQBlok5);
        _spQ52EA.setAdapter(adapterQBlok5);

        if(extras.getString("NO_48") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_48"));
            if(position > 0) {
                _spQ48A.setSelection(position);
            }
        }

        if(extras.getString("NO_49") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_49"));
            if(position > 0) {
                _spQ49A.setSelection(position);
            }
        }

        if(extras.getString("NO_50") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_50"));
            if(position > 0) {
                _spQ50A.setSelection(position);
            }
        }

        if(extras.getString("NO_51") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_51"));
            if(position > 0) {
                _spQ51A.setSelection(position);
            }
        }

        if(extras.getString("NO_52") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52"));
            if(position > 0) {
                _spQ52A.setSelection(position);
            }
        }

        if(extras.getString("NO_52B") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52B"));
            if(position > 0) {
                _spQ52BA.setSelection(position);
            }
        }

        if(extras.getString("NO_52C") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52C"));
            if(position > 0) {
                _spQ52CA.setSelection(position);
            }
        }

        if(extras.getString("NO_52D") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52D"));
            if(position > 0) {
                _spQ52DA.setSelection(position);
            }
        }

        if(extras.getString("NO_52E") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52E"));
            if(position > 0) {
                _spQ52EA.setSelection(position);
            }
        }

        if(extras.getString("NO_52E") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_52E"));
            if(position > 0) {
                _spQ52EA.setSelection(position);
            }
        }

        if(extras.getString("NO_53") != null)
        {
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a1_text)))
            {
                _cbQ53A1.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a2_text)))
            {
                _cbQ53A2.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a3_text)))
            {
                _cbQ53A3.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a4_text)))
            {
                _cbQ53A4.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a5_text)))
            {
                _cbQ53A5.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a6_text)))
            {
                _cbQ53A6.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a7_text)))
            {
                _cbQ53A7.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a8_text)))
            {
                _cbQ53A8.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a9_text)))
            {
                _cbQ53A9.setChecked(true);
            }
            if(extras.getString("NO_53").contains(getResources().getString(R.string.page_checkbox_blok5_q53_a10_text)))
            {
                _cbQ53A10.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_53").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a1_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a2_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a3_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a4_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a5_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a6_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a7_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a8_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok5_q53_a9_text))
                            )
                    {
                        _cbQ53A10.setChecked(true);
                        _txtQ53A.setText(lastAnswer);
                    }
                }
            }
        }

        ArrayAdapter<CharSequence> adapterQ54 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q54A_list, R.layout.spinner_item);
        adapterQ54.setDropDownViewResource(R.layout.spinner_item);
        _spQ54A.setAdapter(adapterQ54);

        if(extras.getString("NO_54") != null)
        {
            int position = SetSelectedSpinner(adapterQ54, extras.getString("NO_54"));
            if(position > 0) {
                _spQ54A.setSelection(position);
            }
        }

        ArrayAdapter<CharSequence> adapterQ55 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q55A_list, R.layout.spinner_item);
        adapterQ55.setDropDownViewResource(R.layout.spinner_item);
        _spQ55A.setAdapter(adapterQ55);

        if(extras.getString("NO_55") != null)
        {
            int position = SetSelectedSpinner(adapterQ55, extras.getString("NO_55"));
            if(position > 0) {
                _spQ55A.setSelection(position);
            }
        }

        if(extras.getString("NO_56") != null)
        {
            if(extras.getString("NO_56").contains("Smartfren"))
            {
                _cbQ56ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Asus"))
            {
                _cbQ56AAsus.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Blackberry"))
            {
                _cbQ56ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Evercoss"))
            {
                _cbQ56AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Lenovo"))
            {
                _cbQ56ALenovo.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Mito"))
            {
                _cbQ56AMito.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Nokia"))
            {
                _cbQ56ANokia.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Oppo"))
            {
                _cbQ56AOppo.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Samsung"))
            {
                _cbQ56ASamsung.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Sony"))
            {
                _cbQ56ASony.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Tidak Ada"))
            {
                _cbQ56ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_56").contains("Lainnya"))
            {
                _cbQ56ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_56").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony")
                            && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ56ALainnya.setChecked(true);
                        _txtQ56A.setText(lastAnswer);
                    }
                }
            }
        }


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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                        Helper.Show(_lblQ53);
                        Helper.Show(_cbQ53A1);
                        Helper.Show(_cbQ53A2);
                        Helper.Show(_cbQ53A3);
                        Helper.Show(_cbQ53A4);
                        Helper.Show(_cbQ53A5);
                        Helper.Show(_cbQ53A6);
                        Helper.Show(_cbQ53A7);
                        Helper.Show(_cbQ53A8);
                        Helper.Show(_cbQ53A9);
                        Helper.Show(_cbQ53A10);
                        Helper.Show(_errorQ53A);
                    }
                }
                else
                {
                    Helper.Hide(_lblQ53);
                    Helper.Hide(_cbQ53A1);
                    Helper.Hide(_cbQ53A2);
                    Helper.Hide(_cbQ53A3);
                    Helper.Hide(_cbQ53A4);
                    Helper.Hide(_cbQ53A5);
                    Helper.Hide(_cbQ53A6);
                    Helper.Hide(_cbQ53A7);
                    Helper.Hide(_cbQ53A8);
                    Helper.Hide(_cbQ53A9);
                    Helper.Hide(_cbQ53A10);
                    Helper.Hide(_errorQ53A);
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
                    Helper.Show(_txtQ53A);
                }
                else
                {
                    Helper.Hide(_txtQ53A);
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
                    Helper.Show(_txtQ56A);
                }
                else
                {
                    Helper.Hide(_txtQ56A);
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
                    _cbQ56AEvercoss.setChecked(false);
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
                Intent intent = new Intent(Blok5AActivity.this, Blok4Activity.class);
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
                startActivity(intent);
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
                A56 = GetCheckBoxValue(_cbQ56AEvercoss, A56);
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

                int validatedAnswer = 0;
                if(A48.equals("--Pilih Jawaban--") || A48 == null || A48.equals("") || A48.isEmpty())
                {
                    _errorQ48A.setError("error");
                    _errorQ48A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ48A.setError(null);
                    _errorQ48A.setText("");
                    validatedAnswer++;
                }

                if(A49.equals("--Pilih Jawaban--") || A49 == null || A49.equals("") || A49.isEmpty())
                {
                    _errorQ49A.setError("error");
                    _errorQ49A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ49A.setError(null);
                    _errorQ49A.setText("");
                    validatedAnswer++;
                }

                if(A50.equals("--Pilih Jawaban--") || A50 == null || A50.equals("") || A50.isEmpty())
                {
                    _errorQ50A.setError("error");
                    _errorQ50A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ50A.setError(null);
                    _errorQ50A.setText("");
                    validatedAnswer++;
                }

                if(A51.equals("--Pilih Jawaban--") || A51 == null || A51.equals("") || A51.isEmpty())
                {
                    _errorQ51A.setError("error");
                    _errorQ51A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ51A.setError(null);
                    _errorQ51A.setText("");
                    validatedAnswer++;
                }

                if(A52.equals("--Pilih Jawaban--") || A52 == null || A52.equals("") || A52.isEmpty())
                {
                    _errorQ52A.setError("error");
                    _errorQ52A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ52A.setError(null);
                    _errorQ52A.setText("");
                    validatedAnswer++;
                }

                if(A52B.equals("--Pilih Jawaban--") || A52B == null || A52B.equals("") || A52B.isEmpty())
                {
                    _errorQ52BA.setError("error");
                    _errorQ52BA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ52BA.setError(null);
                    _errorQ52BA.setText("");
                    validatedAnswer++;
                }

                if(A52C.equals("--Pilih Jawaban--") || A52C == null || A52C.equals("") || A52C.isEmpty())
                {
                    _errorQ52CA.setError("error");
                    _errorQ52CA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ52CA.setError(null);
                    _errorQ52CA.setText("");
                    validatedAnswer++;
                }

                if(A52D.equals("--Pilih Jawaban--") || A52D == null || A52D.equals("") || A52D.isEmpty())
                {
                    _errorQ52DA.setError("error");
                    _errorQ52DA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ52DA.setError(null);
                    _errorQ52DA.setText("");
                    validatedAnswer++;
                }

                if(A52E.equals("--Pilih Jawaban--") || A52E == null || A52E.equals("") || A52E.isEmpty())
                {
                    _errorQ52EA.setError("error");
                    _errorQ52EA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ52EA.setError(null);
                    _errorQ52EA.setText("");
                    validatedAnswer++;
                }

                if(A54.equals("--Pilih Jawaban--") || A54 == null || A54.equals("") || A54.isEmpty())
                {
                    _errorQ54A.setError("error");
                    _errorQ54A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ54A.setError(null);
                    _errorQ54A.setText("");
                    validatedAnswer++;
                }

                if(A55.equals("--Pilih Jawaban--") || A55 == null || A55.equals("") || A55.isEmpty())
                {
                    _errorQ55A.setError("error");
                    _errorQ55A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ55A.setError(null);
                    _errorQ55A.setText("");
                    validatedAnswer++;
                }

                if(_lblQ53.isShown() &&  (A53 == null || A53.equals("") || A53.isEmpty()))
                {
                    _errorQ53A.setError("error");
                    _errorQ53A.setText("pilih salah satu checkbox");
                }
                else if(_lblQ53.isShown() && _cbQ53A10.isChecked() && A53 != null && !A53.equals("") && !A53.isEmpty() && (_txtQ53A.getText() == null || _txtQ53A.getText().toString().equals("")) )
                {
                    _errorQ53A.setError("error");
                    _errorQ53A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_lblQ53.isShown() && _cbQ53A10.isChecked() && A53 != null && !A53.equals("") && !A53.isEmpty() && _txtQ53A.getText().toString().length() > 50)
                {
                    _errorQ53A.setError("error");
                    _errorQ53A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ53A.setError(null);
                    _errorQ53A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ56ATidakAda.isChecked() && (A56 == null || A56.equals("") || A56.isEmpty()))
                {
                    _errorQ56A.setError("error");
                    _errorQ56A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ56ALainnya.isChecked() && A56 != null && !A56.equals("") && !A56.isEmpty() && (_txtQ56A.getText() == null || _txtQ56A.getText().toString().equals("")) )
                {
                    _errorQ56A.setError("error");
                    _errorQ56A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ56ALainnya.isChecked() && A56 != null && !A56.equals("") && !A56.isEmpty() && _txtQ56A.getText().toString().length() > 50)
                {
                    _errorQ56A.setError("error");
                    _errorQ56A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ56A.setError(null);
                    _errorQ56A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 13)
                {
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
            }
        });

    }
}
