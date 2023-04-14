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

public class Halaman_Verifikasi extends AppCompatActivity {
    private EditText otpku;
    private Button verifku;
    private ImageView kembali;
    private TextView sendagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_verifikasi);
        final loadingdialog3 progressDialog3 = new loadingdialog3(Halaman_Verifikasi.this);
        final loadingdialog15 progressDialogotp = new loadingdialog15(Halaman_Verifikasi.this);
        final loadingdialog2 progressDialog1 = new loadingdialog2(Halaman_Verifikasi.this);

        otpku = findViewById(R.id.otpku);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Verifikasi.this, Halaman_LoginUser.class);
                startActivity(intent);
            }
        });

        sendagain = findViewById(R.id.sendaotp);
        sendagain.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                progressDialog1.startLoding();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override

                    public void run() {
                        progressDialog1.dismis();
                        Intent intentm = new Intent(Halaman_Verifikasi.this, Halaman_Verifikasi_Again.class);
                        startActivity(intentm);

                        Intent intent = new Intent(getApplicationContext(),Halaman_Verifikasi.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);

                        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

                        NotificationCompat.Builder noBuilder = new NotificationCompat.Builder(getApplicationContext(), "FIMI")
                                .setSmallIcon(R.drawable.logo)
                                .setContentText("JANGAN BERI kode ini ke siapa pun, WASPADA PENIPUAN!, masukkan kode verifikasi (OTP) 170303.")
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