package com.project.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_AccUser extends AppCompatActivity {


    private ImageView homepg,lovedpg;

    private Button ratekuy, logoutkuy, editprfl;


    final loadingdialog9 progressDialograte = new loadingdialog9(Halaman_AccUser.this);
    final loadingdialog11 progressDialoglogout = new loadingdialog11(Halaman_AccUser.this);
    @Override
    protected void onStart() {
        overridePendingTransition(0,0);
        super.onStart();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_acc);



        homepg = findViewById(R.id.homepg);
        homepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_AccUser.this, Halaman_Utama.class);
                startActivity(intent);

            }
        });

        lovedpg = findViewById(R.id.lovedpg);
        lovedpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_AccUser.this, Halaman_Love.class);
                startActivity(intent);

            }
        });

        ratekuy = findViewById(R.id.rateku);
        ratekuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialograte.startLoding();
            }
        });

        logoutkuy = findViewById(R.id.logoutkuy);
        logoutkuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialoglogout.startLoding();
            }
        });

        editprfl = findViewById(R.id.editprfl);
        editprfl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handlerrate = new Handler();
                handlerrate.postDelayed(new Runnable() {

                    @Override

                    public void run() {

                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_AccUser.this, Halaman_EditProfil.class);
                        startActivity(intent);
                    }
                }, 5000);


            }
        });



    }
    final lodingdialog progressDialog = new lodingdialog(Halaman_AccUser.this);
    final loadingdialog10 progressDialograteku = new loadingdialog10(Halaman_AccUser.this);


    public void rateme(View view) {
        progressDialog.startLoding();


        Handler handlerrate = new Handler();
        handlerrate.postDelayed(new Runnable() {
            @Override

            public void run() {

                progressDialograte.dismis();
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

                progressDialograteku.startLoding();


            }
        }, 5000);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {

            @Override

            public void run() {
                progressDialograteku.dismis();
                Intent intent = new Intent(Halaman_AccUser.this, Halaman_AccUser.class);
                startActivity(intent);

            }
        }, 10000);
    }
    public void tidaklgt(View view) {
        Intent intent = new Intent(Halaman_AccUser.this, Halaman_AccUser.class);
        startActivity(intent);
    }

    public void exitrate(View view) {
        Intent intent = new Intent(Halaman_AccUser.this, Halaman_AccUser.class);
        startActivity(intent);
    }

    public void logoutku(View view) {
        progressDialog.startLoding();


        Handler handlerrate = new Handler();
        handlerrate.postDelayed(new Runnable() {
            @Override

            public void run() {

                progressDialoglogout.dismis();
            }
        }, 5000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {

                progressDialog.dismis();
                Intent intent = new Intent(Halaman_AccUser.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        }, 5000);

    }


}

