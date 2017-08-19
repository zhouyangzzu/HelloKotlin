package com.example.zhouyangzzu.hellokotlin.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public class AlarmReceiver extends BroadcastReceiver {

    static TextToSpeech textToSpeech = null;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Toast", Toast.LENGTH_SHORT).show();

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
    }

}
