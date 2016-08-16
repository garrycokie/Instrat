package com.smartfren.instrat.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.TabsPagerAdapter;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements ListPendingSurveyFragment.OnFragmentInteractionListener,
        NewSurveyFragment.OnFragmentInteractionListener {

    private TabsPagerAdapter _tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vpPager = (ViewPager) findViewById(R.id.pager);
        _tabAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(_tabAdapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //TODO:
    }
}
