package com.example.wala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourth_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
        Intent i3=getIntent();
    }

    public void loadGameNumbers(View view){
        Intent game = new Intent(this, start_game.class);
        startActivity(game);
    }

    public void loadGameColors(View view){
        Intent game = new Intent(this, start_game_2.class);
        startActivity(game);
    }
}
