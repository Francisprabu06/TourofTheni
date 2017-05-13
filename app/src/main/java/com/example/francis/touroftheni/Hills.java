package com.example.francis.touroftheni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hills);
    }
    public void backhills(View view){
        Intent third = new Intent(Hills.this,Title.class);
        startActivity(third);
    }
    public void nexthills(View view){
        Intent third = new Intent(Hills.this,Dams.class);
        startActivity(third);
    }
}
