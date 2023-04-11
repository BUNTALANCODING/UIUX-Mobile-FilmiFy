package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Halaman_Register extends AppCompatActivity {
    private ImageView kembali;
    private Button dftr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_register);

        final loadingdialog1 progressDialog = new loadingdialog1(Halaman_Register.this);
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Register.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        });
        dftr = findViewById(R.id.daftar);
        dftr.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Register.this, Halaman_LoginUser.class);
                        startActivity(intent);
                    }
                }, 5000);
            }
        });
    }
}