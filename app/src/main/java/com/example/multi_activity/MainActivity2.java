package com.example.multi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.text1);
        textView.setText(message);
        VideoView missile = findViewById(R.id.video);
        missile.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.missile);
        MediaController mc = new MediaController(this);
        missile.setMediaController(mc);
        missile.start();

    }

}