package com.example.notesSiddharth

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class NoteEntity(@ColumnInfo(name = "text") val text: String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}



/* Created By Siddharth Singh Baghel on 27-03-2021 at 01:45 AM */