package com.example.annadhaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class intro_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent next =new Intent(intro_screen.this,MainActivity.class);
                startActivity(next);
                finish();
            }
        },2000);
    }
}