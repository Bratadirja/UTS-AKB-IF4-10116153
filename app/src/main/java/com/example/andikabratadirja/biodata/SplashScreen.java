package com.example.andikabratadirja.biodata;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.andikabratadirja.biodata.view.viewPager.IntroActivity;

/*
    Tanggal Pengerjaan : 19 - 05 - 2019
    Nim : 10116153
    Nama : Andika Bratadirja
    Kelas : IF - 4
*/

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
                finish();
            }
        },2000);
    }
}
