package com.nocholla.dagger.retrofit.kotlin.ui.base

class BaseContract {
    interface Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view: T)
    }

    interface View {

    }
}