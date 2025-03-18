package com.example.englishwithmovies.modules

import android.app.Application
import com.example.englishwithmovies.data.AppDatabase
import com.example.englishwithmovies.data.CardDao
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDatabase {
        return AppDatabase.getDatabase(app)
    }

    @Provides
    @Singleton
    fun provideNoteDao(database: AppDatabase): CardDao {
        return database.cardDao()
    }
}