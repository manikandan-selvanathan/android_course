package com.facebook.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ExceptionHandlers extends AppCompatActivity {

    String samplevar;
    String samplevar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception_handlers);
        try
        {
            if(samplevar!=null)
            {
                //Safe
                if(samplevar.length()==0)
                {

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Log.e("ExceptionHandlersException",e.getMessage());
        }
    }

    public void GetValue()
    {
        try
        {

        }
        catch (Exception e)
        {

        }
    }

}
