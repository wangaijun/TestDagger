package com.example.waj.testdagger;

import com.example.waj.testdagger.annotation.ActivityScope;
import com.example.waj.testdagger.v.LoginActivity;
import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(LoginActivity activity);
}