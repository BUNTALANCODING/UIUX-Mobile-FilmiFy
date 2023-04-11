package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Halaman_Utama extends AppCompatActivity {
    private ImageView new1,new2,new3,new4,new5,new6;
    private ImageView pop1,pop2,pop3,pop4,pop5;

    private ImageView accpg,pinnedpg;

    private Button inianimasi,inidrama,iniaction,iniother;
    @Override
    protected void onStart() {
        overridePendingTransition(0,0);
        super.onStart();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        final newfilmins film = new newfilmins(Halaman_Utama.this);
        final newfilmins1 film1 = new newfilmins1(Halaman_Utama.this);
        final newfilmins2 film2 = new newfilmins2(Halaman_Utama.this);
        final newfilmins3 film3 = new newfilmins3(Halaman_Utama.this);
        final newfilmins4 film4 = new newfilmins4(Halaman_Utama.this);
        final newfilmins5 film5 = new newfilmins5(Halaman_Utama.this);

        final populerfims popfilm = new populerfims(Halaman_Utama.this);
        final populerfims1 popfilm1 = new populerfims1(Halaman_Utama.this);
        final populerfims2 popfilm2 = new populerfims2(Halaman_Utama.this);
        final populerfims3 popfilm3 = new populerfims3(Halaman_Utama.this);
        final populerfims4 popfilm4 = new populerfims4(Halaman_Utama.this);

        accpg = findViewById(R.id.accpg);
        accpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Utama.this, Halaman_AccUser.class);
                startActivity(intent);

            }
        });

        pinnedpg = findViewById(R.id.pinnedpg);
        pinnedpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Utama.this, Halaman_Love.class);
                startActivity(intent);

            }
        });



        pop1 = findViewById(R.id.pop1);
        pop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popfilm.startLoding();

            }
        });

        pop2 = findViewById(R.id.pop2);
        pop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popfilm1.startLoding();

            }
        });

        pop3 = findViewById(R.id.pop3);
        pop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popfilm2.startLoding();

            }
        });

        pop4 = findViewById(R.id.pop4);
        pop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popfilm3.startLoding();

            }
        });

        pop5 = findViewById(R.id.pop5);
        pop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popfilm4.startLoding();

            }
        });





        new1 = findViewById(R.id.new1);
        new1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film.startLoding();


            }
        });

        new2 = findViewById(R.id.new2);
        new2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film1.startLoding();

            }
        });

        new3 = findViewById(R.id.new3);
        new3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film2.startLoding();

            }
        });

        new4 = findViewById(R.id.new4);
        new4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film3.startLoding();

            }
        });

        new5 = findViewById(R.id.new5);
        new5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film4.startLoding();

            }
        });

        new6 = findViewById(R.id.new6);
        new6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film5.startLoding();

            }
        });

        inianimasi = findViewById(R.id.inianimasi);
        inianimasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Utama.this, Halaman_Kategori_Animation.class);
                startActivity(intent);

            }
        });

        inidrama = findViewById(R.id.inidrama);
        inidrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Utama.this, Halaman_Kategori_Drama.class);
                startActivity(intent);

            }
        });

        iniaction = findViewById(R.id.iniaction);
        iniaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Utama.this, Halaman_Kategori_Action.class);
                startActivity(intent);

            }
        });


    }
    final lodingdialog progressDialog = new lodingdialog(Halaman_Utama.this);
    public void ininew1(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew1.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void ininew2(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew2.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void ininew3(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew3.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void ininew4(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew4.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void ininew5(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew5.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void ininew6(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailNew6.class);
                startActivity(intent);
            }
        }, 5000);
    }



    public void pop1(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailPop1.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void pop2(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailPop2.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void pop3(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailPop3.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void pop4(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailPop4.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void pop5(View view) {
        progressDialog.startLoding();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override

            public void run() {
                progressDialog.dismis();
                Intent intent = new Intent(Halaman_Utama.this, Halaman_DetailPop5.class);
                startActivity(intent);
            }
        }, 5000);
    }

    public void exitban(View view){
        Intent intent = new Intent(Halaman_Utama.this, Halaman_Utama.class);
        startActivity(intent);
    }




}