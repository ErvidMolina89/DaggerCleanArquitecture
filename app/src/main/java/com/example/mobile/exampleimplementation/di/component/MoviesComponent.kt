package com.example.mobile.exampleimplementation.di.component

import com.example.mobile.exampleimplementation.ui.activities.MainActivity
import com.example.mobile.exampleimplementation.di.module.ApplicationContextModule
import com.example.mobile.exampleimplementation.di.module.MoviesModule
import com.example.mobile.exampleimplementation.di.module.RetrofitModule
import dagger.Component

@Component(modules = [
    ApplicationContextModule::class,
    MoviesModule::class,
    RetrofitModule::class
])
interface MoviesComponent {

    fun inject(mainActivity: MainActivity)
}