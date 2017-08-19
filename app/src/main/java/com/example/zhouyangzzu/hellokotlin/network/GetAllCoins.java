package com.example.zhouyangzzu.hellokotlin.network;

import com.example.zhouyangzzu.hellokotlin.model.CoinTimeItem;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public class GetAllCoins{

    private OkHttpClient mClient = new OkHttpClient();

    public void sendRequest(String url, RequestCallback callback){
        Request request = new Request.Builder().url(url).build();
        Response  response = null;
        try {
            response = mClient.newCall(request).execute();
        }catch (Exception e){
            e.printStackTrace();
            return;
        }

        List<CoinTimeItem> result = parseResult();
        callback.onResponse(result);
    }

    private List<CoinTimeItem> parseResult(){
        return null;
    }

}
