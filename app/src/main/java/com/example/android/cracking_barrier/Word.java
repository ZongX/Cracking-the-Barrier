package com.example.android.cracking_barrier;

/**
 * Created by EliteBook 8570w on 3/4/2017.
 */

public class Word {
    private String engTrans;
    private int japTrans;
    private int imageID = -1;
    private boolean hasImage = false;

    public Word(String engWord, int japWord) {
        engTrans = engWord;
        japTrans = japWord;
    }

    public Word(String engWord, int japWord, int someImageID) {
        engTrans = engWord;
        japTrans = japWord;
        imageID = someImageID;
        hasImage = true;
    }

    public String getEngTrans() {
        return engTrans;
    }

    public int getJapTrans() {
        return japTrans;
    }

    public int getImageID() {
        return imageID;
    }

    public boolean haveImageID() {
        return hasImage;
    }
}
