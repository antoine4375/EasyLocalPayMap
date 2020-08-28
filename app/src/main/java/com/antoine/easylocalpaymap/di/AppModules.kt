package com.antoine.easylocalpaymap.di

import com.antoine.easylocalpaymap.model.service.LocalPlaceRepository
import com.antoine.easylocalpaymap.model.service.OpenDataService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single<OpenDataService> {
        Retrofit.Builder()
            .baseUrl("https://openapi.gg.go.kr/")
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OpenDataService::class.java)
    }
    factory { LocalPlaceRepository(get()) }
}

val appModules = listOf(apiModule)