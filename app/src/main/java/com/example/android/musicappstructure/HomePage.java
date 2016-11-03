package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Find the View that shows the numbers category
        TextView myMusic = (TextView) findViewById(R.id.my_music);

        // Set a click listener on that View
        myMusic.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(HomePage.this, MyMusic.class);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }

    

}
