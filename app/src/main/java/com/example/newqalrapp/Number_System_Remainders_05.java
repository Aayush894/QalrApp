package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Number_System_Remainders_05 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_remainders05);

        pdfView = (PDFView) findViewById(R.id.pdf_ns5);
        pdfView.fromAsset("Number_System_Remainders_05.pdf").load();
    }
}