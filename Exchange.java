package com.hnw.meid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exchange extends AppCompatActivity {
    ViewPagerAdapter adapter;
    ProgressBar loading;
    Button retryButton;
    Map<String, List<Map<String, Object>>> tabDataMap = new HashMap();
    List<Integer> tabIcons = Arrays.asList(new Object[]{new Integer(R.drawable.ic_super), new Integer(R.drawable.ic_data), new Integer(R.drawable.ic_phone_in_talk_outline), new Integer(R.drawable.ic_message)});
    TabLayout tabLayout;
    List<String> tabTitles = new ArrayList();
    ViewPager viewPager;

    /* access modifiers changed from: private */
    public native void fetchData();

    /* access modifiers changed from: private */
    public native void setupViewPager();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);
}
