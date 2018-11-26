package com.example.waj.testdagger.p;

import com.example.waj.testdagger.v.ICommonView;

import javax.inject.Inject;

public class SecondPresenter {
    private ICommonView iView;

    @Inject
    public SecondPresenter(ICommonView iView) {
        this.iView = iView;
    }
}
