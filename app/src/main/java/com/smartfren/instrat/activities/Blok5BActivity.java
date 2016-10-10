package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;

public class Blok5BActivity extends BaseStepsActivity {
    private Spinner _spQ57A;
    private Spinner _spQ58A;
    private Spinner _spQ59A;
    private Spinner _spQ60A;
    private Spinner _spQ60BA;
    private Spinner _spQ60CA;
    private Spinner _spQ61A;
    private Bundle extras;

    private TextView _errorQ57A;
    private TextView _errorQ58A;
    private TextView _errorQ59A;
    private TextView _errorQ60A;
    private TextView _errorQ60BA;
    private TextView _errorQ60CA;
    private TextView _errorQ61A;

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
        super.initActivity(R.layout.activity_blok5b);
        extras = getIntent().getExtras();

        _errorQ57A = (TextView) findViewById(R.id.errorQ57A);
        _errorQ58A = (TextView) findViewById(R.id.errorQ58A);
        _errorQ59A = (TextView) findViewById(R.id.errorQ59A);
        _errorQ60A = (TextView) findViewById(R.id.errorQ60A);
        _errorQ60BA = (TextView) findViewById(R.id.errorQ60BA);
        _errorQ60CA = (TextView) findViewById(R.id.errorQ60CA);
        _errorQ61A = (TextView) findViewById(R.id.errorQ61A);


        _spQ57A = (Spinner) findViewById(R.id.spQ57A);
        _spQ58A = (Spinner) findViewById(R.id.spQ58A);
        _spQ59A = (Spinner) findViewById(R.id.spQ59A);
        _spQ60A = (Spinner) findViewById(R.id.spQ60A);
        _spQ60BA = (Spinner) findViewById(R.id.spQ60BA);
        _spQ60CA = (Spinner) findViewById(R.id.spQ60CA);
        _spQ61A = (Spinner) findViewById(R.id.spQ61A);

