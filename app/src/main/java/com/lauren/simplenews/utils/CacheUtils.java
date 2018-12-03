package com.lauren.simplenews.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 创建人： 杨云杰
 * 创建时间 ： 2018/11/20
 * 描述：用来判断导航页是否已经是第一次进入
 */
public class CacheUtils {
    public static Boolean getBoolean(Context context,String key){
        SharedPreferences mSharedPreferences = context.getSharedPreferences("cache", Context.MODE_PRIVATE);
        return mSharedPreferences.getBoolean(key,false);
    }
    public static void putBoolean(Context context,String key){
        SharedPreferences mSharedPreferences = context.getSharedPreferences("cache", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(key, true);
        editor.apply();
    }
}
