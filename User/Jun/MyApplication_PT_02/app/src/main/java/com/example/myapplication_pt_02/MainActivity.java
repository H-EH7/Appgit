package com.example.myapplication_pt_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText ETD;
    Button BTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ETD = findViewById(R.id.ETD);
        BTN = findViewById(R.id.BTN);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETD.setText("앙기모띠");
            }
        });


    }
}