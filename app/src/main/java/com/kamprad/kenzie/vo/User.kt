package com.kamprad.kenzie.vo

import androidx.room.Entity
import java.util.*

@Entity(primaryKeys = ["idUser"])
data class User(
    val idUser: Int,
    val name: String,
    val role: Int,
    val pin: String,
    val createdAt: Date,
    val updatedAt: Date
)
