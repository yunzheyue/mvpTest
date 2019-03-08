package com.example.mvptest.presenter;

import com.example.mvptest.bean.Girl;
import com.example.mvptest.model.IModel;
import com.example.mvptest.model.IMainModelIml;
import com.example.mvptest.view.IGirlView;

import java.util.List;

/**
 * autour : lbing
 * date : 2018/6/12 0012 17:35
 * className :
 * version : 1.0
 * description :
 */


public class MainPresenter extends BasePresenter<IGirlView> {

    private IGirlView iGrilView;

    private IMainModelIml iMainModelIml = new IMainModelIml();


    public MainPresenter(IGirlView iGrilView) {
        this.iGrilView = iGrilView;
    }

    @Override
    public void fectchData() {
        super.fectchData();
        iGrilView.showLoading();
        iMainModelIml.getDataFromNet(new IModel.LoadLitener<List<Girl>>() {
            @Override
            public void onLoadedLitener(List<Girl> girls) {
                iGrilView.showGirlsList(girls);
            }

            @Override
            public void onErrorListener(String error) {

            }
        });
    }

}
