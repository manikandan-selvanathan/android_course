package com.saimobileapps.learning.AssetsFolder;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import com.saimobileapps.learning.R;

public class AssetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset);
        VideoView videoView=findViewById(R.id.video_view);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.samplevideo;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}
