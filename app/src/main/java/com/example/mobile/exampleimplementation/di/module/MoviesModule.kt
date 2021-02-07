package com.example.mobile.exampleimplementation.di.module

import com.example.mobile.exampleimplementation.data_access.api.api.ApiMovies
import com.example.mobile.exampleimplementation.data_access.api.repo_implement.ApiMoviesImplemet
import com.example.mobile.exampleimplementation.data_access.db_local.DbMovies
import com.example.mobile.exampleimplementation.data_access.preferences.PreferenceMovies
import com.example.mobile.exampleimplementation.data_access.repositories.*
import com.example.mobile.exampleimplementation.presenter.movies.ViewModelMovie
import com.example.mobile.exampleimplementation.use_case.movies.GetApiListMoviesUseCase
import com.example.mobile.exampleimplementation.use_case.movies.GetDbLocalListMoviesUseCase
import com.example.mobile.exampleimplementation.use_case.movies.GetPreferenceListMoviesUseCase
import dagger.Module
import dagger.Provides

@Module(
    includes = [RetrofitModule::class]
)
class MoviesModule {
    // DataSources
    @Provides
    fun provideApiRetrofit(apiMovies: ApiMovies): ApiSourceMovies = ApiMoviesImplemet(apiMovies)

    @Provides
    fun provideDbMovies() : DBSourceMovies = DbMovies()
    @Provides
    fun providePreferenceMovies() : PreferenceSourceMovies = PreferenceMovies()


    // Repositorio
    @Provides
    fun provideRepoMovies(
        apiMovies: ApiSourceMovies,
        dbMovies: DBSourceMovies,
        preferenceMovies: PreferenceSourceMovies
    ) : RepoMovies = RepoMoviesImpl(apiMovies, dbMovies, preferenceMovies)


    // Case Uses
    @Provides
    fun provideApiListMovies(repoMovies: RepoMovies) = GetApiListMoviesUseCase(repoMovies)

    @Provides
    fun provideDbLocalListMovies(repoMovies: RepoMovies) = GetDbLocalListMoviesUseCase(repoMovies)

    @Provides
    fun providePreferenceListMovies(repoMovies: RepoMovies) = GetPreferenceListMoviesUseCase(repoMovies)

    // ViewModel o Presenter

    @Provides
    fun provideViewModelMovies(getApiListMoviesUseCase: GetApiListMoviesUseCase) = ViewModelMovie(getApiListMoviesUseCase)

}