package com.facebook.www.BroadcastReceivers;

import android.Manifest;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.www.R;

public class BRSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brsample);
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.RECEIVE_SMS)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECEIVE_SMS},2012);
        }
        else
        {
            StartBR();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode==2012)
        {
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                StartBR();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    void StartBR()
    {
        IntentFilter in=new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        in.setPriority(2147483647);
        registerReceiver(new BRReceiveMessage(),in);
    }
}
