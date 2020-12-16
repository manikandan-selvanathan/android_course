package com.saimobileapps.learning.LaunchMode;

import android.content.Intent;
import android.os.Bundle;

import com.saimobileapps.learning.R;

public class LaunchModeActivity2 extends LauncheModeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launche_mode_base);
        setTextView();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
