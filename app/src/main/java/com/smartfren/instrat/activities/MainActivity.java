package com.smartfren.instrat.activities;

import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.smartfren.instrat.R;

public class MainActivity extends FragmentActivity implements
        ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }
}
