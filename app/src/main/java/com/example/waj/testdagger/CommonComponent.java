package com.example.waj.testdagger;

import android.util.Log;
import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(LoginActivity activity);
}