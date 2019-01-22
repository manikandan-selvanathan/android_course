package com.facebook.www.BundleSample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.www.R;

public class BundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
    }

    public void sendData(View view) {
        int i=0;
        if(view.getId()==R.id.button_one)
        {
            i=1;
        }
        else if(view.getId()==R.id.button_two)
        {
            i=2;
        }
        else if(view.getId()==R.id.button_three)
        {
            i=3;
        }
        Intent intent=new Intent(this,BundleActivityTwo.class);
        intent.putExtra("data",i);
        intent.putExtra("username","Mani");
        intent.putExtra("remindMe",true);
        startActivity(intent);
    }
}
