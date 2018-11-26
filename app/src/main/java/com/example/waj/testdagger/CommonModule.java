package com.example.waj.testdagger;

import com.example.waj.testdagger.annotation.ActivityScope;
import com.example.waj.testdagger.m.User;
import com.example.waj.testdagger.p.LoginPresenter;
import com.example.waj.testdagger.v.ICommonView;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class CommonModule {
    ICommonView iView;

    public CommonModule(ICommonView iView) {
        this.iView = iView;
    }

    @Provides
    @ActivityScope
    ICommonView provideICommonView()  {
        return iView;
    }

//    @Provides
//    @ActivityScope
//    LoginPresenter provideLoginPresenter(){return new LoginPresenter(iView);}

    @Provides
    @ActivityScope
    User provideIUser(){return new User();}
}