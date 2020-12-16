package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("testapp","onCreate");
        setContentView(R.layout.activity_main);

    }


    int i;
    String a="David";

    void Add()
    {
        i=5+11;
        a="Mani";
        Log.d("printadd","Added Value"+a);
    }


    @Override
    protected void onStart()
    {
        Log.d("testapp","onStart"); //UI is visible
        super.onStart();
    }

    @Override
    protected void onResume() {
        i=5+10;
        Log.d("testapp","onResume");//Once user able to interact
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("testapp","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("testapp","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("testapp","onDestroy");
        super.onDestroy();
    }
}

