package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok5BActivity extends AppCompatActivity {
    private Spinner _spQ57A;
    private Spinner _spQ58A;
    private Spinner _spQ59A;
    private Spinner _spQ60A;
    private Spinner _spQ60BA;
    private Spinner _spQ60CA;
    private Spinner _spQ61A;

    private Button _btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok5b);

        _spQ57A = (Spinner) findViewById(R.id.spQ57A);
        _spQ58A = (Spinner) findViewById(R.id.spQ58A);
        _spQ59A = (Spinner) findViewById(R.id.spQ59A);
        _spQ60A = (Spinner) findViewById(R.id.spQ60A);
        _spQ60BA = (Spinner) findViewById(R.id.spQ60BA);
        _spQ60CA = (Spinner) findViewById(R.id.spQ60CA);
        _spQ61A = (Spinner) findViewById(R.id.spQ61A);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A57 = _spQ57A.getSelectedItem().toString();
                String A58 = _spQ58A.getSelectedItem().toString();
                String A59 = _spQ59A.getSelectedItem().toString();
                String A60 = _spQ60A.getSelectedItem().toString();
                String A60B = _spQ60BA.getSelectedItem().toString();
                String A60C = _spQ60CA.getSelectedItem().toString();
                String A61 = _spQ61A.getSelectedItem().toString();

                Intent intent = new Intent(Blok5BActivity.this, Blok5BActivity.class);
                intent.putExtra("NO_57", A57);
                intent.putExtra("NO_58", A58);
                intent.putExtra("NO_59", A59);
                intent.putExtra("NO_60", A60);
                intent.putExtra("NO_60B", A60B);
                intent.putExtra("NO_60C", A60C);
                intent.putExtra("NO_61", A61);

            }
        });
    }
}
