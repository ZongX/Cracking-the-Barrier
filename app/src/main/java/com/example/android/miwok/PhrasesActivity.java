package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Add the numbers list into an array list
        ArrayList<Word> numbersList = new ArrayList<Word>();
        numbersList.add(0, new Word("Good morning!", R.string.phrase_goodmorning));
        numbersList.add(1, new Word("Hello!", R.string.phrase_hello));
        numbersList.add(2, new Word("My name is...", R.string.phrase_name));
        numbersList.add(3, new Word("Thank you!", R.string.phrase_thanks));
        numbersList.add(4, new Word("Good luck!", R.string.phrase_goodluck));
        numbersList.add(5, new Word("Please!", R.string.phrase_please));
        numbersList.add(6, new Word("Nice to meet you!", R.string.phrase_meet));
        numbersList.add(7, new Word("I hope we get along!", R.string.phrase_getAlong));
        numbersList.add(8, new Word("Good job!", R.string.phrase_welldone));
        numbersList.add(9, new Word("How are you?", R.string.phrase_howareyou));

        //Display the list onto the screen
        WordAdapter itemsAdapter = new WordAdapter(this, numbersList, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}