package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Halaman_Register extends AppCompatActivity {
    private ImageView kembali;
    private Button dftr;

    private EditText name,userreg,mail,passreg,passcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_register);

        final loadingdialog1 progressDialog = new loadingdialog1(Halaman_Register.this);
        final loadingdialog16 progressDialogpasscon = new loadingdialog16(Halaman_Register.this);
        final loadingdialog17 progressDialogEmpty = new loadingdialog17(Halaman_Register.this);
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Register.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        });

        name = findViewById(R.id.Nama);
        userreg = findViewById(R.id.Username);
        mail = findViewById(R.id.Email);
        passreg = findViewById(R.id.Pass);
        passcon = findViewById(R.id.Conpass);

        dftr = findViewById(R.id.daftar);
        dftr.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if (name.getText().toString().length()>0 && userreg.getText().toString().length()>0 && mail.getText().toString().length()>0 && passreg.getText().toString().length()>0 && passcon.getText().toString().length()>0){
                    if (passreg.getText().toString().equals(passcon.getText().toString())){
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
                    }else{
                        progressDialogpasscon.startLoding();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override

                            public void run() {
                                progressDialogpasscon.dismis();
                            }
                        }, 5000);
                    }

                }else{
                    progressDialogEmpty.startLoding();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override

                        public void run() {
                            progressDialogEmpty.dismis();
                        }
                    }, 5000);

                }
            }
        });
    }
}