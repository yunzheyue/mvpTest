package com.example.mvptest.model;


import java.util.List;

/**
 * autour : lbing
 * date : 2018/6/12 0012 17:41
 * className :
 * version : 1.0
 * description :
 */


public interface IModel {

    void getDataFromNet(LoadLitener onOnLoadedLitener);

    interface LoadLitener<T> {
        void onLoadedLitener(T data);
        void onErrorListener(String error);
    }

}
