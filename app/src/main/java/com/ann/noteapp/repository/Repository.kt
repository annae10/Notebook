package com.ann.noteapp.repository

import com.ann.noteapp.model.Note
import com.ann.noteapp.model.NoteDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class Repository @Inject constructor(val noteDao: NoteDao) {

    fun insert(note: Note){
        CoroutineScope(Dispatchers.IO).launch {
            noteDao.insert(note)
        }
    }

    fun delete(note: Note){
        CoroutineScope(Dispatchers.IO).launch {
            noteDao.delete(note)
        }
    }

    fun update(note: Note){
        CoroutineScope(Dispatchers.IO).launch {
            noteDao.update(note)
        }
    }
}