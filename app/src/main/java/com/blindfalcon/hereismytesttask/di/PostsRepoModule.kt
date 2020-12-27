package com.blindfalcon.hereismytesttask.di

import com.blindfalcon.hereismytesttask.data.mapper.ApiMapperImpl
import com.blindfalcon.hereismytesttask.data.repo.PostsRepoImpl
import org.koin.dsl.module

val postsRepoModule = module {
    single { PostsRepoImpl(get(), get()) }
    single { ApiMapperImpl() }
}