package com.smartfren.instrat.utilities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.smartfren.instrat.activities.ListPendingSurveyFragment;
import com.smartfren.instrat.activities.NewSurveyFragment;

/**
 * Created by Garry Cokie on 8/3/2016.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    private FragmentManager _fm;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
        _fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ListPendingSurveyFragment.newInstance(0, "List Pending Survey");
            case 1:
                return NewSurveyFragment.newInstance(1, "Create a New Survey");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "List Survey";
            case 1:
                return "New Survey";
            default:
                return "-";
        }
    }
}