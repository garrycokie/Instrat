package com.smartfren.instrat.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.smartfren.instrat.R;

/**
 * Created by FluffyBunny on 8/7/2016.
 */
public class Block2Activity extends Activity {

    private String[] _operatorSpinnerItems;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block2);

        this._operatorSpinnerItems = new String[] {
                "Smartfren",
                "Axis",
                "Bolt",
                "Indosat",
                "Telkomsel",
                "Tri (3)",
                "XL",
                "Tidak tahu"
        };

        Spinner spinnerOperator= (Spinner) findViewById(R.id.spinOperatorType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._operatorSpinnerItems);
        spinnerOperator.setAdapter(adapter);

        Spinner spinnerOperator4G= (Spinner) findViewById(R.id.spinOperator4G);
        ArrayAdapter<String> adapter4G = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._operatorSpinnerItems);
        spinnerOperator4G.setAdapter(adapter4G);
    }
}
