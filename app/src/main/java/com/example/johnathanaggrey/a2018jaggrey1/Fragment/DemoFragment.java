package com.example.johnathanaggrey.a2018jaggrey1.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.johnathanaggrey.a2018jaggrey1.R;
import com.example.johnathanaggrey.a2018jaggrey1.activity.AdvanceListViewActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.IntentAndBundleActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.LaunchModeActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.NinePatchActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.NotificationActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.ScaleTypeActivity;
import com.example.johnathanaggrey.a2018jaggrey1.activity.ViewPageActivity;
import com.example.johnathanaggrey.a2018jaggrey1.adapter.MainListAdapter;
import com.example.johnathanaggrey.a2018jaggrey1.adapter.ViewPageAdapter;
import com.example.johnathanaggrey.a2018jaggrey1.bean.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {
    private MainListAdapter adapter;
    public List<String> list = new ArrayList<String>();
    private ListView listView;

    public DemoFragment() {
        list.add("LaunchMode");
        list.add("SimpleViewPager");
        list.add("9Patch");
        list.add("ScaleType");
        list.add("Intent$Bundle");
        list.add("Notification");
        list.add("AdvanceListView");
        list.add("AdvanceViewPager");
        list.add("RadioGroup");
        list.add("CheckBox");
        list.add("Dialogs");
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container,false);
        listView = view.findViewById(R.id.main_demo_lv);
        adapter = new MainListAdapter(getContext(), list);
        listView.setAdapter(adapter);
       // View headerView = new View(getActivity());
       // listView.addHeaderView(headerView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent = new Intent();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // go to LaunchModeActivity
                        intent.setClass(getActivity(), LaunchModeActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.setClass(getActivity(), ViewPageActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.setClass(getActivity(), NinePatchActivity.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent.setClass(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setClass(getActivity(), IntentAndBundleActivity.class);
                        intent.putExtra("Msg", "Say Hello!");
                        intent.putExtra("No", 10);
                        Base newBase = new Base();
                        newBase.setName("Yan");
                        Bundle bundle = new Bundle();
                        bundle.putInt("B_Msg", 100);
                        bundle.putString("B_Msg", "FromBundle");
                        bundle.putSerializable("Base", newBase);
                        intent.putExtra("B", bundle);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setClass(getActivity(), NotificationActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.setClass(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent);
                        break;
                    default:
                }
            }
        });
        return view;
    }

}
