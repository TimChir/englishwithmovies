package com.example.englishwithmovies.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CardDao {
    @Insert
    suspend fun insert(card: Card)

    @Query("SELECT * FROM cards ORDER BY id DESC")
    fun getAllCards(): Flow<List<Card>>
}