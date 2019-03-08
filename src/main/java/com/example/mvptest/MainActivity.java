package com.example.mvptest;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mvptest.adapter.GirlListAdapter;
import com.example.mvptest.bean.Girl;
import com.example.mvptest.presenter.MainPresenter;
import com.example.mvptest.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements IGirlView {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
//        获取数据
        presenter.fectchData();
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this, "正在加载。。。", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirlsList(List<Girl> girls) {
        listview.setAdapter(new GirlListAdapter(this, girls));
    }
}
