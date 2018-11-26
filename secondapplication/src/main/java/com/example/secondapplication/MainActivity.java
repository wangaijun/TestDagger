package com.example.secondapplication;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;
/**
 * 1. 注入负责在类中注入依赖，将类的实例注入至声明
 *
 * */
class MainActivity extends Activity {
    @Inject
    Application myApp;
    @Inject
    Resources myResource;
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoComponent.Initializer.init(this.getApplication()).inject(this);

        TextView tv = findViewById(R.id.tv);
        tv.append("\n");
        tv.append(myApp.toString());
        tv.append("\n");
        tv.append(myResource.toString());
        tv.append("\n");
        tv.append(user.toString());
    }
}
