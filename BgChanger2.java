package com.hnw.meid;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.hnw.meid.CardView.CardFragmentPagerAdapter;
import com.hnw.meid.CardView.ShadowTransformer;

public class BgChanger2 extends AppCompatActivity {
    private CardFragmentPagerAdapter mFragmentCardAdapter;
    private ShadowTransformer mFragmentCardShadowTransformer;
    private ViewPager mViewPager;

    public static native float dpToPixels(int i, Context context);

    public native void initializeLogic();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);
}
