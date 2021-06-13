package com.example.a15daystasks.task11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a15daystasks.R;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonstart,buttonpause,buttonstop;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        buttonstart = (Button) findViewById(R.id.buttonstart);
        buttonpause = (Button) findViewById(R.id.buttonpause);
        buttonstop = (Button) findViewById(R.id.buttonstop);

        mediaPlayer = MediaPlayer.create(MusicActivity.this, R.raw.song);
        buttonstart.setOnClickListener(this);
        buttonpause.setOnClickListener(this);
        buttonstop.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonstart:
                mediaPlayer.start();
                break;
            case R.id.buttonpause:
                mediaPlayer.pause();
                    break;
            case R.id.buttonstop:
                mediaPlayer.stop();
                break;
        }

    }
}

