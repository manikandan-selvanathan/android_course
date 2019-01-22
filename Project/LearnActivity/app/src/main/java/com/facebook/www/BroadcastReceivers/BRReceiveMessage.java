package com.facebook.www.BroadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BRReceiveMessage extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try
        {
            Toast.makeText(context,"SMS Receiver",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {

        }
    }
}
