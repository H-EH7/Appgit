package com.example.nemonemologic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.nemonemologic.Level.Level_select;

public class Title extends AppCompatActivity {

    //버튼 선언
    Button startButton;
    Button exitButton;

    //메인
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        //Start 버튼을 눌렀을 때
        startButton = (Button) findViewById(R.id.StartButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Level_select.class);
                startActivity(intent);
            }
        });

        //Exit 버튼을 눌렀을 때
        exitButton = (Button) findViewById(R.id.ExitButton);
        exitButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Title_exit_popup.class);
            startActivityForResult(intent,0);
        });
    }

    //결과 받기
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            if (resultCode == Activity.RESULT_OK) {
                finish();
            }
        }
    }
}