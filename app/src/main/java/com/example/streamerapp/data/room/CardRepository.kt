package com.example.streamerapp.data.room

import androidx.lifecycle.LiveData

class CardRepository (private val cardDao: CardDao) {
    val readAllData: LiveData<List<CardEntity>> = cardDao.readAllData()

    fun addCardEntity(cardEntity: CardEntity) {
        cardDao.addCardEntity(cardEntity)
    }

}