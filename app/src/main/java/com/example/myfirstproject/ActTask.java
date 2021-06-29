package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActTask extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);
        textView.setText("ActivitySingleTask");

        findViewById(R.id.but1).setOnClickListener(v -> startStandard());
        findViewById(R.id.but2).setOnClickListener(v -> startSingleTask());
    }

    private void startStandard() {
        startActivity(new Intent(this, ActStandard.class));
    }

    private void startSingleTask() {
        startActivity(new Intent(this, ActTask.class));
    }
}