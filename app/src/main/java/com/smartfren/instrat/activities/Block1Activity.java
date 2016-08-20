package com.smartfren.instrat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.smartfren.instrat.R;

/**
 * Created by FluffyBunny on 8/7/2016.
 */
public class Block1Activity extends BaseStepsActivity {

    private String[] _storeTypeSpinnerItems;
    private String[] _storeTypeExclusiveSpinnerItems;

    private Spinner _spStoreType;
    private Spinner _spStoreTypeExclusive;
    private EditText _txtStoreTypeExlusiveOtherText;

    private String _storeTypeValue;
    private String _storeTypeExclusiveValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block1);

        this._storeTypeSpinnerItems = new String[]{
                "EXCLUSIVE SMARTFREN", "EXCLUSIVE MEREK LAINNYA", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
        };

        _spStoreType = (Spinner) findViewById(R.id.spinStoreType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._storeTypeSpinnerItems);
        _spStoreType.setAdapter(adapter);

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

        _spStoreTypeExclusive = (Spinner) findViewById(R.id.spinStoreTypeExclusive);
        ArrayAdapter<String> adapterExclusive = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._storeTypeExclusiveSpinnerItems);
        _spStoreTypeExclusive.setAdapter(adapterExclusive);
        _txtStoreTypeExlusiveOtherText = (EditText) findViewById(R.id.txtStoreTypeExclusiveOtherValue);
        _spStoreTypeExclusive.setVisibility(View.GONE);

        _spStoreType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();

                if (selectedItem.equals("EXCLUSIVE SMARTFREN") || selectedItem.equals("EXCLUSIVE MEREK LAINNYA")) {
                    _spStoreTypeExclusive.setVisibility(View.VISIBLE);
                } else {
                    _spStoreTypeExclusive.setVisibility(View.GONE);
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

            }

            @Override
            public void onContinueClicked() {

                if (_storeTypeExclusiveValue.equals("Lainnya, Sebutkan")) {
                    _storeTypeExclusiveValue = _txtStoreTypeExlusiveOtherText.getText().toString();
                }

                Intent intent = new Intent(Block1Activity.this, Block2Activity.class);

                Bundle extras = getIntent().getExtras();

                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", _storeTypeValue);
                intent.putExtra("NO_2", _storeTypeExclusiveValue);

                startActivity(intent);
            }
        });
       }
}
