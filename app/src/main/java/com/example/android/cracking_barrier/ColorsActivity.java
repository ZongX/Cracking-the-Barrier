package com.example.android.cracking_barrier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Add the numbers list into an array list
        ArrayList<Word> colorsList = new ArrayList<Word>();
        colorsList.add(0, new Word("Red", R.string.colors_red, R.drawable.color_red));
        colorsList.add(1, new Word("Green", R.string.colors_green, R.drawable.color_green));
        colorsList.add(2, new Word("Brown", R.string.colors_brown, R.drawable.color_brown));
        colorsList.add(3, new Word("Gray", R.string.colors_gray, R.drawable.color_gray));
        colorsList.add(4, new Word("Black", R.string.colors_black, R.drawable.color_black));
        colorsList.add(5, new Word("White", R.string.colors_white, R.drawable.color_white));
        colorsList.add(6, new Word("Yellow", R.string.colors_yellow, R.drawable.color_mustard_yellow));

        //Display the list onto the screen
        WordAdapter itemsAdapter = new WordAdapter(this, colorsList, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}