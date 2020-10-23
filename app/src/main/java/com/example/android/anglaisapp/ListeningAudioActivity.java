package com.example.android.anglaisapp;


import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;


public class ListeningAudioActivity extends ListeningMainActivity {

    //Variables for MediaPlayer functionality
    Button playBtn;
    SeekBar positionBar;
    SeekBar volumeBar;
    TextView elapsedTimeLabel;
    TextView remaingTimeLabel;
    MediaPlayer mp;
    int Totaltime;
    //Variable for that  returns a value when the user click on an audio button. For example button 1 will give
    // a value of one
    int pressedButtonNumber;
    //Audio name
    TextView AudioName;
    //Variables for the scoring functionality
    TextView ScoreTextview;
    int Totalpoints;
    int point1 = 0;
    int point2 = 0;
    int point3 = 0;
    int point4 = 0;
    int point5 = 0;
    //Radiogroup Variables. They are part of the scoring functionality
    RadioGroup radiogroup1;
    RadioGroup radiogroup2;
    RadioGroup radiogroup3;
    RadioGroup radiogroup4;
    RadioGroup radiogroup5;

    /** Handles audio focus when playing a sound file */

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listening_activity_audio);


        //create arrow to go back in title bar.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        playBtn = findViewById(R.id.playBtn);
        elapsedTimeLabel = findViewById(R.id.elapsedTimeLabel);
        remaingTimeLabel = findViewById(R.id.remainingTimeLabel);

        //Accessing questions
        TextView question1 = findViewById(R.id.question1);
        TextView question2 = findViewById(R.id.question2);
        TextView question3 = findViewById(R.id.question3);
        TextView question4 = findViewById(R.id.question4);
        TextView question5 = findViewById(R.id.question5);
        //Accessing answer choices
        //question1
        radiogroup1 = findViewById(R.id.radiogroup1);
        RadioButton question1_choice1 = findViewById(R.id.question1_choice1);
        RadioButton question1_choice2 = findViewById(R.id.question1_choice2);
        RadioButton question1_choice3 = findViewById(R.id.question1_choice3);
        //question2
        radiogroup2 = findViewById(R.id.radiogroup2);
        RadioButton question2_choice1 = findViewById(R.id.question2_choice1);
        RadioButton question2_choice2 = findViewById(R.id.question2_choice2);
        RadioButton question2_choice3 = findViewById(R.id.question2_choice3);
        //question3
        radiogroup3 = findViewById(R.id.radiogroup3);
        RadioButton question3_choice1 = findViewById(R.id.question3_choice1);
        RadioButton question3_choice2 = findViewById(R.id.question3_choice2);
        RadioButton question3_choice3 = findViewById(R.id.question3_choice3);
        //question4
        radiogroup4 = findViewById(R.id.radiogroup4);
        RadioButton question4_choice1 = findViewById(R.id.question4_choice1);
        RadioButton question4_choice2 = findViewById(R.id.question4_choice2);
        RadioButton question4_choice3 = findViewById(R.id.question4_choice3);
        //question5
        radiogroup5 = findViewById(R.id.radiogroup5);
        RadioButton question5_choice1 = findViewById(R.id.question5_choice1);
        RadioButton question5_choice2 = findViewById(R.id.question5_choice2);
        RadioButton question5_choice3 = findViewById(R.id.question5_choice3);


        pressedButtonNumber = getIntent().getExtras().getInt("buttonNumber");

        //Different arrays to stock DATA
        int[] myMusic = {R.raw.actingschoolandmoviestars, R.raw.apartmentforrent, R.raw.bookshoreshopping, R.raw.campingunderthestars, R.raw.classreunion, R.raw.dailyschedule, R.raw.dvdmovierental, R.raw.funday, R.raw.familyactivities, R.raw.familyrelationships, R.raw.heavenlypiesrestaurant, R.raw.homestayintheusa, R.raw.hotelreservation, R.raw.immigrationandcustoms, R.raw.meetingsingles, R.raw.partyinvitations, R.raw.picnicpreparations, R.raw.restaurantorder, R.raw.saturdaychores, R.raw.shoppingfortheday};
        String[] Audio_names = {"Acting School and Movie Stars", "Apartments for Rent", "Bookstore shopping", "Camping Under the Stars", "Class Reunion", "Daily schedule", "DVD Movie Rentals", "A Fun Day", "Family Activities", "Family Relationships", "Heavenly Pies Restaurant", "Home Stay in the USA", "Hotel Reservation", "Immigrations and Customs", "Meeting Singles", "Party Invitations", "Picnic Preparations", "Restaurant Order", "Saturday's Chores", "Shopping for the Day"};

        String[][] Questions = {
                {"What is the name of the actress?", "Where is she from?", "Where did she work part-time while she was going to school", "How old is the actress?", "What is the woman's hobby?"},
                {"What is the main topic of the conversation?", "Why doesn't Ann like her current apartment?", "How much money does Ann want to pay for rent?", "What kind of place is she looking for?", "How is Roger going to help her?"},
                {"What did the young man buy at the bookstore?", "The son says he carries two smart phones because", "What else does the son have with him?", "How did he pay for everything?", "About when does the conversation take place?"},
                {"What are they planning on doing in the morning", "According to the weather report, when would it start raining?", "What did Paul forget to bring?", "Where did Sara leave the playing cards?", "What do they finally decide to do?"},
                {"What is the woman's name?", "Where is the reunion going to be held?", "The reunion starts at", "How much do two tickets cost for the reunion?", "Why does James feel uncomfortable about attending the reunion?"},
                {"What time does the man get up?", "What time does he get to work?", "What does he do with his family around 6:30 p.m.?", "What do the man and his wife do after the kids go to bed?", "What is one thing the man does NOT say about his wife?"},
                {"Action:", "Comedies:", "Horror:", "Love:", "Foreign:"},
                {"Where does the young girl want to go with her father?", "Who are they going with?", "Based on the conversation, what time will they most likely leave?", "What does the girl want to do later?", "What does the father suggest they do at the end of the day?"},
                {"In addition to paper books, what did the little girl make with paper at school ?,", "What thing did she NOT talk about when making the object in Question 1?", "What did the girl do after school?", "Who did she meet and play with at the junior high school?", "Where does this conversation most probably take place?"},
                {"Where is Pancho from?", "How many brothers and sisters does Pancho have?", "What is his father's job?", "What does his mother do?", "Which thing does Pancho NOT say?"},
                {"What does the man order?", "What does he eat with his meal?", "What does he have to drink?", "What kind of dressing does he ask for?", "Why is the restaurant not serving pies today?"},
                {"James wants to live with a homestay family because he can", "How many children does the homestay family have?", "What kinds of animals does the family have?", "What is Randall like? (his personality)", "Why is Randall asleep on the couch?"},
                {"The man makes a reservation finally for which day?", "What kind of room does the man prefer?", "Why doesn't he want to reserve the suite?", "Including tax, how much is the man's room?", "How do you spell the man's name?"},
                {"What is the purpose of the woman's visit?", "Where will the woman stay during her trip?", "About how long will the woman be in the country?", "What things are in the woman's luggage?", "What other piece of information do we learn about the woman?"},
                {"Where did Doug and Diane first meet?", "How did he know where she lived?", "Where does Doug invite her to go with him on Thursday?", "What is Diane's response to his invitation on Thursday?", "How does Diane feel about Doug's idea for Friday?"},
                {"Gregorio is well known for his ability to work with", "What is one thing that is NOT true about him?", "What does Georgina do for a living?", "Georgina is a ____________ woman wearing a yellow dress", "What is the other invited guest, Brad Pitt, doing in the conversation?"},
                {"When is the picnic?", "Where is the picnic being held?", "How many packages of hot dogs do they decide to buy?", "Why has Kathy been so busy lately?", "What does Dave suggest Scott make for the picnic dessert?"},
                {"How many cheeseburgers does the man order?", "The man is ordering food for a ___________ team.", "The man asks for _______ orders of fries.", "He also orders 40 ___________ shakes.", "The total comes to ________."},
                {"What does the boy want to do at the beginning of the conversation?", "What is one thing the boy is NOT assigned to do around the house?", "What does the boy have to do in his bedroom?", "What is the father going to do while the boy is doing his household chores?", "Where will the father and son go after the housework is done?"},
                {"What is the girl shopping for?", "How much is the black wallet?", "Why doesn't the girl like the brown wallet?", "About how much does the girl have to spend?", "What does the girl decide to buy?"},
        };

        String[][] Questions_choices = {
                {"Sarah Reynolds", "Sarah Rogers", "Sarah Roberts", "She is from Miami.", "She was born in New York.", "She comes from Los Angeles.", "at a restaurant", "at a movie theater", "at a supermarket", "20", "22", "24", "shopping", "cooking", "reading"},
                {"problems with living in an apartment", "a search for a new apartment", "the cost of rent near universities", "It's too expensive.", "The neighborhood is noisy", "It's located some distance from school.", "no more than $200", "around $200", "a little more than $200", "somewhere that is within a short driving distance of campus", "an apartment with furniture already in it", "a place where she can live alone", "He is planning on calling a friend who owns an apartment building.", "He will check the newspapers to see if he can find an apartment for rent.", "He is going to visit an apartment building near his place."},
                {"notebooks, pencils, and one eraser", "three books, pens, and an eraser", "some paper, five pencils, and an eraser", "one of them doesn't work very well", "his iPhone is broken", "he stays in touch with different people", "a jacket", "suntan lotion", "food", "in cash", "with a credit card", "by check", "in January", "in March", "in June"},
                {"fishing", "mountain biking", "hiking", "in the afternoon", "at night", " in the morning", "rain coats", "umbrellas", "rain boots", "next to picnic table", "on picnic table", "under picnic table", "stay at a hotel", "return home", "sleep at the campground"},
                {"Her name is Ashley.", "The woman's name is Amber.", "It's Amanda.", "Mountain Country Club", "Meadow Country Club", "Mesa Country Club", "6:00", "6:15", "6:30", "They cost $20.", "The price is $30.", "The total comes to $40.", "James wasn't very good on the football team, and people remember this.", "James was rejected by a girl in high school, and he is unsure about seeing her again", "James doesn't know how to dance very well, and he is embarrassed about this."},
                {"at 5:00 a.m.", "at 6:00 a.m.", "at 7:00 a.m.", "at 7:00 a.m.", "at 8:00 a.m.", "at 9:00 a.m.", "They read books together.", "They play games.", "They eat dinner.", "They watch TV.", "They clean the house.", "They listen to music.", "She has to take their children to school.", "She helps the kids with their homework.", "She goes shopping for food."},
                {"like", "dislike", "uncertain", "like", "dislike", "uncertain", "like", "dislike", "uncertain", "like", "dislike", "uncertain", "like", "dislike", "uncertain"},
                {"to the park", "to the movies", "to the swimming pool", "the girl's mother", "the girl's best friend", "the girl's older brother", "9:30 AM", "12:45 PM", "2:00 PM", "She wants to walk to the ice cream store.", "She wants to swim at the park.", "She wants to go down to the beach.", "go to a restaurant", "watch a fireworks display", "play a board game"},
                {"an animal", "a person", "a building", "paper", "glue", "scissors", "She rode her bicycle.", "She watched television.", "She went to the store.", "her teacher", "her cousins", "her father", "at a house", "at a school", "at a park"},
                {"Paraguay", "Peru", "Portugal", "11", "12", "13", "taxi driver", "dentist", "police officer", "She owns a beauty salon.", "She runs a small family store.", "She works at a bread shop.", "His brothers and sisters help his mom.", "His mom sells food like eggs and sugar.", "His mother enjoys her job very much."},
                {"T-bone steak", "chicken fried steak", "broiled chicken", "fries", "bread", "rice", "small juice", "medium juice", "large juice", "French", "Italian", "ranch", "The baker was hurt at work and can't prepare them.", "The oven is broken and hasn't been repaired.", "The restaurant has decided to only sell ice cream."},
                {"save money for college", "learn more of the language", "live close to school", "eleven", "twelve", "thirteen", "The family has dogs, cats, birds, and a snake.", "The family owns a dog, some cats, a rabbit, and a hamster.", "The family has some cats, dogs, a snake, and a rabbit.", "He's outgoing and friendly.", "He's reliable and honest", "He's organized and hardworking.", "He worked very late at his job at the video store.", "He played video games all night.", "He studied until 4:00 a.m. in the morning."},
                {"March 20th", "March 21st", "March 22nd", "a non-smoking room", "a smoking room", "either one is okay", "It doesn't have a nice view.", "It doesn't come with a sauna bath.", "It's too expensive.", "80 dollars", "88 dollars", "96 dollars", "Maxner", "Maexner", "Mexner"},
                {"business", "pleasure", "business and pleasure", "at a friend's home", "at a hotel", "at a university dormitory", "one or two days", "three or four days", "more than  four days", "clothing,computer, and books", "CD player,clothing, and books", "books,gifts, and computer", "Her parents are on the same trip.", "She enjoys traveling to different countries.", "She was born in that country."},
                {"at school", "at a restaurant", "at a party", "He asked a friend for directions.", " He followed her home.", "He looked her up in the phone book.", "to a restaurant", "to a theater", "to a dance", "She can't go out because she has to study.", "She is sorry, but she has another date.", "She has to work that day, so she can't go.", "She thinks if would be a great idea if she had the time.", "She feels that it would be uninteresting outing.", "She has done the activity before, so she'd rather not go."},
                {"famous athletes", "animals", "world dancers", "He's tall.", "He's wearing green slacks", "He has on a blue jacket.", "She's a popular sports figure.", "She's famous for her cooking skills.", "She makes a living selling tennis shoes.", "large", "heavy", "small", "He's sitting in the room.", "He's standing by a table.", "He's eating some refreshments."},
                {"on Thursday", "on Friday", "on Saturday", "at a park", "at Dave's house", "by a river", "six", "seven", "eight", "She has been working a lot recently.", "She has been taking care of her sick mother.", "She has been taking two night classes.", "cherry pie", "chocolate cake", "oatmeal cookies"},
                {"18", "48", "80", "basketball", "soccer", "tennis", "40", "50", "60", "chocolate", "strawberry", "vanilla", "$290.13", "$219.13", "$290.30"},
                {"go play outside", "watch TV", "play video games", "clean the garage", "vacuum the floors", "wash the walls", "put away his books", "make his bed", "pick up his dirty clothes", "wash the car", "paint the house", "work in the yard", "to a movie", "out to eat", "to a ball game"},
                {"a present for her mother", "a present for a friend", "a present for her father", "$49.95", "$40.95", "$44.95", "There isn't a place to put pictures.", "It's too big and heavy.", "She doesn't like the color.", "$5.00", "$10.00", "$13.00", "a black wallet", "a brown belt", "a tie"},
        };
        //Make sure to put the right choice for a given question then put th two others choices next to each other: ex: questionc3,question2c1,question2c3
        //means that question1c3 is right(+25 onclick) and c1 and c3 are wrong (0 onclick)

        //But this will be a lot of Onclicklistener(15!!!) See other ways to handle that problem.
        RadioButton[][] Right_choices = {
                {question1_choice3, question2_choice1, question3_choice2, question4_choice1, question5_choice1},
                {question1_choice2, question2_choice3, question3_choice1, question4_choice2, question5_choice3},
                {question1_choice1, question2_choice3, question3_choice3, question4_choice2, question5_choice1},
                {question1_choice3, question2_choice2, question3_choice1, question4_choice1, question5_choice3},
                {question1_choice3, question2_choice1, question3_choice1, question4_choice3, question5_choice2},
                {question1_choice1, question2_choice2, question3_choice3, question4_choice1, question5_choice2},
                {question1_choice2, question2_choice1, question3_choice2, question4_choice2, question5_choice2},
                {question1_choice2, question2_choice1, question3_choice3, question4_choice3, question5_choice1},
                {question1_choice1, question2_choice3, question3_choice1, question4_choice2, question5_choice1},
                {question1_choice2, question2_choice3, question3_choice1, question4_choice2, question5_choice3},
                {question1_choice2, question2_choice3, question3_choice1, question4_choice3, question5_choice1},
                {question1_choice2, question2_choice3, question3_choice3, question4_choice1, question5_choice2},
                {question1_choice2, question2_choice1, question3_choice3, question4_choice2, question5_choice2},
                {question1_choice3, question2_choice2, question3_choice3, question4_choice2, question5_choice3},
                {question1_choice3, question2_choice1, question3_choice2, question4_choice3, question5_choice2},
                {question1_choice2, question2_choice3, question3_choice1, question4_choice3, question5_choice1},
                {question1_choice3, question2_choice3, question3_choice2, question4_choice1, question5_choice3},
                {question1_choice3, question2_choice2, question3_choice3, question4_choice1, question5_choice1},
                {question1_choice1, question2_choice1, question3_choice2, question4_choice3, question5_choice2},
                {question1_choice3, question2_choice2, question3_choice1, question4_choice2, question5_choice3},
        };

        AudioName = findViewById(R.id.textview_audioname);
        AudioName.setText(Audio_names[pressedButtonNumber]);
        question1.setText(Questions[pressedButtonNumber][0]);
        question2.setText(Questions[pressedButtonNumber][1]);
        question3.setText(Questions[pressedButtonNumber][2]);
        question4.setText(Questions[pressedButtonNumber][3]);
        question5.setText(Questions[pressedButtonNumber][4]);

        question1_choice1.setText(Questions_choices[pressedButtonNumber][0]);
        question1_choice2.setText(Questions_choices[pressedButtonNumber][1]);
        question1_choice3.setText(Questions_choices[pressedButtonNumber][2]);

        question2_choice1.setText(Questions_choices[pressedButtonNumber][3]);
        question2_choice2.setText(Questions_choices[pressedButtonNumber][4]);
        question2_choice3.setText(Questions_choices[pressedButtonNumber][5]);

        question3_choice1.setText(Questions_choices[pressedButtonNumber][6]);
        question3_choice2.setText(Questions_choices[pressedButtonNumber][7]);
        question3_choice3.setText(Questions_choices[pressedButtonNumber][8]);

        question4_choice1.setText(Questions_choices[pressedButtonNumber][9]);
        question4_choice2.setText(Questions_choices[pressedButtonNumber][10]);
        question4_choice3.setText(Questions_choices[pressedButtonNumber][11]);

        question5_choice1.setText(Questions_choices[pressedButtonNumber][12]);
        question5_choice2.setText(Questions_choices[pressedButtonNumber][13]);
        question5_choice3.setText(Questions_choices[pressedButtonNumber][14]);

        //Scoring System
        Right_choices[pressedButtonNumber][0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point1 = 20;
            }
        });
        Right_choices[pressedButtonNumber][1].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point2 = 20;
            }
        });
        Right_choices[pressedButtonNumber][2].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point3 = 20;
            }
        });
        Right_choices[pressedButtonNumber][3].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point4 = 20;
            }
        });
        Right_choices[pressedButtonNumber][4].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point5 = 20;
            }
        });


        //Media player
        mp = MediaPlayer.create(this, myMusic[pressedButtonNumber]);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        Totaltime = mp.getDuration();
        //position Bar
        positionBar = findViewById(R.id.positionBar);
        positionBar.setMax(Totaltime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        if (fromUser) {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        //eVolume Bar
        volumeBar = findViewById(R.id.volumeBar);
        volumeBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        float volumeNum = progress / 100f;
                        mp.setVolume(volumeNum, volumeNum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        //Thread (Update positionBar and TimeLabel)

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null) {
                    try {

                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                }
            }
        }).start();
    }

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @SuppressLint("SetTextI18n")
        @Override
        public void handleMessage(Message msg) {
            int currentPosition = msg.what;
            //Update positionBar
            positionBar.setProgress(currentPosition);

            //Update Labels.
            String elapsedTime = createTimeLabel(currentPosition);
            elapsedTimeLabel.setText(elapsedTime);

            String remainingTime = createTimeLabel(Totaltime - currentPosition);
            remaingTimeLabel.setText("- " + remainingTime);

        }
    };

    public String createTimeLabel(int time) {
        String timeLabel;
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;

    }

    public void playBtnClick(View view) {
        if (!mp.isPlaying()) {
            //stopping
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);
        } else {
            //playing

            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }

    }

    //Scoring button system. This function is linked with Onclick of Results in xml code
    public void Score(View view) {
        String Point_string;
        Totalpoints = point1 + point2 + point3 + point4 + point5;
        if (radiogroup1.getCheckedRadioButtonId() == -1 || radiogroup2.getCheckedRadioButtonId() == -1 || radiogroup3.getCheckedRadioButtonId() == -1 || radiogroup4.getCheckedRadioButtonId() == -1 || radiogroup5.getCheckedRadioButtonId() == -1) {
            //None of the radiogroups(None of the choices in each radiogroup is checked)are checked

            Point_string = "Make sure to select one choice in each question before you get the results";

        } else {
            //All the radiogroups (one choice in each radiogroup is checked) are checked!

            if (Totalpoints == 100) {
                Point_string = "Congratulations! You got " + Totalpoints + " You can now pass to the next audio";
            } else {
                Point_string = "You got " + Totalpoints + " Ohh try to reach 100! I know you can do this";
                radiogroup1.clearCheck();
                radiogroup2.clearCheck();
                radiogroup3.clearCheck();
                radiogroup4.clearCheck();
                radiogroup5.clearCheck();
            }

        }
        ScoreTextview = findViewById(R.id.score_textview);
        ScoreTextview.setText(Point_string);

        //Set score to be Zero again so when the user can restart.
        point1 = 0;
        point2 = 0;
        point3 = 0;
        point4 = 0;
        point5 = 0;

    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        mp.stop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }
}
