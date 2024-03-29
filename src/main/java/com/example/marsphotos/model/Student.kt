package com.example.marsphotos.model

import kotlinx.serialization.Serializable

@Serializable
data class Student (
    val id: String,
    val created_at: String,
    val updated_at: String,
    val fname: String,
    val lname: String,
    val country: String
    )