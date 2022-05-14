package com.akhutornyi.mylibrary

import com.akhutornyi.mylibrary.di.DiTreeHolder

object MyLibInitializer {

    private var isInitialized = false

    fun initialize() {
        DiTreeHolder.initialize()
        isInitialized = true
    }

    fun reset() {
        DiTreeHolder.reset()
        isInitialized = false
    }

    fun isInitialized(): Boolean = isInitialized

}