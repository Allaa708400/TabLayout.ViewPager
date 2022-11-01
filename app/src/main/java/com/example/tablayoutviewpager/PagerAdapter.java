package com.example.tablayoutviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.Objects;

public class PagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<MyTab> taps = new ArrayList<>();

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addTab(MyTab tab){
        taps.add(tab);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return taps.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return taps.get(position).getTabName();
    }

    @Override
    public int getCount() {
        return taps.size();
    }
}