package cc.femto.kommon.mvp

interface MvpPresenter<V : MvpView> {

    /**
     * Attaches the [MvpView] to the presenter.
     * Typically called in [android.view.View.onAttachedToWindow()]
     */
    fun onAttach(view: V)

    /**
     * Typically called in [android.view.View.onDetachedFromWindow()]
     */
    fun onDetach()
}