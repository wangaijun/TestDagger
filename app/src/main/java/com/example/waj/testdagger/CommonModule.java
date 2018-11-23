package com.example.waj.testdagger;

import dagger.Module;
import dagger.Provides;

@Module
class CommonModule {
    ICommonView iView;

    public CommonModule(ICommonView iView) {
        this.iView = iView;
    }

    @Provides
    @ActivityScope
    ICommonView provideIcommonView()  {
        return iView;
    }
}