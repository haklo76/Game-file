package com.hnw.meid;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.InputStream;

public class HApp extends Application {
    public static SharedPreferences.Editor editor;
    private static Context mApplicationContext;
    public static SharedPreferences sharedPreferences;
    int selectedTheme;

    public static native InputStream convertToStream(String str);

    public static native String convertToString(InputStream inputStream);

    public static native void copyText(String str);

    public static native String d(String str, String str2);

    public static native String decrypt(String str);

    public static native Context getContext();

    public static native String getInit();

    public static native int getInt(String str, int i);

    public static native String getKey();

    public static native String getKey(String str);

    public static native SharedPreferences getPref();

    public static native String getStr(String str, String str2);

    public static native String getStringFromAssets(String str);

    public static native void mkey();

    public static native void removeString(String str);

    public static native void saveInt(String str, int i);

    public static native void saveString(String str, String str2);

    public static native void showMessage(String str);

    public native void onCreate();

    public native void subscribe();

    static {
        System.loadLibrary("Hnin");
    }
}
