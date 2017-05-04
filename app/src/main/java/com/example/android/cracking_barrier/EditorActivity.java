package com.example.android.cracking_barrier;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.cracking_barrier.data.wordContract.wordEntry;
import com.example.android.cracking_barrier.data.wordDbHelper;

/**
 * Created by EliteBook 8570w on 4/29/2017.
 */

public class EditorActivity extends AppCompatActivity {
    private EditText newJap;
    private EditText newTrans;
    private wordDbHelper dbHelper = new wordDbHelper (this);

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_editor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        newJap = (EditText) findViewById(R.id.new_Jap_word);
        newTrans = (EditText) findViewById(R.id.new_trans);
    }

    private void insertWord (){
        String new_word_Jap = newJap.getText().toString().trim();
        String new_word_trans = newTrans.getText().toString().trim();

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues newRow = new ContentValues();
        newRow.put(wordEntry.COLUMN_JAP, new_word_Jap);
        newRow.put(wordEntry.COLUMN_TRANS, new_word_trans);

        long rowID = db.insert(wordEntry.TABLE_NAME, null, newRow);
        if (rowID == -1){
            Toast showThis = Toast.makeText(this, "Error with saving your new word", Toast.LENGTH_SHORT);
            showThis.show();
        }
        Toast.makeText(this, new_word_Jap + " has been added to your dictionary successfully!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.editor_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_save:
                insertWord();
                finish();
                return true;
            case R.id.action_delete:
                //Do nothing for now
                return true;
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
