package com.hnw.meid;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class KeyLogin extends AppCompatActivity {
    EditText key;
    Button loginBt;
    EditText name;
    ProgressDialog pd;
    TextView welcome;

    public static native String convertToJsonString(ArrayList arrayList);

    public native void checkKey(String str, String str2);

    public native void hideLoading();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    public native void showLoading();

    public native void showToast(String str);
}
