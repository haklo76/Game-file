package com.hnw.meid;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Login extends AppCompatActivity {
    Button getOtp;
    boolean hasKey = false;
    boolean hasOtp = false;
    EditText otp;
    ProgressDialog pd;
    EditText phone;
    String regPhone;
    String regkey;
    TextView welcome;

    public static native String convertToJsonString(ArrayList arrayList);

    /* access modifiers changed from: private */
    public native void login(String str, String str2);

    public native void checkKey(String str, String str2);

    public native String getJsonText(String str, String str2);

    public native void hideLoading();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    public native void sendotp(String str);

    public native void showLoading();

    public native void showToast(String str);
}
