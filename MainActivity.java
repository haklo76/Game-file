package com.hnw.meid;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {
    public static String PointAmount = "0";
    public static Account account;
    public static String dataAmount = "0";
    public static String gameLink;
    public static ArrayList<Game> games;
    public static InputStream inputStream;
    public static String minutes = "0";
    public static String playNumber;
    public static int selectGame;
    String DATA_TAG = "data";
    private CardView DataCard;
    String RESULT = "result";
    String SMS_TAG = "sms";
    private CardView SmsCard;
    String VOICE_TAG = "voice";
    private CardView VoiceCard;
    /* access modifiers changed from: private */
    public LinearLayout accountsContainer;
    /* access modifiers changed from: private */
    public boolean accountsExpanded = false;
    String afterLimit = "0";
    /* access modifiers changed from: private */
    public TextView bExp;
    /* access modifiers changed from: private */
    public TextView billtv;
    private ImageView buypackage;
    boolean canExtend = false;
    /* access modifiers changed from: private */
    public Account currentAccount;
    String currentLimit = "0";
    /* access modifiers changed from: private */
    public TextView dExp;
    private ImageView dailyfreepoint;
    /* access modifiers changed from: private */
    public TextView datatv;
    List<String> deList;
    /* access modifiers changed from: private */
    public DrawerLayout drawerLayout;
    private ImageView exchange;
    /* access modifiers changed from: private */
    public TextView exchangeable;
    private ImageView extend;
    private FloatingActionButton fab;
    /* access modifiers changed from: private */
    public LinearLayout gameContainer;
    View headerView;
    private ImageView heart;
    /* access modifiers changed from: private */
    public LinearLayout heartContainer;
    ImageView homeButton;
    private TextView kev;
    String mainBalanceSpend = "0";
    CardView mainCv;
    /* access modifiers changed from: private */
    public TextView member;
    private TextView name;
    /* access modifiers changed from: private */
    public TextView noteTv;
    private ImageView optionImage;
    ProgressDialog pd;
    private TextView phone;
    /* access modifiers changed from: private */
    public TextView pointTv;
    private ImageView pointhistory;
    SharedPreferences pref;
    /* access modifiers changed from: private */
    public TextView sExp;
    List<String> seList;
    /* access modifiers changed from: private */
    public TextView smstv;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout swiperefreshlayout1;
    /* access modifiers changed from: private */
    public TextView vExp;
    List<String> veList;
    /* access modifiers changed from: private */
    public TextView voicetv;

    public static native String decoded(String str);

    /* access modifiers changed from: private */
    public native void getDailyPoint();

    public static native String getExp(String str);

    public static native String getExpDate(String str);

    private static native String getJson(String str);

    public static native String getMainPhone();

    public static native List getPhonesList(String str);

    public static native String getToken();

    private native void populateAccounts(List list);

    private native void setupAccountSwitcher(View view);

    /* access modifiers changed from: private */
    public native void showTwoButtonDialog(String str);

    /* access modifiers changed from: private */
    public native void switchAccount(Account account2);

    /* access modifiers changed from: private */
    public native void toggleAccounts(ImageView imageView);

    public native void Inject();

    public native void copyText(String str);

    public native void extend();

    public native void getData();

    public native void getGames();

    public native String getUrl(int i);

    public native String getWebToken(String str);

    public native void hideLoading();

    public native void invite();

    public native void join(int i);

    public native void keyExpired();

    public native void loadWebView(WebView webView);

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    @Override
    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    public native void processExp(String str, TextView textView, JSONArray jSONArray);

    public native void refresh();

    public native void removeAccount();

    public native void reqData();

    public native void showAccountOption();

    public native void showChoiceNumber(List list, String str, boolean z);

    public native void showLoading();

    public native void showMessage(String str);

    public native void smsi(String str);

    public native void updateVersion(String str, String str2);

    static class Account {
        private final String key;
        private final String name;
        /* access modifiers changed from: private */
        public final String phone;

        public native String getKey();

        public native String getName();

        public native String getPhone();

        public Account(String str, String str2, String str3) {
            this.name = str;
            this.phone = str2;
            this.key = str3;
        }
    }
}
