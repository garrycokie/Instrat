package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.Helper;

public class Blok7AActivity extends BaseStepsActivity {
    private Spinner _spQ104A;

    private CheckBox _cbQ103A1;
    private CheckBox _cbQ103A2;
    private CheckBox _cbQ103A3;
    private CheckBox _cbQ103A4;
    private CheckBox _cbQ103A5;

    private CheckBox _cbQ105A1;
    private CheckBox _cbQ105A2;
    private CheckBox _cbQ105A3;
    private CheckBox _cbQ105A4;
    private CheckBox _cbQ105A5;
    private CheckBox _cbQ105A6;
    private CheckBox _cbQ105A7;
    private CheckBox _cbQ105A8;
    private CheckBox _cbQ105A9;
    private CheckBox _cbQ105A10;
    private CheckBox _cbQ105A11;
    private CheckBox _cbQ105A12;
    private CheckBox _cbQ105A13;
    private CheckBox _cbQ105A14;
    private CheckBox _cbQ105A15;

    private EditText _txtQ105A;

    private TextView _errorQ103A;
    private TextView _errorQ104A;
    private TextView _errorQ105A;

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
        super.initActivity(R.layout.activity_blok7a);
        extras = getIntent().getExtras();

        _cbQ103A1 = (CheckBox) findViewById(R.id.cbQ103A1);
        _cbQ103A2 = (CheckBox) findViewById(R.id.cbQ103A2);
        _cbQ103A3 = (CheckBox) findViewById(R.id.cbQ103A3);
        _cbQ103A4 = (CheckBox) findViewById(R.id.cbQ103A4);
        _cbQ103A5 = (CheckBox) findViewById(R.id.cbQ103A5);

        _spQ104A = (Spinner) findViewById(R.id.spQ104A);

        _cbQ105A1 = (CheckBox) findViewById(R.id.cbQ105A1);
        _cbQ105A2 = (CheckBox) findViewById(R.id.cbQ105A2);
        _cbQ105A3 = (CheckBox) findViewById(R.id.cbQ105A3);
        _cbQ105A4 = (CheckBox) findViewById(R.id.cbQ105A4);
        _cbQ105A5 = (CheckBox) findViewById(R.id.cbQ105A5);
        _cbQ105A6 = (CheckBox) findViewById(R.id.cbQ105A6);
        _cbQ105A7 = (CheckBox) findViewById(R.id.cbQ105A7);
        _cbQ105A8 = (CheckBox) findViewById(R.id.cbQ105A8);
        _cbQ105A9 = (CheckBox) findViewById(R.id.cbQ105A9);
        _cbQ105A10 = (CheckBox) findViewById(R.id.cbQ105A10);
        _cbQ105A11 = (CheckBox) findViewById(R.id.cbQ105A11);
        _cbQ105A12 = (CheckBox) findViewById(R.id.cbQ105A12);
        _cbQ105A13 = (CheckBox) findViewById(R.id.cbQ105A13);
        _cbQ105A14 = (CheckBox) findViewById(R.id.cbQ105A14);
        _cbQ105A15 = (CheckBox) findViewById(R.id.cbQ105A15);

        _errorQ103A = (TextView) findViewById(R.id.errorQ103A);
        _errorQ104A = (TextView) findViewById(R.id.errorQ104A);
        _errorQ105A = (TextView) findViewById(R.id.errorQ105A);

        Helper.Show(_cbQ105A1);
        Helper.Show(_cbQ105A2);
        Helper.Show(_cbQ105A3);
        Helper.Show(_cbQ105A4);
        Helper.Show(_cbQ105A5);
        Helper.Show(_cbQ105A6);
        Helper.Show(_cbQ105A7);
        Helper.Show(_cbQ105A8);
        Helper.Show(_cbQ105A9);
        Helper.Show(_cbQ105A10);
        Helper.Show(_cbQ105A11);
        Helper.Show(_cbQ105A12);
        Helper.Show(_cbQ105A13);
        Helper.Show(_cbQ105A14);
        Helper.Show(_cbQ105A15);

