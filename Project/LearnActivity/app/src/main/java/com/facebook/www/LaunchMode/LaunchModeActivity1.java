package com.facebook.www.LaunchMode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.www.R;

public class LaunchModeActivity1 extends LauncheModeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launche_mode_base);
        setTextView();
    }
}
