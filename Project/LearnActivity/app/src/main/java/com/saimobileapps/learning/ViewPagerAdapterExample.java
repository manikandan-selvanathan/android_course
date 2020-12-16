package com.saimobileapps.learning;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerAdapterExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_adapter_example);
        ViewPager viewpager=findViewById(R.id.viewpager);
        ViewPagerExampleAdapter viewPagerExampleAdapter=new ViewPagerExampleAdapter(getSupportFragmentManager());
        viewpager.setAdapter(viewPagerExampleAdapter);

    }
}
