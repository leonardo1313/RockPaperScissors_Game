package com.optimahorizonapps.rockpaperscissors_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView player_image;
    private ImageView computer_image;
    private Button rock_button;
    private Button paper_button;
    private Button scissors_button;
    private TextView score_text;
    private int player_score = 0;
    private int computer_score = 0;

    private static Random rand = new Random();
    private int computer_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player_image = findViewById(R.id.imageView_player);
        computer_image = findViewById(R.id.imageView_computer);
        rock_button = findViewById(R.id.button1_rock);
        paper_button = findViewById(R.id.button2_paper);
        scissors_button = findViewById(R.id.button3_scissors);
        score_text = findViewById(R.id.textView_score);

        rock_button.setOnClickListener(view -> {
            playerChoiceRock();
        });

        paper_button.setOnClickListener(view -> {
            playerChoicePaper();
        });

        scissors_button.setOnClickListener(view -> {
            playerChoiceScissors();
        });
    }

    public void playerChoiceRock() {
        player_image.setImageResource(R.drawable.rock);
        computer_choice = rand.nextInt(3) + 1;

        if(computer_choice == 1) {
            computer_image.setImageResource(R.drawable.rock);
            Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        } else if(computer_choice == 2) {
            computer_image.setImageResource(R.drawable.paper);
            Toast.makeText(this, "Paper covers rock. Computer wins!", Toast.LENGTH_SHORT).show();
            computer_score++;
        } else {
            computer_image.setImageResource(R.drawable.scissors);
            Toast.makeText(this, "Rock crushes scissors. You winn!", Toast.LENGTH_SHORT).show();
            player_score++;
        }
        score_text.setText("Player " + player_score + " : " + computer_score + " Computer");
    }

    public void playerChoicePaper() {
        player_image.setImageResource(R.drawable.paper);
        computer_choice = rand.nextInt(3) + 1;

        if(computer_choice == 1) {
            computer_image.setImageResource(R.drawable.rock);
            Toast.makeText(this, "Paper covers rock. You winn!", Toast.LENGTH_SHORT).show();
            player_score++;
        } else if(computer_choice == 2) {
            computer_image.setImageResource(R.drawable.paper);
            Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        } else {
            computer_image.setImageResource(R.drawable.scissors);
            Toast.makeText(this, "Scissors cut paper. Computer wins!", Toast.LENGTH_SHORT).show();
            computer_score++;
        }
        score_text.setText("Player " + player_score + " : " + computer_score + " Computer");
    }

    public void playerChoiceScissors() {
        player_image.setImageResource(R.drawable.scissors);
        computer_choice = rand.nextInt(3) + 1;

        if(computer_choice == 1) {
            computer_image.setImageResource(R.drawable.rock);
            Toast.makeText(this, "Rock crushes scissors. Computer wins!", Toast.LENGTH_SHORT).show();
            computer_score++;
        } else if(computer_choice == 2) {
            computer_image.setImageResource(R.drawable.paper);
            Toast.makeText(this, "Scissors cut paper. You winn!", Toast.LENGTH_SHORT).show();
            player_score++;
        } else {
            computer_image.setImageResource(R.drawable.scissors);
            Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        }
        score_text.setText("Player " + player_score + " : " + computer_score + " Computer");
    }
}