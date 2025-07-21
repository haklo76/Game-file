package com.hnw.meid;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import java.util.Map;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private Map<String, List<Map<String, Object>>> tabDataMap;
    private List<String> tabTitles;

    @Override
    public native int getCount();

    @Override
    public native Fragment getItem(int i);

    @Override
    public native CharSequence getPageTitle(int i);

    public ViewPagerAdapter(FragmentManager fragmentManager, List<String> list, Map<String, List<Map<String, Object>>> map) {
        super(fragmentManager);
        this.tabTitles = list;
        this.tabDataMap = map;
    }
}
