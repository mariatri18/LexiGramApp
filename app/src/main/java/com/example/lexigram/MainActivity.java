package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSettings;
    private Button buttonLevel1;
    private Button buttonLevels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSettings = (Button) findViewById(R.id.buttonSettings);
        buttonLevel1 = (Button) findViewById(R.id.buttonNewGame);
        buttonLevels = (Button) findViewById(R.id.buttonLevels);


        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySettings();
            }
        });

        buttonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLevel1Activity();
            }
        });

        buttonLevels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLevelsActivity();
            }
        });


    }

    public void openActivitySettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openLevel1Activity() {
        Intent intent = new Intent(this, Level1Activity.class);
        startActivity(intent);
    }

    public void openLevelsActivity() {
        Intent intent = new Intent(this, LevelsActivity.class);
        startActivity(intent);
    }

}