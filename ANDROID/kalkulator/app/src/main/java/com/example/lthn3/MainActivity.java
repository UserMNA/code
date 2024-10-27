package com.example.lthn3;

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

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button addition;
    Button addition2;
    Button addition3;
    Button addition4;
    Button persen;

    float number1, number2, getResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdgeToEdge.enable(this);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        addition = findViewById(R.id.add);
        addition2 = findViewById(R.id.add2);
        addition3 = findViewById(R.id.add3);
        addition4 = findViewById(R.id.add4);
        persen = findViewById(R.id.persen);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                getResult = number1 + number2;
                result.setText(String.valueOf(getResult));
            }
        });

        addition2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                getResult = number1 - number2;
                result.setText(String.valueOf(getResult));
            }
        });

        addition3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                getResult = number1 * number2;
                result.setText(String.valueOf(getResult));
            }
        });

        addition4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                getResult = number1 / number2;
                result.setText(String.valueOf(getResult));
            }
        });

        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                getResult = (number1 / number2) * 100;
                result.setText(String.valueOf(getResult));
            }
        });
    }
}