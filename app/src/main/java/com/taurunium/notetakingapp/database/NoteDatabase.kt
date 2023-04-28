package com.taurunium.notetakingapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.taurunium.notetakingapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun getNoteDao(): NoteDAO

    companion object{
        @Volatile //sa ovim volatile kazemo da ca ova instance i sve njene promene biti vidljive svim threadovima
        private var instance: NoteDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?:
            synchronized(LOCK){
                instance?: createDatabase(context).also{
                    instance = it
                }
            }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            NoteDatabase::class.java,
            "note_db"
        ).build()
    }
}