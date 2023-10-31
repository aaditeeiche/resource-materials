package com.example.resourcematerials;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ViewTopicVid extends AppCompatActivity {
    private static final int REQUEST_PERMISSION_CODE = 123; // You can change the request code as needed.

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
                    "bfs",
                    "dfs",
                    "avl"
            };
            String[] content = {
                    "Breadth-first search (BFS) is an algorithm for searching a tree data structure for a node that satisfies a given property. It starts at the tree root and explores all nodes at the present depth prior to moving on to the nodes at the next depth level. Extra memory, usually a queue, is needed to keep track of the child nodes that were encountered but not yet explored.",
                    "Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking. Extra memory, usually a stack, is needed to keep track of the nodes discovered so far along a specified branch which helps in backtracking of the graph.",
                    "In computer science, an AVL tree (named after inventors Adelson-Velsky and Landis) is a self-balancing binary search tree. In an AVL tree, the heights of the two child subtrees of any node differ by at most one; if at any time they differ by more than one, rebalancing is done to restore this property. Lookup, insertion, and deletion all take O(log n) time in both the average and worst cases, where n is the number of nodes in the tree prior to the operation. Insertions and deletions may require the tree to be rebalanced by one or more tree rotations."
            };
            String[] videoUrls = {
                    "https://youtu.be/HZ5YTanv5QE?si=JNPNFlfIYEIR4_Zx",
                    "https://youtu.be/Y40bRyPQQr0?si=l7kGQG5PXm75I_VN",
                    "https://youtu.be/jDM6_TnYIqE?si=xTcfVRk3Cbjzpzz1"
            };

            String selectedVideoUrl = videoUrls[topicNumber-1];
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(selectedVideoUrl);
            TextView contentAboutTopic = findViewById(R.id.textView);
            contentAboutTopic.setText(content[topicNumber-1]);

            Button downloadButton = findViewById(R.id.downloadButton);
            downloadButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    downloadPdf();
//                    copyRawFileToLocalStorage();
                    Intent intent = new Intent(ViewTopicVid.this, ViewPdf.class);

                    intent.putExtra("tN", topics[topicNumber-1]); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });


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
    private void copyRawFileToLocalStorage() {
        if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            // If permission is not granted, request it from the user.
            requestPermissions(new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_CODE);
        } else {
            // Permission is already granted; copy the file.
            performCopyOperation();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, proceed with copying the file.
                performCopyOperation();
            } else {
                // Permission denied, handle it accordingly (e.g., show a message to the user).
            }
        }
    }

    private void performCopyOperation() {
        String filename = "bfs.pdf"; // Replace with the actual filename of your PDF
        File localFile = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), filename);

        AssetManager assetManager = getAssets();
        try {
            InputStream in = assetManager.open("raw/" + filename);
            FileOutputStream out = new FileOutputStream(localFile);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
