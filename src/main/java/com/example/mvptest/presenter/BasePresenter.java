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

    protected WeakReference<T> weakReference;

    public void attachView(T t) {
//        用软引用进行包裹
        weakReference = new WeakReference<T>(t);
    }

    public void detachView() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    //    获取数据
    public void fectchData() {

    }
}
