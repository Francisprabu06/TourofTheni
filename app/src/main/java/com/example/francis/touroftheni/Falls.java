package com.example.francis.touroftheni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Falls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falls);
    }
    public void backfalls(View view){
        Intent five = new Intent(Falls.this,Title.class);
        startActivity(five);
    }

}
