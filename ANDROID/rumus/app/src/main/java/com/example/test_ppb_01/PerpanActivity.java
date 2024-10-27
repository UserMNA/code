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

public class PerpanActivity extends AppCompatActivity {

    TextView luas;
    EditText pe1, pe2;
    Button htngt;

    float number1, number2, getResult;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpan);

        EdgeToEdge.enable(this);
        pe1 = findViewById(R.id.pe1);
        pe2 = findViewById(R.id.pe2);
        luas = findViewById(R.id.luas);
        htngt = findViewById(R.id.htng);

        htngt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(pe1.getText().toString());
                number2 = Integer.parseInt(pe2.getText().toString());
                getResult = number1 * number2;
                luas.setText(String.valueOf(getResult));
            }
        });
    }
}