package com.akhutornyi.mylibrary.di

import com.akhutornyi.mylibrary.SomeDependency
import com.akhutornyi.mylibrary.internal.SubDependency
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@Singleton
@MergeComponent(AnalyticsScope::class)
internal interface AnalyticsComponent {
    fun subDependency(): SubDependency

    //can be used for field injection
    //but we need to create create an inject(target: SpecificType) extra method
    fun inject(target: SomeDependency)
}