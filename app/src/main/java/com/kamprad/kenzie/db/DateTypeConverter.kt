package com.kamprad.kenzie.db

import androidx.room.TypeConverter
import java.util.*

/** For converting date into long, used for saving into SQLite using Room. */
object DateTypeConverter {
    /** Convert date from long type to Date (to get from DB and returned. */
    @TypeConverter
    @JvmStatic
    fun fromTimestamp(value: Long?) = if (value == null) {
        null
    } else {
        Date(value)
    }

    /** Convert date from Date type to Long (to save into DB). */
    @TypeConverter
    @JvmStatic
    fun dateToTimestamp(date: Date?) = date?.time
}
