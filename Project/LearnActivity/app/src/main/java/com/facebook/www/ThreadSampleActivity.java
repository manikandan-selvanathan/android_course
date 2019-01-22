package com.facebook.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

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
