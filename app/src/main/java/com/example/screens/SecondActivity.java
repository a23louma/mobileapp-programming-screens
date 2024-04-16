package com.example.screens;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            Log.d("asdasd:", name);
            TextView myText = findViewById(R.id.intent_text);
            myText.setText("Hej hej från andra sidan, hälsar ".concat(name));

        }

    }
}