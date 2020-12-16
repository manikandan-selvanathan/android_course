package com.saimobileapps.learning.Location;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.saimobileapps.learning.Helper;
import com.saimobileapps.learning.R;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getLocation();
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 32);
        } else {
            Helper.Instance().GetCurrentLocation(this);
            Log.d("Changes", "getLocation: permissions granted");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

       if(requestCode==32) //Location Permission
       {
           if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
           {
               Helper.Instance().GetCurrentLocation(this);
           }
           else
           {
               //denied
           }
       }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }



}
