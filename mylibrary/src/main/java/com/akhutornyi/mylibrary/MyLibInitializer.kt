package com.akhutornyi.mylibrary

import android.app.Application
import com.akhutornyi.mylibrary.di.DiTreeHolder
import com.akhutornyi.mylibrary.internal.SubDependency

object MyLibInitializer {

    private var app: Application? = null


    fun initialize(application: Application) {
        app = application
    }

    internal fun application(): Application =
        app ?: throw IllegalStateException("${MyLibInitializer::class} should be initialized before usage")

    fun reset() {
        app = null
    }

    fun isInitialized(): Boolean = app != null

}