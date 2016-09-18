package cc.femto.kommon.mvp

import rx.subscriptions.CompositeSubscription

open class MvpBasePresenter<V : MvpView> : MvpPresenter<V> {

    var view: V? = null
    val subscriptions = CompositeSubscription()

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        subscriptions.clear()
        view = null
    }
}