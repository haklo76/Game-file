package com.hnw.meid;

public class FileHelper {
    private static native void createNewFile(String str);

    public static native String[] getAccounts();

    public static native String getPublicDir(String str);

    public static native boolean isEmptyAccounts();

    public static native boolean isExistFile(String str);

    public static native void makeDir(String str);

    public static native String readFile();

    public static native String readFile(String str);

    public static native void writeFile(String str);

    public static native void writeFile(String str, String str2);
}
