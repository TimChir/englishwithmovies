package com.example.englishwithmovies.views

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.englishwithmovies.data.Card
import com.example.englishwithmovies.data.CardDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CardsViewModel @Inject constructor(
    private val cardDao: CardDao
) : ViewModel() {
    val allCards : Flow<List<Card>> = cardDao.getAllCards()
    fun insert(card: Card) = viewModelScope.launch {
        cardDao.insert(card)
    }
}