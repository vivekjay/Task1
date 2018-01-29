package com.example.vijay.task1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dell on 1/19/2018.
 */

public class Helper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
   private   static final String DATABASE_NAME="VIJAY.db";
    private   static final String TABLE_NAME="User";
    private static final String COLUMN_USER_NAME = "user_name";
    private static final String COLUMN_USER_EMAIL = "user_email";
    private static final String COLUMN_USER_PASSWORD = "user_password";
    private String CREATE_USER_TABLE = "CREATE TABLE" + TABLE_NAME + "(" +COLUMN_USER_NAME + "TEXT," +COLUMN_USER_EMAIL+ "TEXT" +
            COLUMN_USER_PASSWORD + "TEXT" +")";

    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public Helper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table User(int id,string name, string pass);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("drop table User if exist");
    }
}
