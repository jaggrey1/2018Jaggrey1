package com.example.johnathanaggrey.a2018jaggrey1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.johnathanaggrey.a2018jaggrey1.R;

import java.util.List;

public class AdvListAdapter extends BaseAdapter {

    private final LayoutInflater inflater;
    private Context context;
    private List<String> list;

    public AdvListAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView==null) {
            convertView = inflater.inflate(R.layout.item_adv_listview, parent, false);
            TextView textLeft = convertView.findViewById(R.id.item_adv_left_tv);
            TextView textRight = convertView.findViewById(R.id.item_adv_right_tv);
            holder.textLeft = textLeft;
            holder.textRight = textRight;
            convertView.setTag(holder);
        }
        holder = (ViewHolder) convertView.getTag();
        holder.textLeft.setText(list.get(position));
        holder.textRight.setText(list.get(position));
        if (position%2==0){
            holder.textLeft.setVisibility(View.VISIBLE);
            holder.textRight.setVisibility(View.INVISIBLE);
        } else {
            holder.textLeft.setVisibility(View.INVISIBLE);
            holder.textRight.setVisibility(View.VISIBLE);
        }
        return convertView;
    }

    private class ViewHolder {
        TextView textLeft;
        TextView textRight;
    }
}
