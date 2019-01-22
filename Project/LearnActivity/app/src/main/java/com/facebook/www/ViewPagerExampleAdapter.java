package com.facebook.www;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerExampleAdapter extends FragmentPagerAdapter {

    public ViewPagerExampleAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                return SampleFragment1.newInstance();
            case 1:
                return SampleFragment2.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
