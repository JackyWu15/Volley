package com.hechuangwu.volley;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.hechuangwu.volley.config.ImageConfig;
import com.hechuangwu.volley.config.DisplayConfig;
import com.hechuangwu.volley.engine.image.BitmapRequest;
import com.hechuangwu.volley.engine.image.RequestQueue;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class ImageLoader {
    //配置
    private ImageConfig mConfig;
    //请求队列
    private RequestQueue mRequestQueue;

    private static ImageLoader mInstance;

    private ImageLoader(ImageConfig config){
        mConfig = config;
        mRequestQueue = new RequestQueue( config.getThreadCount() );
        mRequestQueue.start();
    }


    public static ImageLoader getInstance(ImageConfig config){
        if(mInstance == null){
            synchronized (ImageLoader.class) {
                if(mInstance == null){
                    mInstance = new ImageLoader(config);
                }
            }
        }
        return mInstance;
    }

    public static ImageLoader getInstance(){
        if(mInstance==null){
            throw new UnsupportedOperationException( "没有初始化" );
        }

        return mInstance;

    }

    /**
     * 显示图片
     */
    public void display(ImageView imageView,String uri){
        display(imageView, uri, null, null);
    }


    /**
     * 加入请求
     */
    public void display(ImageView imageView, String uri,DisplayConfig displayConfig, ImageListener imageListener){
        //构建一个请求
        BitmapRequest bitmapRequest = new BitmapRequest( imageView, uri, displayConfig, imageListener );
        //加入队列
        mRequestQueue.addRequest( bitmapRequest );
    }

    public ImageConfig getConfig() {
        return mConfig;
    }

    public  interface ImageListener{
        void onComplete(ImageView imageView, Bitmap bitmap, String uri);
    }


}
