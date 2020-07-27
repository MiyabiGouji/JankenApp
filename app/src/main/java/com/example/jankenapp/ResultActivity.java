package com.example.jankenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ResultActivity extends AppCompatActivity {

    int GU = 0;
    int CHOKI = 1;
    int PA = 2;
    int myHand = 0;
    int comHand = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent intent = this.getIntent();
        int myHand = intent.getIntExtra("MY_HAND", 0);
        int charId = intent.getIntExtra("CHAR_ID", 0);

        switch (myHand) {
            case R.id.guImage:
                myHand = GU;
                break;
            case R.id.chokiImage:
                myHand = CHOKI;
                break;
            case R.id.paImage:
                myHand = PA;
                break;
        }
        Log.d("ResultActivity", String.valueOf(myHand));
        Log.d("ResultActivity", String.valueOf(charId));
        // computerの手を決める.
        comHand = computerHand();
        // Log.d("JankenActivity", selected_character_id);
    }

    private int computerHand() {
        return 0;
    }
}
