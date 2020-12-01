package com.thomas.note.common

import android.view.View
import com.billy.android.loading.Gloading
import com.thomas.base.ui.BaseActivity
import com.thomas.note.common.helper.EventHelper

abstract class AbstractActivity : BaseActivity() {
    protected var holder: Gloading.Holder? = null
    override fun isNeedRegister(): Boolean {
        return false
    }

    override fun onStart() {
        super.onStart()
        if (isNeedRegister) {
            EventHelper.register(this)
        }
    }

    override fun isNeedAdapt(): Boolean {
        return false
    }

    override fun setAdaptScreen(): Int {
        return 360
    }

    override fun isTransparent(): Boolean {
        return true
    }

    override fun onThomasClick(view: View) {}

    override fun onDestroy() {
        if (isNeedRegister) {
            EventHelper.unregister(this)
        }
        super.onDestroy()
    }
}