package com.saimobileapps.learning.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.saimobileapps.learning.Helper;

public class SampleService extends Service {
    public SampleService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Helper.Instance().GetCurrentLocation(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }
}
