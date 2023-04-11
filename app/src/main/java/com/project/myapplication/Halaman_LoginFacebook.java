package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Halaman_LoginFacebook extends AppCompatActivity {
    private ImageView exitku;
    @Override
    protected void onStart() {
        overridePendingTransition(0,0);
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login_facebook);
        exitku = findViewById(R.id.exit);
        exitku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_LoginFacebook.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        });
    }
}