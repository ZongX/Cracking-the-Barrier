package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList (View view){
        Intent numbersIntent = new Intent (this, NumbersActivity.class);
        startActivity(numbersIntent);
        finish();
    }

    public void openPhrasesList (View view){
        Intent phrasesIntenet = new Intent (this, PhrasesActivity.class);
        startActivity(phrasesIntenet);
        finish();
    }

    public void openFamilyList (View view){
        Intent familyIntent = new Intent (this, FamilyActivity.class);
        startActivity(familyIntent);
        finish();
    }

    public void openColorsList (View view){
        Intent colorsList = new Intent (this,ColorsActivity.class);
        startActivity(colorsList);
        finish();
    }
}
