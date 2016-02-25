package com.mbh.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static final int TIMEOUT_MILLISEC = 800; // after 800, it will start

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Important to keep it here!
        handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Here you can do anything after on the mainUIThread
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // important to not come back here
            }
        }, TIMEOUT_MILLISEC);
    }
}
