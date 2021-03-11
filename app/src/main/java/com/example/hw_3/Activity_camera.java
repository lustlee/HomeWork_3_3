package com.example.hw_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class Activity_camera extends AppCompatActivity {

    Button btn_camera,btn_video;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btn_camera = findViewById(R.id.btn_camera_video);
        btn_video = findViewById(R.id.btn_video);
        toolbar = findViewById(R.id.toolbar_top);
        setActionBar(toolbar);


        btn_camera.setOnClickListener(view -> {
            Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
            startActivity(intent);
        });

        btn_video.setOnClickListener(view -> {
            Intent intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
            startActivity(intent);
        });

    }
}