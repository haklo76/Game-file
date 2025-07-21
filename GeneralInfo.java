package com.hnw.meid;

/* compiled from: BalanceDetail */
class GeneralInfo {
    private String blockOneWay;
    private String blockTwoWay;
    private BalanceDetail mainBalance;
    private String number;

    public native String getBlockOneWay();

    public native String getBlockTwoWay();

    public native BalanceDetail getMainBalance();

    public native String getNumber();

    public native void setBlockOneWay(String str);

    public native void setBlockTwoWay(String str);

    public native void setMainBalance(BalanceDetail balanceDetail);

    public native void setNumber(String str);

    public GeneralInfo(String str, String str2, String str3, BalanceDetail balanceDetail) {
        this.number = str;
        this.blockOneWay = str2;
        this.blockTwoWay = str3;
        this.mainBalance = balanceDetail;
    }
}
