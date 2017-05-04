package com.example.android.cracking_barrier;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        TextView customText = (TextView) findViewById(R.id.userWords);
        customText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent customList = new Intent (MainActivity.this, CustomActivity.class);
                startActivity(customList);
            }
        });
    }

    public void openNumbersList (View view){
        Intent numbersIntent = new Intent (this, NumbersActivity.class);
        startActivity(numbersIntent);
    }

    public void openPhrasesList (View view){
        Intent phrasesIntent = new Intent (this, PhrasesActivity.class);
        startActivity(phrasesIntent);
    }

    public void openFamilyList (View view){
        Intent familyIntent = new Intent (this, FamilyActivity.class);
        startActivity(familyIntent);
    }

    public void openColorsList (View view){
        Intent colorsList = new Intent (this, ColorsActivity.class);
        startActivity(colorsList);
    }

    public void setLocale () {
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case R.id.action_language:
                return true;
            case R.id.action_reset:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
