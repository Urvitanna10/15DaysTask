package com.example.a15daystasks.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.a15daystasks.R;

public class VideoActivity extends AppCompatActivity {
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        video=(VideoView)findViewById(R.id.video);
        MediaController mediaController= new MediaController(this);

        mediaController.setAnchorView(video);
        Uri uri= Uri.parse(Environment.getExternalStorageDirectory().getPath()+ "/" + R.raw.earth);
        video.setMediaController(mediaController);
        video.setVideoURI(uri);

        video.requestFocus();
        video.start();

        video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(VideoActivity.this, "Thanks", Toast.LENGTH_SHORT).show();
            }
        });
        video.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
                Toast.makeText(VideoActivity.this,"Error",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}