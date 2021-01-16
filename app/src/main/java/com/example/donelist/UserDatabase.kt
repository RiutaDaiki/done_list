package com.example.donelist

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//データベースの作成とインスタンスの取得（？）　

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun UserDao(): UserDao

    companion object {
        private var INSTANCE: UserDatabase? = null
        private val lock = Any()


        fun getInstance(context: Context): UserDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, UserDatabase::class.java, "User.db")
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE!!
            }
        }

    }



}