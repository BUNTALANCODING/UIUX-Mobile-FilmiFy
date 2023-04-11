package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Halaman_LoginUser extends AppCompatActivity {

    private ImageView kembali;

    private Button googlelgn;

    private TextView daftarin;

    private Button fcbklgn,masukin;

    private Button btnNotif;

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onStart() {
        overridePendingTransition(0,0);
        super.onStart();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login_user);

        final lodingdialog progressDialog = new lodingdialog(Halaman_LoginUser.this);
        final loadingdialog2 progressDialog1 = new loadingdialog2(Halaman_LoginUser.this);
        final loadingdialog4 progressDialog4 = new loadingdialog4(Halaman_LoginUser.this);
        final loadingdialog6 progressDialog6 = new loadingdialog6(Halaman_LoginUser.this);
        final loadingdialog14 progressDialoglog = new loadingdialog14(Halaman_LoginUser.this);


        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.passku);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_LoginUser.this, Halaman_Awal.class);
                startActivity(intent);
            }
        });

        masukin = findViewById(R.id.masuk);
        masukin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("akbar") && password.equals("123456")) {
                    progressDialog1.startLoding();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override

                        public void run() {
                            progressDialog1.dismis();
                            Intent intentm = new Intent(Halaman_LoginUser.this, Halaman_Verifikasi.class);
                            startActivity(intentm);

                            Intent intent = new Intent(getApplicationContext(),Halaman_Verifikasi.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                            PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);

                            Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

                            NotificationCompat.Builder noBuilder = new NotificationCompat.Builder(getApplicationContext(), "FIMI")
                                    .setSmallIcon(R.drawable.logo)
                                    .setContentText("JANGAN BERI kode ini ke siapa pun, WASPADA PENIPUAN!, masukkan kode verifikasi (OTP) 825470.")
                                    .setContentTitle("FilmiFy - OTP")
                                    .setAutoCancel(true)
                                    .setSound(defaultSoundUri)
                                    .setContentIntent(pendingIntent);

                            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                                NotificationChannel channel = new NotificationChannel("FIMI", "FilmiFy - OTP", NotificationManager.IMPORTANCE_DEFAULT);
                                notificationManager.createNotificationChannel(channel);
                            }

                            notificationManager.notify(0, noBuilder.build());
                        }
                    }, 7000);


                }else {
                    progressDialoglog.startLoding();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override

                        public void run() {
                            progressDialoglog.dismis();


                        }
                    }, 7000);

                }
            }
        });



        googlelgn = findViewById(R.id.google);
        googlelgn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();


                    }
                }, 7000);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog4.startLoding();


                    }
                }, 8000);


            }

        });

        fcbklgn  = findViewById(R.id.facebook);
        fcbklgn .setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();


                    }
                }, 7000);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog6.startLoding();


                    }
                }, 8000);


            }

        });


        daftarin = findViewById(R.id.daftar);
        daftarin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog.dismis();
                        Intent intent = new Intent(Halaman_LoginUser.this, Halaman_Register.class);
                        startActivity(intent);
                    }
                }, 7000);
            }
        });


    }

    public void keluarggl(View view) {
        Intent intent = new Intent(Halaman_LoginUser.this, Halaman_LoginUser.class);
        startActivity(intent);
    }

    public void gglchs(View view) {
        Intent intent = new Intent(Halaman_LoginUser.this, Halaman_Utama.class);
        startActivity(intent);
    }

    public void lgnacc(View view) {
        Intent intent = new Intent(Halaman_LoginUser.this, Halaman_Utama.class);
        startActivity(intent);
    }
    public void lgnfck(View view) {
        Intent intent = new Intent(Halaman_LoginUser.this, Halaman_Utama.class);
        startActivity(intent);
    }


    final loadingdialog5 progressDialog5 = new loadingdialog5(Halaman_LoginUser.this);

    public void accggl1(View view) {
        progressDialog5.startLoding();

    }



}