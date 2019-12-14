package com.hechuangwu.volley.engine.image.load;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

import com.hechuangwu.volley.bitmap.BitmapDecoder;
import com.hechuangwu.volley.engine.image.BitmapRequest;
import com.hechuangwu.volley.util.ImageViewHelper;

import java.io.File;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 本地加载
 */
class LocalLoader extends AbstractLoader {
    @Override
    protected Bitmap onLoad(BitmapRequest request) {
        final String path = Uri.parse(request.getImageUri()).getPath();
        File file = new File(path);
        if(!file.exists()){
            return null;
        }
        BitmapDecoder decoder = new BitmapDecoder() {
            @Override
            public Bitmap decodeBitmapWithOption(BitmapFactory.Options options) {
                return BitmapFactory.decodeFile(path, options);
            }
        };

        return decoder.decodeBitmap( ImageViewHelper.getWidth(request.getImageView()), ImageViewHelper.getHeight(request.getImageView()));
    }
}
