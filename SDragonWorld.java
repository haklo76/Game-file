package com.hnw.meid;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONArray;

public class SDragonWorld extends AppCompatActivity {
    /* access modifiers changed from: private */
    public int MAX_COUNT_ADD = 5;
    boolean acceptProcessing = false;
    boolean adding = false;
    boolean clickedFriendTab = false;
    private int counterAdd = 0;
    boolean firstProcess = true;
    String formatUrl = "https://myidgo.mytel.com.mm?mcuid=c9697bb144de680e291699a81d0dc0a6&mcapp=myid";
    boolean friendProcessing = false;
    private Handler handlerAccept;
    /* access modifiers changed from: private */
    public Handler handlerAdd;
    private Handler handlerSendAndClaim;
    /* access modifiers changed from: private */
    public Handler handlerTW = new Handler();
    String img = "image/jpeg";
    String js = "application/javascript";
    private boolean mProcessingFriends = false;
    boolean mutedSound = false;
    boolean sendingHeart = false;
    ScrollView sv;
    /* access modifiers changed from: private */
    public Runnable textChangeTimeoutRunnable;
    TextView tv;
    String uniqueKey = "";
    WebView wv;

    private native void Hs();

    private native void evaluteJS(String str);

    private native void initWebView(WebView webView);

    /* access modifiers changed from: private */
    public native void injectScript();

    private native String injectString(String str);

    /* access modifiers changed from: private */
    public native void showComfirmDialog(String str);

    /* access modifiers changed from: private */
    public native void simulateButtonClick(String str);

    public native void callAddFriend(String str);

    public native void deletePhone(boolean z);

    public native WebResourceResponse doIntercept(String str, String str2);

    public native void getPhones();

    @Override
    public native void onBackPressed();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    /* access modifiers changed from: protected */
    @Override
    public native void onDestroy();

    public native void processJson(String str);

    public native void sdAppend(String str);

    public native void startADD(JSONArray jSONArray);

    public native void submitPhone(String str);

    public class Nagarlay {
        private final SDragonWorld this$0;

        static native SDragonWorld access$0(Nagarlay nagarlay);

        @JavascriptInterface
        public native void logFromJS(String str);

        @JavascriptInterface
        public native void onFriendProcessed(String str);

        @JavascriptInterface
        public native void receiveMessage(String str);

        @JavascriptInterface
        public native void show(String str);

        public Nagarlay(SDragonWorld sDragonWorld) {
            this.this$0 = sDragonWorld;
        }
    }

    class MyWebChromeClient extends WebChromeClient {
        private final SDragonWorld this$0;

        static native SDragonWorld access$0(MyWebChromeClient myWebChromeClient);

        public native void onProgressChanged(WebView webView, int i);

        public native void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

        public native void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

        public native boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

        public MyWebChromeClient(SDragonWorld sDragonWorld) {
            this.this$0 = sDragonWorld;
        }
    }

    class MyWebViewClient extends WebViewClient {
        private final SDragonWorld this$0;

        static native SDragonWorld access$0(MyWebViewClient myWebViewClient);

        public native void onPageFinished(WebView webView, String str);

        public native void onPageStarted(WebView webView, String str, Bitmap bitmap);

        public native void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

        @Override
        public native WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest);

        @Override
        public native boolean shouldOverrideUrlLoading(WebView webView, String str);

        public MyWebViewClient(SDragonWorld sDragonWorld) {
            this.this$0 = sDragonWorld;
        }
    }
}
