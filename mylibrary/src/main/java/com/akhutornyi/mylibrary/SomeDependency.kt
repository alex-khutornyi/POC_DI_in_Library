package com.akhutornyi.mylibrary

import com.akhutornyi.mylibrary.di.DiTreeHolder
import com.akhutornyi.mylibrary.internal.SubDependency
import timber.log.Timber

class SomeDependency {

    private val subDependency: SubDependency = DiTreeHolder.getSubDependency()

    fun doSomeWork(message: String) {
        Timber.e("doSomeWork: hash=${hashCode()}, message=$message")
        subDependency.print(message)
    }

}