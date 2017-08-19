package com.example.zhouyangzzu.hellokotlin.provider

import com.example.zhouyangzzu.hellokotlin.provider.ProviderConfigure.Companion.DB_NAME
import com.example.zhouyangzzu.hellokotlin.provider.ProviderConfigure.Companion.DB_VERSION
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.*

/**
 * Created by zhouyangzzu on 2017/6/11.
 */


class DataBaseHelper (context:Context)
    : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION){

    override fun onCreate(db: SQLiteDatabase?) {
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

}