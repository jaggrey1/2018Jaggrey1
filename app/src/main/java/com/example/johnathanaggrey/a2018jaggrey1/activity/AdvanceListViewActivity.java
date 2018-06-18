package com.example.johnathanaggrey.a2018jaggrey1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.johnathanaggrey.a2018jaggrey1.R;
import com.example.johnathanaggrey.a2018jaggrey1.adapter.AdvListAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdvanceListViewActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> list = new ArrayList<String>();
    private AdvListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);

        View view = getLayoutInflater().inflate(R.layout.listview_header, null);

        list.add("Hello!");
        list.add("Hi");
        list.add("Hows going");
        list.add("Perfect");

        listView = findViewById(R.id.adv_lv);
        adapter = new AdvListAdapter(this, list);
        listView.setAdapter(adapter);
        listView.addHeaderView(view);
    }
}
