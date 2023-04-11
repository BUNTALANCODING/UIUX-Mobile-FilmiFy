package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Halaman_EditProfil extends AppCompatActivity {
    private ImageView kembali;
    private Button saveprofil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_edit_profil);

        final lodingdialog progressDialog = new lodingdialog(Halaman_EditProfil.this);
        final loadingdialog12 progressDialogsv = new loadingdialog12(Halaman_EditProfil.this);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_EditProfil.this, Halaman_AccUser.class);
                startActivity(intent);
            }
        });

        saveprofil = findViewById(R.id.saveprfl);
        saveprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressDialog.startLoding();
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
                        progressDialogsv.startLoding();

                    }
                }, 5000);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialogsv.dismis();
                        Intent intent = new Intent(Halaman_EditProfil.this, Halaman_AccUser.class);
                        startActivity(intent);
                    }
                }, 10000);

            }
        });
    }
}