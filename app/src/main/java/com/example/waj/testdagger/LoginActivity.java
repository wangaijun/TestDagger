package com.example.waj.testdagger;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

class LoginActivity extends Activity implements ICommonView {
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

        DaggerCommonComponent.builder().commonModule(new CommonModule(this)).build().inject(this);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(new User());
            }
        });
    }


}
