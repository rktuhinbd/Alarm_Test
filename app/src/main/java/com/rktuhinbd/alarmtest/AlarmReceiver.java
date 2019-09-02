package com.rktuhinbd.alarmtest;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Fired!", Toast.LENGTH_SHORT).show();
        Log.e("Alarm Fired!", "True");

        showNotification(context);
    }

    private void showNotification(Context context) {

    }
}
