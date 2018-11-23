package com.example.waj.testdagger

import android.widget.Toast
import javax.inject.Inject

class LoginPresenter {
    lateinit var iView:ICommonView

    @Inject
    constructor(iView: ICommonView) {
        this.iView = iView
    }


    fun login(user: User) {
        Toast.makeText(iView.getContext(),"login......",Toast.LENGTH_LONG).show()
    }
}