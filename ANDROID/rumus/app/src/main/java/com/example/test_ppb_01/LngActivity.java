package com.example.test_ppb_01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LngActivity extends AppCompatActivity {

    TextView ng;
    EditText le2;
    Button htngl;

    double number1, number2, getResult;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lng);

        EdgeToEdge.enable(this);
        le2 = findViewById(R.id.le2);
        ng = findViewById(R.id.ng);
        htngl = findViewById(R.id.htngl);

        htngl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Integer.parseInt(le2.getText().toString());
                getResult = 2 * 3.14 * number2;
                ng.setText(String.valueOf(getResult));
            }
        });
    }
}