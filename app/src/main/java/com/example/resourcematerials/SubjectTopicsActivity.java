package com.example.resourcematerials;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SubjectTopicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_topics);

        // Get the selected subject from the intent
        String subject = getIntent().getStringExtra("subject");

        // Set the title for the activity
        setTitle(subject);

        // Initialize WebView to display YouTube videos
        WebView webView = findViewById(R.id.topicWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // Enable JavaScript for embedded YouTube videos

        // Load the YouTube video based on the selected topic
        if (subject.equals("Data Structures and Algorithms")) {
            int topicNumber = getIntent().getIntExtra("topicNumber", -1);

            // Load the YouTube video based on the selected topic
            if (topicNumber == 1) {
                String[] topics = {
                        "Graphs - BFS",
                        "Graphs - DFS",
                        "Trees - AVL Tree Insertion & Rotation"
                };

                String[] videoUrls = {
                        "https://youtu.be/HZ5YTanv5QE?si=JNPNFlfIYEIR4_Zx",
                        "https://youtu.be/Y40bRyPQQr0?si=l7kGQG5PXm75I_VN",
                        "https://youtu.be/jDM6_TnYIqE?si=xTcfVRk3Cbjzpzz1"
                };

                String selectedVideoUrl = videoUrls[topicNumber];
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(selectedVideoUrl);
            }else if (topicNumber == 2) {
                String[] topics = {
                        "OSI",
                        "TCP/IP",
                        "Routing Protocols"
                };

                String[] videoUrls = {
                        "https://youtu.be/HZ5YTanv5QE?si=JNPNFlfIYEIR4_Zx",
                        "https://youtu.be/Y40bRyPQQr0?si=l7kGQG5PXm75I_VN",
                        "https://youtu.be/jDM6_TnYIqE?si=xTcfVRk3Cbjzpzz1"
                };

                String selectedVideoUrl = videoUrls[topicNumber];
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(selectedVideoUrl);
            }
        }
    }
}
