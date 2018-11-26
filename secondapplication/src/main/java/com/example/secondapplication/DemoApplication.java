package com.example.secondapplication;

import android.app.Application;

public class DemoApplication extends Application {
    public static DemoGraph sDemoGraph;
    public static DemoApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        buildComponentAndInject();
    }

    public static DemoGraph component(){
        return sDemoGraph;
    }

    public static void buildComponentAndInject(){
        sDemoGraph = DemoComponent.Initializer.init(sInstance);
    }
}
