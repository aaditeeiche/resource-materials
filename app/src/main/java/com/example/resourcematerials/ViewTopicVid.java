package com.example.resourcematerials;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ViewTopicVid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_view);

        String topicName = getIntent().getStringExtra("subject");
        int topicNumber = getIntent().getIntExtra("topicNumber", 1);
        WebView webView = findViewById(R.id.topicWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // Enable JavaScript for embedded YouTube videos

        assert topicName != null;
        if (topicName.equals("Data Structures and Algorithms")) {
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

            String selectedVideoUrl = videoUrls[topicNumber-1];
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(selectedVideoUrl);
        }else if (topicName.equals("Computer Networking")) {
            String[] topics = {
                    "OSI",
                    "TCP/IP",
                    "Routing Protocols"
            };
            String[] videoUrls = {
                    "https://youtu.be/qBXmbJZQ5rY?si=lf2pYjRQ6C0yb1Tq",
                    "https://youtu.be/PpsEaqJV_A0?si=F3Lq38TWhUMaNIZR",
                    "https://youtu.be/at0jBPXbFqE?si=1g-RB5iNzrgaPNzy"
            };

            String selectedVideoUrl = videoUrls[topicNumber-1];
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(selectedVideoUrl);
        }else if (topicName.equals("Design and Analysis of Algorithms")){
            String[] topics = {
                    "Backtracking",
                    "Multistage Graph",
                    "Knapsack"
            };
            String[] videoUrls = {
                    "https://youtu.be/s7AvT7cGdSo?si=Hy63LEKluvuf1PD0",
                    "https://youtu.be/9iE9Mj4m8jk?si=4FlDWV4MVLfsNqBA",
                    "https://youtu.be/cJ21moQpofY?si=c-S0QphozLWR8ig7"
            };

            String selectedVideoUrl = videoUrls[topicNumber-1];
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(selectedVideoUrl);
        }
    }
}
