package com.romansmekalov.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = findViewById(R.id.videoView);

        //String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.demo;
//        String videoPath = "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.demo;
//        videoView.setVideoPath(videoPath);

        String s = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
            Uri videoPath = Uri.parse(s);

            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(videoPath);
            videoView.requestFocus();
//
        videoView.start();
    }
}
