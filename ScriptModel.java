package com.hnw.meid;

public class ScriptModel {
    public boolean active;
    public String fullPath;
    public String name;
    public String path;
    public String uniqueKey;
    public String x;
    public String y;

    public native String getFullPath();

    public native String getName();

    public native String getPath();

    public native String getUniqueKey();

    public native String getX();

    public native String getY();

    public native boolean isActive();

    public native void setActive(boolean z);

    public native void setFullPath(String str);

    public native void setName(String str);

    public native void setPath(String str);

    public native void setUniqueKey(String str);

    public native void setX(String str);

    public native void setY(String str);

    public ScriptModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.name = str;
        this.path = str2;
        this.fullPath = str3;
        this.uniqueKey = str4;
        this.x = str5;
        this.y = str6;
        this.active = z;
    }
}
