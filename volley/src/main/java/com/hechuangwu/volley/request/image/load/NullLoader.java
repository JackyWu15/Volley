package com.hechuangwu.volley.request.image.load;

import android.graphics.Bitmap;

import com.hechuangwu.volley.request.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class NullLoader extends AbstractLoader {
    @Override
    protected Bitmap onLoad(BitmapRequest request) {
        return null;
    }
}
