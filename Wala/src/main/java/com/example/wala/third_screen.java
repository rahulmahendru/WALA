package com.example.wala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class third_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        Intent i2=getIntent();
    }



    public void displayFourthScreen(View view){
        Intent i3=new Intent(this, fourth_screen.class);
        startActivity(i3);
    }
}
