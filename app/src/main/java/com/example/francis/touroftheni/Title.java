package com.example.francis.touroftheni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void temple(View view){
        Intent second = new Intent(getApplicationContext(),Templetot.class);
        startActivity(second);
    }
    public void hill(View view){
        Intent third = new Intent(getApplicationContext(),Hills.class);
        startActivity(third);
    }
    public void dam (View view) {
        Intent four = new Intent(getApplicationContext(), Dams.class);
        startActivity(four);
    }
    public void fall(View view) {
        Intent five = new Intent(getApplicationContext(), Falls.class);
        startActivity(five);
    }
}
