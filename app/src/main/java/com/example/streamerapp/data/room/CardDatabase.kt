package com.example.streamerapp.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CardEntity::class], version = 1)
abstract class CardEntityDatabase : RoomDatabase() {
    abstract fun cardDao(): CardDao

    companion object {
        @Volatile
        private var INSTANCE: CardEntityDatabase? = null

        fun getDatabase(context: Context): CardEntityDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CardEntityDatabase::class.java,
                    "cards"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}