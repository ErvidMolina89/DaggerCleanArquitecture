package com.example.mobile.exampleimplementation.presenter.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.use_case.movies.GetApiListMoviesUseCase
import javax.inject.Inject

class ViewModelMovie (@JvmField @Inject var getApiListMoviesUseCase: GetApiListMoviesUseCase) : ViewModel() {

    var listMovies: MutableLiveData<MutableList<NewMovie>> = MutableLiveData()

    fun getListMovies(){
        listMovies.value = getApiListMoviesUseCase.invoke()
    }
}