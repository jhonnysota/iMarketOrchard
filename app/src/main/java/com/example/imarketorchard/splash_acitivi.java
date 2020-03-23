package com.example.imarketorchard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;

public class splash_acitivi extends AppCompatActivity {

    private final int DURACION_SPLASH = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash_acitivi.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        }, DURACION_SPLASH);
    }
}