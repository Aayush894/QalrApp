package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Coding_Decoding_Question extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_decoding_question);

        pdfView = (PDFView) findViewById(R.id.pdf_w7);
        pdfView.fromAsset("Coding_Decoding_Question.pdf").load();
    }
}