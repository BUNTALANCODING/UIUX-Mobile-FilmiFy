package com.project.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_Love extends AppCompatActivity {


    private ImageView homepg, userpg, delete, delete1 , delete2, delete3;

    private Button play1, play2, play3, play4, deleteku;

    final loadingdialog7 progressDialogdelscs = new loadingdialog7(Halaman_Love.this);
    @Override
    protected void onStart() {
        overridePendingTransition(0, 0);
        super.onStart();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_love);
        final lodingdialog progressDialog = new lodingdialog(Halaman_Love.this);


        homepg = findViewById(R.id.homepg);
        homepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Love.this, Halaman_Utama.class);
                startActivity(intent);

            }
        });

        userpg = findViewById(R.id.userpg);
        userpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Love.this, Halaman_AccUser.class);
                startActivity(intent);

            }
        });

        play1 = findViewById(R.id.play1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Love.this, Halaman_PlayFilmLike.class);
                        startActivity(intent);

                    }
                }, 5000);

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
                        Intent intent = new Intent(Halaman_Love.this, Halaman_PlayFilmLike1.class);
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
                        Intent intent = new Intent(Halaman_Love.this, Halaman_PlayFilmLike2.class);
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
                        Intent intent = new Intent(Halaman_Love.this, Halaman_PlayFilmLike3.class);
                        startActivity(intent);

                    }
                }, 5000);

            }
        });


        delete = findViewById(R.id.delete1);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialogdelscs.startLoding();

            }
        });

        delete1 = findViewById(R.id.delete2);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialogdelscs.startLoding();

            }
        });

        delete2 = findViewById(R.id.delete3);
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialogdelscs.startLoding();

            }
        });


        delete3 = findViewById(R.id.delete4);
        delete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialogdelscs.startLoding();

            }
        });




    }
    final lodingdialog progressDialog = new lodingdialog(Halaman_Love.this);
    final loadingdialog8 progressDialogdel = new loadingdialog8(Halaman_Love.this);


    public void deleteku(View view) {
        progressDialog.startLoding();


        Handler handlerrate = new Handler();
        handlerrate.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialogdelscs.dismis();
            }
        }, 5000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {

                progressDialog.dismis();
            }
        }, 5000);

        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {

            @Override

            public void run() {

                progressDialogdel.startLoding();


            }
        }, 5000);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {

            @Override

            public void run() {
                progressDialogdel.dismis();
                Intent intent = new Intent(Halaman_Love.this, Halaman_Love_delete.class);
                startActivity(intent);

            }
        }, 10000);
    }
    public void tidakdlt(View view) {
        Intent intent = new Intent(Halaman_Love.this, Halaman_Love.class);
        startActivity(intent);
    }
}