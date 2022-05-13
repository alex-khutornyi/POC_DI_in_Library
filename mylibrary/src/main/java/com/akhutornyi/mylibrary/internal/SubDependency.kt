package com.akhutornyi.mylibrary.internal

import timber.log.Timber

internal class SubDependency {

    fun print(message: String) {
        Timber.e("print: hash=${hashCode()}, message=$message")
    }

}