        ArrayAdapter<CharSequence> adapterQ57 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q57A_list, R.layout.spinner_item);
        adapterQ57.setDropDownViewResource(R.layout.spinner_item);
        _spQ57A.setAdapter(adapterQ57);

        if(extras.getString("NO_57") != null)
        {
            int position = SetSelectedSpinner(adapterQ57, extras.getString("NO_57"));
            if(position > 0) {
                _spQ57A.setSelection(position);
            }
        }

        ArrayAdapter<CharSequence> adapterQBlok5 = ArrayAdapter.createFromResource(this, R.array.page_blok5_produkterlihat_list, R.layout.spinner_item);
        adapterQBlok5.setDropDownViewResource(R.layout.spinner_item);
        _spQ58A.setAdapter(adapterQBlok5);
        _spQ59A.setAdapter(adapterQBlok5);
        _spQ60A.setAdapter(adapterQBlok5);
        _spQ60BA.setAdapter(adapterQBlok5);
        _spQ60CA.setAdapter(adapterQBlok5);

        if(extras.getString("NO_58") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_58"));
            if(position > 0) {
                _spQ58A.setSelection(position);
            }
        }

        if(extras.getString("NO_59") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_59"));
            if(position > 0) {
                _spQ59A.setSelection(position);
            }
        }

        if(extras.getString("NO_60") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60"));
            if(position > 0) {
                _spQ60A.setSelection(position);
            }
        }

        if(extras.getString("NO_60B") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60B"));
            if(position > 0) {
                _spQ60BA.setSelection(position);
            }
        }

        if(extras.getString("NO_60C") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60C"));
            if(position > 0) {
                _spQ60CA.setSelection(position);
            }
        }

        ArrayAdapter<CharSequence> adapterQ61 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q61A_list, R.layout.spinner_item);
        adapterQ61.setDropDownViewResource(R.layout.spinner_item);
        _spQ61A.setAdapter(adapterQ61);

        if(extras.getString("NO_61") != null)
        {
            int position = SetSelectedSpinner(adapterQ61, extras.getString("NO_61"));
            if(position > 0) {
                _spQ61A.setSelection(position);
            }
        }

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {

                String surveyType = extras.getString("TipeSurvey");

                if(surveyType.equals("Full Audit Modem"))
                {
                    Intent intent = new Intent(Blok5BActivity.this, Blok4Activity.class);
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
                else
                {
                    Intent intent = new Intent(Blok5BActivity.this, Blok5AActivity.class);
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
                    startActivity(intent);
                }

            }

            @Override
            public void onContinueClicked() {
                String A57 = _spQ57A.getSelectedItem().toString();
                String A58 = _spQ58A.getSelectedItem().toString();
                String A59 = _spQ59A.getSelectedItem().toString();
                String A60 = _spQ60A.getSelectedItem().toString();
                String A60B = _spQ60BA.getSelectedItem().toString();
                String A60C = _spQ60CA.getSelectedItem().toString();
                String A61 = _spQ61A.getSelectedItem().toString();

                int validatedAnswer = 0;

                if(A57.equals("--Pilih Jawaban--") || A57 == null || A57.equals("") || A57.isEmpty())
                {
                    _errorQ57A.setError("error");
                    _errorQ57A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ57A.setError(null);
                    _errorQ57A.setText("");
                    validatedAnswer++;
                }

                if(A58.equals("--Pilih Jawaban--") || A58 == null || A58.equals("") || A58.isEmpty())
                {
                    _errorQ58A.setError("error");
                    _errorQ58A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ58A.setError(null);
                    _errorQ58A.setText("");
                    validatedAnswer++;
                }

                if(A59.equals("--Pilih Jawaban--") || A59 == null || A59.equals("") || A59.isEmpty())
                {
                    _errorQ59A.setError("error");
                    _errorQ59A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ59A.setError(null);
                    _errorQ59A.setText("");
                    validatedAnswer++;
                }

                if(A60.equals("--Pilih Jawaban--") || A60 == null || A60.equals("") || A60.isEmpty())
                {
                    _errorQ60A.setError("error");
                    _errorQ60A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ60A.setError(null);
                    _errorQ60A.setText("");
                    validatedAnswer++;
                }

                if(A60B.equals("--Pilih Jawaban--") || A60B == null || A60B.equals("") || A60B.isEmpty())
                {
                    _errorQ60BA.setError("error");
                    _errorQ60BA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ60BA.setError(null);
                    _errorQ60BA.setText("");
                    validatedAnswer++;
                }

                if(A60C.equals("--Pilih Jawaban--") || A60C == null || A60C.equals("") || A60C.isEmpty())
                {
                    _errorQ60CA.setError("error");
                    _errorQ60CA.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ60CA.setError(null);
                    _errorQ60CA.setText("");
                    validatedAnswer++;
                }

                if(A61.equals("--Pilih Jawaban--") || A61 == null || A61.equals("") || A61.isEmpty())
                {
                    _errorQ61A.setError("error");
                    _errorQ61A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ61A.setError(null);
                    _errorQ61A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 7)
                {
                    String surveyType = extras.getString("TipeSurvey");
                    String storeType = extras.getString("NO_1");

                    if(surveyType.equals("Full Audit Modem"))
                    {
                        Intent intent = new Intent(Blok5BActivity.this, Blok7AActivity.class);
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
                        intent.putExtra("NO_57", A57);
                        intent.putExtra("NO_58", A58);
                        intent.putExtra("NO_59", A59);
                        intent.putExtra("NO_60", A60);
                        intent.putExtra("NO_60B", A60B);
                        intent.putExtra("NO_60C", A60C);
                        intent.putExtra("NO_61", A61);
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
                        intent.putExtra("NO_102", "Samsung");
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
                    }
                    else if(surveyType.equals("Full Audit Smartphone") && storeType.equals("EXCLUSIVE SMARTFREN"))
                    {
                        Intent intent = new Intent(Blok5BActivity.this, Blok8Activity.class);
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
                        intent.putExtra("NO_57", A57);
                        intent.putExtra("NO_58", A58);
                        intent.putExtra("NO_59", A59);
                        intent.putExtra("NO_60", A60);
                        intent.putExtra("NO_60B", A60B);
                        intent.putExtra("NO_60C", A60C);
                        intent.putExtra("NO_61", A61);
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
                    }
                    else
                    {
                        Intent intent = new Intent(Blok5BActivity.this, Blok6Activity.class);
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
                        intent.putExtra("NO_57", A57);
                        intent.putExtra("NO_58", A58);
                        intent.putExtra("NO_59", A59);
                        intent.putExtra("NO_60", A60);
                        intent.putExtra("NO_60B", A60B);
                        intent.putExtra("NO_60C", A60C);
                        intent.putExtra("NO_61", A61);
                        startActivity(intent);
                    }

                }


            }
        });
    }
}
