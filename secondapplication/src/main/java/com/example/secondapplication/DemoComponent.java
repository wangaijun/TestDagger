package com.example.secondapplication;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {MainModule.class})
public interface DemoComponent extends DemoGraph{
    final class Initializer{
        private Initializer(){}
        public static DemoComponent init(DemoApplication app){
            return DaggerDemoComponent.builder()
                    .mainModule(new MainModule(app))
                    .build();
        }
    }
}
