package com.hnw.meid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    SharedPreferences.Editor editor;
    public String[] feature = {"Shield", "Explosion", "Gold (no support worldmode)", "Speed", "CRIT CHANCE", "CRIT DMG", "Range", "Stone coolDown", "Water Boom", "Water Boom Damage", "Myid Game Update Problem"};
    int lastClicked;
    ListView lv;
    String[] notes = {"အနည်းဆုံး 100 ထည့်ပါ", "100 - 9000", "အများဆုံး 2000000000\n 1 is default", "7 အနည်းဆုံးထားပါ", "ဆယ်ဂဏန်းပဲထားပါ", "ရာဂဏန်းပဲထားပါ", "အများဆုံး၁၅၀ထားပါ", "1-20", "5-99", "100-900", ""};
    String[] prefName = {"shield", "explosion", "gold", "speed"};
    SharedPreferences sharedPreferences;

    /* access modifiers changed from: private */
    public native void showTwoButtonDialog();

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    @Override
    public native boolean onCreateOptionsMenu(Menu menu);

    @Override
    public native boolean onOptionsItemSelected(MenuItem menuItem);

    public native void resetSetting();

    public native void showToast(String str);
}
