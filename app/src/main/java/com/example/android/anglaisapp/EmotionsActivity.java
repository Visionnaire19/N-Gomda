package com.example.android.anglaisapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EmotionsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener  mCompletionListener = new MediaPlayer.OnCompletionListener(){

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

        final ArrayList<Word> Words = new ArrayList<Word>();

        //elements

        Words.add(new Word("Angry", "Having a strong feeling of being upset or annoyed", "He is angry because I refused to help him ", R.drawable.emotion_angry, R.raw.emotion_angry));
        Words.add(new Word("Anxious", "Afraid or nervous especially about what may happen", "The BEPC results make him anxious ", R.drawable.emotion_anxious, R.raw.emotion_anxious));
        Words.add(new Word("Bored", "Feeling weary and restless because of lack of interest", "Gaetan is bored since the beginning of her explanation", R.drawable.emotion_bored, R.raw.emotion_bored));
        Words.add(new Word("Confident", "Having a feeling or belief that you can do something well", "Hannah is confident for the test because she knows everything", R.drawable.emotion_confident, R.raw.emotion_confident));
        Words.add(new Word("Curious", "Having a desire to learn or know more about something or someone", "Carl is so curious that He wants to see everything", R.drawable.emotion_curious, R.raw.emotion_curious));
        Words.add(new Word("Depressed", "Feeling sad", "Anita is depressed because she got a bad mark in Maths", R.drawable.emotion_depressed, R.raw.emotion_depressed));
        Words.add(new Word("Disappointed", "Feeling sad because something was not good as expected", "Laurent's parents are disappointed because of his new attitude toward them", R.drawable.emotion_disapointed, R.raw.emotion_disappointed));
        Words.add(new Word("Embarrassed", "Feeling bad about something,someone or oneself", "Emma was embarrassed by her child's attitude ", R.drawable.emotion_embarassed, R.raw.emotion_embarrassed));
        Words.add(new Word("Envious", "Feeling or showing desire to have what someone else has", "Lot of persons are envious of Einsten's situation because he succeeded more that anyone else", R.drawable.emotion_envious, R.raw.emotion_envious));
        Words.add(new Word("Excited", "Feeling enthusiasm", "Ursula is excited because of her forthcoming travel in USA", R.drawable.emotion_excited, R.raw.emotion_excited));
        Words.add(new Word("Happy", "Feeling pleasure and enjoyment because of your life, situation...", "The announcement of this good news made everybody happy", R.drawable.emotion_happy, R.raw.emotion_happy));
        Words.add(new Word("Sad", "Joyless, unhappy, feeling affected with unhappiness", "Carine is sad because she lost her preferred doll", R.drawable.emotion_sad, R.raw.emotion_sad));
        Words.add(new Word("Scared", "Afraid of something", "Arnaud is always scared when he is watching horror movies", R.drawable.emotion_scared, R.raw.emotion_scared));
        Words.add(new Word("Sick", "Affected with a disease or illness", "Laure is sick today and cannot come at school", R.drawable.emotion_sick, R.raw.emotion_sick));
        Words.add(new Word("Sleepy", "Tired and ready to fall asleep", "The EPS practice made everyone sleepy", R.drawable.emotion_sleepy, R.raw.emotion_sleepy));
        Words.add(new Word("Surprised", "To be amazed or upset by something that was not expected", "Pauline was surprised that we organized a party for her birthday", R.drawable.emotion_surprised, R.raw.emotion_surprised));
        Words.add(new Word("Suspicious", "Having or showing a feeling that something is wrong", "A policeman has to be suspicious to find the mystery in each investigation", R.drawable.emotion_suspicious, R.raw.emotion_suspicious));
        Words.add(new Word("Upset", "Unhappy, worried", "The students' conduct makes the teacher uspet", R.drawable.emotion_upset, R.raw.emotion_upset));


        WordAdapter wordsAdapter = new WordAdapter(this, Words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = Words.get(position);

                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(EmotionsActivity.this, word.getPronounciationId());
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
