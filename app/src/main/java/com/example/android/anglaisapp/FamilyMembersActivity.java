package com.example.android.anglaisapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        final ArrayList<Word> Words = new ArrayList<Word>();

        //elements

        Words.add(new Word("Boy", "A male child", "The boy is running", R.drawable.family_boy, R.raw.family_boy));//you will need to put each image in the right folder
        Words.add(new Word("Girl", "A female child ", "This girl right there is beautiful", R.drawable.family_girl, R.raw.family_girl));
        Words.add(new Word("Man", "An adult male human being ", "This man looks like Justin Bieber", R.drawable.family_man, R.raw.family_man));
        Words.add(new Word("Woman", "A female adult human being ", "The woman who is coming is part of my family", R.drawable.family_woman, R.raw.family_woman));
        Words.add(new Word("Husband", "A married man ", "Her husband is nice", R.drawable.family_husbandwife, R.raw.family_husband));
        Words.add(new Word("Parent", "A person who is a father or mother ", "His parents like all his friends", R.drawable.family_fathermother, R.raw.family_parent));
        Words.add(new Word("Baby", "A very young child ", "Diane's baby is very handsome", R.drawable.family_baby, R.raw.family_baby));
        Words.add(new Word("Grandmother", "The mother of your father or mother ", " My grandmother is 100 years old", R.drawable.family_grandmother, R.raw.family_grandmother));
        Words.add(new Word("grandfather", "The father of your father or mother ", "My grandfather still work as a farmer ", R.drawable.family_grandfather, R.raw.family_grandfather));
        Words.add(new Word("Son", "A male offspring especially of human parents ", "Kevin' son decided to join the army", R.drawable.family_son, R.raw.family_son));
        Words.add(new Word("Daughter", "A female offspring especially of human parents ", "The person who has this girl as daughter is very lucky", R.drawable.family_daughter, R.raw.family_daughter));
        Words.add(new Word("Sister", "A girl or woman who has one or both the same parents as you ", "Christian's sister lives in USA", R.drawable.family_sisters, R.raw.family_sister));
        Words.add(new Word("Brother", "A boy or man who has one or both of the same parents as you ", "My brother has a great influence upon the persons who knows him", R.drawable.family_brothers, R.raw.family_brother));
        Words.add(new Word("Aunt", "The sister of your father or mother or the wife of your uncle ", "Today, I encountered a aunt who I didn't know", R.drawable.family_aunt, R.raw.family_aunt));
        Words.add(new Word("Uncle", "The brother of your father or mother or the wife of your aunt ", "I like when my uncle is home because He always gives me money", R.drawable.family_uncle, R.raw.family_uncle));

      /*  Words.add(new Word("Sept","Seven"));
        Words.add(new Word("Huit","Eight"));
        Words.add(new Word("Neuf","Nine"));
        Words.add(new Word("Dix","Ten"));*/

        WordAdapter wordsAdapter = new WordAdapter(this, Words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = Words.get(position);

                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this, word.getPronounciationId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;


        }
        AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
            @Override
            public void onAudioFocusChange(int focusChange) {

                if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT||

                focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){

                }
            }
        };



    }
}
