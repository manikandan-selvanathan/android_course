package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WebAPIAccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_apiaccess);


        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                WebConnectorHelper obj=new WebConnectorHelper();
               //Request and Response
                String response=obj.sendGet("https://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22");
                //Deserialize


                Log.d("Weather Request",response);
            }
        });
        t1.start();

    }
}
