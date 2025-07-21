package com.hnw.meid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;

public class RewardFragment extends Fragment {
    private static final String ARG_REWARDS = "rewards";

    public static native RewardFragment newInstance(List list);

    private native List toStringList(List list);

    @Override
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
}
