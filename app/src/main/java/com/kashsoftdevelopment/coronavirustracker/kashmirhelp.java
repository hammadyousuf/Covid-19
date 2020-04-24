package com.kashsoftdevelopment.coronavirustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kashmirhelp extends AppCompatActivity {


    private PDFView pdfViewkashmir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kashmirhelp);

        pdfViewkashmir= findViewById(R.id.pdfViewkashmir);

        pdfViewkashmir.fromAsset("kashmir.pdf").load();
    }
}
