package com.hnw.meid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;

public class VideoPickerActivity extends AppCompatActivity {
    private static final int PICK_VIDEO_REQUEST = 101;
    /* access modifiers changed from: private */
    public static final int STORAGE_PERMISSION_REQUEST = 102;
    Button deleteVideo;
    /* access modifiers changed from: private */
    public VideoView mVideoView;
    Button pickVideo;
    private String selectedVideoPath;

    private native String copyVideoToAppDir(Uri uri);

    /* access modifiers changed from: private */
    public native void openVideoPicker();

    /* access modifiers changed from: private */
    public native void showDelete();

    public native File getBgVideo();

    /* access modifiers changed from: protected */
    @Override
    public native void onActivityResult(int i, int i2, Intent intent);

    /* access modifiers changed from: protected */
    @Override
    public native void onCreate(Bundle bundle);

    /* access modifiers changed from: protected */
    @Override
    public native void onDestroy();

    /* access modifiers changed from: protected */
    @Override
    public native void onPause();

    @Override
    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    /* access modifiers changed from: protected */
    @Override
    public native void onResume();
}
