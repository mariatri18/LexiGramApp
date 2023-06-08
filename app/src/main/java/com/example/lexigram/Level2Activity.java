package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level2Activity extends AppCompatActivity {
    private Button correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        final MediaPlayer skilosSound = MediaPlayer.create(this, R.raw.skilos);
        final  MediaPlayer wrongSound = MediaPlayer.create(this, R.raw.wrong);
        final  MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);

        Button playCat = (Button) this.findViewById(R.id.sound);
        Button playWrong = (Button) this.findViewById(R.id.wrong);
        Button playWrong1 = (Button) this.findViewById(R.id.wrong1);
        Button playWrong2 = (Button) this.findViewById(R.id.wrong3);

        Button playCorrect = (Button) this.findViewById(R.id.correct);

        correct = (Button) findViewById(R.id.correct);


        skilosSound.start();

        playCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skilosSound.start();
            }
        });

        playWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongSound.start();
            }
        });

        playWrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongSound.start();
            }
        });

        playWrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongSound.start();
            }
        });

        playCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctSound.start();
            }

        });

        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLevel();
            }
        });
    }

    public void openActivityLevel() {
        Intent intent = new Intent(this, Level2Activity.class);
        startActivity(intent);
    }


}