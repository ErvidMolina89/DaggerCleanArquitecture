package com.example.mobile.exampleimplementation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mobile.exampleimplementation.data_access.repositories.RepoMovies
import com.example.mobile.exampleimplementation.databinding.ActivityMainBinding
import com.example.mobile.exampleimplementation.di.BaseApplication
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var repoMovies: RepoMovies
//    @Inject lateinit var viewModelMovies: ViewModelMovie
//    @Inject lateinit var apiMovies: ApiMovies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpDagger()
    }

    private fun setUpDagger(){
        (this.applicationContext as BaseApplication).getMoviesComponent().inject(this)
        Log.e("", "")
    }
}