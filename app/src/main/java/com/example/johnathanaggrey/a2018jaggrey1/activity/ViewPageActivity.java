package com.example.johnathanaggrey.a2018jaggrey1.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.johnathanaggrey.a2018jaggrey1.Fragment.DemoFragment;
import com.example.johnathanaggrey.a2018jaggrey1.Fragment.WorkFragment;
import com.example.johnathanaggrey.a2018jaggrey1.R;
import com.example.johnathanaggrey.a2018jaggrey1.adapter.ViewPageAdapter;

import java.util.ArrayList;

public class ViewPageActivity extends AppCompatActivity {

    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);
        viewPager = findViewById(R.id.viewpager_vp);
        fragmentList.add(new DemoFragment());
        fragmentList.add(new WorkFragment());
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        adapter.updateList(fragmentList);
    }
}
