package com.optimahorizonapps.rockpaperscissors_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView player_image;
    private ImageView computer_image;
    private Button rock_button;
    private Button paper_button;
    private Button scissors_button;
    private int player_score = 0;
    private int computer_score = 0;

    private Random rand = new Random();
    private int computer_choice = rand.nextInt(3) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player_image = findViewById(R.id.imageView_player);
        computer_image = findViewById(R.id.imageView_computer);
        rock_button = findViewById(R.id.button1_rock);
        paper_button = findViewById(R.id.button2_paper);
        scissors_button = findViewById(R.id.button3_scissors);

        rock_button.setOnClickListener(view -> {
                player_image.setImageResource(R.drawable.rock);

                if(computer_choice == 1) {
                    computer_image.setImageResource(R.drawable.rock);
                } else if(computer_choice == 2) {
                    computer_image.setImageResource(R.drawable.paper);
                } else {
                    computer_image.setImageResource(R.drawable.scissors);
                }
        });

        paper_button.setOnClickListener(view -> {
            player_image.setImageResource(R.drawable.paper);

            if(computer_choice == 1) {
                computer_image.setImageResource(R.drawable.rock);
            } else if(computer_choice == 2) {
                computer_image.setImageResource(R.drawable.paper);
            } else {
                computer_image.setImageResource(R.drawable.scissors);
            }
        });

        scissors_button.setOnClickListener(view -> {
            player_image.setImageResource(R.drawable.scissors);

            if(computer_choice == 1) {
                computer_image.setImageResource(R.drawable.rock);
            } else if(computer_choice == 2) {
                computer_image.setImageResource(R.drawable.paper);
            } else {
                computer_image.setImageResource(R.drawable.scissors);
            }

        });
    }
}