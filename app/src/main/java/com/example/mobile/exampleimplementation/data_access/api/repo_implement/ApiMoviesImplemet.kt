package com.example.mobile.exampleimplementation.data_access.api.repo_implement

import com.example.mobile.exampleimplementation.data_access.api.api.ApiMovies
import com.example.mobile.exampleimplementation.data_access.repositories.ApiSourceMovies
import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.entities.NewMovies
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class ApiMoviesImplemet(
     @JvmField @Inject var retrofitApiMovies: ApiMovies
    ): ApiSourceMovies {

    override fun getMovies(): MutableList<NewMovie> {
        return emptyList<NewMovie>().toMutableList()
    }
}