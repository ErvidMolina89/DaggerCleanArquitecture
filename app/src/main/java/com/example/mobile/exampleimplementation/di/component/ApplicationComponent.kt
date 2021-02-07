package com.example.mobile.exampleimplementation.di.component

import com.example.mobile.exampleimplementation.di.module.ApplicationContextModule
import dagger.Component

@Component(modules = [
    ApplicationContextModule::class
])
interface ApplicationComponent {
}