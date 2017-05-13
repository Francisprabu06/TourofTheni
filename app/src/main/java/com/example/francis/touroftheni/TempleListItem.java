package com.example.francis.touroftheni;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TempleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.temple_list_item);

        TextView txttemple = (TextView) findViewById(R.id.temple_label);
        ImageView img= (ImageView)findViewById(R.id.imageView);
        Intent i = getIntent();
        // getting attached intent data
        String temple = i.getStringExtra("temple");

        // displaying selected temple name
        txttemple.setText(temple);

    }
}