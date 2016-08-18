package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok7Activity extends AppCompatActivity {
    private Spinner _spQ101A;

    private CheckBox _cbQ102ASamsung;
    private CheckBox _cbQ102ASmartfren;
    private CheckBox _cbQ102AAdvan;
    private CheckBox _cbQ102ALenovo;
    private CheckBox _cbQ102AOppo;
    private CheckBox _cbQ102AAsus;

    private Button _btnNext;

    protected String GetCheckBoxValue(CheckBox cb, String result)
    {
        if(cb.isChecked())
        {
            result = result + ";"+ cb.getText().toString();
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok7);

        _spQ101A = (Spinner) findViewById(R.id.spQ101A);

        _cbQ102ASamsung = (CheckBox) findViewById(R.id.cbQ102ASamsung);
        _cbQ102ASmartfren = (CheckBox) findViewById(R.id.cbQ102ASmartfren);
        _cbQ102AAdvan = (CheckBox) findViewById(R.id.cbQ102AAdvan);
        _cbQ102ALenovo = (CheckBox) findViewById(R.id.cbQ102ALenovo);
        _cbQ102AOppo = (CheckBox) findViewById(R.id.cbQ102AOppo);
        _cbQ102AAsus = (CheckBox) findViewById(R.id.cbQ102AAsus);

        _btnNext = (Button) findViewById(R.id.btnNext);

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String A101 = _spQ101A.getSelectedItem().toString();

                String A102 = "";
                A102 = GetCheckBoxValue(_cbQ102ASamsung, A102);
                A102 = GetCheckBoxValue(_cbQ102ASmartfren, A102);
                A102 = GetCheckBoxValue(_cbQ102AAdvan, A102);
                A102 = GetCheckBoxValue(_cbQ102ALenovo, A102);
                A102 = GetCheckBoxValue(_cbQ102AOppo, A102);
                A102 = GetCheckBoxValue(_cbQ102AAsus, A102);

                if(_cbQ102ASamsung.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7AActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
                else if(_cbQ102ASmartfren.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7BActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
                else if(_cbQ102AAdvan.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7CActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
                else if(_cbQ102ALenovo.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7DActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
                else if(_cbQ102AOppo.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7EActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
                else if(_cbQ102AAsus.isChecked())
                {
                    Intent intent = new Intent(Blok7Activity.this, Blok7FActivity.class);
                    intent.putExtra("NO_101", A101);
                    intent.putExtra("NO_102", A102);
                }
            }
        });
    }
}
