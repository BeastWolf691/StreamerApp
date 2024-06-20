package com.example.streamerapp.data.room

import androidx.room.Database

@Database(entities = [CardEntity::class], version = 1)
abstract class CardDatabase {
    abstract fun cardDao():CardDao
}