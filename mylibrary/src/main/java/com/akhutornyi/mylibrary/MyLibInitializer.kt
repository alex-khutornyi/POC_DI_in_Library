package com.akhutornyi.mylibrary

import com.akhutornyi.mylibrary.di.DiTreeHolder
import com.akhutornyi.mylibrary.internal.SubDependency

object MyLibInitializer {

    private var isInitialized = false

    fun initialize() {
        DiTreeHolder.setSubDependency(SubDependency())
        isInitialized = true
    }

    fun reset() {
        DiTreeHolder.resetSubDependency()
        isInitialized = false
    }

    fun isInitialized(): Boolean = isInitialized

}