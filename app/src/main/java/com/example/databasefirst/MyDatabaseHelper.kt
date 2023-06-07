package com.example.databasefirst

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DATABASE_NAME:String = "BookLibrary.db"
val DATABASE_VERSION:Int = 1
val TABLE_NAME:String = "my_library"
val COLUMN_ID:String = "_id"
val COLUMN_TITLE:String = "book_title"
val COLUMN_AUTHOR:String = "book_author"
val COLUMN_PAGES:String = "book_pages"
class MyDatabaseHelper : SQLiteOpenHelper {
    private lateinit var context:Context



    constructor(context: Context) : super(context, DATABASE_NAME, null, DATABASE_VERSION) {
        this.context = context
    }


    override fun onCreate(db: SQLiteDatabase?) {
        val query:String = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_TITLE TEXT," +
                "$COLUMN_AUTHOR TEXT," +
                "$COLUMN_PAGES TEXT);"
        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
    }
}