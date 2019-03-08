package com.example.mvptest.presenter;

import java.lang.ref.WeakReference;

/**
 * autour : lbing
 * date : 2018/6/12 0012 17:32
 * className :
 * version : 1.0
 * description :
 */

//要获取activity的引用
public abstract class BasePresenter<T> {

    protected WeakReference<T> iView;

    public BasePresenter(T t) {
        attachView(t);
    }

    //   下面操作主要是防止内存泄漏
    public void attachView(T t) {
        //    用软引用进行包裹
        iView = new WeakReference<T>(t);
    }

    public void detachView() {
        if (iView != null) {
            iView.clear();
            iView = null;
        }
    }

    //    获取数据，可能有些页面并不需要，因此没有设置成abstract
    public void fectchData() {

    }
}
