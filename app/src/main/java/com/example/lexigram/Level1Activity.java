package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        final  MediaPlayer catSound = MediaPlayer.create(this, R.raw.gata);
        Button playCat = (Button) this.findViewById(R.id.cat);

        playCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catSound.start();
            }
        });

    }
}