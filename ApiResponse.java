package com.hnw.meid;

import java.util.List;

/* compiled from: BalanceDetail */
class ApiResponse {
    private List<AccountGroup> accounts;
    private int errorCode;
    private GeneralInfo generalInfo;
    private String message;

    public native List getAccounts();

    public native int getErrorCode();

    public native GeneralInfo getGeneralInfo();

    public native String getMessage();

    public native void setAccounts(List list);

    public native void setErrorCode(int i);

    public native void setGeneralInfo(GeneralInfo generalInfo2);

    public native void setMessage(String str);

    public ApiResponse(int i, String str, GeneralInfo generalInfo2, List<AccountGroup> list) {
        this.errorCode = i;
        this.message = str;
        this.generalInfo = generalInfo2;
        this.accounts = list;
    }
}
