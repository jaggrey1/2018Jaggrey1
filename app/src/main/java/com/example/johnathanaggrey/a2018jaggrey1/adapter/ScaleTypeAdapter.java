package com.example.johnathanaggrey.a2018jaggrey1.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ScaleTypeAdapter extends PagerAdapter {
    private final List<View> viewList;

    public ScaleTypeAdapter(List<View> viewList) {

        this.viewList = viewList;
    }

    @Override
    public int getCount() {
    //    System.out.print("SystemCall: getCount");
        Log.d("Trace", "getCount");
        return viewList.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewList.get(position), 0);
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(viewList.get(position));
        Log.e("Trace", "destroyItem");
        Log.i("Trace", String.valueOf(position));
    }
}
