package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Blood_Relation_Question extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_relation_question);

        pdfView = (PDFView) findViewById(R.id.pdf_w5);
        pdfView.fromAsset("Blood_Relation_Question.pdf").load();
    }
}