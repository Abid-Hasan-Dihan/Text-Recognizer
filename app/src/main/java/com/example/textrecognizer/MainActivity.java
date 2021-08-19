package com.example.textrecognizer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button captureButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black_shade_1));

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black_shade_1)));



        captureButton = findViewById(R.id.idBtnCapture);

        captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ScannerActivity.class);
                startActivity(i);
            }
        });


    }
}