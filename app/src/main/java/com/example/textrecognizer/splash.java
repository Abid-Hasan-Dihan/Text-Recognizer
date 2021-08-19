package com.example.textrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {

    ImageView splashimg;
    TextView appname;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);




//        appname = findViewById(R.id.app_name);
        lottieAnimationView = findViewById(R.id.lottie);

//        appname.animate().translationY(000).setDuration(2000).setStartDelay(1000);
        lottieAnimationView.animate().translationY(000).setDuration(2400).setStartDelay(1000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), com.example.textrecognizer.MainActivity.class);
                startActivity(i);
                finish();
            }
        },2700);


    }
}