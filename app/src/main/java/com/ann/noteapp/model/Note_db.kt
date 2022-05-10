package com.ann.noteapp.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1)
abstract class Note_db:RoomDatabase() {

    abstract fun noteDao():NoteDao
}