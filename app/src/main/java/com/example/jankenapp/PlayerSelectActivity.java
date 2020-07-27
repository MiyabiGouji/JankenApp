package com.example.jankenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayerSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_select);

        final ImageButton boy_button = findViewById(R.id.boyButton);
        final ImageButton girl_button = findViewById(R.id.girlButton);
        final ImageButton man_button = findViewById(R.id.manButton);

        boy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onSelectCharacter(view);
            }
        });

        girl_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSelectCharacter(view);
            }
        });

        man_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSelectCharacter(view);
            }
        });
    }

    private void onSelectCharacter(View view){
        Intent intent = new Intent(this, JankenActivity.class);
        intent.putExtra("CHAR_ID", view.getId());

        startActivity(intent);
    }


}