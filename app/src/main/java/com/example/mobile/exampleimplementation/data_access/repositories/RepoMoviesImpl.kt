package com.example.mobile.exampleimplementation.data_access.repositories

import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.utils.OriginData
import javax.inject.Inject

interface RepoMovies{

    fun returnListMovie(originData: OriginData) : MutableList<NewMovie>

}

class RepoMoviesImpl (
    @JvmField @Inject var  apiSourceMovies: ApiSourceMovies,
    @JvmField @Inject var  dBSourceMovies: DBSourceMovies,
    @JvmField @Inject var  preferenceSourceMovies: PreferenceSourceMovies
) : RepoMovies  {


    override fun returnListMovie(originData: OriginData) :MutableList<NewMovie>{
        return when (originData){
            OriginData.api -> {
                apiSourceMovies.getMovies()
            }
            OriginData.db -> {
                dBSourceMovies.getMovies()
            }
            OriginData.preference -> {
                preferenceSourceMovies.getMovies()
            }
        }
    }
}


interface ApiSourceMovies {
    fun getMovies(): MutableList<NewMovie>
}

interface DBSourceMovies {
    fun getMovies(): MutableList<NewMovie>
}

interface PreferenceSourceMovies {
    fun getMovies(): MutableList<NewMovie>
}