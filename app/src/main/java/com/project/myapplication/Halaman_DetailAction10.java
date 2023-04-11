package com.project.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_DetailAction10 extends AppCompatActivity {
    private ImageView kembali;
    private Button play,savefilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_detail_action10);

        final lodingdialog progressDialog = new lodingdialog(Halaman_DetailAction10.this);

        VideoView videoView = findViewById(R.id.newvid1);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.up;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();

        final loadingdialog13 progressDialogsvflm = new loadingdialog13(Halaman_DetailAction10.this);
        savefilm = findViewById(R.id.button6);
        savefilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressDialogsvflm.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialogsvflm.dismis();

                    }
                }, 5000);

            }
        });

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_DetailAction10.this, Halaman_Kategori_Drama.class);
                startActivity(intent);
            }
        });

        play = findViewById(R.id.play1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_DetailAction10.this, Halaman_PlayAnim10.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });
    }
}