package com.smartfren.instrat.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.smartfren.instrat.R;

/**
 * Created by ASUS on 8/16/2016.
 */
public abstract class BaseStepsActivity extends AppCompatActivity {

    private OnStepEventListener _stepEventListener;

    protected Button _btnBack;
    protected Button _btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void initActivity(int view) {
        setContentView(view);
        _btnBack = (Button) findViewById(R.id.btnStepBack);
        _btnContinue = (Button) findViewById(R.id.btnStepContinue);

        _btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_stepEventListener!=null) {
                    _stepEventListener.onBackClicked();
                }
            }
        });
        _btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_stepEventListener != null) {
                    _stepEventListener.onContinueClicked();
                }
            }
        });
    }

    protected interface OnStepEventListener {
        void onBackClicked();
        void onContinueClicked();
    }

    protected void setStepEventListener(OnStepEventListener eventListener) {
        _stepEventListener = eventListener;
    }
}