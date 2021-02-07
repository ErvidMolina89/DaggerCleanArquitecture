package com.example.mobile.exampleimplementation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.mobile.exampleimplementation.data_access.api.repo_implement.ApiMoviesImplemet
import com.example.mobile.exampleimplementation.data_access.repositories.ApiSourceMovies
import com.example.mobile.exampleimplementation.data_access.repositories.DBSourceMovies
import com.example.mobile.exampleimplementation.data_access.repositories.PreferenceSourceMovies
import com.example.mobile.exampleimplementation.data_access.repositories.RepoMovies
import com.example.mobile.exampleimplementation.databinding.ActivityMainBinding
import com.example.mobile.exampleimplementation.di.BaseApplication
import com.example.mobile.exampleimplementation.entities.NewMovie
import com.example.mobile.exampleimplementation.presenter.movies.ViewModelMovie
import com.example.mobile.exampleimplementation.use_case.movies.GetApiListMoviesUseCase
import com.example.mobile.exampleimplementation.use_case.movies.GetDbLocalListMoviesUseCase
import com.example.mobile.exampleimplementation.use_case.movies.GetPreferenceListMoviesUseCase
import com.example.mobile.exampleimplementation.utils.mostrarEnconsola
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var viewModelMovies: ViewModelMovie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpDagger()
        fillView()
    }

    private fun fillView() {
        viewModelMovies.listMovies.observe(this, object : Observer<MutableList<NewMovie>>{
            override fun onChanged(t: MutableList<NewMovie>?) {
                "cargo la lista".mostrarEnconsola()
            }
        })

        viewModelMovies.getListMovies()
    }

    private fun setUpDagger(){
        (this.applicationContext as BaseApplication).getMoviesComponent().inject(this)
        Log.e("", "")
    }
}