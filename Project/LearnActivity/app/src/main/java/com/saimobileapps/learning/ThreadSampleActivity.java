package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThreadSampleActivity extends AppCompatActivity {

    String i="value";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_sample);
        try
        {
            PrintValues(null);
        }
        catch (Exception e)
        {

        }
    }

    public void PrintValues(String val) throws Exception {
        if(val==null)
        {
            throw  new Exception("The Val variable should be null");
        }
        Log.d("PrintValues",val);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
