package com.hnw.meid;

public class SDUtils {
    public static native String decrypt(String str);

    public static native String encrypt(String str);

    public static native String getInit();

    public static native String getKey();
}
