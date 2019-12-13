package com.hechuangwu.volley.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public abstract class BitmapDecoder {

    public abstract Bitmap decodeBitmapWithOption(BitmapFactory.Options options);


    /**
     * 根据控件缩放Bitmap
     */
    public Bitmap decodeBitmap(int reqWidth,int reqHeight){
        BitmapFactory.Options options = new BitmapFactory.Options();
        //只解码宽高，不加载图片
        options.inJustDecodeBounds = true;
        //读尺寸
        decodeBitmapWithOption(options);
        //缩放
        calculateSampleSizeWithOption(options,reqWidth,reqHeight);
        //读图片
        return  decodeBitmapWithOption(options);
    }


    private void calculateSampleSizeWithOption(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        //图片的原始宽高
        int width = options.outWidth;
        int height = options.outHeight;

        int inSampleSize = 1;
        if(width > reqWidth || height > reqHeight){
            //宽高的缩放比例
            int heightRatio = Math.round((float)height / (float)reqHeight);
            int widthRatio = Math.round((float)width / (float)reqWidth);

            //有的图是长图、有的是宽图
            inSampleSize = Math.max(heightRatio, widthRatio);
        }

        //全景图
        //当inSampleSize为2，图片的宽与高变成原来的1/2
        //options.inSampleSize = 2
        options.inSampleSize = inSampleSize;

        //每个像素2个字节
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        //Bitmap占用内存
        options.inJustDecodeBounds = false;
        //当系统内存不足时可以回收Bitmap
        options.inPurgeable = true;
        options.inInputShareable = true;


    }

}
