package com.hnw.meid;

import android.view.View;
import android.widget.TextView;

public class SDDecorations {
    public static native void animateTextIntro(View view);

    public static native void setOvalBackground(View view, int i, int i2, int i3);

    public static native void swirlTextAnimation(TextView textView, String str);
}
