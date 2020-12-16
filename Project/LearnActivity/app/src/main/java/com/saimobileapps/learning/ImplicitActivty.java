package com.saimobileapps.learning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImplicitActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_activty);

    }

    public void SampleClick(View view) {
        if(view.getId()==R.id.OpenMap)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
            Uri.parse("http://maps.google.com?q=12.9845134,80.2397399"));
            startActivity(intent);


        }
    }
}
