package com.example.wala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class congrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats);
        Intent congrats=getIntent();
    }

    public void restart(View view){
        Intent res = new Intent(this, MainActivity.class);
        startActivity(res);
    }
}
