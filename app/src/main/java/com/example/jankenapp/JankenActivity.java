package com.example.jankenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.jankenapp.R;

public class JankenActivity extends AppCompatActivity {
    int GIRL = 0;
    int BOY = 1;
    int MAN = 2;

    int selectedCharId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janken);

        Intent intent = this.getIntent();
        int charId = intent.getIntExtra("CHAR_ID", 0);

        switch (charId) {
            case R.id.girlButton:
                selectedCharId = GIRL;
                break;
            case R.id.boyButton:
                selectedCharId = BOY;
                break;
            case R.id.manButton:
                selectedCharId = MAN;
                break;
        }


        ImageButton gu = findViewById(R.id.guImage);
        ImageButton choki = findViewById(R.id.chokiImage);
        ImageButton pa = findViewById(R.id.paImage);

        gu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onSelectMyHand(selectedCharId, view);
            }
        });
        choki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onSelectMyHand(selectedCharId, view);
            }
        });
        pa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onSelectMyHand(selectedCharId, view);
            }
        });
    }

    private void onSelectMyHand(int selectedCharId, View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("CHAR_ID", selectedCharId);
        intent.putExtra("MY_HAND", view.getId());
        startActivity(intent);
    }
}