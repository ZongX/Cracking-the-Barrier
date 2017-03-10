package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EliteBook 8570w on 3/4/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int bgColorID;

    public WordAdapter(Activity context, ArrayList<Word> numbersList, int colorID) {
        super(context, 0, numbersList);
        bgColorID = colorID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);

        LinearLayout twoTexts = (LinearLayout) listItemView.findViewById(R.id.twoTextTrans);
        int color = ContextCompat.getColor(getContext(),bgColorID);
        twoTexts.setBackgroundColor(color);

        TextView textJap = (TextView) listItemView.findViewById(R.id.verJap);
        textJap.setText(getContext().getString(currentWord.getJapTrans()));

        TextView textEng = (TextView) listItemView.findViewById(R.id.verEng);
        textEng.setText(currentWord.getEngTrans());

        ImageView wordIcon = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.haveImageID()) {
            wordIcon.setImageResource(currentWord.getImageID());
        }
        else{
            wordIcon.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
