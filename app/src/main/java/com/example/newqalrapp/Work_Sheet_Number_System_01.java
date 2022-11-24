package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Work_Sheet_Number_System_01 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_sheet_number_system01);

        pdfView = (PDFView) findViewById(R.id.pdf_ns4);
        pdfView.fromAsset("Work_Sheet_Number_System_01.pdf").load();
    }
}