package com.hegazy.playersbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bio extends AppCompatActivity {
    private ImageView image ;
    private TextView name, bio;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        extras = getIntent().getExtras();
        name = (TextView) findViewById(R.id.name);
        bio = (TextView) findViewById(R.id.bio);
        image = (ImageView) findViewById(R.id.imageView);

        name.setText(extras.getString("name"));
        bio.setText(extras.getString("bio"));

        if (name.getText().equals("Leo Messi"))
            image.setImageDrawable(getResources().getDrawable(R.drawable.messi));
        else
            image.setImageDrawable(getResources().getDrawable(R.drawable.dejong));

    }
}