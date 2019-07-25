package com.example.wala;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class start_game_2 extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game_2);
        Intent game=getIntent();

        createRandomColor();
    }

    public void createRandomColor() {

        Random rnd = new Random();                //initialize the random class

        int[] numbers = {R.raw.red, R.raw.green, R.raw.black, R.raw.white, R.raw.blue, R.raw.pink, R.raw.yellow};
        int[] colors = {Color.RED, Color.GREEN, Color.BLACK, Color.WHITE, Color.BLUE, Color.MAGENTA, Color.YELLOW};

        //Generate the first random number to speak out
        int number = rnd.nextInt(7) + 0;

        //Play the sound
        MediaPlayer nmbr = MediaPlayer.create(this, numbers[number]);
        nmbr.start();

        // generate 2 random numbers
        int number2 = rnd.nextInt(7) + 0;
        while (number2 == number) {
            number2 = rnd.nextInt(7) + 0;
        }

        int number3 = rnd.nextInt(7) + 0;
        while (number3 == number || number3 == number2) {
            number3 = rnd.nextInt(7) + 0;
        }

        //Assign the question number to the Question text box
        TextView question = (TextView) findViewById(R.id.question);
        question.setText(Integer.toString(number));

        //Store the 3 random numbers in an array to assign them
        int[] arr = {number, number2, number3};

        //generate a random position for first button
        int pos = rnd.nextInt(3);
        Button Ans1 = (Button) findViewById(R.id.Ans1);
        Ans1.setText(Integer.toString(arr[pos]));
        Ans1.setTextColor(colors[arr[pos]]);
        Ans1.setBackgroundColor(colors[arr[pos]]);

        //generate a random position for second button
        int pos2 = rnd.nextInt(3);
        while (pos2 == pos) {
            pos2 = rnd.nextInt(3);
        }
        Button Ans2 = (Button) findViewById(R.id.Ans2);
        Ans2.setText(Integer.toString(arr[pos2]));
        Ans2.setTextColor(colors[arr[pos2]]);
        Ans2.setBackgroundColor(colors[arr[pos2]]);

        //generate a random position for third button
        int pos3 = rnd.nextInt(3);
        while (pos3 == pos || pos3 == pos2) {
            pos3 = rnd.nextInt(3);
        }
        Button Ans3 = (Button) findViewById(R.id.Ans3);
        Ans3.setText(Integer.toString(arr[pos3]));
        Ans3.setTextColor(colors[arr[pos3]]);
        Ans3.setBackgroundColor(colors[arr[pos3]]);
    }

    // Method to increase or decrease the score when the user plays the game
    public void onClickAns(View view) {
        TextView question = (TextView) findViewById(R.id.question);
        Button Ans = (Button) findViewById(view.getId());
        if (Ans.getText().equals(question.getText())) {
            score++;
        }

        TextView text = (TextView) findViewById(R.id.points);
        text.setText("Points: " + score);


        if (score < 10) {
            createRandomColor();
        }
        else if(score==10){
            displayCongratulations(view);
        }

    }

    public void displayCongratulations(View view){
        Intent congrats = new Intent(this, congrats.class);
        startActivity(congrats);
    }
}

