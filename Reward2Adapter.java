package com.hnw.meid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import java.util.List;

public class Reward2Adapter extends ArrayAdapter<RewardItem> {
    private final String type;

    @NonNull
    @Override
    public native View getView(int i, View view, ViewGroup viewGroup);

    public Reward2Adapter(Context context, List<RewardItem> list, String str) {
        super(context, 0, list);
        this.type = str;
    }
}
