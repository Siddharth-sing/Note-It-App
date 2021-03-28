package com.example.notesSiddharth

import androidx.lifecycle.LiveData
import androidx.room.*

/* Created By Siddharth Singh Baghel on 27-03-2021 at 01:45 AM */

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: NoteEntity)

    @Delete
    suspend fun delete(note: NoteEntity)

    @Query(value = "select * from notes_table order by id ASC")
    fun getAllNOtes(): LiveData<List<NoteEntity>>
}