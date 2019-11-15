package com.example.myapplication;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 5;

        Button btnClickHere = findViewById(R.id.btn);


        btnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMessage = findViewById(R.id.textViewMessage);
                tvMessage.setText("Yeyy Berhasillllll");
                tvMessage.setTextSize(20);

                Toast.makeText(MainActivity.this,"Hello Worlddd!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
