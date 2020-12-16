package com.saimobileapps.learning.SavedInstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saimobileapps.learning.R;

public class SavedInstanceSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_instance_sample_activty);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }





    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String value = savedInstanceState.getString("sample_key", null);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("sample_key", "Values");
        super.onSaveInstanceState(outState);
    }
}
