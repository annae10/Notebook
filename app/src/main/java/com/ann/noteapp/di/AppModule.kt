package com.ann.noteapp.di

import android.app.Application
import androidx.room.Room
import com.ann.noteapp.model.NoteDao
import com.ann.noteapp.model.NoteDb
import com.ann.noteapp.repository.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
}

@Singleton
@Provides
fun providesNoteDao(db: NoteDb): NoteDao {
   return db.noteDao()
}

@Singleton
@Provides
fun provideAppDatabase(app:Application): NoteDb {
    return Room.databaseBuilder(app,NoteDb::class.java, "note_db")
        .build()
}

@Singleton
@Provides
fun providesRepository():Repository{
    return Repository()
}

