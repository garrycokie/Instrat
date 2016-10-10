package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.Helper;

/**
 * Created by FluffyBunny on 8/7/2016.
 */
public class Block1Activity extends BaseStepsActivity {
    private static final String TAG = "Block 1";

    private String[] _storeTypeSpinnerItems;
    private String[] _storeTypeExclusiveSpinnerItems;

    private Spinner _spStoreType;
    private Spinner _spStoreTypeExclusive;
    private EditText _txtStoreTypeExlusiveOtherText;
    private TextView _txtStoreTypeExlusiveLabel;

    private String _storeTypeValue;
    private String _storeTypeExclusiveValue;

    // Extra Parameters
    private String _paramDeviceSurveyID;
    private String _paramTipeSurvey;
    private String _paramUserID;
    private String _paramAccessToken;

    private TextView _errorStoreType;
    private TextView _errorStoreTypeExclusive;

    public int SetSelectedSpinner(ArrayAdapter<CharSequence> adapter, String value)
    {
        if (value != null) {
            int spinnerPosition = adapter.getPosition(value);
            return spinnerPosition;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block1);

        // Get Extra Parameters from previous activity
        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            _paramDeviceSurveyID = extras.getString("DeviceSurveyID");
            _paramTipeSurvey = extras.getString("TipeSurvey");
            _paramUserID = extras.getString("UserID");
            _paramAccessToken = extras.getString("AccessToken");
        }

        if(_paramTipeSurvey.equals("Full Audit Smartphone"))
        {
            this._storeTypeSpinnerItems = new String[]{
                    "--Pilih Jawaban--","EXCLUSIVE SMARTFREN", "EXCLUSIVE MEREK LAINNYA", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
            };
        }
        else if(_paramTipeSurvey.equals("Full Audit Modem"))
        {
            this._storeTypeSpinnerItems = new String[]{
                    "--Pilih Jawaban--", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
            };
        }
        else if(_paramTipeSurvey.equals("Advocacy Harga"))
        {
            this._storeTypeSpinnerItems = new String[]{
                    "--Pilih Jawaban--","NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
            };
        }
        else if(_paramTipeSurvey.equals("Listing"))
        {
            this._storeTypeSpinnerItems = new String[]{
                    "--Pilih Jawaban--","EXCLUSIVE SMARTFREN", "EXCLUSIVE MEREK LAINNYA", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
            };
        }

