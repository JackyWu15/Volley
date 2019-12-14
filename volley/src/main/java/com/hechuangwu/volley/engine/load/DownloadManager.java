package com.hechuangwu.volley.engine.load;

import android.os.Environment;
import android.util.Log;

import com.hechuangwu.volley.engine.HttpTask;
import com.hechuangwu.volley.engine.RequestBody;
import com.hechuangwu.volley.engine.ThreadPool;
import com.hechuangwu.volley.engine.load.info.Item;
import com.hechuangwu.volley.engine.load.inter.IDownloadCallback;
import com.hechuangwu.volley.engine.inter.IHttpRequest;

import java.io.File;
import java.util.concurrent.FutureTask;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class DownloadManager implements IDownloadCallback {
    private static final String TAG = DownloadManager.class.getSimpleName();
    private File mFolder =  Environment.getExternalStorageDirectory();
    private byte[] lock = new byte[0];

    private void setStorageDir(File folder){
        mFolder = folder;
    }


    public void down(String url,String fileName) {
        synchronized (lock) {

            File file = new File( mFolder,fileName);
            Item item = new Item( url, file.getAbsolutePath() );


            //请求对象
            IHttpRequest downloadRequest = new DownloadRequest();
            //响应对象
            DownloadResponse downloadResponse = new DownloadResponse( this, item, downloadRequest );

            //请求体
            RequestBody<Item> itemRequestBody = new RequestBody<>();
            itemRequestBody.setHttpRequest( downloadRequest );
            itemRequestBody.setHttpResponse( downloadResponse );
            itemRequestBody.setUrl( url );

            //请求任务
            HttpTask httpTask=new HttpTask(itemRequestBody);
            try {
                ThreadPool.getInstance().execute(new FutureTask<Object>(httpTask,null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void onDownloadStatusChanged(Item item) {

    }

    @Override
    public void onTotalLengthReceived(Item item) {

    }

    @Override
    public void onCurrentSizeChanged(Item item, double length, long speed) {
        Log.i(TAG,"下载速度："+ speed/1000 +"k/s");
        Log.i(TAG,"-----路径  "+ item.getFilePath()+"  下载长度  "+length+"   速度  "+speed);
    }

    @Override
    public void onDownloadSuccess(Item item) {
        Log.i(TAG,"下载成功    路劲  "+ item.getFilePath()+"  url "+ item.getUrl());
    }

    @Override
    public void onDownloadPause(Item item) {

    }

    @Override
    public void onDownloadError(Item item, int var2, String var3) {

    }
}
