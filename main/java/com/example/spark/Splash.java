package com.example.spark;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        int delayMillis = 4000;
        handler.postDelayed(new Runnable()
        {
            @Override
            public void  run()
            {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        } ,delayMillis);
    }
}
