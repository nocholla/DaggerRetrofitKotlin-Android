package com.nocholla.dagger.retrofit.kotlin.di.component

import com.nocholla.dagger.retrofit.kotlin.BaseApp
import com.nocholla.dagger.retrofit.kotlin.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}