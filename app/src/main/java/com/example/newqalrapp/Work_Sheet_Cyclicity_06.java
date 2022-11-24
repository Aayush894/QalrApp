package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Work_Sheet_Cyclicity_06 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_sheet_cyclicity06);

        pdfView = (PDFView) findViewById(R.id.pdf_ns6);
        pdfView.fromAsset("Work_Sheet_Cyclicuity_Remainder_06.pdf").load();
    }
}