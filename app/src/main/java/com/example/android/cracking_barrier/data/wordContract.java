package com.example.android.cracking_barrier.data;

import android.provider.BaseColumns;

/**
 * Created by EliteBook 8570w on 5/1/2017.
 */

final public class wordContract {
    public final class wordEntry implements BaseColumns {
        public static final String TABLE_NAME = "Words";
        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_JAP = "Japanese";
        public static final String COLUMN_TRANS = "Translation";
    }
}
