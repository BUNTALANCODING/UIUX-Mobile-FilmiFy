package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Halaman_LoginOtherGoogle extends AppCompatActivity {
    private ImageView exitku;

    @Override
    protected void onStart() {
        overridePendingTransition(0,0);
        super.onStart();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login_other_google);

    }
}