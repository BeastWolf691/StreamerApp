package com.example.streamerapp.data.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//DAO data access objects

@Dao
interface CardDao {
    @Insert
    fun addCardEntity(cardEntity: CardEntity)

    @Query("SELECT * FROM cards ORDER BY id ASC")
    fun getCardEntity() : List<CardEntity>
    fun readAllData(): LiveData<List<CardEntity>>

    @Update
    fun updateCardEntity(cardEntity: CardEntity)

    @Query("DELETE FROM cards WHERE id = :idCard")
    @Delete
    fun deleteCardEntity(idCard: Long)
}