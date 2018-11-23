package com.example.waj.testdagger;

import com.example.waj.testdagger.annotation.ActivityScope;
import com.example.waj.testdagger.v.ICommonView;
import dagger.Module;
import dagger.Provides;

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
}