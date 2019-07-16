package com.nocholla.dagger.retrofit.kotlin.di.module

import android.app.Application
import com.nocholla.dagger.retrofit.kotlin.BaseApp
import com.nocholla.dagger.retrofit.kotlin.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}