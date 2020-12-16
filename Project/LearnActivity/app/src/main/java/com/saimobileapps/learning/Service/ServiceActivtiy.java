package com.saimobileapps.learning.Service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.saimobileapps.learning.R;

public class ServiceActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_activtiy);
        try
        {
            Intent obj=new Intent(ServiceActivtiy.this,SampleServiceClass.class);
            startService(obj);
        }
        catch (Exception e)
        {
            Log.e("ErrorMessage",e.getMessage());
        }
    }
}
