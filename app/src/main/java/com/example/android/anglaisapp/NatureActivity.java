package com.example.android.anglaisapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 03/04/2018.
 */

public class NatureActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
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

        Words.add(new Word("beach", "An area covered with sand or small rocks that is next to an ocean or a lake", "All our family spent the day at the beach", R.drawable.nature_beach, R.raw.nature_beach));
        Words.add(new Word("cloudy", "Having many clouds in the sky", "The weather forecast announced that tomorrow will be cloudy", R.drawable.nature_cloudy_day, R.raw.nature_cloudy ));
        Words.add(new Word("constellation", "A group of stars that forms a particular shape in the sky and has been given a name", "Almost all of the constellations are beautiful", R.drawable.nature_constellation, R.raw.nature_constellation ));
        Words.add(new Word("desert", "Arid land with sparse vegetation", "The Kalahari and the Sahara are deserts", R.drawable.nature_desert, R.raw.nature_desert ));
        Words.add(new Word("fire", "The light and heat and especially the flame produced by burning", "The fire helps humans to cook their food", R.drawable.nature_fire, R.raw.nature_fire ));
        Words.add(new Word("flower", "The part of the plant from which the seed or fruit develops", "Women like receive flowers as a gift", R.drawable.nature_flower, R.raw.nature_flower ));
        Words.add(new Word("island", "A tract of land surrounded by water", "Robinson Crusoe was lost on a island in the book of Daniel Defoe", R.drawable.nature_island, R.raw.nature_island ));
        Words.add(new Word("leaf", "One of the flat and typically green parts that grows from a stem or a twig", "The leaf is one of the most important parts of the plant", R.drawable.nature_leaf, R.raw.nature_leaf ));
        Words.add(new Word("Moon", "The large round object that circles the Earth and that shines at night by reflecting light from the sun", "This powerful telescope permits us to see the moon much clearer", R.drawable.nature_moon, R.raw.nature_moon ));
        Words.add(new Word("mountain", "An area of land that rises very high above the land around it", "The highest mountain in Africa is the Kilimandjaro", R.drawable.nature_mountain, R.raw.nature_mountain ));
        Words.add(new Word("mushroom", "A fungus that is shaped like an umbrella", "Many cultures eat mushrooms", R.drawable.nature_mushroom, R.raw.nature_mushroom ));
        Words.add(new Word("rain",  "water that falls in drops from clouds in the sky", "It is unusual to have rains in January", R.drawable.nature_rain, R.raw.nature_rain));
        Words.add(new Word("snow", "soft, white pieces of frozen water that fall to the ground from the dky in cold weather", "There is no snow in Burkina Faso", R.drawable.nature_snow, R.raw.nature_snow));
        Words.add(new Word("star", "Objects in space that looks like points of light in the night sky", "There are many stars in our galaxy", R.drawable.nature_star, R.raw.nature_star));
        Words.add(new Word("sun", "The star that the Earth moves around and that gives the Earth heat and light", "The sun rises in the East", R.drawable.nature_sun, R.raw.nature_sun ));
        Words.add(new Word("thunderbolt", "A flash of lightning that makes a loud sound and that hits someone or something", "This old man had been hit seven times by the thunderbolt", R.drawable.nature_thunderbolt, R.raw.nature_thunderbolt ));
        Words.add(new Word("tree", "A usually tall plant that has a thick stem and many branches", "Peter has many trees in his house", R.drawable.nature_tree, R.raw.nature_tree ));
        Words.add(new Word("volcano", "A mountain with a hole in the top that sometimes sends out lava in an eruption", "Volcanoes caused many deaths in the World's History", R.drawable.nature_volcano, R.raw.nature_volcano ));
        Words.add(new Word("water", "Clear liquid that has no color, no taste, no smell used for drinking principally", "We need water to live", R.drawable.nature_water, R.raw.nature_water));
        Words.add(new Word("wave", "An area of moving water that is raised above the main surface of an ocean or a lake", "Waves are essential for surfing", R.drawable.nature_wave, R.raw.nature_wave ));
        Words.add(new Word("whirlwind", "A very strong wind that moves in a spinning motion", "Africans often see whirlwinds as mythical phenomena", R.drawable.nature_whirlwind, R.raw.nature_whirlwind ));

        WordAdapter wordsAdapter= new WordAdapter(this, Words);

        ListView listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = Words.get(position);
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(NatureActivity.this, word.getPronounciationId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mOnCompletionListener);

            }
        });
    }

    private void releaseMediaPlayer(){
        if (mMediaPlayer!= null){
            mMediaPlayer.release();
            mMediaPlayer=null;
        }
    }

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange== AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange== AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ){

            }

        }
    };
}

