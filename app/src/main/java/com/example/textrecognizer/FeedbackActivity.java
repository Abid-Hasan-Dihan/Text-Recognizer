package com.example.textrecognizer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton,clearButton;
    private EditText nameEditText,messageEditText;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setTitle("Feedback");

        getWindow().setStatusBarColor(ContextCompat.getColor(FeedbackActivity.this,R.color.black_shade_1));

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black_shade_1)));

        sendButton = findViewById(R.id.sendButtonId);
        clearButton = findViewById(R.id.clearButtonId);

        nameEditText = findViewById(R.id.nameEditText);
        messageEditText = findViewById(R.id.messageEditText);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {

            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();

            if (v.getId() == R.id.sendButtonId) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ahdihan2001aug@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
                intent.putExtra(Intent.EXTRA_TEXT, "Name : " + name + "\n Message: " + message);
                startActivity(Intent.createChooser(intent, "Feedback with"));

            } else if (v.getId() == R.id.clearButtonId) {
                nameEditText.setText("");
                messageEditText.setText("");
            }


        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "Exception : "+e, Toast.LENGTH_SHORT).show();


        }


    }
}