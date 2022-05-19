package com.ann.noteapp.ui

import androidx.lifecycle.ViewModel
import com.ann.noteapp.model.Note
import com.ann.noteapp.repository.Repository
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {

    fun insert(note: Note){
    repository.insert(note)
    }
}