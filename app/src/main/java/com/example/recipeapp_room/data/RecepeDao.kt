package com.example.recipeapp_room.data

import androidx.room.*

@Dao
interface RecepeDao {
    @Query("SELECT * FROM Recipe ORDER BY title DESC")
    fun getAllUserInfo(): List<Recipe>

    @Insert
    fun insertrecipe(n: Recipe)
    @Update
    fun updaterecipe(recipe: Recipe)
    @Delete
    fun deleterecipe(recipe: Recipe)

}