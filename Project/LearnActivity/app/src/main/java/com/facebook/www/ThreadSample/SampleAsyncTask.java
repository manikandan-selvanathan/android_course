package com.facebook.www.ThreadSample;

import android.os.AsyncTask;
import android.util.Log;

public class SampleAsyncTask extends AsyncTask<Integer,Integer,Integer> {
    @Override
    protected Integer doInBackground(Integer... integers) {
        for (int i = 0; i < 200; i++) {
            Log.d("ThreadSampleActivity", "i Value" + i);
        }
        return 0;
    }

//
//
//    @Override
//    protected void onPreExecute() {
//        super.onPreExecute();
//    }
//
//    @Override
//    protected Object doInBackground(Object[] objects) {
//        for (int i = 0; i < 200; i++) {
//            Log.d("ThreadSampleActivity", "i Value" + i);
//        }
//        return null;
//    }
//
//    @Override
//    protected void onProgressUpdate(Object[] values) {
//        super.onProgressUpdate(values);
//    }
//
//    @Override
//    protected void onPostExecute(Object o) {
//        super.onPostExecute(o);
//    }
}
