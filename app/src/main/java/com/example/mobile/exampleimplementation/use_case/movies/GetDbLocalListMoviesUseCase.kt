package com.example.mobile.exampleimplementation.use_case.movies

import com.example.mobile.exampleimplementation.data_access.repositories.RepoMovies
import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.utils.OriginData

class GetDbLocalListMoviesUseCase(val repoMovies: RepoMovies) {
    fun invoke (): MutableList<NewMovie> {
        return repoMovies.returnListMovie(OriginData.db)
    }
}