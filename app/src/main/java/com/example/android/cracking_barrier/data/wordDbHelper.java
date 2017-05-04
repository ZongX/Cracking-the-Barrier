package com.example.android.cracking_barrier.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.android.cracking_barrier.data.wordContract.wordEntry;

/**
 * Created by EliteBook 8570w on 5/1/2017.
 */

public class wordDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "dictionary.db";

    public wordDbHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String DATABASE_CREATE = "CREATE TABLE " + wordEntry.TABLE_NAME +
                " (" + wordEntry.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + wordEntry.COLUMN_JAP + " TEXT NOT NULL, "
                + wordEntry.COLUMN_TRANS + " TEXT NOT NULL);";
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
