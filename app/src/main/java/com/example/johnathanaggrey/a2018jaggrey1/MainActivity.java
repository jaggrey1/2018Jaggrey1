package com.example.johnathanaggrey.a2018jaggrey1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.johnathanaggrey.a2018jaggrey1.Fragment.DemoFragment;
import com.example.johnathanaggrey.a2018jaggrey1.Fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private Button orgButton;
    private Button picButton;

    private Button demoButton;
    private Button workButton;
    private LinearLayout fragmentLayout;

    private DemoFragment demoFragment;
    private WorkFragment workFragment;

    public void onBack(View v){
        Toast.makeText(MainActivity.this,"Orange_Back!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoFragment = new DemoFragment();
        workFragment = new WorkFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout,demoFragment).commit();

        orgButton = findViewById(R.id.main_title_bt_org);
        picButton = findViewById(R.id.main_title_bt_pic);

        demoButton = findViewById(R.id.main_tool_demo);
        demoButton.setTextColor(Color.RED);
        workButton = findViewById(R.id.main_tool_work);


        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Picture Button!", Toast.LENGTH_SHORT).show();
            }
        });

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.RED);
                workButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, demoFragment).commit();
            }
        });
        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.BLACK);
                workButton.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, workFragment).commit();
            }
        });
    }
}
