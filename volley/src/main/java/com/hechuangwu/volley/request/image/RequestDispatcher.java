package com.hechuangwu.volley.request.image;

import android.util.Log;

import com.hechuangwu.volley.request.image.load.ILoader;
import com.hechuangwu.volley.request.image.load.LoaderManager;

import java.util.concurrent.BlockingQueue;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 请求分发处理
 */
public class RequestDispatcher extends Thread{

    private BlockingQueue<BitmapRequest> mBitmapRequests;

    public RequestDispatcher(BlockingQueue<BitmapRequest> bitmapRequests) {
        mBitmapRequests = bitmapRequests;
    }


    /**
     * 处理请求
     */
    @Override
    public void run() {
        while (!interrupted()){
            try {
                BitmapRequest request = mBitmapRequests.take();

                request.getSerialNO();
                String schema = parseSchema(request.getImageUri());
                ILoader loader = LoaderManager.getInstance().getLoader( schema );
                loader.loadImage( request );

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String parseSchema(String imageUri) {
        if(imageUri.contains("://")){
            return imageUri.split("://")[0];
        }else{
            Log.i("jason", "图片地址schema异常！");
        }
        return null;
    }
}
