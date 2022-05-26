package com.androidappwp.movieapphg.remote

import com.androidappwp.movieapphg.hilt.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieInterface {


    @GET()
    suspend fun getAllMovies(
        @Query("s")s:String,
        @Query("page")page:Int,
        @Query("apiKey")apiKey:String,
    ):Response<MovieResponse>




}