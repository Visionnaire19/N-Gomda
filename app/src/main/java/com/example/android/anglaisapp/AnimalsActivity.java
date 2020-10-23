package com.example.android.anglaisapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {
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


  Words.add(new Word("Ant", "", "The ant is a tiny animal ", R.drawable.animal_ant, R.raw.animal_ant));
  Words.add(new Word("Chick", "A baby chicken", "The chick is going out from its mom egg ", R.drawable.animal_babychicken, R.raw.animal_chick));
  Words.add(new Word("Bat", "", "The bat is a nocturnal animal", R.drawable.animal_bat, R.raw.animal_bat));
  Words.add(new Word("Bear", "", "The bear is wandering in the forest, searching honey ", R.drawable.animal_bear, R.raw.animal_bear));
  Words.add(new Word("Bird", "", "The children are hunting birds behind their house", R.drawable.animal_bird, R.raw.animal_bird));
  Words.add(new Word("Boar", "A wild pig", "Professional hunters appreciate the boar as a prey", R.drawable.animal_boar, R.raw.animal_boar));
  Words.add(new Word("Bug", "", "My mom hates seeing bugs in her house", R.drawable.animal_bug, R.raw.animal_bug));
  Words.add(new Word("Butterfly", "An insect that has a long thin body and brightly colored wings ", "Sam is always running after butterflies ", R.drawable.animal_butterfly, R.raw.animal_butterfly));
  Words.add(new Word("Camel", "", "The camel has always been used for travels in hot regions", R.drawable.animal_camel, R.raw.aniaml_camel));
  Words.add(new Word("Cat", "", "Suleiman does not like cats", R.drawable.animal_cat, R.raw.animal_cat));
  Words.add(new Word("Chipmunk", "", "Alvin and the Chipmunks is one of my favorite movie", R.drawable.animal_chipmunk, R.raw.animal_chipmunk));
  Words.add(new Word("Cow", "", "The cow is used for its milk ", R.drawable.animal_cow, R.raw.animal_cow));
  Words.add(new Word("Crab", "", "The crab is a maritime animal", R.drawable.animal_crab, R.raw.animal_crab));
  Words.add(new Word("Cricket", "", "A little cricket made her yell because of fear", R.drawable.animal_cricket, R.raw.animal_cricket));
  Words.add(new Word("Crocodile", "", "You can see crocodiles at Bazoule", R.drawable.animal_crocodile, R.raw.animal_crocodile));
  Words.add(new Word("dog", "Carnivorous mammal", "The dog is human's best friend ", R.drawable.animal_dog, R.raw.animal_dog));
  Words.add(new Word("Dolphin", "A small usually gray whale that has a pointed nose", "Dolphins interact well with humans ", R.drawable.animal_dolphin, R.raw.animal_dolphin));
  Words.add(new Word("Dove", "", "The dove is generally associated with peace", R.drawable.animal_dove, R.raw.animal_dove));
  Words.add(new Word("Duck", "", "Annie's duck can do incredible things ", R.drawable.animal_duck, R.raw.animal_duck));
  Words.add(new Word("Eagle", "", "The eagle a the most majestic predator in the air ", R.drawable.animal_eagle, R.raw.animal_eagle));
  Words.add(new Word("Elephant", "A very large gray animal that has a long, flexible nose and two long tusks", "The elephants in the forest destructed the fields ", R.drawable.animal_elephant, R.raw.animal_elephant));
  Words.add(new Word("Ewe", "A female sheep", "The ewe gave birth to two lambs ", R.drawable.animal_ewe, R.raw.animal_ewe));
  Words.add(new Word("Fish", "An animal that lives in water, breathes with gills and usually has fins and scales", "We went to the river all the day and we got a lot of fishes", R.drawable.animal_fish, R.raw.animal_fish));
  Words.add(new Word("Fox", "", "The fox is usually seen as smart ", R.drawable.animal_fox, R.raw.animal_fox));
  Words.add(new Word("Frog", "", "Frogs live generally in ponds ", R.drawable.animal_frog, R.raw.animal_frog));
  Words.add(new Word("Giraffe", "A very tall African animal that has an extremely long neck and legs", "Peter had liked to see giraffes for the first tme ", R.drawable.animal_giraffe, R.raw.animal_giraffe));
  Words.add(new Word("Goat", "", "The goat is a very stubborn animal ", R.drawable.animal_goat, R.raw.animal_goat));
  Words.add(new Word("Gorilla", "A type of very large ape that has black fur and that comes from Africa", "There is a small number of gorillas in Burkina Faso  ", R.drawable.animal_gorilla, R.raw.animal_gorilla));
  Words.add(new Word("Hamster", "", "Lionel's hamster needs water to survive", R.drawable.animal_hamster, R.raw.animal_hamster));
  Words.add(new Word("Honeybee", "A bee that makes honey", "The honey made by the honeybees is very coveted by humans ", R.drawable.animal_honeybee, R.raw.animal_honeybee));
  Words.add(new Word("Horse", "A large animal used for riding and for carrying and pulling things", "The horse has always been useful to humans ", R.drawable.animal_horse, R.raw.animal_horse));
  Words.add(new Word("Koala", "An Australian animal that ahs thick gray fur, large hairy ears, sharp claws for climbing and no tail", "The koalas can be seen everywhere in the world thanks to zoos ", R.drawable.animal_koala, R.raw.animal_koala));
  Words.add(new Word("Leopard", "A large brownish-yellow cat with black spots", "The leopard is the fastest animal in the world ", R.drawable.animal_leopard, R.raw.animal_leopard));
  Words.add(new Word("Lion", "A large wild cat that has golden brown fur", "Some people pay lions to admire them everyday ", R.drawable.animal_lion, R.raw.animal_lion));
  Words.add(new Word("Lizard", "A type of reptile that has four legs and a long body and tail", "Sophia runs as soon as she sees a lizard ", R.drawable.animal_lizard, R.raw.animal_lizard));
  Words.add(new Word("Monkey", "A type of animal that has a long tail and usually lives in trees", "Monkeys are very similar to humans ", R.drawable.animal_monkey, R.raw.animal_monkey));
  Words.add(new Word("Mouse", "A very small animal that has a pointed nose and a long, thin tail", "In Africa, people usually kill mice when they see them in their houses  ", R.drawable.animal_mouse, R.raw.animal_mouse));
  Words.add(new Word("Octopus", "A sea animal that has a soft body and eight long arms", "Daniel swam with octopuses last summer", R.drawable.animal_octopus, R.raw.animal_octopus));
  Words.add(new Word("Owl", "A bird that usually hunts at night and that has a large head and eyes, a powerful hooked beak and strong claws", "The owl's yelling freaked me out", R.drawable.animal_owl, R.raw.animal_owl));
  Words.add(new Word("Ox", "A bull", "The herd has ten cows and one ox ", R.drawable.animal_ox, R.raw.animal_ox));
  Words.add(new Word("Panda", "A large animal with black and white fur that looks like a bear and eats mostly bamboo shoots", "The pandas are a protected species ", R.drawable.animal_panda, R.raw.animal_panda));
  Words.add(new Word("Penguin", "A black and white bird that cannot fly, that uses its wings for swimming", "Rihanna dreams to see a penguin, just one time in her life ", R.drawable.animal_penguin, R.raw.animal_penguin));
  Words.add(new Word("Pig", "", "The pig is considered as a dirty animal ", R.drawable.animal_pig, R.raw.animal_pig));
  Words.add(new Word("Rabbit", "A small animal that has soft fur and back legs that are longer than its front legs", "Raphael possesses rabbits in his farm", R.drawable.animal_rabbit, R.raw.animal_rabbbit));
  Words.add(new Word("Rhinoceros", "A large, heavy animal that has thick skin and either one or two large horns on its nose", "The rhinoceros pursued all the hunting team ", R.drawable.animal_rhinoceros, R.raw.animal_rhinoceros));
  Words.add(new Word("Rooster", "An adult male chicken", "The rooster wakes up everybody with its crow", R.drawable.animal_rooster, R.raw.animal_rooster));
  Words.add(new Word("Sauropod", "", "The sauropod is a disappeared dinosaur ", R.drawable.animal_sauropod, R.raw.animal_sauropod));
  Words.add(new Word("Scorpion", "A small animal that has two front claws and curved tail with a poisonous stinger at the end", "The scorpion's sting is responsible of many deaths ", R.drawable.animal_scorpion, R.raw.animal_scorpion));
  Words.add(new Word("Shark", "", "Ines doesn't like to watch movies about shark attacks ", R.drawable.animal_shark, R.raw.animal_shark));
  Words.add(new Word("Snail", "A small animal that lives in a shell that it carries on its back, that moves very slowly", "French like to eat snails ", R.drawable.animal_snail, R.raw.animal_snail));
  Words.add(new Word("Snake", "An animal that has a long, thin body and no arms or legs", "He got bitten by a venomous snake ", R.drawable.animal_snake, R.raw.animal_snake));
  Words.add(new Word("Spider", "A small creature that has eight legs and usually creates a web in which it catches insects for food", "A spider bit Spiderman for him to get super powers", R.drawable.animal_spider, R.raw.animal_spider));
  Words.add(new Word("Tiger", "A large, wild cat that has a coat of usually yellow or orange fur and black stripes", "Maurice thinks the tiger is stronger than the lion ", R.drawable.animal_tiger, R.raw.animal_tiger));
  Words.add(new Word("Turkey", "", "The turkey is raised for its meat principally ", R.drawable.animal_turkey, R.raw.animal_turkey));
  Words.add(new Word("Turtle", "", "Turtles can live very old ", R.drawable.animal_turtle, R.raw.animal_turtle));
  Words.add(new Word("Waterbuffalo", "A large animal like a cow with long horns that lives in Asia and often used to pull plows", "Waterbuffalos help in the labor in the fields", R.drawable.animal_waterbuffalo, R.raw.animal_waterbuffalo));
  Words.add(new Word("Whale", "An often very large animal that lives in the ocean and that is a mammal", "The whale is the biggest mammal on earth", R.drawable.animal_whale, R.raw.animal_whale));
  Words.add(new Word("Wolf", "A large animal that is similar to dogs and that often hunts in groups", "The wolves attacked entire herds of sheep in some countries", R.drawable.animal_wolf, R.raw.animal_wolf));
  Words.add(new Word("Zebra", "An animal that looks like a horse and has a black and white stripes covering its body", "Esther finds zebras beautiful ", R.drawable.animal_zebra, R.raw.animal_zebra));


  final WordAdapter wordsAdapter = new WordAdapter(this, Words);

  // Get a reference to the ListView, and attach the adapter to the listView.
  ListView listView = (ListView) findViewById(R.id.list);
  listView.setAdapter(wordsAdapter);

  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
   @Override
   public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
    Word word = Words.get(position);

    releaseMediaPlayer();

    mMediaPlayer = MediaPlayer.create(AnimalsActivity.this, word.getPronounciationId());

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
