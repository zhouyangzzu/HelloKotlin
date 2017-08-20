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
        addTask(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }

    static public void addTask(Context context){

        long triggerAtTime = SystemClock.elapsedRealtime() + 1000;//1s之后触发
        long interval = 1000;//每秒取一次数据
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0,
                intent, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager manager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        //manager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, interval, pendingIntent);

        //换单次alarm，试试保活效果
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pendingIntent);
    }





}
