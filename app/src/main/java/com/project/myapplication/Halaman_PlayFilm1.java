package com.project.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_PlayFilm1 extends AppCompatActivity {
    private ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_play_film1);



        VideoView videoView = findViewById(R.id.playvid1);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.spdr_man_play_new;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_PlayFilm1.this, Halaman_DetailNew2.class);
                startActivity(intent);
            }
        });
    }
}