        _txtQ105A = (EditText) findViewById(R.id.txtQ105A);

        if(extras.getString("NO_103") != null && !extras.getString("NO_103").isEmpty() && !extras.getString("NO_103").equals(""))
        {
            if(extras.getString("NO_103").contains(getResources().getString(R.string.page_checkbox_blok7_supplier_distributor_samsung_text)))
            {
                _cbQ103A1.setChecked(true);
            }
            if(extras.getString("NO_103").contains(getResources().getString(R.string.page_checkbox_blok7_supplier_wholesaler_text)))
            {
                _cbQ103A2.setChecked(true);
            }
            if(extras.getString("NO_103").contains(getResources().getString(R.string.page_checkbox_blok7_supplier_bandar_text)))
            {
                _cbQ103A3.setChecked(true);
            }
            if(extras.getString("NO_103").contains(getResources().getString(R.string.page_checkbox_blok7_supplier_toko_lain_text)))
            {
                _cbQ103A4.setChecked(true);
            }
            if(extras.getString("NO_103").contains(getResources().getString(R.string.page_checkbox_blok7_supplier_mall_lain_text)))
            {
                _cbQ103A5.setChecked(true);
            }
        }

        ArrayAdapter<CharSequence> adapterQ104 = ArrayAdapter.createFromResource(this, R.array.page_blok7_nextorder_list, R.layout.spinner_item);
        adapterQ104.setDropDownViewResource(R.layout.spinner_item);
        _spQ104A.setAdapter(adapterQ104);

        if(extras.getString("NO_104") != null && !extras.getString("NO_104").isEmpty() && !extras.getString("NO_104").equals(""))
        {
            int position = SetSelectedSpinner(adapterQ104, extras.getString("NO_104"));
            if(position > 0) {
                _spQ104A.setSelection(position);
            }
        }

