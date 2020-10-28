package com.example.android.anglaisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Vocabulary = findViewById(R.id.button_vocabulary);

        Vocabulary.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, VocabularyMainActivity.class);
                startActivity(familyIntent);
            }
        });

        Button Listening = findViewById(R.id.button_listening);
        Listening.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View view) {
                Intent listeningIntent = new Intent(MainActivity.this, ListeningMainActivity.class);
                startActivity(listeningIntent);
            }
        });

        Button Reading = findViewById(R.id.button_reading);
        Reading.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View view) {
                Intent ReadingIntent = new Intent(MainActivity.this, ReadingMainActivity.class);
                startActivity(ReadingIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_infos:
                Intent InfoIntent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(InfoIntent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);


        }
    }


}
