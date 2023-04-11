package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman_Awal extends AppCompatActivity {
    private Button lanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        lanjut = findViewById(R.id.masuk);
        lanjut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Awal.this,Halaman_LoginUser.class);
                startActivity(intent);
            }
        });
    }
}