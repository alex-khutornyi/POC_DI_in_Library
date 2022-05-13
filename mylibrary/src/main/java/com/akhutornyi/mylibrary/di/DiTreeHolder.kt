package com.akhutornyi.mylibrary.di

import com.akhutornyi.mylibrary.internal.SubDependency

internal object DiTreeHolder {

    private var subDependency: SubDependency? = null

    internal fun setSubDependency(subDependency: SubDependency) {
        this.subDependency = subDependency
    }

    internal fun resetSubDependency() {
        subDependency = null
    }

    internal fun getSubDependency(): SubDependency =
        subDependency ?: throw IllegalStateException("${SubDependency::class.qualifiedName} is NOT initialized")

}