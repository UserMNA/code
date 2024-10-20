package com.example.test_ppb_01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button PP;
    Button LNG;
    Button Tbng;
    Button GJGN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.PP).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PerpanActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.LNG).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LngActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.TBNG).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TbngActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.GJGN).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GjgnActivity.class);
            startActivity(intent);
        });
    }
}