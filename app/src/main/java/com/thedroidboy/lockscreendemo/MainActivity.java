package com.thedroidboy.lockscreendemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Yaakov Shahak on 14/12/2016.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, LockScreenService.class));
        finish();
    }
}
