package com.example.francis.touroftheni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dams);
    }

    public void backdams(View view){
    Intent four = new Intent(Dams.this,Title.class);
        startActivity(four);
    }
    public void nextdams(View view){
        Intent five = new Intent(Dams.this,Falls.class);
        startActivity(five);
    }
}
