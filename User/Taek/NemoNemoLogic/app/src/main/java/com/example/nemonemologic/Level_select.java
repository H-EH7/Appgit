package com.example.nemonemologic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Level_select extends AppCompatActivity {

    Button Level_1_Button;
    Button Level_2_Button;
    Button Level_3_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_select);

        Level_1_Button = (Button) findViewById(R.id.Level_1_Button);
        Level_2_Button = (Button) findViewById(R.id.Level_2_Button);
        Level_3_Button = (Button) findViewById(R.id.Level_3_Button);

        Level_1_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Level_1.class);
                startActivity(intent);
            }
        });

        Level_2_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Level_2.class);
                startActivity(intent);
            }
        });

        Level_3_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Level_3.class);
                startActivity(intent);
            }
        });
    }
}