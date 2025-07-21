package com.hnw.meid;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BgAdapter extends FragmentPagerAdapter {
    String[] sources;
    String[] titles;

    @Override
    public native int getCount();

    @Override
    public native Fragment getItem(int i);

    public BgAdapter(FragmentManager fragmentManager, String[] strArr, String[] strArr2) {
        super(fragmentManager);
        this.titles = strArr;
        this.sources = strArr2;
    }
}
