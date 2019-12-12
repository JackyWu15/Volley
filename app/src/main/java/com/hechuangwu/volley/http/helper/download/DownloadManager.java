package com.hechuangwu.volley.http.helper.download;

import android.os.Environment;
import android.util.Log;

import com.hechuangwu.volley.http.helper.HttpTask;
import com.hechuangwu.volley.http.helper.RequestBody;
import com.hechuangwu.volley.http.helper.ThreadPool;
import com.hechuangwu.volley.http.helper.download.info.Item;
import com.hechuangwu.volley.http.helper.download.inter.IDownloadCallback;
import com.hechuangwu.volley.http.helper.inter.IHttpRequest;

import java.io.File;
import java.util.concurrent.FutureTask;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class DownloadManager implements IDownloadCallback {
    private static final String TAG = DownloadManager.class.getSimpleName();

    private byte[] lock = new byte[0];

    public void down(String url,String fileName) {
        synchronized (lock) {

            File file = new File( Environment.getExternalStorageDirectory(),fileName);
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
