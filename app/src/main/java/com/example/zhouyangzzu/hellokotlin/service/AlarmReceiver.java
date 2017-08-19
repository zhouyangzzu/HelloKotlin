package com.example.zhouyangzzu.hellokotlin.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public class AlarmReceiver extends BroadcastReceiver {

    static TextToSpeech textToSpeech = null;


    @Override
    public void onReceive(Context context, Intent intent) {

        try{
            if (null == textToSpeech){
                textToSpeech = new TextToSpeech(context.getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        textToSpeech.setLanguage(Locale.ENGLISH);
                    }
                });
            }else{
                textToSpeech.speak("EOS rise 5%", TextToSpeech.QUEUE_FLUSH, null);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //check service
        Intent intent2 = new Intent(context, FetchRealTimeDataService.class);
        intent.setAction("blabla");
        context.startService(intent2);
    }

}
