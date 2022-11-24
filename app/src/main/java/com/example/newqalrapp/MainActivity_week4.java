package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_week4 extends AppCompatActivity {
    Button btn1_w4,btn2_w4;
    ImageView back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week4);

        back4 = findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_week4.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });

        btn1_w4 = findViewById(R.id.btn1_w4);

        btn1_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity_week4.this, Percentage_Cheat_Sheet.class);
                startActivity(intent);

            }
        });

        btn2_w4 = findViewById(R.id.btn2_w4);

        btn2_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity_week4.this, Question_percentage.class);
                startActivity(intent);

            }
        });
    }
}