package com.facebook.www;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerDecemberAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> list;
    public ViewPagerDecemberAdapter(FragmentManager fm, ArrayList<Fragment> listOfFragments) {
        super(fm);
        list=listOfFragments;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
