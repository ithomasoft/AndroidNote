package com.thomas.note.common

import com.thomas.base.mvp.BaseMvpPresenter
import com.thomas.base.mvp.IBaseMvpView

/**
 * @author Thomas
 */
abstract class AbstractMvpActivity<P : BaseMvpPresenter<*, *>?> : AbstractActivity(), IBaseMvpView {
    protected var presenter: P? = null
    override fun setContentView() {
        super.setContentView()
        //创建present
        presenter = createPresenter()
        presenter?.attachView(this as Nothing?)
    }

    override fun onDestroy() {
        super.onDestroy()
        //解除绑定，避免内存泄露
        if (presenter != null) {
            presenter!!.detachView()
            presenter = null
        }
    }

    protected abstract fun createPresenter(): P
}