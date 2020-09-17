package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private Thread x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        x = new Thread() {

            public void run() {
                try {
                    synchronized (this) {
                        try {
                            wait(2900);
                        } catch (InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                    }
                } finally
                {
                    Intent intent = new Intent(SplashScreen.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        x.start();
    }
}
