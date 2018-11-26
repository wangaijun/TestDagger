package com.example.secondapplication;

import android.app.Application;
import dagger.Component;

import javax.inject.Singleton;
/**
 * 组件负责将模块注册入类中
 *
 * */
@Singleton
@Component(modules = {MainModule.class})
public interface DemoComponent{
    void inject(MainActivity mainActivity);
    final class Initializer{
        private Initializer(){}
        public static DemoComponent init(Application app){
            return DaggerDemoComponent.builder()
                    .mainModule(new MainModule(app))
                    .build();
        }
    }
}
