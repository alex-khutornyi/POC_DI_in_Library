package com.akhutornyi.pocdiinlibrary

import android.app.Application
import com.akhutornyi.mylibrary.MyLibInitializer
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLogger()
        setupMyLibrary()
    }

    private fun setupLogger() {
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun setupMyLibrary() {
        MyLibInitializer.initialize(this)
    }

}