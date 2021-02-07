package com.example.mobile.exampleimplementation.di.module

import com.example.mobile.exampleimplementation.di.BaseApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationContextModule (val baseApplication: BaseApplication) {
//    @ApplicationScope
    @Provides
    fun provideApplication() = baseApplication

    @Provides
    fun provideApplicationContext() = baseApplication.applicationContext
}