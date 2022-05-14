package com.akhutornyi.mylibrary

import com.akhutornyi.mylibrary.di.DiTreeHolder
import com.akhutornyi.mylibrary.internal.SubDependency
import timber.log.Timber
import javax.inject.Inject

class SomeDependency {

    private val subDependency: SubDependency = DiTreeHolder.getAnalyticsComponent().subDependency()

    fun doSomeWork(message: String) {
        Timber.e("doSomeWork: hash=${hashCode()}, message=$message")
        subDependency.print(message)
    }

}