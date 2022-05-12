package com.ann.noteapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_note")
class Note(
    @PrimaryKey var id: Int,
    var title: String?,
    var description: String?,
    var status: String?
    ) {
}