package com.walden.javadesignmode.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.bean.StragegyBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/20 0020.
 */

public class MainPageAdapter extends BaseAdapter {
    public ArrayList<StragegyBean> mData;
    private Context mContext;

    public MainPageAdapter(ArrayList<StragegyBean> data, Context context) {
        mData = data;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(mContext, R.layout.stragegy_mode_item, null);
        TextView tv = (TextView) view.findViewById(R.id.item);
        tv.setText(position+1+"-"+mData.get(position).name);
        return view;
    }
}
