package com.facebook.www.Activty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.www.R;

public class ActivityOneSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_sample);//Layout
    }


    @Override
    protected void onStart() {
        super.onStart();
    }


    public void OnClickMethod(View view)
    {
        Intent intentobj=new Intent(ActivityOneSample.this,ActivityTwoSample.class);
        startActivity(intentobj);
    }
}
