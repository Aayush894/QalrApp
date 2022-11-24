package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Number_System_03_Unit_Digit extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system03_unit_digit);

        pdfView = (PDFView) findViewById(R.id.pdf_ns3);
        pdfView.fromAsset("Number_System_03_Unit_Digit.pdf").load();
    }
}