package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity1 extends AppCompatActivity {
    Button btnweek1,btnweek2,btnweek4,btnweek5,btnweek6,btnweek7;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        back = findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity1.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnweek1 = findViewById(R.id.btnweek1);

        btnweek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week_2.class);
                startActivity(intent);
            }
        });

        btnweek2 = findViewById(R.id.btnweek2);

        btnweek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week3.class);
                startActivity(intent);
            }
        });
        btnweek4 = findViewById(R.id.btnweek4);

        btnweek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week4.class);
                startActivity(intent);
            }
        });
        btnweek5 = findViewById(R.id.btnweek5);

        btnweek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week5.class);
                startActivity(intent);
            }
        });

        btnweek6 = findViewById(R.id.btnweek6);

        btnweek6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week6.class);
                startActivity(intent);
            }
        });

        btnweek7 = findViewById(R.id.btnweek7);

        btnweek7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity_week7.class);
                startActivity(intent);
            }
        });
    }
}