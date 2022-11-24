package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Percentage_Cheat_Sheet extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage_cheat_sheet);

        pdfView = (PDFView) findViewById(R.id.pdf_percentage1);
        pdfView.fromAsset("Percentage_Cheat_Sheet.pdf").load();
    }
}