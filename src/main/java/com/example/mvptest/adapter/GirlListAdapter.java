package com.example.mvptest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvptest.R;
import com.example.mvptest.bean.Girl;

import java.util.List;


/**
 * Created by david on 3/3/2017.
 */

public class GirlListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Girl> data;

    public GirlListAdapter(Context context, List<Girl> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_v1, null);
        Girl g = data.get(position);
        ImageView iv_icon = (ImageView) view.findViewById(R.id.iv_icon);
        iv_icon.setImageResource(g.icon);

        TextView tv_like = (TextView) view.findViewById(R.id.tv_like);
        tv_like.setText("喜欢程度："+g.like);

        TextView tv_style = (TextView) view.findViewById(R.id.tv_style);
        tv_style.setText(g.style);

        return view;
    }

}
