package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Number_System_01_Classification extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system01_classification);

        pdfView = (PDFView) findViewById(R.id.pdf_ns1);
        pdfView.fromAsset("Number_System_01_Classification.pdf").load();
    }
}