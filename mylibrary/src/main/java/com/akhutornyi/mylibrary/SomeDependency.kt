package com.akhutornyi.mylibrary

import com.akhutornyi.mylibrary.internal.SubDependency
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import timber.log.Timber

class SomeDependency {

    private val subDependency: SubDependency =
        EntryPointAccessors.fromApplication(MyLibInitializer.application(), DiEntryPoint::class.java)
            .subDependency()

    fun doSomeWork(message: String) {
        Timber.e("doSomeWork: hash=${hashCode()}, message=$message")
        subDependency.print(message)
    }

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    internal interface DiEntryPoint {
        fun subDependency(): SubDependency
    }

}