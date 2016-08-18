package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok9Activity extends AppCompatActivity {

    private Spinner _spQ128A;
    private Button _btnNext;

    private String _Q128AValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok9);

        _spQ128A = (Spinner) findViewById(R.id.spQ128A);
        _btnNext = (Button) findViewById(R.id.btnNext);

        _spQ128A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                _Q128AValue = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        _btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Blok9Activity.this, Blok10Activity.class);
                intent.putExtra("NO_128", _Q128AValue);

                startActivity(intent);
            }
        });
    }
}
