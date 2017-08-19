package com.example.zhouyangzzu.hellokotlin.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Toast", Toast.LENGTH_SHORT).show();
    }
}
