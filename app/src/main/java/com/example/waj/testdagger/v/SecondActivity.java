package com.example.waj.testdagger.v;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.example.waj.testdagger.R;
import com.example.waj.testdagger.d.CommonModule;
import com.example.waj.testdagger.d.DaggerSecondComponent;
import com.example.waj.testdagger.p.SecondPresenter;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class SecondActivity extends Activity implements ICommonView {
    @Inject
    SecondPresenter secondPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DaggerSecondComponent.builder().commonModule(new CommonModule(this)).build().inject(this);
    }

    @NotNull
    @Override
    public Context getContext() {
        return this.getApplicationContext();
    }
}
