package com.saimobileapps.learning.BundleSample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.saimobileapps.learning.R;

public class BundleActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_two);
        TextView textView=findViewById(R.id.text_view);
        textView.setText(""+getIntent().getIntExtra("data",0));
    }


}
