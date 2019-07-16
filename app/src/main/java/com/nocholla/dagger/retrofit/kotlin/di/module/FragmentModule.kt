package com.nocholla.dagger.retrofit.kotlin.di.module

import com.nocholla.dagger.retrofit.kotlin.api.ApiServiceInterface
import com.nocholla.dagger.retrofit.kotlin.ui.about.AboutContract
import com.nocholla.dagger.retrofit.kotlin.ui.about.AboutPresenter
import com.nocholla.dagger.retrofit.kotlin.ui.list.ListContract
import com.nocholla.dagger.retrofit.kotlin.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}