package com.example.nemonemologic.Level;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.nemonemologic.R;

public class Level_1 extends AppCompatActivity {

    Button button;
    int winCount = 61;
    int count = 0;
    Life currentLife = new Life(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);
    }

    //옳은 버튼
    public void RightClick(View v) {
        //누른 버튼을 button에 저장
        button = (Button) v;
        //누른 버튼의 백그라운드 색을 가져오기
        ColorDrawable color = (ColorDrawable) button.getBackground();
        int backGroundColor = color.getColor();

        //누른 버튼의 색이 검정일 경우 확인
        if (backGroundColor == getApplicationContext().getResources().getColor(R.color.white)) {
            button.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.black));
            count++;
        }

        //다 찾으면 승리
        if (count == winCount) {
            Toast.makeText(this, "Win!", Toast.LENGTH_LONG).show();
        }
    }

    //틀린 버튼
    public void WrongClick(View v) {
        --currentLife.life;

        //라이프가 0이 되었을 때 종료
        if (currentLife.life == 0) {
            finish();
        } else {
            Toast.makeText(this, "Life: " + currentLife.life, Toast.LENGTH_SHORT).show();
        }
    }

}