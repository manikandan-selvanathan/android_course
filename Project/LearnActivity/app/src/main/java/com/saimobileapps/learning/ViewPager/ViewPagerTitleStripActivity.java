package com.saimobileapps.learning.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saimobileapps.learning.R;

import java.util.ArrayList;

public class ViewPagerTitleStripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_title_strip);
        final ViewPager viewPager=findViewById(R.id.viewpager);
        final ActionBar actionBar = getSupportActionBar();
        ArrayList<Fragment> list=new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment1());

        viewPager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager(),list));
    }
}
