package com.saimobileapps.learning.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import com.saimobileapps.learning.R;

public class SampleServiceClass extends Service {
    public SampleServiceClass() {
        try{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.music);
                        mediaPlayer.start();
//                        for (long i=0;i<99999999;i++)
//                        {
//                            Log.d("ServiceSample","i Values"+i);
//                            Thread.sleep(1000);
//                        }
                    }
                    catch (Exception e)
                    {
                        Log.e("ErrorMessage",e.getMessage());
                    }
                }
            }).start();
        }
        catch (Exception e)
        {
            Log.e("ErrorMessage",e.getMessage());
        }


    }

    @Override
    public IBinder onBind(Intent intent) {
        return  null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }
}
