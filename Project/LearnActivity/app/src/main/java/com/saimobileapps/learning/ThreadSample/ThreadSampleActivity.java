package com.saimobileapps.learning.ThreadSample;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.saimobileapps.learning.R;

public class ThreadSampleActivity extends AppCompatActivity {

    ProgressBar progress_circular;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_sample2);
        final ProgressBar progressBar=findViewById(R.id.progress_circular);
       new Thread(new RunForLoop()).start();

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                progressBar.setProgress(msg.arg1);
            }
        };
        DoAsyncTask();
    }


    class RunForLoop implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Log.d("ThreadSampleActivity", "i Value" + i);
                try{
                    Thread.sleep(100);
                }
                catch (Exception e)
                {

                }
                Message mes=Message.obtain();
                mes.arg1=i;
                handler.sendMessage(mes);
            }
        }
    }

    void WithoutThread() {
        try {

            for (int i = 0; i < 203942039; i++) {
                Log.d("ThreadSampleActivity", "i Value" + i);
            }
        } catch (Exception e) {

        }
    }

    void WithThread() {
        try {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 203942039; i++) {
                        Log.d("ThreadSampleActivity", "i Value" + i);
                    }
                }
            }).start();
        } catch (Exception e) {

        }
    }

    void DoAsyncTask()
    {
        try{
            SampleAsyncTask sampleAsyncTask=new SampleAsyncTask();
            Integer value=sampleAsyncTask.execute().get();
            Log.d("ValuesChanged","Sample : "+value);
        }
        catch (Exception e)
        {

        }
    }
}
