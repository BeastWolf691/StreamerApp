package com.example.streamerapp.data.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CardViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<CardEntity>>
    private val repository: CardRepository
    init {
        val  cardDao = CardEntityDatabase.getDatabase(application).cardDao()
        repository = CardRepository(cardDao)
        readAllData = repository.readAllData
    }

    fun addCardEntity(cardEntity: CardEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCardEntity(cardEntity)
        }
    }
}