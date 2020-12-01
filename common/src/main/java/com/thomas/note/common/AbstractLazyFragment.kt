package com.thomas.note.common

import android.view.View
import com.billy.android.loading.Gloading
import com.thomas.base.ui.LazyFragment
import com.thomas.note.common.helper.EventHelper

abstract class AbstractLazyFragment : LazyFragment() {
    protected var holder: Gloading.Holder? = null
    override fun isTransparent(): Boolean {
        return true
    }

    override fun setContentView() {
        super.setContentView()
    }

    override fun onFirstUserVisible() {
        if (isNeedRegister) {
            EventHelper.register(this)
        }
    }

    override fun onUserVisible() {
        if (isNeedRegister) {
            EventHelper.register(this)
        }
    }

    override fun onUserInvisible() {
        if (isNeedRegister) {
            EventHelper.unregister(this)
        }
    }

    override fun destroyViewAndThing() {
        if (isNeedRegister) {
            EventHelper.unregister(this)
        }
    }

    override fun onThomasClick(view: View) {}
}