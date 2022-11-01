package com.example.tablayoutviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Test extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tabLayout = findViewById(R.id.main_tabLayout);
        viewPager = findViewById(R.id.main_pager);
    }
}