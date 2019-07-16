package com.nocholla.dagger.retrofit.kotlin.di.component

import com.nocholla.dagger.retrofit.kotlin.di.module.ActivityModule
import com.nocholla.dagger.retrofit.kotlin.ui.main.MainActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}