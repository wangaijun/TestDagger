package com.example.waj.testdagger.p

import android.widget.Toast
import com.example.waj.testdagger.m.User
import com.example.waj.testdagger.v.ICommonView
import javax.inject.Inject

class LoginPresenter {
    private var iView: ICommonView

    @Inject
    constructor(iView: ICommonView) {
        this.iView = iView
    }


    fun login(user: User) {
        Toast.makeText(iView.getContext(),"${user.id},${user.userName},${user.pwd},login......",Toast.LENGTH_LONG).show()
    }
}