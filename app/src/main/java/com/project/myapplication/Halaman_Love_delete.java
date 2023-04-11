package com.project.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_Love_delete extends AppCompatActivity {


    private ImageView homepg, userpg, delete;

    private Button play1, play2, play3, play4, deleteku;

    @Override
    protected void onStart() {
        overridePendingTransition(0, 0);
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_love_delete);
        final lodingdialog progressDialog = new lodingdialog(Halaman_Love_delete.this);
        final loadingdialog7 progressDialog1 = new loadingdialog7(Halaman_Love_delete.this);


        homepg = findViewById(R.id.homepg);
        homepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Love_delete.this, Halaman_Utama.class);
                startActivity(intent);

            }
        });

        userpg = findViewById(R.id.userpg);
        userpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Love_delete.this, Halaman_AccUser.class);
                startActivity(intent);

            }
        });


        play2 = findViewById(R.id.play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Love_delete.this, Halaman_PlayFilmLike1.class);
                        startActivity(intent);

                    }
                }, 5000);

            }
        });

        play3 = findViewById(R.id.play3);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Love_delete.this, Halaman_PlayFilmLike2.class);
                        startActivity(intent);

                    }
                }, 5000);

            }
        });

        play4 = findViewById(R.id.play4);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Love_delete.this, Halaman_PlayFilmLike3.class);
                        startActivity(intent);

                    }
                }, 5000);

            }
        });







    }
    final lodingdialog progressDialog = new lodingdialog(Halaman_Love_delete.this);
    public void delete(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Love_delete.this, Halaman_DetailNew1.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void deleteku(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Love_delete.this, Halaman_DetailNew1.class);
                startActivity(intent);
            }
        }, 5000);
    }
}