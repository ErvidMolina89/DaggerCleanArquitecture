package com.example.mobile.exampleimplementation.di

import android.app.Application
import com.example.mobile.exampleimplementation.di.component.ApplicationComponent
import com.example.mobile.exampleimplementation.di.component.DaggerApplicationComponent
import com.example.mobile.exampleimplementation.di.component.DaggerMoviesComponent
import com.example.mobile.exampleimplementation.di.component.MoviesComponent
import com.example.mobile.exampleimplementation.di.module.ApplicationContextModule
import com.example.mobile.exampleimplementation.di.module.MoviesModule

class BaseApplication: Application() {

    private lateinit var applicationComponent: ApplicationComponent
    private lateinit var moviesComponent: MoviesComponent

    override fun onCreate() {
        super.onCreate()
        setupApplicationComponent()
        setupMoviesComponent()
    }

    private fun setupApplicationComponent() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationContextModule(ApplicationContextModule(this))
            .build()
    }

    private fun setupMoviesComponent() {
        moviesComponent = DaggerMoviesComponent
            .builder()
            .moviesModule(MoviesModule())
            .build()
    }

    fun getApplicationComponent() = applicationComponent
    fun getMoviesComponent() = moviesComponent
}