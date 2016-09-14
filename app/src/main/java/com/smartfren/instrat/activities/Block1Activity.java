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

        this._storeTypeSpinnerItems = new String[]{
                "EXCLUSIVE SMARTFREN", "EXCLUSIVE MEREK LAINNYA", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
        };

        _spStoreType = (Spinner) findViewById(R.id.spinStoreType);
        ArrayAdapter<CharSequence> storeTypeAdapter = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._storeTypeSpinnerItems);
        _spStoreType.setAdapter(storeTypeAdapter);

        this._storeTypeExclusiveSpinnerItems = new String[]{
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

        _spStoreTypeExclusive = (Spinner) findViewById(R.id.spinStoreTypeExclusive);
        ArrayAdapter<CharSequence> storeTypeExclusiveAdapter = new ArrayAdapter<CharSequence>(this,
                R.layout.spinner_item, this._storeTypeExclusiveSpinnerItems);
        _spStoreTypeExclusive.setAdapter(storeTypeExclusiveAdapter);

        _txtStoreTypeExlusiveLabel.setVisibility(View.GONE);
        _spStoreTypeExclusive.setVisibility(View.GONE);

        _storeTypeValue =  extras.getString("NO_1");
        _storeTypeExclusiveValue = extras.getString("NO_2");

        _spStoreType.setSelection(SetSelectedSpinner(storeTypeAdapter, _storeTypeValue));
        _spStoreTypeExclusive.setSelection(SetSelectedSpinner(storeTypeExclusiveAdapter, _storeTypeExclusiveValue));

        _spStoreType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();

                if (selectedItem.equals("EXCLUSIVE SMARTFREN") || selectedItem.equals("EXCLUSIVE MEREK LAINNYA")) {
                    _spStoreTypeExclusive.setVisibility(View.VISIBLE);
                    _txtStoreTypeExlusiveLabel.setVisibility(View.VISIBLE);
                } else {
                    _spStoreTypeExclusive.setVisibility(View.GONE);
                    _txtStoreTypeExlusiveLabel.setVisibility(View.GONE);
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
                    _txtStoreTypeExlusiveOtherText.setVisibility(View.VISIBLE);
                } else {
                    _txtStoreTypeExlusiveOtherText.setVisibility(View.GONE);
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

                if (_storeTypeExclusiveValue.equals("Lainnya, Sebutkan")) {
                    _storeTypeExclusiveValue = _txtStoreTypeExlusiveOtherText.getText().toString();
                }

                Intent intent = new Intent(Block1Activity.this, Block2Activity.class);

                intent.putExtra("DeviceSurveyID", _paramDeviceSurveyID);
                intent.putExtra("TipeSurvey", _paramTipeSurvey);
                intent.putExtra("UserID", _paramUserID);
                intent.putExtra("AccessToken", _paramAccessToken);

                intent.putExtra("NO_1", _storeTypeValue);
                intent.putExtra("NO_2", _storeTypeExclusiveValue);

                startActivity(intent);
            }
        });
    }
}
