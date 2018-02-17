package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseLongArray;
import android.widget.Toast;

import java.util.concurrent.Delayed;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//menmunculkan toas loading ketika splashscreen belum muncul
        Toast toast = Toast.makeText(this, "loading", Toast.LENGTH_LONG);
        toast.show();

        //berpindah activity dan memunculkan toast ketika telah berpindah activity

      final Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
          @Override
          public void run() {
              Toast.makeText(SplashScreen.this, "Muhammad Ridwan_1202154212", Toast.LENGTH_SHORT).show();
              startActivity(new Intent(getApplicationContext(), SplashScreen.class));
              Intent intent = new Intent(SplashScreen.this, MenuUtama.class);
              startActivity(intent);
              finish();

              //lamanya splashscreen
          }
      }, 4000L);
    }
}
