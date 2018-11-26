package com.example.secondapplication;

import android.app.Application;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class MainModule {
    private final DemoApplication mApp;

    public MainModule(DemoApplication application){
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
}
