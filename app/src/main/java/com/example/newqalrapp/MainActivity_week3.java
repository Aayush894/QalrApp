package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_week3 extends AppCompatActivity {
    Button btn_ns,btn_ns1,btn_ns2,btn_ns3,btn_ns4,btn_ns5,btn_ns6;
    ImageView back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        back3 = findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_week3.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });
        btn_ns = findViewById(R.id.btn_ns);
        btn_ns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this, Number_System.class);
                startActivity(intent);
            }
        });

        btn_ns1 = findViewById(R.id.btn_ns1);
        btn_ns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this, Number_System_01_Classification.class);
                startActivity(intent);
            }
        });

        btn_ns2 = findViewById(R.id.btn_ns2);
        btn_ns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this,Number_System_02_Divisibility.class);
                startActivity(intent);
            }
        });

        btn_ns3 = findViewById(R.id.btn_ns3);
        btn_ns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this,Number_System_03_Unit_Digit.class);
                startActivity(intent);
            }
        });

        btn_ns4 = findViewById(R.id.btn_ns4);
        btn_ns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this, Work_Sheet_Number_System_01.class);
                startActivity(intent);
            }
        });
        btn_ns5 = findViewById(R.id.btn_ns5);
        btn_ns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this,Number_System_Remainders_05.class);
                startActivity(intent);
            }
        });
        btn_ns6 = findViewById(R.id.btn_ns6);
        btn_ns6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_week3.this, Work_Sheet_Cyclicity_06.class);
                startActivity(intent);
            }
        });
    }
}