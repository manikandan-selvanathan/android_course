package com.saimobileapps.learning.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> list;
    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager,ArrayList<Fragment> list){
        super(fragmentManager);
        this.list=list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + (position + 1);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
