package com.example.up;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    private Button BtnBack;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing);
        BtnBack = findViewById(R.id.btnback);
        BtnBack.setOnClickListener(v -> {
            Intent okno2 = new Intent(this, SecondActivity.class);
            startActivity(okno2);
            finish();
        });
    }
}

