package com.example.intentchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2Intent extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_intent);
        Intent intent = getIntent();
        String message = intent.getStringExtra("button_id");
        TextView textView = findViewById(R.id.text_message);
        if (message.equals("textOne")) {
            textView.setText(getResources().getString(R.string.TextOne_Message));

        } else if (message.equals("textTwo")) {
            textView.setText(getResources().getString(R.string.TextTwo_Message));

        } else if (message.equals("textThree")) {
            textView.setText(getResources().getString(R.string.TextThree_Message));
        }
    }
}