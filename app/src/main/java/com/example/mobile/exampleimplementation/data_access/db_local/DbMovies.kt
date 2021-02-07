package com.example.mobile.exampleimplementation.data_access.db_local

import com.example.mobile.exampleimplementation.data_access.repositories.DBSourceMovies
import com.example.mobile.exampleimplementation.entities.NewMovie

class DbMovies: DBSourceMovies {
    override fun getMovies(): MutableList<NewMovie> {
        return emptyList<NewMovie>().toMutableList()
    }
}