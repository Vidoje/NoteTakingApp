package com.taurunium.notetakingapp.database

import androidx.room.Database
import com.taurunium.notetakingapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase {
    abstract fun getNoteDao(): NoteDAO

    companion object{
        @Volatile
        private var instance: NoteDatabase? = null
        private val LOCK = Any()
    }
}