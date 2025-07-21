package com.hnw.meid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class PointHistory extends AppCompatActivity {
    ViewPagerAdapter adapter;
    int[] tabIcons = {R.drawable.ic_plus_circle, R.drawable.ic_minus_circle};
    TabLayout tabLayout;
    ViewPager viewPager;

    private native void setupTabIcons();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> fragmentList = new ArrayList();
        private final List<String> fragmentTitleList = new ArrayList();
        private final PointHistory this$0;

        static native PointHistory access$0(ViewPagerAdapter viewPagerAdapter);

        public native void addFragment(Fragment fragment, String str);

        @Override
        public native int getCount();

        @Override
        public native Fragment getItem(int i);

        @Override
        public native CharSequence getPageTitle(int i);

        public ViewPagerAdapter(PointHistory pointHistory, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.this$0 = pointHistory;
        }
    }
}
