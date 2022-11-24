package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Number_System_02_Divisibility extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system02_divisibility);

        pdfView = (PDFView) findViewById(R.id.pdf_ns2);
        pdfView.fromAsset("Number_System_02_Divisibility.pdf").load();
    }
}