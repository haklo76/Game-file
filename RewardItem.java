package com.hnw.meid;

public class RewardItem {
    public int amount;
    public String reason;
    public String updateTime;

    public RewardItem(String str, int i, String str2) {
        this.reason = str;
        this.amount = i;
        this.updateTime = str2;
    }
}
