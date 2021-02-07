package com.example.mobile.exampleimplementation.di.module

import com.example.mobile.exampleimplementation.data_access.api.api.ApiMovies
import com.example.mobile.exampleimplementation.data_access.api.repo_implement.ApiMoviesImplemet
import com.example.mobile.exampleimplementation.data_access.db_local.DbMovies
import com.example.mobile.exampleimplementation.data_access.preferences.PreferenceMovies
import com.example.mobile.exampleimplementation.data_access.repositories.RepoMovies
import com.example.mobile.exampleimplementation.data_access.repositories.apiMovies
import com.example.mobile.exampleimplementation.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

@Module(
    includes = [RetrofitModule::class]
)
class MoviesModule {
    // DataSources
    @ApplicationScope
    @Provides
    fun provideApiRetrofit(apiMovies: ApiMovies) = ApiMoviesImplemet(apiMovies)

    @ApplicationScope
    @Provides
    fun provideDbMovies() = DbMovies()
    @ApplicationScope
    @Provides
    fun providePreferenceMovies() = PreferenceMovies()

    // Repositorio
    @ApplicationScope
    @Provides
    fun provideRepoMovies(apiMovies: apiMovies,
                          dbMovies: DbMovies,
                          preferenceMovies: PreferenceMovies) = RepoMovies(apiMovies, dbMovies, preferenceMovies)

//    // Case Uses
//    @ApplicationScope
//    @Provides
//    fun provideApiListMovies(repoMovies: RepoMovies) = GetApiListMoviesUseCase(repoMovies)
//
//    @ApplicationScope
//    @Provides
//    fun provideDbLocalListMovies(repoMovies: RepoMovies) = GetDbLocalListMoviesUseCase(repoMovies)
//
//    @ApplicationScope
//    @Provides
//    fun providePreferenceListMovies(repoMovies: RepoMovies) = GetPreferenceListMoviesUseCase(repoMovies)
//
//    // ViewModel o Presenter
//
//    @ApplicationScope
//    @Provides
//    fun provideViewModelMovies(getApiListMoviesUseCase: GetApiListMoviesUseCase) = ViewModelMovie(getApiListMoviesUseCase)

}