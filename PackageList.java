package com.hnw.meid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.hnw.meid.Models.PackageItem;
import java.util.ArrayList;
import java.util.List;

public class PackageList extends AppCompatActivity {
    PackageAdapter adapter;
    List<PackageItem> dataList = new ArrayList();
    GridView gridView;
    ProgressBar progressBar;
    Button retryButton;

    public native void getPackage();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);
}
