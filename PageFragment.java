package com.hnw.meid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    private static final String SOURCE_TEXT = "source";
    private static final String TITLE_TEXT = "title";

    public static native PageFragment newInstance(String str, String str2);

    @Override
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
}
