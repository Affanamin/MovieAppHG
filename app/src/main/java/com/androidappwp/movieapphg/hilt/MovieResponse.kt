package com.androidappwp.movieapphg.hilt

import com.androidappwp.movieapphg.data.Movie

data class MovieResponse(
    val Response: String,
    val Search: List<Movie>,
    val totalResults: String
)