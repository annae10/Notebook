package com.ann.noteapp.model

import androidx.room.Entity

@Entity(tableName = "table_note")
class Note(
    var id: Int,
    var title: String?,
    var description: String?,
    var status: String?
    ) {
}