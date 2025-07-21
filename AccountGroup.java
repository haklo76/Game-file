package com.hnw.meid;

import java.util.List;

/* compiled from: BalanceDetail */
class AccountGroup {
    private List<BalanceDetail> details;
    private String groupName;
    private double totalBalance;

    public native List getDetails();

    public native String getGroupName();

    public native double getTotalBalance();

    public native void setDetails(List list);

    public native void setGroupName(String str);

    public native void setTotalBalance(double d);

    public AccountGroup(String str, double d, List<BalanceDetail> list) {
        this.groupName = str;
        this.totalBalance = d;
        this.details = list;
    }
}
