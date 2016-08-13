package com.smartfren.instrat.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.smartfren.instrat.R;

/**
 * Created by FluffyBunny on 8/7/2016.
 */
public class Block1Activity extends Activity {

    private String[] _storeTypeSpinnerItems;
    private String[] _storeTypeExclusiveSpinnerItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block1);

        this._storeTypeSpinnerItems = new String[] {
                "EXCLUSIVE SMARTFREN", "EXCLUSIVE MEREK LAINNYA", "NON EXCLUSIVE SMARTFREN", "NON EXCLUSIVE LAINNYA"
        };

        Spinner spinnerStoretype = (Spinner) findViewById(R.id.spinStoreType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._storeTypeSpinnerItems);
        spinnerStoretype.setAdapter(adapter);

        this._storeTypeExclusiveSpinnerItems = new String[] {
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

        Spinner spinnerStoretypeExclusive = (Spinner) findViewById(R.id.spinStoreTypeExclusive);
        ArrayAdapter<String> adapterExclusive = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._storeTypeExclusiveSpinnerItems);
        spinnerStoretypeExclusive.setAdapter(adapterExclusive);
    }
}
