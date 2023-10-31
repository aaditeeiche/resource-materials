package com.example.resourcematerials;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPdf extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        WebView webView = findViewById(R.id.pdfWebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);

// Load the PDF file using PDF.js from the raw resource
        String topicName = getIntent().getStringExtra("tN");
//        System.out.println("topicName in view:"+topicName);
        String pdfPath = "file:///android_res/raw/" + topicName;
        webView.loadUrl("file:///android_asset/pdf.js/web/viewer.html?file=" + pdfPath);
    }
}
