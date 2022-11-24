package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Question_percentage extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_percentage);

        pdfView = (PDFView) findViewById(R.id.pdf_percentage2);
        pdfView.fromAsset("Question_percentage.pdf").load();
    }
}