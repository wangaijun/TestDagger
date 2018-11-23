package com.example.waj.testdagger.annotation;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Scope //标记局部单例
@Retention(RetentionPolicy.RUNTIME)//保留策略：运行时
public @interface ActivityScope {
}

/**
 * 被它标记的对象生命周期与对应的Activity相同
 * */
