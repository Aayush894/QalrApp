package com.example.newqalrapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_week5 extends AppCompatActivity {
    Button btn1_w5;
    ImageView back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week5);

        back5 = findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_week5.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });


        btn1_w5 = findViewById(R.id.btn1_w5);
        btn1_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week5.this, Blood_Relation_Question.class);
                startActivity(intent);
            }
        });
    }
}