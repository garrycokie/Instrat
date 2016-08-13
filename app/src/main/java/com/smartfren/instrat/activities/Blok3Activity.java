package com.smartfren.instrat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok3Activity extends AppCompatActivity {
    private Spinner spQ7A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok3);

        spQ7A = (Spinner) findViewById(R.id.spQ7A);

    }
}
