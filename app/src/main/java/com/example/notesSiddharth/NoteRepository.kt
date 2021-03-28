package com.example.notesSiddharth

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData


/* Created By Siddharth Singh Baghel on 27-03-2021 at 01:45 AM */


// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class NoteRepository(private val noteDao: NoteDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allNotes: LiveData<List<NoteEntity>> = noteDao.getAllNOtes()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(note:NoteEntity){
        noteDao.insert(note)
    }

    @WorkerThread
    suspend fun delete(note:NoteEntity){
        noteDao.delete(note)
    }

}