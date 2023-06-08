package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MoreDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_difficulty);

        final MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);

        correctSound.start();
    }
}