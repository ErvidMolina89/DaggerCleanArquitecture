package com.example.mobile.exampleimplementation.data_access.preferences

import com.example.mobile.exampleimplementation.data_access.repositories.preferenceMovies
import com.example.mobile.exampleimplementation.entities.NewMovie

class PreferenceMovies: preferenceMovies {
    override fun getMovies(): MutableList<NewMovie> {
        return emptyList<NewMovie>().toMutableList()
    }
}