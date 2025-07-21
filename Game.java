package com.hnw.meid;

public class Game {
    String description;
    String gameLink;
    String imageUrl;
    String name;

    public native String getDescription();

    public native String getGameLink();

    public native String getImageUrl();

    public native String getName();

    public native void setDescription(String str);

    public native void setGameLink(String str);

    public native void setImageUrl(String str);

    public native void setName(String str);

    public Game(String str, String str2, String str3, String str4) {
        this.name = str;
        this.gameLink = str2;
        this.imageUrl = str3;
        this.description = str4;
    }
}
