package com.blindfalcon.hereismytesttask.di

import com.blindfalcon.hereismytesttask.data.api.ApplicationApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(ApplicationApi::class.java) }
}