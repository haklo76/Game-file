package com.hnw.meid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AddAccount extends AppCompatActivity {
    ImageView iv;
    TextView welcome;

    public native void loginKey(View view);

    public native void loginPhone(View view);

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    /* access modifiers changed from: protected */
    @Override
    public native void onResume();
}
