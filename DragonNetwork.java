package com.hnw.meid;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class DragonNetwork {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final int READ_TIMEOUT = 15000;
    /* access modifiers changed from: private */
    public static final String TAG = "HttpRequestHelper";

    public interface HttpResponseListener {
        void onError(String str, int i);

        void onSuccess(String str, int i);
    }

    public static native void GetRequest(String str, HashMap hashMap, HttpResponseListener httpResponseListener);

    /* access modifiers changed from: private */
    public static native HttpURLConnection openConnection(URL url, HashMap hashMap, String str);

    public static native void postRequest(String str, String str2, HashMap hashMap, HttpResponseListener httpResponseListener);
}
