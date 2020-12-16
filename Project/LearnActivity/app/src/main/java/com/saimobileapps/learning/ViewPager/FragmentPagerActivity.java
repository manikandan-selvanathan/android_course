package com.saimobileapps.learning.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saimobileapps.learning.R;

import java.util.ArrayList;

public class FragmentPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pager);
        ViewPager viewpager=findViewById(R.id.viewpager);
        ArrayList<Fragment> list=new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment1());

        viewpager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager(),list));
    }
}
