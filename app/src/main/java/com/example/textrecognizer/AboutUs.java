package com.example.textrecognizer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

public class AboutUs extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setTitle("About Us");

        getWindow().setStatusBarColor(ContextCompat.getColor(AboutUs.this,R.color.black));

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black_shade_1)));
    }
}