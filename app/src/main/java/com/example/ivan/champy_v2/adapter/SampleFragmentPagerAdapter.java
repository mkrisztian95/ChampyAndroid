package com.example.ivan.champy_v2.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ivan.champy_v2.fragment.PendingFragment;
import com.example.ivan.champy_v2.fragment.FriendsFragment;
import com.example.ivan.champy_v2.fragment.OtherFragment;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Friends", "Pending", "Other" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override // если что-то пойдет не так, то удалить (return null) и сменить "Case 2" на "return".
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return new FriendsFragment();
            case 1: return new PendingFragment();
            case 2: return new OtherFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}