package com.example.komponenandroid_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class komponen extends AppCompatActivity {
    private static final  String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen);
    }
    public void komponen1(View view) {
        Log.d(LOG_TAG, "Button clicked");
        Intent intent = new Intent(this, komponen1.class);
        startActivity(intent);
    }

    public void komponen2(View view) {
        Log.d(LOG_TAG, "Button clicked");
        Intent intent = new Intent(this, komponen2.class);
        startActivity(intent);
    }

    public void komponen3(View view) {
        Log.d(LOG_TAG, "Button clicked");
        Intent intent = new Intent(this, komponen3.class);
        startActivity(intent);
    }

    public void komponen4(View view) {
        Log.d(LOG_TAG, "Button clicked");
        Intent intent = new Intent(this, komponen4.class);
        startActivity(intent);
    }

    public void komponen5(View view) {
        Log.d(LOG_TAG, "Button clicked");
        Intent intent = new Intent(this, komponen5.class);
        startActivity(intent);
    }
}
