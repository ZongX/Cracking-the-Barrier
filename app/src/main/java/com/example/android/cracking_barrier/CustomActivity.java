package com.example.android.cracking_barrier;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.example.android.cracking_barrier.data.WordCursorAdapter;
import com.example.android.cracking_barrier.data.wordContract.wordEntry;
import com.example.android.cracking_barrier.data.wordDbHelper;

/**
 * Created by EliteBook 8570w on 4/29/2017.
 */

public class CustomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        // Setup FAB to open EditorActivity
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomActivity.this, EditorActivity.class);
                startActivity(intent);
            }
        });
        displayDatabaseInfo();
    }


    @Override
    protected void onStart(){
        super.onStart();
        displayDatabaseInfo();
    }

    private void displayDatabaseInfo(){
        wordDbHelper mDbHelper = new wordDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                wordEntry.COLUMN_ID,
                wordEntry.COLUMN_JAP,
                wordEntry.COLUMN_TRANS
        };

        Cursor cursor = db.query(wordEntry.TABLE_NAME, projection, null, null, null, null, null);

        ListView wordListView = (ListView) findViewById(R.id.custom_list);

        WordCursorAdapter adapter = new WordCursorAdapter (this, cursor);

        wordListView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.custom_menu, menu);
        return true;
    }
}
