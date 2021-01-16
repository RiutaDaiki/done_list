package com.example.donelist

import androidx.room.*

//メソッドを格納しておく所

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll(): List<User>

    @Insert
    fun insert(users: User)

    @Update
    fun update(users: User)

    @Delete
    fun delete(users: User)
}