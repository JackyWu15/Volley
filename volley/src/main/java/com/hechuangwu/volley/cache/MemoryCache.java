package com.hechuangwu.volley.cache;

import android.graphics.Bitmap;

import com.hechuangwu.volley.engine.image.BitmapRequest;

import androidx.annotation.NonNull;
import androidx.collection.LruCache;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 内存缓存
 */
public class MemoryCache implements BitmapCache{
    private LruCache<String, Bitmap> mLruCache;
    private int maxSize = 10*1024*1024;

     public MemoryCache(int maxSize) {
//        maxSize = (int)Runtime.getRuntime().freeMemory() / 1024 / 8;
        if(maxSize<=0){
            maxSize = this.maxSize;
        }
        mLruCache = new LruCache<String,Bitmap>( maxSize ){
            @Override
            protected int sizeOf(@NonNull String key, @NonNull Bitmap value) {
                return value.getRowBytes()*value.getHeight();
            }
        };
    }

    public MemoryCache() {
       this(0);
    }


    @Override
    public void put(BitmapRequest request, Bitmap bitmap) {
        mLruCache.put(request.getImageUriMD5(), bitmap);
    }

    @Override
    public Bitmap get(BitmapRequest request) {
        return mLruCache.get( request.getImageUriMD5() );
    }

    @Override
    public void remove(BitmapRequest request) {
        mLruCache.remove(request.getImageUriMD5());
    }
}
