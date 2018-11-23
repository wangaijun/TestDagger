package com.example.waj.testdagger.v;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.example.waj.testdagger.*;
import com.example.waj.testdagger.m.User;
import com.example.waj.testdagger.p.LoginPresenter;

import javax.inject.Inject;

public class LoginActivity extends Activity implements ICommonView {
    @Inject
    LoginPresenter presenter;

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommonModule commonModule = new CommonModule(this);

        CommonComponent build = DaggerCommonComponent.builder().commonModule(commonModule).build();

        build.inject(this);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(new User());
            }
        });
    }


}
