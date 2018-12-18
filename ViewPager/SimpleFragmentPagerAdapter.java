package com.facebook.www.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

    public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return Fragment2.newInstance();
            case 1:
                return Fragment1.newInstance();
            case 2:
                return Fragment2.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
