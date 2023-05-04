package com.taurunium.notetakingapp.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.taurunium.notetakingapp.database.NoteDatabase
import com.taurunium.notetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)

    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)

    fun getAllNotes(): LiveData<List<Note>> = db.getNoteDao().getAllNotes()

    fun searchNote(query:String?): LiveData<List<Note>> = db.getNoteDao().searchNote(query)
}