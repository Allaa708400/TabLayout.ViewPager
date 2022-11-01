package com.example.tablayoutviewpager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
  //  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
       // setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.main_tabLayout);
       viewPager = findViewById(R.id.main_pager);


      PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

      adapter.addTab(new MyTab("Food",CategoryFragment.newInstance(1, "Food")));
      adapter.addTab(new MyTab("Drinks",CategoryFragment.newInstance(2, "Drinks")));
      adapter.addTab(new MyTab("Deserts",CategoryFragment.newInstance(3, "Deserts")));
      adapter.addTab(new MyTab("Other",CategoryFragment.newInstance(4, "Other")));

      viewPager.setAdapter(adapter);
      tabLayout.setupWithViewPager(viewPager);

      tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "un_selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "re_selected", Toast.LENGTH_SHORT).show();
            }
        });
      viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
});

    }
}
   /*
      // PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

     //  adapter.addTab(new
         //      MyTab("Food",CategoryFragment.newInstance(1, "Food")));
       // adapter.addTab(new

           // MyTab("Drinks",CategoryFragment.newInstance(2, "Drinks")));
        //adapter.addTab(new

          //  MyTab("Deserts",CategoryFragment.newInstance(3, "Deserts")));
        //adapter.addTab(new

          //  MyTab("Other",CategoryFragment.newInstance(4, "Other")));

      // viewPager.setAdapter(adapter);
    */