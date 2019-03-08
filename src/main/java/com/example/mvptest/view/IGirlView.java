package com.example.mvptest.view;

import com.example.mvptest.bean.Girl;

import java.util.List;

/**
 * autour : lbing
 * date : 2018/6/12 0012 17:28
 * className :
 * version : 1.0
 * description :
 */


public interface IGirlView extends IView {

    void showLoading();

    void showGirlsList(List<Girl> girls);

}
