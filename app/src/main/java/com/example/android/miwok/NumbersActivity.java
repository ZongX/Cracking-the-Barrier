package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Add the numbers list into an array list
        ArrayList<Word> numbersList = new ArrayList<Word>();
        numbersList.add(0, new Word("One", R.string.number_one_jap, R.drawable.number_one));
        numbersList.add(1, new Word("Two", R.string.number_two_jap, R.drawable.number_two));
        numbersList.add(2, new Word("Three", R.string.number_three_jap, R.drawable.number_three));
        numbersList.add(3, new Word("Four", R.string.number_four_jap, R.drawable.number_four));
        numbersList.add(4, new Word("Five", R.string.number_five_jap, R.drawable.number_five));
        numbersList.add(5, new Word("Six", R.string.number_six_jap, R.drawable.number_six));
        numbersList.add(6, new Word("Seven", R.string.number_seven_jap, R.drawable.number_seven));
        numbersList.add(7, new Word("Eight", R.string.number_eight_jap, R.drawable.number_eight));
        numbersList.add(8, new Word("Nine", R.string.number_nine_jap, R.drawable.number_nine));
        numbersList.add(9, new Word("Ten", R.string.number_ten_jap, R.drawable.number_ten));

        //Display the list onto the screen
        WordAdapter itemsAdapter = new WordAdapter(this, numbersList, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}