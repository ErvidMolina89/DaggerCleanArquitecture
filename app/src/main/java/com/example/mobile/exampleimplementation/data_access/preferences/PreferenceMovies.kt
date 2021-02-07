package com.example.mobile.exampleimplementation.data_access.preferences

import com.example.mobile.exampleimplementation.data_access.repositories.PreferenceSourceMovies
import com.example.mobile.exampleimplementation.entities.NewMovie

class PreferenceMovies: PreferenceSourceMovies {
    override fun getMovies(): MutableList<NewMovie> {
        return emptyList<NewMovie>().toMutableList()
    }
}