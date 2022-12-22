package com.example.up;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button BtnCyb;
    private Button BtnSport;
    private Button BtnMusic;
    private Button BtnDraw;
    private Button BtnPolitics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosetheme);
        BtnCyb = findViewById(R.id.btncyber);
        BtnCyb.setOnClickListener(v -> {
            Intent okno2 = new Intent(this, ThirdActivity.class);
            startActivity(okno2);
            finish();
        });
        BtnSport = findViewById(R.id.btnsport);
        BtnSport.setOnClickListener(v -> {
            Intent okno3 = new Intent(this, SeventhActivity.class);
            startActivity(okno3);
            finish();
        });
        BtnDraw = findViewById(R.id.btndraw);
        BtnDraw.setOnClickListener(v -> {
            Intent okno4 = new Intent(this, FourthActivity.class);
            startActivity(okno4);
            finish();
        });
        BtnMusic = findViewById(R.id.btnmusic);
        BtnMusic.setOnClickListener(v -> {
            Intent okno5 = new Intent(this, FifthActivity.class);
            startActivity(okno5);
            finish();
        });
        BtnPolitics = findViewById(R.id.btnpolit);
        BtnPolitics.setOnClickListener(v -> {
            Intent okno6 = new Intent(this, SixthActivity.class);
            startActivity(okno6);
            finish();
        });
    }
}
