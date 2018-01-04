package cc.femto.kommon.mvp

import io.reactivex.disposables.CompositeDisposable


open class MvpBasePresenter<V : MvpView> : MvpPresenter<V> {

    var view: V? = null
    val disposables = CompositeDisposable()

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        disposables.clear()
        view = null
    }
}