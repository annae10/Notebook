package com.ann.noteapp.model

import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note)

    @Update
    fun update(note:Note)

    @Delete
    fun delete(note: Note)

    @Query("Select * from table_note")
    fun getAllNotes():List<Note>
}