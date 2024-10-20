package com.example.buttonchange;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button button, button2;
    Boolean changea=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageview=(ImageView)findViewById(R.id.imageview);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!changea) {
                    imageview.setImageResource(R.drawable.trans_abah);

                    ((TransitionDrawable) imageview.getDrawable()).startTransition(3000);
                    changea=true;
                }
                else {
                    imageview.setImageResource(R.drawable.trans_mm);

                    ((TransitionDrawable) imageview.getDrawable()).startTransition(3000);
                    changea=false;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!changea) {
                    imageview.setImageResource(R.drawable.trans_mba);
                    ((TransitionDrawable) imageview.getDrawable()).startTransition(3000);
                    changea=true;
                }
                else {
                    imageview.setImageResource(R.drawable.trans_a2);

                    ((TransitionDrawable) imageview.getDrawable()).startTransition(3000);
                    changea=false;
                }
            }
        });
    }
}