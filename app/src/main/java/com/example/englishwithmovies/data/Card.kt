package com.example.englishwithmovies.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cards")
data class Card(
    @PrimaryKey(autoGenerate = true) val id :Int = 0,
    val word : String,
    val translation : String,
    val difficulty : String = "medium"
)
