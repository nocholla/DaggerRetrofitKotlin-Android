package com.nocholla.dagger.retrofit.kotlin

import android.app.Application
import com.nocholla.dagger.retrofit.kotlin.di.component.ApplicationComponent
import com.nocholla.dagger.retrofit.kotlin.di.component.DaggerApplicationComponent
import com.nocholla.dagger.retrofit.kotlin.di.module.ApplicationModule

class BaseApp: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}