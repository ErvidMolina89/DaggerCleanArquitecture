package com.example.mobile.exampleimplementation.data_access.api.repo_implement

import com.example.mobile.exampleimplementation.data_access.api.api.ApiMovies
import com.example.mobile.exampleimplementation.data_access.repositories.apiMovies
import com.example.mobile.exampleimplementation.entities.NewMovie

class ApiMoviesImplemet(val retrofitApiMovies: ApiMovies): apiMovies {

    override fun getMovies(): MutableList<NewMovie> {
        var entityList = emptyList<NewMovie>().toMutableList()
        return entityList
    }
}