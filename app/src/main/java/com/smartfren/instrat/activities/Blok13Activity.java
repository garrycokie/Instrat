package com.smartfren.instrat.activities;

import android.os.Bundle;

import com.smartfren.instrat.R;

/**
 * Created by FluffyBunny on 8/20/2016.
 */
public class Blok13Activity extends BaseStepsActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block12);



        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: button back clicked
            }

            @Override
            public void onContinueClicked() {
                // TODO: button continue clicked

            }
        });
    }
}
