package com.example.android.anglaisapp;



import android.support.v7.app.AppCompatActivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class VocabularyMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.vocabularyactivity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.emotions);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(VocabularyMainActivity.this, EmotionsActivity.class);
                startActivity(numbersIntent);
            }
        });

        //find the View that shows family category
        TextView family= (TextView) findViewById(R.id.family);

        //set a click listener on that View
        family.setOnClickListener(new View.OnClickListener(){
            //the code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View view){
                Intent familyIntent= new Intent(VocabularyMainActivity.this, FamilyMembersActivity.class);
                startActivity(familyIntent);
            }
        });

        //find the View that shows colors category
        TextView colors=(TextView) findViewById(R.id.animals);

        //set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener(){
            //this code will be executed when the colors View is clicked on

            @Override
            public void onClick(View view){
                Intent colorsIntent= new Intent(VocabularyMainActivity.this, AnimalsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView nature=(TextView) findViewById(R.id.nature);

        //set a click listener on that View
        nature.setOnClickListener(new View.OnClickListener(){
            //this code will be executed when the colors View is clicked on

            @Override
            public void onClick(View view){
                Intent natureIntent= new Intent(VocabularyMainActivity.this, NatureActivity.class);
                startActivity(natureIntent);
            }
        });





    }

}