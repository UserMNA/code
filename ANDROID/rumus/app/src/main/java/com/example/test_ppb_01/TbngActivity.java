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

public class TbngActivity extends AppCompatActivity {

    TextView kelit;
    EditText te2, te3;
    Button htngt;

    double number1, number2, number3, getResult;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbng);

        EdgeToEdge.enable(this);
        te2 = findViewById(R.id.te2);
        te3 = findViewById(R.id.te3);
        kelit = findViewById(R.id.kelit);
        htngt = findViewById(R.id.htng);

        htngt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Integer.parseInt(te2.getText().toString());
                number3 = Integer.parseInt(te3.getText().toString());
                getResult = 3.14 * (number2 * number2) * number3;
                kelit.setText(String.valueOf(getResult));
            }
        });
    }
}