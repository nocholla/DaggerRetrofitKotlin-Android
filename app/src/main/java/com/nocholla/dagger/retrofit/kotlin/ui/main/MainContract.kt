package com.nocholla.dagger.retrofit.kotlin.ui.main

import com.nocholla.dagger.retrofit.kotlin.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}