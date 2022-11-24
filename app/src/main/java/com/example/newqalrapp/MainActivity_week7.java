package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_week7 extends AppCompatActivity {
    Button btn1_w7;
    ImageView back7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week7);

        back7 = findViewById(R.id.back7);
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_week7.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });


        btn1_w7 = findViewById(R.id.btn1_w7);
        btn1_w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week7.this, Coding_Decoding_Question.class);
                startActivity(intent);
            }
        });
    }
}