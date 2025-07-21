package com.hnw.meid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class RewardListFragment extends Fragment {
    private static final String ARG_TYPE = "type";
    Reward2Adapter adapter;
    List<RewardItem> itemList = new ArrayList();
    ListView listView;
    ProgressBar progressBar;
    Button retryButton;
    /* access modifiers changed from: private */
    public String type;

    /* access modifiers changed from: private */
    public native void loadData();

    public static native RewardListFragment newInstance(String str);

    /* access modifiers changed from: private */
    public native void showList(boolean z);

    private native void showLoading(boolean z);

    /* access modifiers changed from: private */
    public native void showRetry();

    /* access modifiers changed from: private */
    public native void showRetryOnUi();

    @Override
    public native void onCreate(Bundle bundle);

    @Nullable
    @Override
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
}
