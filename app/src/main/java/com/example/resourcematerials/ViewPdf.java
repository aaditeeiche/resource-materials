package com.example.resourcematerials;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class ViewPdf extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Map<String, String> topicToUrl = new HashMap<>();
        topicToUrl.put("bfs", "https://github.com/aaditeeiche/resource-materials/blob/7d465c8c59f08399576dcfaa547af47e3b8e5efb/app/src/main/res/raw/bfs.pdf");
        topicToUrl.put("dfs", "https://github.com/aaditeeiche/resource-materials/blob/7d465c8c59f08399576dcfaa547af47e3b8e5efb/app/src/main/res/raw/dfs.pdf");
        topicToUrl.put("avl", "https://github.com/aaditeeiche/resource-materials/blob/7d465c8c59f08399576dcfaa547af47e3b8e5efb/app/src/main/res/raw/avl.pdf");

        setContentView(R.layout.activity_pdf_view);
        WebView webView = findViewById(R.id.pdfWebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setBuiltInZoomControls(true);
// Load the PDF file using PDF.js from the raw resource
        String topicName = getIntent().getStringExtra("tN");
//        System.out.println("topicName in view:"+topicName);
        webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url="+ topicToUrl.get(topicName));

        String pdfPath = "file:///android_res/raw/" + topicName;
//        webView.loadUrl("file:///android_asset/pdf.js/web/viewer.html?file=" + pdfPath);
    }

}
