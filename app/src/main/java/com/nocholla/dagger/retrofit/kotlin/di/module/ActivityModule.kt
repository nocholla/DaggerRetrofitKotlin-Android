package com.nocholla.dagger.retrofit.kotlin.di.module

import android.app.Activity
import com.nocholla.dagger.retrofit.kotlin.ui.main.MainContract
import com.nocholla.dagger.retrofit.kotlin.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}