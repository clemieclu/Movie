package com.example.myapplication

import org.json.JSONArray

data class Movie(
    val title: String,
    val movieId: Int,
    val overview: String,
    val posterPath: String,
) {
    companion object {
        fun fromJsonArray(movieJsonArray: JSONArray) {

        }
    }
}