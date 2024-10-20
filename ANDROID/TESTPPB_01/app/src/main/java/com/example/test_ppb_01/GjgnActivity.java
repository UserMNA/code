package com.example.test_ppb_01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class GjgnActivity extends AppCompatActivity {

    TextView bil, hasil;
    EditText be;
    Button tnt;

    float number1, getResult;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gjgn);

        EdgeToEdge.enable(this);
        be = findViewById(R.id.be);
        bil = findViewById(R.id.bil);
        hasil = findViewById(R.id.hasil);
        tnt = findViewById(R.id.tnt);

        tnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(be.getText().toString());
                getResult = number1 / 2;
                bil.setText(String.valueOf(getResult));

                // Menentukan genap atau ganjil
                if (number1 % 2 == 0) {
                    hasil.setText("Genap"); // Menampilkan hasil
                } else {
                    hasil.setText("Ganjil"); // Menampilkan hasil
                }
            }
        });
    }
}
