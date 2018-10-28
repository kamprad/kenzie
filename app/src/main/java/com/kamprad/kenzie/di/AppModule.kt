package com.kamprad.kenzie.di

import android.app.Application
import androidx.room.Room
import com.kamprad.kenzie.db.KampradDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  This module provides the singleton dependencies that the app requires (dao, db, etc).
 */
@Module(includes = [ViewModelModule::class])
class AppModule {

    /**
     * Provides DB instance.
     */
    @Singleton
    @Provides
    fun provideDb(app: Application) = Room
        .databaseBuilder(app, KampradDb::class.java, "github.db")
        .fallbackToDestructiveMigration()
        .build()
}
