package com.example.secondapplication;

import android.app.Application;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
/**
 * 负责提供支持依赖注入类的实例
 * */
@Module
public class MainModule {
    private final Application mApp;

    public MainModule(Application application){
        mApp = application;
    }

    @Provides
    @Singleton
    protected Application provideApplication(){
        return mApp;
    }

    @Provides
    @Singleton
    protected Resources provideResources() {
        return mApp.getResources();
    }

    @Provides
    @Singleton
    protected User provideUser(){return new User();}
}
