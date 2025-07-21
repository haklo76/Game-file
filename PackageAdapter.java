package com.hnw.meid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.hnw.meid.Models.PackageItem;
import java.util.List;

public class PackageAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    List<PackageItem> packageList;

    @Override
    public native int getCount();

    @Override
    public native Object getItem(int i);

    @Override
    public native long getItemId(int i);

    @Override
    public native View getView(int i, View view, ViewGroup viewGroup);

    public PackageAdapter(Context context2, List<PackageItem> list) {
        this.context = context2;
        this.packageList = list;
        this.inflater = LayoutInflater.from(context2);
    }
}
