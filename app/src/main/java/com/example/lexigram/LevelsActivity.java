package com.example.lexigram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelsActivity extends AppCompatActivity {
    private Button animals;
    private Button fruits;
    private Button comingSoon;
    private Button comingSoon2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        animals = (Button) findViewById(R.id.animals);
        fruits = (Button) findViewById(R.id.fruits);
        comingSoon = (Button) findViewById(R.id.comingSoon1);
        comingSoon2 = (Button) findViewById(R.id.comingSoon2);

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAnimals();
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                οopenActivityFruits();
            }
        });

        comingSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComingSoon();
            }
        });

        comingSoon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComingSoon();
            }
        });


    }

    private void openComingSoon() {
        Intent intent = new Intent(this, ComingSoon.class);
        startActivity(intent);
    }

    private void οopenActivityFruits() {
        Intent intent = new Intent(this, Level6Activity.class);
        startActivity(intent);
    }

    private void openActivityAnimals() {
        Intent intent = new Intent(this, Level1Activity.class);
        startActivity(intent);
    }
}