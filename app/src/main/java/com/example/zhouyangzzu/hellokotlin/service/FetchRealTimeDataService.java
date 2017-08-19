package com.example.zhouyangzzu.hellokotlin.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public class FetchRealTimeDataService extends IntentService {

    public FetchRealTimeDataService() {
        super("FetchRealTimeDataService");
    }

    public FetchRealTimeDataService(String name) {
        super("FetchRealTimeDataService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        addTask();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return IntentService.START_STICKY;//保活
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }

    private void addTask(){

        long triggerAtTime = SystemClock.elapsedRealtime() + 1000;//1s之后触发
        long interval = 1000;//每秒取一次数据
        Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0,
                intent, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        manager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, interval, pendingIntent);
    }


}
