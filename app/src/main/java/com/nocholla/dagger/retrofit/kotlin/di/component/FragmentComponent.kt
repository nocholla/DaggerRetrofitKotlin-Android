package com.nocholla.dagger.retrofit.kotlin.di.component

import com.nocholla.dagger.retrofit.kotlin.di.module.FragmentModule
import com.nocholla.dagger.retrofit.kotlin.ui.about.AboutFragment
import com.nocholla.dagger.retrofit.kotlin.ui.list.ListFragment
import dagger.Component

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}