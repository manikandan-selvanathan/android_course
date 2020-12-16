package com.saimobileapps.learning;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ViewPagerDecemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_december);
        ViewPager viewpager=findViewById(R.id.viewpager);
        ArrayList<Fragment> listOfFragment=new ArrayList<>();
        listOfFragment.add(ViewPagerFragment1.newInstance());
        listOfFragment.add(ViewPagerFragmentTwo.newInstance());
        listOfFragment.add(ViewPagerFragmentThree.newInstance());

        ViewPagerDecemberAdapter viewPagerExampleAdapter=new ViewPagerDecemberAdapter(getSupportFragmentManager(),listOfFragment);
        viewpager.setAdapter(viewPagerExampleAdapter);


    }
}
