package com.example.johnathanaggrey.a2018jaggrey1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.johnathanaggrey.a2018jaggrey1.R;

import java.util.List;

public class MainListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    private List<String> list;

    public MainListAdapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_main,parent,false);
            TextView textView = convertView.findViewById(R.id.main_adapter_tv);
            convertView.setTag(textView);
        }
        TextView textView = (TextView) convertView.getTag();
        textView.setText(list.get(position));
        return convertView;
    }
}
