package com.akhutornyi.mylibrary.internal

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class SubDependency @Inject constructor() {

    fun print(message: String) {
        Timber.e("print: hash=${hashCode()}, message=$message")
    }

}