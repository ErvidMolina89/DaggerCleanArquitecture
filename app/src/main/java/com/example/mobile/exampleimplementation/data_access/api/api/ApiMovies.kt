package com.example.mobile.exampleimplementation.data_access.api.api

import com.example.mobile.exampleimplementation.data_access.repositories.apiMovies
import com.example.mobile.exampleimplementation.entities.NewMovies
import retrofit2.Call
import retrofit2.http.GET

interface ApiMovies {
    @GET("movies/?")
    fun getListMovies(): Call<NewMovies>
}