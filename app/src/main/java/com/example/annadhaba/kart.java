package com.example.annadhaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class kart extends AppCompatActivity {
    Toolbar Karttoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kart);
        Karttoolbar =findViewById(R.id.karttoolBar);
        setSupportActionBar(Karttoolbar);
    }
}