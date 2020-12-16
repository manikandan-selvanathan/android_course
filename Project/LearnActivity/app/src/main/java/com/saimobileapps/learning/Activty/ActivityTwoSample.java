package com.saimobileapps.learning.Activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.saimobileapps.learning.R;

public class ActivityTwoSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_sample);
    }

    public void OnClickMethods(View view) {
        finish();
    }
}
