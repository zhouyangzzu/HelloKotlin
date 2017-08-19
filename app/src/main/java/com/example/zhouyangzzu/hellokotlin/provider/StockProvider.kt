//package com.example.zhouyangzzu.hellokotlin.provider
//
//import android.content.ContentProvider
//import android.content.ContentValues
//import android.database.Cursor
//import android.net.Uri
//
///**
// * Created by zhouyangzzu on 2017/6/10.
// */
//
//public class StockProvider : ContentProvider(){
//
//    lateinit var dbHelper : DataBaseHelper
//
//    override fun onCreate(): Boolean {
//        dbHelper = DataBaseHelper(context)
//        return true
//    }true
//
//    override fun update(uri: Uri?, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
//        return 0
//    }
//
//    override fun query(uri: Uri?, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor {
//    }
//
//    override fun insert(uri: Uri?, values: ContentValues?): Uri {
//    }
//
//    override fun delete(uri: Uri?, selection: String?, selectionArgs: Array<out String>?): Int {
//    }
//
//    override fun getType(uri: Uri?): String {
//    }
//
//}