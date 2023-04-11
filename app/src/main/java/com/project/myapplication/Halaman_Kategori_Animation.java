package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Halaman_Kategori_Animation extends AppCompatActivity {
    private ImageView kembali;

    private ImageView animfilm1,animfilm2,animfilm3,animfilm4,animfilm5,animfilm6,animfilm7,animfilm8,animfilm9,animfilm10,animfilm11,animfilm12   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kategori_animation);
        final lodingdialog progressDialog = new lodingdialog(Halaman_Kategori_Animation.this);
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_Utama.class);
                startActivity(intent);
            }
        });

        animfilm1 = findViewById(R.id.anim1);
        animfilm1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm2 = findViewById(R.id.anim2);
        animfilm2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim1.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm3 = findViewById(R.id.anim3);
        animfilm3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim2.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm4 = findViewById(R.id.anim4);
        animfilm4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim3.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm5 = findViewById(R.id.anim5);
        animfilm5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim4.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm6 = findViewById(R.id.anim6);
        animfilm6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim5.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm7 = findViewById(R.id.anim7);
        animfilm7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim6.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm8 = findViewById(R.id.anim8);
        animfilm8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim7.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm9 = findViewById(R.id.anim9);
        animfilm9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim8.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm10 = findViewById(R.id.anim10);
        animfilm10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim9.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm11 = findViewById(R.id.anim11);
        animfilm11.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim10.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });

        animfilm12 = findViewById(R.id.anim12);
        animfilm12.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_Kategori_Animation.this, Halaman_DetailAnim11.class);
                        startActivity(intent);

                    }
                }, 7000);

            }
        });
    }
}