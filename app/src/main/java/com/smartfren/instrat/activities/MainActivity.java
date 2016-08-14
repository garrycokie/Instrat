package com.smartfren.instrat.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.TabsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabsPagerAdapter _tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vpPager = (ViewPager) findViewById(R.id.pager);
        _tabAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(_tabAdapter);
    }
}
