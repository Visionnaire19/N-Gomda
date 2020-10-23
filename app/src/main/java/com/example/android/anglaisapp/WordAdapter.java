package com.example.android.anglaisapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 2/23/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param Words A List of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> Words)
    {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,Words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView= convertView;
        if(listItemView== null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord= getItem(position);


        // Find the TextView in the list_item.xml layout with the ID english_text_view
        TextView EnglishWord_TextView= (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the current english word and
// set this text on the name TextView
        EnglishWord_TextView.setText(currentWord.getEnglishWord());

        // Find the TextView in the list_item.xml layout with the ID WordExplanation_text_view
        TextView WordExplanation_TextView= (TextView) listItemView.findViewById(R.id.WordExplanation_text_view);
        // Get the word explanation in English from the current word object and
// set this text on the name TextView
       WordExplanation_TextView.setText(currentWord.getEnglishExplanation());


       //Find the TextView in the list_item.xml layout with the ID example_text_view
        TextView WordExample_TextView= (TextView) listItemView.findViewById(R.id.example_text_view);
        // Get the word example in English from the current word object and
// set this text on the name TextView
        WordExample_TextView.setText(currentWord.getEnglishExample());


        // Find the ImageView in the list_item.xml layout with the ID image_image_view
        ImageView WordImage_ImageView= (ImageView) listItemView.findViewById(R.id.image_image_view);
        // Get the Image in app from the current word object and
// set this image on ImageView
        WordImage_ImageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}
