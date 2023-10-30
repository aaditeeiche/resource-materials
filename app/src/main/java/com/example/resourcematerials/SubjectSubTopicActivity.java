package com.example.resourcematerials;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubjectSubTopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        String subject = getIntent().getStringExtra("subject");
        switch (subject){
            case "Data Structures and Algorithms":
                setContentView(R.layout.activity_subject_subtopics);
                break;

            case "Computer Networking":
                setContentView(R.layout.activity_cn_topics);
                break;

            case "Design and Analysis of Algorithms":
                setContentView(R.layout.activity_daa_topics);
                break;
        }




        // Set the title for the activity
        setTitle(subject);

        if(subject.equals("Data Structures and Algorithms")) {
            Button graphBFS = findViewById(R.id.graphBFS);

            graphBFS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 1); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button graphDFS = findViewById(R.id.graphBFS2);

            graphDFS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 2); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button avlTreeInsDel = findViewById(R.id.avlTreeInsDel);

            avlTreeInsDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with D\ata Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 3); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });
        }else  if(subject.equals("Computer Networking")) {
            Button osi = findViewById(R.id.osi);

            osi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 1); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button tcpIp = findViewById(R.id.tcpIp);

            tcpIp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 2); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button routingProtocols = findViewById(R.id.routingProtocols);

            routingProtocols.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with D\ata Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 3); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });
        }else if(subject.equals("Design and Analysis of Algorithms")){
            Button backtracking = findViewById(R.id.backtracking);

            backtracking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 1); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button msg = findViewById(R.id.msg);

            msg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with Data Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 2); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });

            Button knapsack = findViewById(R.id.knapsack);

            knapsack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start SubjectTopicsActivity with D\ata Structures and Algorithms and topic 0 (Graphs - BFS)
                    Intent intent = new Intent(SubjectSubTopicActivity.this, ViewTopicVid.class);
                    intent.putExtra("subject", subject);
                    intent.putExtra("topicNumber", 3); // Change this number to select the desired topic
                    startActivity(intent);
                }
            });
        }
    }

}
