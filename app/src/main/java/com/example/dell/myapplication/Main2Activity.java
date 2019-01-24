package com.example.dell.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.pnikosis.materialishprogress.ProgressWheel;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private ProgressWheel progress_wheel;
    private Button show;
    private Button hine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        progress_wheel = (ProgressWheel) findViewById(R.id.progress_wheel);
        show = (Button) findViewById(R.id.show);
        hine = (Button) findViewById(R.id.hine);
        show.setOnClickListener(this);
        hine.setOnClickListener(this);
        progress_wheel.setBarColor(Color.RED);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.show:
                 progress_wheel.setVisibility(View.VISIBLE);
                break;
            case R.id.hine:
                progress_wheel.setVisibility(View.GONE);
                break;
        }
    }
}