        _spStoreType = (Spinner) findViewById(R.id.spinStoreType);
        ArrayAdapter<CharSequence> storeTypeAdapter = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._storeTypeSpinnerItems);
        _spStoreType.setAdapter(storeTypeAdapter);

        this._storeTypeExclusiveSpinnerItems = new String[]{
                "--Pilih Jawaban--",
                "Smartfren (khusus Premium Store, Gallery Smartfren dan SMILE)",
                "Advan",
                "Asus",
                "Blackberry",
                "Evercoss (Cross)",
                "Indosat",
                "Lenovo",
                "Mito",
                "Nokia (Microsoft)",
                "Oppo",
                "Samsung",
                "Sony",
                "Tri (3)",
                "XL",
                "Lainnya, Sebutkan",
        };

        _txtStoreTypeExlusiveLabel = (TextView) findViewById(R.id.txtStoreTypeExclusive);
        _txtStoreTypeExlusiveOtherText = (EditText) findViewById(R.id.txtStoreTypeExclusiveOtherValue);

        _errorStoreType = (TextView) findViewById(R.id.errorStoreType);
        _errorStoreTypeExclusive = (TextView) findViewById(R.id.errorStoreTypeExclusive);


        _spStoreTypeExclusive = (Spinner) findViewById(R.id.spinStoreTypeExclusive);
        ArrayAdapter<CharSequence> storeTypeExclusiveAdapter = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._storeTypeExclusiveSpinnerItems);
        _spStoreTypeExclusive.setAdapter(storeTypeExclusiveAdapter);

        Helper.Hide(_spStoreTypeExclusive);
        Helper.Hide(_txtStoreTypeExlusiveLabel);
        Helper.Hide(_errorStoreTypeExclusive);

        _storeTypeValue =  extras.getString("NO_1");
        _storeTypeExclusiveValue = extras.getString("NO_2");

        _spStoreType.setSelection(SetSelectedSpinner(storeTypeAdapter, _storeTypeValue));
        _spStoreTypeExclusive.setSelection(SetSelectedSpinner(storeTypeExclusiveAdapter, _storeTypeExclusiveValue));

        _spStoreType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();

                if ((selectedItem.equals("EXCLUSIVE SMARTFREN") || selectedItem.equals("EXCLUSIVE MEREK LAINNYA")) && !_paramTipeSurvey.equals("Listing") ) {
                    Helper.Show(_spStoreTypeExclusive);
                    Helper.Show(_txtStoreTypeExlusiveLabel);
                    Helper.Show(_errorStoreTypeExclusive);
                } else {
                    Helper.Hide(_spStoreTypeExclusive);
                    Helper.Hide(_txtStoreTypeExlusiveLabel);
                    Helper.Hide(_errorStoreTypeExclusive);
                }

                _storeTypeValue = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        _spStoreTypeExclusive.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();

                if (selectedItem.equals("Lainnya, Sebutkan")) {
                    Helper.Show(_txtStoreTypeExlusiveOtherText);
                } else {
                    Helper.Hide(_txtStoreTypeExlusiveOtherText);
                }

                _storeTypeExclusiveValue = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                Log.d(TAG, "Back clicked");
                // TODO: handle back

                Intent intent = new Intent(Block1Activity.this, Block0Activity.class);
                intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                intent.putExtra("TipeSurvey", _paramTipeSurvey);
                intent.putExtra("UserID", _paramUserID);
                intent.putExtra("AccessToken", _paramAccessToken);
                startActivity(intent);
            }

            @Override
            public void onContinueClicked() {

                if(_storeTypeExclusiveValue != null)
                {
                    if (_storeTypeExclusiveValue.equals("Lainnya, Sebutkan")) {
                        _storeTypeExclusiveValue = _txtStoreTypeExlusiveOtherText.getText().toString();
                    }
                }

                int CountValidated = 0;
                if(_storeTypeValue.equals("--Pilih Jawaban--") || _storeTypeValue == null || _storeTypeValue.equals("") || _storeTypeValue.isEmpty())
                {
                    _errorStoreType.setError("error");
                    _errorStoreType.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorStoreType.setError(null);
                    _errorStoreType.setText("");
                    CountValidated++;
                }

                if(((_storeTypeValue.equals("EXCLUSIVE SMARTFREN") || _storeTypeValue.equals("EXCLUSIVE MEREK LAINNYA")) && !_paramTipeSurvey.equals("Listing") ) &&   (_storeTypeExclusiveValue.equals("--Pilih Jawaban--") || _storeTypeExclusiveValue == null || _storeTypeExclusiveValue.equals("") || _storeTypeExclusiveValue.isEmpty()))
                {
                    _errorStoreTypeExclusive.setError("error");
                    _errorStoreTypeExclusive.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorStoreTypeExclusive.setError(null);
                    _errorStoreTypeExclusive.setText("");
                    CountValidated++;
                }

                if(CountValidated == 2) {

                    if(_paramTipeSurvey.equals("Full Audit Smartphone"))
                    {
                        if(_storeTypeValue.equals("EXCLUSIVE SMARTFREN"))
                        {
                            Intent intent = new Intent(Block1Activity.this, Blok4Activity.class);

                            intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                            intent.putExtra("TipeSurvey", _paramTipeSurvey);
                            intent.putExtra("UserID", _paramUserID);
                            intent.putExtra("AccessToken", _paramAccessToken);

                            intent.putExtra("NO_1", _storeTypeValue);
                            intent.putExtra("NO_2", _storeTypeExclusiveValue);
                            intent.putExtra("NO_3", "");
                            intent.putExtra("NO_4", "");
                            intent.putExtra("NO_5", "");
                            intent.putExtra("NO_6", "");
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
                        else if(_storeTypeValue.equals("EXCLUSIVE MEREK LAINNYA"))
                        {
                            Intent intent = new Intent(Block1Activity.this, Blok8Activity.class);

                            intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                            intent.putExtra("TipeSurvey", _paramTipeSurvey);
                            intent.putExtra("UserID", _paramUserID);
                            intent.putExtra("AccessToken", _paramAccessToken);

                            intent.putExtra("NO_1", _storeTypeValue);
                            intent.putExtra("NO_2", _storeTypeExclusiveValue);
                            intent.putExtra("NO_3", "");
                            intent.putExtra("NO_4", "");
                            intent.putExtra("NO_5", "");
                            intent.putExtra("NO_6", "");
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
                        }
                        else if(_storeTypeValue.equals("NON EXCLUSIVE SMARTFREN"))
                        {
                            Intent intent = new Intent(Block1Activity.this, Block2Activity.class);

                            intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                            intent.putExtra("TipeSurvey", _paramTipeSurvey);
                            intent.putExtra("UserID", _paramUserID);
                            intent.putExtra("AccessToken", _paramAccessToken);

                            intent.putExtra("NO_1", _storeTypeValue);
                            intent.putExtra("NO_2", _storeTypeExclusiveValue);

                            startActivity(intent);
                        }
                        else if(_storeTypeValue.equals("NON EXCLUSIVE LAINNYA"))
                        {
                            Intent intent = new Intent(Block1Activity.this, Block2Activity.class);

                            intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                            intent.putExtra("TipeSurvey", _paramTipeSurvey);
                            intent.putExtra("UserID", _paramUserID);
                            intent.putExtra("AccessToken", _paramAccessToken);

                            intent.putExtra("NO_1", _storeTypeValue);
                            intent.putExtra("NO_2", _storeTypeExclusiveValue);

                            startActivity(intent);
                        }

                    }
                    else if(_paramTipeSurvey.equals("Full Audit Modem"))
                    {
                        Intent intent = new Intent(Block1Activity.this, Block2Activity.class);

                        intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                        intent.putExtra("TipeSurvey", _paramTipeSurvey);
                        intent.putExtra("UserID", _paramUserID);
                        intent.putExtra("AccessToken", _paramAccessToken);

                        intent.putExtra("NO_1", _storeTypeValue);
                        intent.putExtra("NO_2", _storeTypeExclusiveValue);

                        startActivity(intent);
                    }
                    else if(_paramTipeSurvey.equals("Listing"))
                    {
                        Intent intent = new Intent(Block1Activity.this, Blok8Activity.class);

                        intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                        intent.putExtra("TipeSurvey", _paramTipeSurvey);
                        intent.putExtra("UserID", _paramUserID);
                        intent.putExtra("AccessToken", _paramAccessToken);

                        intent.putExtra("NO_1", _storeTypeValue);
                        intent.putExtra("NO_2", _storeTypeExclusiveValue);
                        intent.putExtra("NO_3", "");
                        intent.putExtra("NO_4", "");
                        intent.putExtra("NO_5", "");
                        intent.putExtra("NO_6", "");
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
                    }
                    else if(_paramTipeSurvey.equals("Advocacy Harga"))
                    {
                        Intent intent = new Intent(Block1Activity.this, Blok3Activity.class);

                        intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                        intent.putExtra("TipeSurvey", _paramTipeSurvey);
                        intent.putExtra("UserID", _paramUserID);
                        intent.putExtra("AccessToken", _paramAccessToken);

                        intent.putExtra("NO_1", _storeTypeValue);
                        intent.putExtra("NO_2", _storeTypeExclusiveValue);
                        intent.putExtra("NO_3", "");
                        intent.putExtra("NO_4", "");
                        intent.putExtra("NO_5", "");
                        startActivity(intent);
                    }


                }
             }
        });
    }
}
