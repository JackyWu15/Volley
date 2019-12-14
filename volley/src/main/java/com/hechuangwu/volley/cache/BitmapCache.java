package com.hechuangwu.volley.cache;

import android.graphics.Bitmap;

import com.hechuangwu.volley.engine.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public interface BitmapCache {
    /**
     * 缓存
     */
    void put(BitmapRequest request, Bitmap bitmap);

    /**
     * 获取缓存
     */
    Bitmap get(BitmapRequest request);

    /**
     * 移除缓存
     */
    void remove(BitmapRequest request);
}
