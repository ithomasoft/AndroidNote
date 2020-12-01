package com.thomas.note.common

import android.view.View
import com.billy.android.loading.Gloading
import com.thomas.base.ui.BaseFragment
import com.thomas.note.common.helper.EventHelper

abstract class AbstractFragment : BaseFragment() {
    protected var holder: Gloading.Holder? = null
    override fun isTransparent(): Boolean {
        return true
    }

    override fun onStart() {
        super.onStart()
        if (isNeedRegister) {
            EventHelper.register(this)
        }
    }

    override fun onDestroyView() {
        if (isNeedRegister) {
            EventHelper.unregister(this)
        }
        super.onDestroyView()
    }

    override fun onThomasClick(view: View) {}
}