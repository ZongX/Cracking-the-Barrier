package com.example.android.cracking_barrier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Add the numbers list into an array list
        ArrayList<Word> numbersList = new ArrayList<Word>();
        numbersList.add(0, new Word("Father", R.string.family_father, R.drawable.family_father));
        numbersList.add(1, new Word("Mother", R.string.family_mother, R.drawable.family_mother));
        numbersList.add(2, new Word("Son", R.string.family_son, R.drawable.family_son));
        numbersList.add(3, new Word("Daughter", R.string.family_daughter, R.drawable.family_daughter));
        numbersList.add(4, new Word("Older Brother", R.string.family_brother, R.drawable.family_older_brother));
        numbersList.add(5, new Word("Younger Brother", R.string.family_lBrother, R.drawable.family_younger_brother));
        numbersList.add(6, new Word("Older Sister", R.string.family_sister, R.drawable.family_older_sister));
        numbersList.add(7, new Word("Younger Sister", R.string.family_lSister, R.drawable.family_younger_sister));
        numbersList.add(8, new Word("Grandmother", R.string.family_grandMother, R.drawable.family_grandmother));
        numbersList.add(9, new Word("Grandfather", R.string.family_grandFather, R.drawable.family_grandfather));

        //Display the list onto the screen
        WordAdapter itemsAdapter = new WordAdapter(this, numbersList, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}