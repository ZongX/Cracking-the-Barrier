package com.example.android.cracking_barrier.data;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.android.cracking_barrier.R;
import com.example.android.cracking_barrier.data.wordContract.wordEntry;

/**
 * Created by EliteBook 8570w on 5/2/2017.
 */

public class WordCursorAdapter extends CursorAdapter {

    public WordCursorAdapter (Context context, Cursor c){
        super(context,c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.cursor_list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView JapTextView = (TextView) view.findViewById (R.id.verJap);
        TextView EngTextView = (TextView) view.findViewById (R.id.verEng);

        int JapIndexColumn = cursor.getColumnIndex(wordEntry.COLUMN_JAP);
        int EngIndexColumn = cursor.getColumnIndex(wordEntry.COLUMN_TRANS);

        String JapWord = cursor.getString(JapIndexColumn);
        String TransWord = cursor.getString(EngIndexColumn);

        JapTextView.setText(JapWord);
        EngTextView.setText(TransWord);
    }
}
