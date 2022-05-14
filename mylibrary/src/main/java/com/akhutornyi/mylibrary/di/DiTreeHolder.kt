package com.akhutornyi.mylibrary.di


internal object DiTreeHolder {

    private var analyticsComponent: AnalyticsComponent? = null

    internal fun initialize() {
        analyticsComponent = DaggerAnalyticsComponent.create()
    }

    internal fun reset() {
        analyticsComponent = null
    }
    internal fun getAnalyticsComponent(): AnalyticsComponent =
        analyticsComponent ?: throw IllegalStateException("${AnalyticsComponent::class.qualifiedName} is NOT initialized")

}