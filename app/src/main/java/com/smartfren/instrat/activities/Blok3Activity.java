package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok3Activity extends AppCompatActivity {

    private Button _btnNext;
    private RadioButton _rbQ6A1;
    private RadioButton _rbQ6A2;
    private RadioButton _rbQ6A3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok3);

        _btnNext = (Button) findViewById((R.id.btnNext));
        _rbQ6A1 = (RadioButton) findViewById((R.id.rbQ6A1));
        _rbQ6A2 = (RadioButton) findViewById((R.id.rbQ6A2));
        _rbQ6A3 = (RadioButton) findViewById((R.id.rbQ6A3));

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(_rbQ6A1.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3AActivity.class);
                    intent.putExtra("NO_6", _rbQ6A1.getText());
                    startActivity(intent);
                }
                else if(_rbQ6A2.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3BActivity.class);
                    intent.putExtra("NO_6", _rbQ6A2.getText());
                    startActivity(intent);
                }
                else if(_rbQ6A3.isChecked())
                {
                    Intent intent = new Intent(Blok3Activity.this, Blok3CActivity.class);
                    intent.putExtra("NO_6", _rbQ6A3.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }


}
