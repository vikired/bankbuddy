package com.yoyk.bankbuddy.Database.Database;

/**
 * Created by Viki on 10/22/2016.
 */

public interface DatabaseConstants {
    public static String DB_NAME = "banks.db";

    public static final String TABLE_BANK="bank";

    public static final String COL_BANK_ID = "_id";
    public static final String COL_BANK_NAME = "name";
    public static final String COL_BANK_INQUIRY = "inquiry";
    public static final String COL_BANK_CARE = "care";
    public static final String COL_BANK_LOGO = "logo";
    public static final String COL_BANK_FAV = "favourite";

    public static final String TABLE_LANG = "languages";
    public static final String COL_LANG_ID = "_id";
    public static final String COL_LANG_NAME = "lang_name";
}
