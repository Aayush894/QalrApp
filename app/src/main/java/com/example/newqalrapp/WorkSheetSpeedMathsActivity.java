package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class WorkSheetSpeedMathsActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_sheet_speed_maths);

        pdfView = (PDFView) findViewById(R.id.pdf2);
        pdfView.fromAsset("Work_Sheet_Speed_Maths.pdf").load();
    }
}