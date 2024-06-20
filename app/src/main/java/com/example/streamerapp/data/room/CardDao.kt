package com.example.streamerapp.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//DAO data access objects

@Dao
interface CardDao {
    @Insert
    fun addNewCard(cardEntity: CardEntity)

    @Query("SELECT * FROM cards")
    fun getCards() : List<CardEntity>

    @Update
    fun updateCard(cardEntity: CardEntity)

    @Query("DELETE FROM cards WHERE id = :idCard")
    @Delete
    fun deleteCard(idCard: Long)
}