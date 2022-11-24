package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_week6 extends AppCompatActivity {
Button btn1_w6;
ImageView back6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week6);

        back6 = findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_week6.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });


        btn1_w6 = findViewById(R.id.btn1_w6);
        btn1_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week6.this,Profit_Loss_Practice_Sheet.class);
                startActivity(intent);
            }
        });
    }
}