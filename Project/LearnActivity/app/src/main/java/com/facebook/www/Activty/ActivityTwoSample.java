package com.facebook.www.Activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.www.R;

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
