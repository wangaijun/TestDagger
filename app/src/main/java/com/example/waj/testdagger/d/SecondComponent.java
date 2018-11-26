package com.example.waj.testdagger.d;

import com.example.waj.testdagger.annotation.ActivityScope;
import com.example.waj.testdagger.v.SecondActivity;
import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface SecondComponent {
    void inject(SecondActivity activity);
}