package com.example.mvptest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mvptest.presenter.BasePresenter;

/**
 * autour : lbing
 * date : 2018/6/12 0012 17:26
 * className :
 * version : 1.0
 * description :
 */

//这个要使用泛型。因为要暴露presenter的对象给activity使用
public abstract class BaseActivity<T extends BasePresenter> extends Activity {

    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(this);
    }
    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }


}
