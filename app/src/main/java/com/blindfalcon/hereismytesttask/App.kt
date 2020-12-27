package com.blindfalcon.hereismytesttask

import android.app.Application
import com.blindfalcon.hereismytesttask.di.apiModule
import com.blindfalcon.hereismytesttask.di.networkModule
import com.blindfalcon.hereismytesttask.di.postsRepoModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            fragmentFactory()
            modules(
                listOf(
                    apiModule,
                    networkModule,
                    postsRepoModule
                )
            )
        }
    }
}