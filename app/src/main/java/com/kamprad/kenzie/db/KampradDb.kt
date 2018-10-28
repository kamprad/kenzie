package com.kamprad.kenzie.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kamprad.kenzie.vo.User

/** RoomDatabase definition.
 *
 * Used for setting up Room for Pos9.
 * */
@Database(
    entities = [
        User::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateTypeConverter::class)
abstract class KampradDb : RoomDatabase()
