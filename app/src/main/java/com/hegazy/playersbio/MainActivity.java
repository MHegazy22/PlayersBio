package com.hegazy.playersbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView firstImage ,
                      secondImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstImage = (ImageView) findViewById(R.id.firstImage);
        secondImage = (ImageView) findViewById(R.id.secondImage);

        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bio = new Intent(MainActivity.this,Bio.class);
                bio.putExtra("name", "Leo Messi");
                bio.putExtra("bio", "The Best Player In The World");
                startActivity(bio);
            }
        });

        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bio = new Intent(MainActivity.this,Bio.class);
                bio.putExtra("name", "DE Jong");
                bio.putExtra("bio", "Barcelona  Player");
                startActivity(bio);
            }
        });
    }
}