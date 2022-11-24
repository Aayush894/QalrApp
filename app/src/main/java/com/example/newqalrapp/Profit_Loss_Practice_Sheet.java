package com.example.newqalrapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Profit_Loss_Practice_Sheet extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit_loss_practice_sheet);

        pdfView = (PDFView) findViewById(R.id.pdf_profitloss);
        pdfView.fromAsset("Percentage_Cheat_Sheet.pdf").load();
    }
}