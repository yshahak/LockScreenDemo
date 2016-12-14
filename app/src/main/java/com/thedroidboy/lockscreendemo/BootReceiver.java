package com.thedroidboy.lockscreendemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by B.E.L on 14/12/2016.
 */

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, LockScreenService.class));
    }
}
