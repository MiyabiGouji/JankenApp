package com.example.jankenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.jankenapp.R;

public class JankenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janken);

        Intent intent = this.getIntent();
        String selected_character = intent.getStringExtra("selectedCharacter");
        if(selected_character != null){
            Log.d("JankenActivity", selected_character);
        } else{
            Log.d("JankenActivity", "ぬるぽ");
        }
    }
}