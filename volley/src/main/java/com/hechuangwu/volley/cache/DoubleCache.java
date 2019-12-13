package com.hechuangwu.volley.cache;

import android.content.Context;
import android.graphics.Bitmap;

import com.hechuangwu.volley.request.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 双缓存
 */
public class DoubleCache implements BitmapCache {
    private static final String TAG = DoubleCache.class.getSimpleName();
    //内存缓存
    private MemoryCache mMemoryCache = new MemoryCache();
    //硬盘缓存
    private DiskCache mDiskCache;

    public DoubleCache(Context context) {
        mDiskCache = DiskCache.getInstance(context);
    }

    @Override
    public void put(BitmapRequest request, Bitmap bitmap) {
        mMemoryCache.put(request, bitmap);
        mDiskCache.put(request, bitmap);
    }

    @Override
    public Bitmap get(BitmapRequest request) {
        Bitmap bitmap = mMemoryCache.get(request);
        //缓存为空
        if(bitmap == null){
            //取disk
            bitmap = mDiskCache.get(request);
            if(bitmap != null){
                //放入内存，方便再获取
                mMemoryCache.put(request, bitmap);
            }
        }
        return bitmap;
    }

    @Override
    public void remove(BitmapRequest request) {
        mMemoryCache.remove(request);
        mDiskCache.remove(request);
    }
}
