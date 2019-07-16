package com.nocholla.dagger.retrofit.kotlin.ui.list

import com.nocholla.dagger.retrofit.kotlin.model.DetailsViewModel
import com.nocholla.dagger.retrofit.kotlin.model.Post
import com.nocholla.dagger.retrofit.kotlin.ui.base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}