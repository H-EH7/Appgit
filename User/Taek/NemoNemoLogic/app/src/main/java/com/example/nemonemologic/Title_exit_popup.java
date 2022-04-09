package com.example.nemonemologic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Title_exit_popup extends Activity {

    //버튼 선언
    Button yesButton;
    Button noButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.title_exit_popup);


        //yes 버튼 동작
        yesButton = (Button) findViewById(R.id.yes_button);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Title.class);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        //no 버튼 동작
        noButton = (Button) findViewById(R.id.no_button);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Title.class);
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });

    }

    /*바깥레이어 클릭시 안닫히게
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()== MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }
    */
}
