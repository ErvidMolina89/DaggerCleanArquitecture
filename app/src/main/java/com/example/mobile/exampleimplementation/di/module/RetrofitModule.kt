package com.example.mobile.exampleimplementation.di.module

import com.example.mobile.exampleimplementation.data_access.api.api.ApiMovies
import com.example.mobile.exampleimplementation.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
class RetrofitModule {
    private val BASE_URL = "https://comicvine.gamespot.com/api/"

    @ApplicationScope
    @Provides
    fun providesGsonConverterFactory() = GsonConverterFactory.create()!!

    @ApplicationScope
    @Provides
    fun providesHttpLoginInterceptor() = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @ApplicationScope
    @Provides
    fun providesOkHttpClient(loggingInterceptor: HttpLoggingInterceptor) = OkHttpClient
        .Builder()
        .addInterceptor(loggingInterceptor)
        .connectTimeout(20, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .build()

    @ApplicationScope
    @Provides
    fun providesRetrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory) = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(gsonConverterFactory)
        .build()

    @ApplicationScope
    @Provides
    fun provideApiClient(retrofit: Retrofit) = retrofit.create(ApiMovies::class.java)
}