        if(extras.getString("NO_105") != null && !extras.getString("NO_105").isEmpty() && !extras.getString("NO_105").equals(""))
        {
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_1_text)))
            {
                _cbQ105A1.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_2_text)))
            {
                _cbQ105A2.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_3_text)))
            {
                _cbQ105A3.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_4_text)))
            {
                _cbQ105A4.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_5_text)))
            {
                _cbQ105A5.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_6_text)))
            {
                _cbQ105A6.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_7_text)))
            {
                _cbQ105A7.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_8_text)))
            {
                _cbQ105A8.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_9_text)))
            {
                _cbQ105A9.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_10_text)))
            {
                _cbQ105A10.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_11_text)))
            {
                _cbQ105A11.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_12_text)))
            {
                _cbQ105A12.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_13_text)))
            {
                _cbQ105A13.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_14_text)))
            {
                _cbQ105A14.setChecked(true);
            }
            if(extras.getString("NO_105").contains(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_15_text)))
            {
                _cbQ105A15.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_105").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_1_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_2_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_3_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_4_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_5_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_6_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_7_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_8_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_9_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_10_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_11_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_12_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_13_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_14_text))
                            && !lastAnswer.equals(getResources().getString(R.string.page_checkbox_blok7_alasan_ragu_15_text))
                            )
                    {
                        _cbQ105A15.setChecked(true);
                        _txtQ105A.setText(lastAnswer);
                    }
                }
            }
        }


        _spQ104A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    Helper.Show(_cbQ105A1);
                    Helper.Show(_cbQ105A2);
                    Helper.Show(_cbQ105A3);
                    Helper.Show(_cbQ105A4);
                    Helper.Show(_cbQ105A5);
                    Helper.Show(_cbQ105A6);
                    Helper.Show(_cbQ105A7);
                    Helper.Hide(_cbQ105A8);
                    Helper.Hide(_cbQ105A9);
                    Helper.Hide(_cbQ105A10);
                    Helper.Hide(_cbQ105A11);
                    Helper.Hide(_cbQ105A12);
                    Helper.Hide(_cbQ105A13);
                    Helper.Hide(_cbQ105A14);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    Helper.Show(_cbQ105A1);
                    Helper.Show(_cbQ105A2);
                    Helper.Show(_cbQ105A3);
                    Helper.Show(_cbQ105A4);
                    Helper.Show(_cbQ105A5);
                    Helper.Show(_cbQ105A6);
                    Helper.Show(_cbQ105A7);
                    Helper.Show(_cbQ105A8);
                    Helper.Show(_cbQ105A9);
                    Helper.Show(_cbQ105A10);
                    Helper.Show(_cbQ105A11);
                    Helper.Show(_cbQ105A12);
                    Helper.Show(_cbQ105A13);
                    Helper.Show(_cbQ105A14);
                }
                else
                {
                    Helper.Hide(_cbQ105A1);
                    Helper.Hide(_cbQ105A2);
                    Helper.Hide(_cbQ105A3);
                    Helper.Hide(_cbQ105A4);
                    Helper.Hide(_cbQ105A5);
                    Helper.Hide(_cbQ105A6);
                    Helper.Hide(_cbQ105A7);
                    Helper.Show(_cbQ105A8);
                    Helper.Show(_cbQ105A9);
                    Helper.Show(_cbQ105A10);
                    Helper.Show(_cbQ105A11);
                    Helper.Show(_cbQ105A12);
                    Helper.Show(_cbQ105A13);
                    Helper.Show(_cbQ105A14);
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

                    Intent intent = new Intent(Blok7AActivity.this, Blok7Activity.class);
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
                    intent.putExtra("NO_48", extras.getString("NO_48"));
                    intent.putExtra("NO_49", extras.getString("NO_49"));
                    intent.putExtra("NO_50", extras.getString("NO_50"));
                    intent.putExtra("NO_51", extras.getString("NO_51"));
                    intent.putExtra("NO_52", extras.getString("NO_52"));
                    intent.putExtra("NO_52B", extras.getString("NO_52B"));
                    intent.putExtra("NO_52C", extras.getString("NO_52C"));
                    intent.putExtra("NO_52D", extras.getString("NO_52D"));
                    intent.putExtra("NO_52E", extras.getString("NO_52E"));
                    intent.putExtra("NO_53", extras.getString("NO_53"));
                    intent.putExtra("NO_54", extras.getString("NO_54"));
                    intent.putExtra("NO_55", extras.getString("NO_55"));
                    intent.putExtra("NO_56", extras.getString("NO_56"));
                    intent.putExtra("NO_57", extras.getString("NO_57"));
                    intent.putExtra("NO_58", extras.getString("NO_58"));
                    intent.putExtra("NO_59", extras.getString("NO_59"));
                    intent.putExtra("NO_60", extras.getString("NO_60"));
                    intent.putExtra("NO_60B", extras.getString("NO_60B"));
                    intent.putExtra("NO_60C", extras.getString("NO_60C"));
                    intent.putExtra("NO_61", extras.getString("NO_61"));
                    intent.putExtra("NO_61B", extras.getString("NO_61B"));
                    intent.putExtra("NO_61C", extras.getString("NO_61C"));
                    intent.putExtra("NO_62", extras.getString("NO_62"));
                    intent.putExtra("NO_63", extras.getString("NO_63"));
                    intent.putExtra("NO_64", extras.getString("NO_64"));
                    intent.putExtra("NO_65", extras.getString("NO_65"));
                    intent.putExtra("NO_66", extras.getString("NO_66"));
                    intent.putExtra("NO_67", extras.getString("NO_67"));
                    intent.putExtra("NO_68", extras.getString("NO_68"));
                    intent.putExtra("NO_69", extras.getString("NO_69"));
                    intent.putExtra("NO_70", extras.getString("NO_70"));
                    intent.putExtra("NO_71", extras.getString("NO_71"));
                    intent.putExtra("NO_72", extras.getString("NO_72"));
                    intent.putExtra("NO_73", extras.getString("NO_73"));
                    intent.putExtra("NO_74", extras.getString("NO_74"));
                    intent.putExtra("NO_75", extras.getString("NO_75"));
                    intent.putExtra("NO_76", extras.getString("NO_76"));
                    intent.putExtra("NO_77", extras.getString("NO_77"));
                    intent.putExtra("NO_78", extras.getString("NO_78"));
                    intent.putExtra("NO_79", extras.getString("NO_79"));
                    intent.putExtra("NO_80", extras.getString("NO_80"));
                    intent.putExtra("NO_81", extras.getString("NO_81"));
                    intent.putExtra("NO_82", extras.getString("NO_82"));
                    intent.putExtra("NO_83", extras.getString("NO_83"));
                    intent.putExtra("NO_84", extras.getString("NO_84"));
                    intent.putExtra("NO_85", extras.getString("NO_85"));
                    intent.putExtra("NO_86", extras.getString("NO_86"));
                    intent.putExtra("NO_87", extras.getString("NO_87"));
                    intent.putExtra("NO_88", extras.getString("NO_88"));
                    intent.putExtra("NO_89", extras.getString("NO_89"));
                    intent.putExtra("NO_90", extras.getString("NO_90"));
                    intent.putExtra("NO_91", extras.getString("NO_91"));
                    intent.putExtra("NO_92", extras.getString("NO_92"));
                    intent.putExtra("NO_93", extras.getString("NO_93"));
                    intent.putExtra("NO_94", extras.getString("NO_94"));
                    intent.putExtra("NO_95", extras.getString("NO_95"));
                    intent.putExtra("NO_96", extras.getString("NO_96"));
                    intent.putExtra("NO_97", extras.getString("NO_97"));
                    intent.putExtra("NO_98", extras.getString("NO_98"));
                    intent.putExtra("NO_99", extras.getString("NO_99"));
                    intent.putExtra("NO_100", extras.getString("NO_100"));
                    intent.putExtra("NO_101", extras.getString("NO_101"));
                    intent.putExtra("NO_102", extras.getString("NO_102"));
                    startActivity(intent);
            }

            @Override
            public void onContinueClicked() {
                String A103 = "";
                A103 = GetCheckBoxValue(_cbQ103A1, A103);
                A103 = GetCheckBoxValue(_cbQ103A2, A103);
                A103 = GetCheckBoxValue(_cbQ103A3, A103);
                A103 = GetCheckBoxValue(_cbQ103A4, A103);
                A103 = GetCheckBoxValue(_cbQ103A5, A103);

                String A104 = _spQ104A.getSelectedItem().toString();

                String A105 = "";
                if(_spQ104A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A105 = GetCheckBoxValue(_cbQ105A1, A105);
                    A105 = GetCheckBoxValue(_cbQ105A2, A105);
                    A105 = GetCheckBoxValue(_cbQ105A3, A105);
                    A105 = GetCheckBoxValue(_cbQ105A4, A105);
                    A105 = GetCheckBoxValue(_cbQ105A5, A105);
                    A105 = GetCheckBoxValue(_cbQ105A6, A105);
                    A105 = GetCheckBoxValue(_cbQ105A7, A105);
                }
                else if(_spQ104A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A105 = GetCheckBoxValue(_cbQ105A1, A105);
                    A105 = GetCheckBoxValue(_cbQ105A2, A105);
                    A105 = GetCheckBoxValue(_cbQ105A3, A105);
                    A105 = GetCheckBoxValue(_cbQ105A4, A105);
                    A105 = GetCheckBoxValue(_cbQ105A5, A105);
                    A105 = GetCheckBoxValue(_cbQ105A6, A105);
                    A105 = GetCheckBoxValue(_cbQ105A7, A105);
                    A105 = GetCheckBoxValue(_cbQ105A8, A105);
                    A105 = GetCheckBoxValue(_cbQ105A9, A105);
                    A105 = GetCheckBoxValue(_cbQ105A10, A105);
                    A105 = GetCheckBoxValue(_cbQ105A11, A105);
                    A105 = GetCheckBoxValue(_cbQ105A12, A105);
                    A105 = GetCheckBoxValue(_cbQ105A13, A105);
                    A105 = GetCheckBoxValue(_cbQ105A14, A105);
                }
                else
                {
                    A105 = GetCheckBoxValue(_cbQ105A8, A105);
                    A105 = GetCheckBoxValue(_cbQ105A9, A105);
                    A105 = GetCheckBoxValue(_cbQ105A10, A105);
                    A105 = GetCheckBoxValue(_cbQ105A11, A105);
                    A105 = GetCheckBoxValue(_cbQ105A12, A105);
                    A105 = GetCheckBoxValue(_cbQ105A13, A105);
                    A105 = GetCheckBoxValue(_cbQ105A14, A105);
                }

                if(_cbQ105A15.isChecked())
                {
                    A105 = A105 + ";" + _txtQ105A.getText().toString();
                }

                int validatedAnswer = 0;

                if(A104.equals("--Pilih Jawaban--") || A104 == null || A104.equals("") || A104.isEmpty())
                {
                    _errorQ104A.setError("error");
                    _errorQ104A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ104A.setError(null);
                    _errorQ104A.setText("");
                    validatedAnswer++;
                }
                if(A103.equals("") || A103.isEmpty())
                {
                    _errorQ103A.setError("error");
                    _errorQ103A.setText("pilih salah satu checkbox");
                }
                else
                {
                    _errorQ103A.setError(null);
                    _errorQ103A.setText("");
                    validatedAnswer++;
                }

                if(A105 == null || A105.equals("") || A105.isEmpty())
                {
                    _errorQ105A.setError("error");
                    _errorQ105A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ105A15.isChecked() && A105 != null && !A105.equals("") && !A105.isEmpty() && (_txtQ105A.getText() == null || _txtQ105A.getText().toString().equals("")) )
                {
                    _errorQ105A.setError("error");
                    _errorQ105A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ105A15.isChecked() && A105 != null && !A105.equals("") && !A105.isEmpty() && _txtQ105A.getText().toString().length() > 50)
                {
                    _errorQ105A.setError("error");
                    _errorQ105A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ105A.setError(null);
                    _errorQ105A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 3)
                {
                    String product = extras.getString("NO_102").toLowerCase();

                        if(product.contains("smartfren"))
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok7BActivity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }
                        else if(product.contains("advan"))
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok7CActivity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }
                        else if(product.contains("lenovo"))
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok7DActivity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }
                        else if(product.contains("oppo"))
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok7EActivity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }
                        else if(product.contains("asus"))
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok7FActivity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }
                        else
                        {
                            Intent intent = new Intent(Blok7AActivity.this, Blok8Activity.class);
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
                            intent.putExtra("NO_48", extras.getString("NO_48"));
                            intent.putExtra("NO_49", extras.getString("NO_49"));
                            intent.putExtra("NO_50", extras.getString("NO_50"));
                            intent.putExtra("NO_51", extras.getString("NO_51"));
                            intent.putExtra("NO_52", extras.getString("NO_52"));
                            intent.putExtra("NO_52B", extras.getString("NO_52B"));
                            intent.putExtra("NO_52C", extras.getString("NO_52C"));
                            intent.putExtra("NO_52D", extras.getString("NO_52D"));
                            intent.putExtra("NO_52E", extras.getString("NO_52E"));
                            intent.putExtra("NO_53", extras.getString("NO_53"));
                            intent.putExtra("NO_54", extras.getString("NO_54"));
                            intent.putExtra("NO_55", extras.getString("NO_55"));
                            intent.putExtra("NO_56", extras.getString("NO_56"));
                            intent.putExtra("NO_57", extras.getString("NO_57"));
                            intent.putExtra("NO_58", extras.getString("NO_58"));
                            intent.putExtra("NO_59", extras.getString("NO_59"));
                            intent.putExtra("NO_60", extras.getString("NO_60"));
                            intent.putExtra("NO_60B", extras.getString("NO_60B"));
                            intent.putExtra("NO_60C", extras.getString("NO_60C"));
                            intent.putExtra("NO_61", extras.getString("NO_61"));
                            intent.putExtra("NO_61B", extras.getString("NO_61B"));
                            intent.putExtra("NO_61C", extras.getString("NO_61C"));
                            intent.putExtra("NO_62", extras.getString("NO_62"));
                            intent.putExtra("NO_63", extras.getString("NO_63"));
                            intent.putExtra("NO_64", extras.getString("NO_64"));
                            intent.putExtra("NO_65", extras.getString("NO_65"));
                            intent.putExtra("NO_66", extras.getString("NO_66"));
                            intent.putExtra("NO_67", extras.getString("NO_67"));
                            intent.putExtra("NO_68", extras.getString("NO_68"));
                            intent.putExtra("NO_69", extras.getString("NO_69"));
                            intent.putExtra("NO_70", extras.getString("NO_70"));
                            intent.putExtra("NO_71", extras.getString("NO_71"));
                            intent.putExtra("NO_72", extras.getString("NO_72"));
                            intent.putExtra("NO_73", extras.getString("NO_73"));
                            intent.putExtra("NO_74", extras.getString("NO_74"));
                            intent.putExtra("NO_75", extras.getString("NO_75"));
                            intent.putExtra("NO_76", extras.getString("NO_76"));
                            intent.putExtra("NO_77", extras.getString("NO_77"));
                            intent.putExtra("NO_78", extras.getString("NO_78"));
                            intent.putExtra("NO_79", extras.getString("NO_79"));
                            intent.putExtra("NO_80", extras.getString("NO_80"));
                            intent.putExtra("NO_81", extras.getString("NO_81"));
                            intent.putExtra("NO_82", extras.getString("NO_82"));
                            intent.putExtra("NO_83", extras.getString("NO_83"));
                            intent.putExtra("NO_84", extras.getString("NO_84"));
                            intent.putExtra("NO_85", extras.getString("NO_85"));
                            intent.putExtra("NO_86", extras.getString("NO_86"));
                            intent.putExtra("NO_87", extras.getString("NO_87"));
                            intent.putExtra("NO_88", extras.getString("NO_88"));
                            intent.putExtra("NO_89", extras.getString("NO_89"));
                            intent.putExtra("NO_90", extras.getString("NO_90"));
                            intent.putExtra("NO_91", extras.getString("NO_91"));
                            intent.putExtra("NO_92", extras.getString("NO_92"));
                            intent.putExtra("NO_93", extras.getString("NO_93"));
                            intent.putExtra("NO_94", extras.getString("NO_94"));
                            intent.putExtra("NO_95", extras.getString("NO_95"));
                            intent.putExtra("NO_96", extras.getString("NO_96"));
                            intent.putExtra("NO_97", extras.getString("NO_97"));
                            intent.putExtra("NO_98", extras.getString("NO_98"));
                            intent.putExtra("NO_99", extras.getString("NO_99"));
                            intent.putExtra("NO_100", extras.getString("NO_100"));
                            intent.putExtra("NO_101", extras.getString("NO_101"));
                            intent.putExtra("NO_102", extras.getString("NO_102"));
                            intent.putExtra("NO_103", A103);
                            intent.putExtra("NO_104", A104);
                            intent.putExtra("NO_105", A105);
                            intent.putExtra("NO_106", extras.getString("NO_106"));
                            intent.putExtra("NO_107", extras.getString("NO_107"));
                            intent.putExtra("NO_108", extras.getString("NO_108"));
                            intent.putExtra("NO_109", extras.getString("NO_109"));
                            intent.putExtra("NO_110", extras.getString("NO_110"));
                            intent.putExtra("NO_111", extras.getString("NO_111"));
                            intent.putExtra("NO_112", extras.getString("NO_112"));
                            intent.putExtra("NO_113", extras.getString("NO_113"));
                            intent.putExtra("NO_114", extras.getString("NO_114"));
                            intent.putExtra("NO_115", extras.getString("NO_115"));
                            intent.putExtra("NO_116", extras.getString("NO_116"));
                            intent.putExtra("NO_117", extras.getString("NO_117"));
                            intent.putExtra("NO_118", extras.getString("NO_118"));
                            intent.putExtra("NO_119", extras.getString("NO_119"));
                            intent.putExtra("NO_120", extras.getString("NO_120"));
                            startActivity(intent);
                        }

                }



            }
        });
    }
}
