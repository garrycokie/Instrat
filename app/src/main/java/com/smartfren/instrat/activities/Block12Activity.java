package com.smartfren.instrat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Block12Activity extends BaseStepsActivity {

    private EditText _txtQ134;
    private Spinner _spQ135;

    private String _Q134Value;
    private String _Q135Value;

    private String[] _Q135ItemArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block12);

        _Q135ItemArray = new String[]{ "Outlet lama (ada dalam list)", "Outlet baru (tidak ada dalam list)" };
        _spQ135 = (Spinner) findViewById(R.id.spQ135);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._Q135ItemArray);
        _spQ135.setAdapter(adapter);

        _txtQ134 = (EditText) findViewById(R.id.txtQ134);


        _spQ135.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                _Q135Value  = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: button back clicked
            }

            @Override
            public void onContinueClicked() {
                // TODO: button continue clicked

                _Q134Value = _txtQ134.getText().toString();

                Intent intent = new Intent(Block12Activity.this, Blok13Activity.class);

                intent.putExtra("NO_134", _Q134Value);
                intent.putExtra("NO_135", _Q135Value);

                startActivity(intent);
            }
        });
    }
}
