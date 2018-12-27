package com.saimobileapps.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d("LogActivity","OnCreate");
        Log.e("LogActivity","Sample Exception Message");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LogActivity","onStart");
    }

    @Override
    protected void onStop() {
        Log.d("LogActivity","onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LogActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LogActivity","onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LogActivity","onDestroy");
    }
}