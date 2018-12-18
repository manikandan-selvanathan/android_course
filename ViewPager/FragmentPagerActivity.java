package com.facebook.www.ViewPager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.www.R;

public class FragmentPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pager);
        ViewPager viewpager=findViewById(R.id.viewpager);
        viewpager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager()));
    }
}
