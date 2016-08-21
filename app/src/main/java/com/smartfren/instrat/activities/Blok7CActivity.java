package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok7CActivity extends BaseStepsActivity {
    private Spinner _spQ110A;

    private CheckBox _cbQ109A1;
    private CheckBox _cbQ109A2;
    private CheckBox _cbQ109A3;
    private CheckBox _cbQ109A4;
    private CheckBox _cbQ109A5;

    private CheckBox _cbQ111A1;
    private CheckBox _cbQ111A2;
    private CheckBox _cbQ111A3;
    private CheckBox _cbQ111A4;
    private CheckBox _cbQ111A5;
    private CheckBox _cbQ111A6;
    private CheckBox _cbQ111A7;
    private CheckBox _cbQ111A8;
    private CheckBox _cbQ111A9;
    private CheckBox _cbQ111A10;
    private CheckBox _cbQ111A11;
    private CheckBox _cbQ111A12;
    private CheckBox _cbQ111A13;
    private CheckBox _cbQ111A14;
    private CheckBox _cbQ111A15;

    private EditText _txtQ111A;

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
        super.setContentView(R.layout.activity_blok7c);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok7c);

        _cbQ109A1 = (CheckBox) findViewById(R.id.cbQ109A1);
        _cbQ109A2 = (CheckBox) findViewById(R.id.cbQ109A2);
        _cbQ109A3 = (CheckBox) findViewById(R.id.cbQ109A3);
        _cbQ109A4 = (CheckBox) findViewById(R.id.cbQ109A4);
        _cbQ109A5 = (CheckBox) findViewById(R.id.cbQ109A5);

        _spQ110A = (Spinner) findViewById(R.id.spQ110A);

        _cbQ111A1 = (CheckBox) findViewById(R.id.cbQ111A1);
        _cbQ111A2 = (CheckBox) findViewById(R.id.cbQ111A2);
        _cbQ111A3 = (CheckBox) findViewById(R.id.cbQ111A3);
        _cbQ111A4 = (CheckBox) findViewById(R.id.cbQ111A4);
        _cbQ111A5 = (CheckBox) findViewById(R.id.cbQ111A5);
        _cbQ111A6 = (CheckBox) findViewById(R.id.cbQ111A6);
        _cbQ111A7 = (CheckBox) findViewById(R.id.cbQ111A7);
        _cbQ111A8 = (CheckBox) findViewById(R.id.cbQ111A8);
        _cbQ111A9 = (CheckBox) findViewById(R.id.cbQ111A9);
        _cbQ111A10 = (CheckBox) findViewById(R.id.cbQ111A10);
        _cbQ111A11 = (CheckBox) findViewById(R.id.cbQ111A11);
        _cbQ111A12 = (CheckBox) findViewById(R.id.cbQ111A12);
        _cbQ111A13 = (CheckBox) findViewById(R.id.cbQ111A13);
        _cbQ111A14 = (CheckBox) findViewById(R.id.cbQ111A14);
        _cbQ111A15 = (CheckBox) findViewById(R.id.cbQ111A15);

        _cbQ111A1.setVisibility(View.VISIBLE);
        _cbQ111A2.setVisibility(View.VISIBLE);
        _cbQ111A3.setVisibility(View.VISIBLE);
        _cbQ111A4.setVisibility(View.VISIBLE);
        _cbQ111A5.setVisibility(View.VISIBLE);
        _cbQ111A6.setVisibility(View.VISIBLE);
        _cbQ111A7.setVisibility(View.VISIBLE);
        _cbQ111A8.setVisibility(View.VISIBLE);
        _cbQ111A9.setVisibility(View.VISIBLE);
        _cbQ111A10.setVisibility(View.VISIBLE);
        _cbQ111A11.setVisibility(View.VISIBLE);
        _cbQ111A12.setVisibility(View.VISIBLE);
        _cbQ111A13.setVisibility(View.VISIBLE);
        _cbQ111A14.setVisibility(View.VISIBLE);
        _cbQ111A15.setVisibility(View.VISIBLE);

        _txtQ111A = (EditText) findViewById(R.id.txtQ111A);

        _spQ110A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Akan order lagi"))
                {
                    _cbQ111A1.setVisibility(View.VISIBLE);
                    _cbQ111A2.setVisibility(View.VISIBLE);
                    _cbQ111A3.setVisibility(View.VISIBLE);
                    _cbQ111A4.setVisibility(View.VISIBLE);
                    _cbQ111A5.setVisibility(View.VISIBLE);
                    _cbQ111A6.setVisibility(View.VISIBLE);
                    _cbQ111A7.setVisibility(View.VISIBLE);
                    _cbQ111A8.setVisibility(View.GONE);
                    _cbQ111A9.setVisibility(View.GONE);
                    _cbQ111A10.setVisibility(View.GONE);
                    _cbQ111A11.setVisibility(View.GONE);
                    _cbQ111A12.setVisibility(View.GONE);
                    _cbQ111A13.setVisibility(View.GONE);
                    _cbQ111A14.setVisibility(View.GONE);
                }
                else if(selectedItem.equals("Lihat-lihat dulu"))
                {
                    _cbQ111A1.setVisibility(View.VISIBLE);
                    _cbQ111A2.setVisibility(View.VISIBLE);
                    _cbQ111A3.setVisibility(View.VISIBLE);
                    _cbQ111A4.setVisibility(View.VISIBLE);
                    _cbQ111A5.setVisibility(View.VISIBLE);
                    _cbQ111A6.setVisibility(View.VISIBLE);
                    _cbQ111A7.setVisibility(View.VISIBLE);
                    _cbQ111A8.setVisibility(View.VISIBLE);
                    _cbQ111A9.setVisibility(View.VISIBLE);
                    _cbQ111A10.setVisibility(View.VISIBLE);
                    _cbQ111A11.setVisibility(View.VISIBLE);
                    _cbQ111A12.setVisibility(View.VISIBLE);
                    _cbQ111A13.setVisibility(View.VISIBLE);
                    _cbQ111A14.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbQ111A1.setVisibility(View.GONE);
                    _cbQ111A2.setVisibility(View.GONE);
                    _cbQ111A3.setVisibility(View.GONE);
                    _cbQ111A4.setVisibility(View.GONE);
                    _cbQ111A5.setVisibility(View.GONE);
                    _cbQ111A6.setVisibility(View.GONE);
                    _cbQ111A7.setVisibility(View.GONE);
                    _cbQ111A8.setVisibility(View.VISIBLE);
                    _cbQ111A9.setVisibility(View.VISIBLE);
                    _cbQ111A10.setVisibility(View.VISIBLE);
                    _cbQ111A11.setVisibility(View.VISIBLE);
                    _cbQ111A12.setVisibility(View.VISIBLE);
                    _cbQ111A13.setVisibility(View.VISIBLE);
                    _cbQ111A14.setVisibility(View.VISIBLE);
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
                String A109 = "";
                A109 = GetCheckBoxValue(_cbQ109A1, A109);
                A109 = GetCheckBoxValue(_cbQ109A2, A109);
                A109 = GetCheckBoxValue(_cbQ109A3, A109);
                A109 = GetCheckBoxValue(_cbQ109A4, A109);
                A109 = GetCheckBoxValue(_cbQ109A5, A109);

                String A110 = _spQ110A.getSelectedItem().toString();

                String A111 = "";
                if(_spQ110A.getSelectedItem().toString().equals("Akan order lagi"))
                {
                    A111 = GetCheckBoxValue(_cbQ111A1, A111);
                    A111 = GetCheckBoxValue(_cbQ111A2, A111);
                    A111 = GetCheckBoxValue(_cbQ111A3, A111);
                    A111 = GetCheckBoxValue(_cbQ111A4, A111);
                    A111 = GetCheckBoxValue(_cbQ111A5, A111);
                    A111 = GetCheckBoxValue(_cbQ111A6, A111);
                    A111 = GetCheckBoxValue(_cbQ111A7, A111);
                }
                else if(_spQ110A.getSelectedItem().toString().equals("Lihat-lihat dulu"))
                {
                    A111 = GetCheckBoxValue(_cbQ111A1, A111);
                    A111 = GetCheckBoxValue(_cbQ111A2, A111);
                    A111 = GetCheckBoxValue(_cbQ111A3, A111);
                    A111 = GetCheckBoxValue(_cbQ111A4, A111);
                    A111 = GetCheckBoxValue(_cbQ111A5, A111);
                    A111 = GetCheckBoxValue(_cbQ111A6, A111);
                    A111 = GetCheckBoxValue(_cbQ111A7, A111);
                    A111 = GetCheckBoxValue(_cbQ111A8, A111);
                    A111 = GetCheckBoxValue(_cbQ111A9, A111);
                    A111 = GetCheckBoxValue(_cbQ111A10, A111);
                    A111 = GetCheckBoxValue(_cbQ111A11, A111);
                    A111 = GetCheckBoxValue(_cbQ111A12, A111);
                    A111 = GetCheckBoxValue(_cbQ111A13, A111);
                    A111 = GetCheckBoxValue(_cbQ111A14, A111);
                }
                else
                {
                    A111 = GetCheckBoxValue(_cbQ111A8, A111);
                    A111 = GetCheckBoxValue(_cbQ111A9, A111);
                    A111 = GetCheckBoxValue(_cbQ111A10, A111);
                    A111 = GetCheckBoxValue(_cbQ111A11, A111);
                    A111 = GetCheckBoxValue(_cbQ111A12, A111);
                    A111 = GetCheckBoxValue(_cbQ111A13, A111);
                    A111 = GetCheckBoxValue(_cbQ111A14, A111);
                }

                if(_cbQ111A15.isChecked())
                {
                    A111 = A111 + ";" + _txtQ111A.getText().toString();
                }

                Bundle extras = getIntent().getExtras();
                String product = extras.getString("NO_102").toLowerCase();
                if(product.contains("lenovo"))
                {
                    Intent intent = new Intent(Blok7CActivity.this, Blok7DActivity.class);
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
                    intent.putExtra("NO_103", extras.getString("NO_103"));
                    intent.putExtra("NO_104", extras.getString("NO_104"));
                    intent.putExtra("NO_105", extras.getString("NO_105"));
                    intent.putExtra("NO_106", extras.getString("NO_106"));
                    intent.putExtra("NO_107", extras.getString("NO_107"));
                    intent.putExtra("NO_108", extras.getString("NO_108"));
                    intent.putExtra("NO_109", A109);
                    intent.putExtra("NO_110", A110);
                    intent.putExtra("NO_111", A111);
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
                    Intent intent = new Intent(Blok7CActivity.this, Blok7EActivity.class);
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
                    intent.putExtra("NO_103", extras.getString("NO_103"));
                    intent.putExtra("NO_104", extras.getString("NO_104"));
                    intent.putExtra("NO_105", extras.getString("NO_105"));
                    intent.putExtra("NO_106", extras.getString("NO_106"));
                    intent.putExtra("NO_107", extras.getString("NO_107"));
                    intent.putExtra("NO_108", extras.getString("NO_108"));
                    intent.putExtra("NO_109", A109);
                    intent.putExtra("NO_110", A110);
                    intent.putExtra("NO_111", A111);
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
                    Intent intent = new Intent(Blok7CActivity.this, Blok7FActivity.class);
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
                    intent.putExtra("NO_103", extras.getString("NO_103"));
                    intent.putExtra("NO_104", extras.getString("NO_104"));
                    intent.putExtra("NO_105", extras.getString("NO_105"));
                    intent.putExtra("NO_106", extras.getString("NO_106"));
                    intent.putExtra("NO_107", extras.getString("NO_107"));
                    intent.putExtra("NO_108", extras.getString("NO_108"));
                    intent.putExtra("NO_109", A109);
                    intent.putExtra("NO_110", A110);
                    intent.putExtra("NO_111", A111);
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
        });
    }
}
