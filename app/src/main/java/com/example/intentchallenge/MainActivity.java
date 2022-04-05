package com.example.intentchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Intent intent=new Intent(this, MainActivity2Intent.class );
        String message = null;
        if (view.getId() == R.id.TextOne){
            message = "textOne";
        }
        else if (view.getId() == R.id.TextTwo){
            message = "textTwo";
        }
        else if (view.getId() == R.id.TextThree){
            message = "textThree";
        }
        intent.putExtra("button_id",message);
        startActivity(intent);
    }
}