package iak4.com.jajal4;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by gueone on 5/12/2017.
 */

public class FormatResolver{

    /**
     * This it the content authority for DroidTermsExample provider.
     */
    public static final String CONTENT_AUTHORITY = "com.iak.almuwahhid";

    /**
     * This is the {@link Uri} on which all other DroidTermsExample Uris are built.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * The path for terms
     */
    public static final String PATH_TERMS = "repo";

    /**
     * This is the {@link Uri} used to get a full list of terms and definitions.
     */
    public static final Uri CONTENT_URI =
            BASE_CONTENT_URI.buildUpon().appendPath(PATH_TERMS).build();


    /**
     * This is a String type that denotes a Uri references a list or directory.
     */
    public static final String CONTENT_TYPE =
            ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TERMS;

    /**
     * This is a String type that denotes a Uri references a single item.
     */
    public static final String CONTENT_ITEM_TYPE =
            ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TERMS;

    public static final String COLUMN_REPO = "name_repo";

    public static Uri buildTermUriWithId(long id) {
        return ContentUris.withAppendedId(CONTENT_URI, id);
    }
}
