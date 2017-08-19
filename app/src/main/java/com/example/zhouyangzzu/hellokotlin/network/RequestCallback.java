package com.example.zhouyangzzu.hellokotlin.network;

/**
 * Created by zhouyangzzu on 2017/8/19.
 */

public interface RequestCallback<T> {
    void onResponse(T result);
}
