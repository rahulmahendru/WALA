package com.example.wala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sec_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_screen);
        Intent intent=getIntent();
    }



    public void displayThirdScreen(View view){
        Intent i2=new Intent(this, third_screen.class);
        startActivity(i2);
    }
}
