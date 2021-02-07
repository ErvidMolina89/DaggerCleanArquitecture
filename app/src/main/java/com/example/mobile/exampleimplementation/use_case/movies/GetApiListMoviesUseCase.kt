package com.example.mobile.exampleimplementation.use_case.movies

import com.example.mobile.exampleimplementation.data_access.repositories.RepoMovies
import com.example.mobile.exampleimplementation.data_access.repositories.RepoMoviesImpl
import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.utils.OriginData
import javax.inject.Inject

class GetApiListMoviesUseCase(@JvmField @Inject var repoMoviesImpl: RepoMovies) {
    fun invoke (): MutableList<NewMovie> {
        return repoMoviesImpl.returnListMovie(OriginData.api)
    }
}