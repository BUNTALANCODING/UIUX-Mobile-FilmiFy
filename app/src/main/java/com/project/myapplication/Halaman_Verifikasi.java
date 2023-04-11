package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Halaman_Verifikasi extends AppCompatActivity {
    private EditText otpku;
    private Button verifku;

    private ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_verifikasi);
        final loadingdialog3 progressDialog3 = new loadingdialog3(Halaman_Verifikasi.this);
        final loadingdialog15 progressDialogotp = new loadingdialog15(Halaman_Verifikasi.this);

        otpku = findViewById(R.id.otpku);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Verifikasi.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        });

        verifku = findViewById(R.id.verifin);
        verifku.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String otp = otpku.getText().toString();
                if (otp.equals("825470")){
                    progressDialog3.startLoding();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override

                        public void run() {
                            progressDialog3.dismis();
                            Intent intent = new Intent(Halaman_Verifikasi.this, Halaman_Utama.class);
                            startActivity(intent);
                        }
                    }, 5000);
                }else {
                    progressDialogotp.startLoding();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override

                        public void run() {
                            progressDialogotp.dismis();

                        }
                    }, 5000);

                }

            }
        });
    }
}