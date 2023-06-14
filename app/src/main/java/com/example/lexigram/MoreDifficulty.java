package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreDifficulty extends AppCompatActivity {
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_difficulty);

        final MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);

        button = (Button) findViewById(R.id.button2);

        correctSound.start();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivityLevel();
            }
        });
    }

    public void openActivityLevel() {
        Intent intent = new Intent(this, Level6Activity.class);
        startActivity(intent);
    }
}