package com.hnw.meid;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.util.List;

public class WebActivity extends AppCompatActivity {
    ArrayAdapter adapter;
    Runnable autoPlayRunning = new Runnable(this) {
        private final WebActivity this$0;

        {
            this.this$0 = r1;
        }

        static native WebActivity access$0(AnonymousClass100000000 r1);

        @Override
        public native void run();
    };
    Button btn;
    public LinearLayout container;
    int currentMB;
    int currentMin;
    int currentPoint;
    int durationpermtach = 7;
    View engine;
    boolean engineActive;
    TextView goldenHeart;
    /* access modifiers changed from: private */
    public Handler handler = new Handler(Looper.getMainLooper());
    List<String> history;
    String img;
    /* access modifiers changed from: private */
    public boolean isAutoPlayRunning = false;
    String js;
    int lastMB;
    int lastMin;
    int lastPoint;
    TextView mbtv;
    public String playNumber;
    boolean playingSong = true;
    SharedPreferences pref;
    TextView ptstv;
    TextView rainbow;
    TextView remainTurn;
    int[] remainingTime = {this.durationpermtach};
    View scene;
    boolean sceneActive;
    /* access modifiers changed from: private */
    public List<ScriptModel> scriptListFull;
    Button showbs;
    Button timerbtn;
    TextView turn;
    String url;
    TextView voiceTv;
    WebView webView1;

    private native void Hs(WebView webView, String str, String str2);

    private static native String appendParamsForUrl(String str);

    public static native String formatUrl(String str, boolean z);

    private native void initWebView(WebView webView);

    /* access modifiers changed from: private */
    public native void injectScript();

    /* access modifiers changed from: private */
    public native void playWorldMode();

    /* access modifiers changed from: private */
    public native void showComfirmDialog();

    /* access modifiers changed from: private */
    public native void showTwoButtonDialog();

    /* access modifiers changed from: private */
    public native void simulateButtonClick(String str);

    private native void triggerHistory();

    public native WebResourceResponse doIntercept(String str, String str2);

    public native WebResourceResponse doInterceptFromFile(File file, String str);

    public native String doMath(int i, int i2);

    public native boolean existsVideo();

    public native String formatHtml(String str);

    public native ScriptModel getSM(String str);

    public native boolean hasSM(String str);

    @Override
    public native void onBackPressed();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    @Override
    public native boolean onCreateOptionsMenu(Menu menu);

    /* access modifiers changed from: protected */
    @Override
    public native void onDestroy();

    @Override
    public native boolean onOptionsItemSelected(MenuItem menuItem);

    /* access modifiers changed from: protected */
    @Override
    public native void onPause();

    /* access modifiers changed from: protected */
    @Override
    public native void onResume();

    public native void processJson(String str);

    public native void reqData();

    public native void setupButton(boolean z);

    public native void showChoiceNumber(List list, String str);

    public native void showNodes();

    public native void showToast(String str);

    public native void startWorldGameTimer();

    public native Bitmap stringToImage(String str);

    public native void worldEndgame();

    public native void worldPlayAgain();

    public class Nagarlay {
        private final WebActivity this$0;

        static native WebActivity access$0(Nagarlay nagarlay);

        @JavascriptInterface
        public native void STP(String str);

        @JavascriptInterface
        public native void apis(String str);

        @JavascriptInterface
        public native void receiveMessage(String str);

        @JavascriptInterface
        public native void show(String str);

        public Nagarlay(WebActivity webActivity) {
            this.this$0 = webActivity;
        }
    }

    class MyWebChromeClient extends WebChromeClient {
        private final WebActivity this$0;

        static native WebActivity access$0(MyWebChromeClient myWebChromeClient);

        public native void onProgressChanged(WebView webView, int i);

        public native void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

        public native void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

        public native boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

        public MyWebChromeClient(WebActivity webActivity) {
            this.this$0 = webActivity;
        }
    }

    class MyWebViewClient extends WebViewClient {
        private final WebActivity this$0;

        static native WebActivity access$0(MyWebViewClient myWebViewClient);

        public native void onPageFinished(WebView webView, String str);

        public native void onPageStarted(WebView webView, String str, Bitmap bitmap);

        public native void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

        @Override
        public native WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest);

        @Override
        public native boolean shouldOverrideUrlLoading(WebView webView, String str);

        public MyWebViewClient(WebActivity webActivity) {
            this.this$0 = webActivity;
        }
    }
}
