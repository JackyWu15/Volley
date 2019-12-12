package com.hechuangwu.volley.http.helper.download;

import android.os.Handler;
import android.os.Looper;

import com.hechuangwu.volley.http.helper.download.info.Item;
import com.hechuangwu.volley.http.helper.download.info.Status;
import com.hechuangwu.volley.http.helper.download.inter.IDownResponse;
import com.hechuangwu.volley.http.helper.download.inter.IDownloadCallback;
import com.hechuangwu.volley.http.helper.inter.IHttpRequest;

import org.apache.http.HttpEntity;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class DownloadResponse implements IDownResponse {


    private Item mItem;
    private File mFile;
    protected String mUrl;
    private long mBreakPoint;//当前进度
    private IDownloadCallback mDownloadCallback;
    private IHttpRequest mHttpRequest;
    private Handler mHandler = new Handler( Looper.myLooper() );

    public DownloadResponse(IDownloadCallback downloadCallback, Item item, IHttpRequest httpRequest) {
        mItem = item;
        mDownloadCallback = downloadCallback;
        mHttpRequest = httpRequest;
        mFile = new File( item.getFilePath() );
        mBreakPoint = mFile.length();

    }


    @Override
    public void httpService(IHttpRequest httpRequest) {
        mHttpRequest = httpRequest;
    }

    /**
     * 断点下载
     */
    @Override
    public void addHttpHeader(Map<String, String> headerMap) {
        long length = mFile.length();
        if (length > 0L) {
            headerMap.put( "RANGE", "bytes=" + length + "-" );
        }
    }


    @Override
    public void onSuccess(HttpEntity httpEntity) {
        InputStream inputStream = null;
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            inputStream = httpEntity.getContent();

            long startTime = System.currentTimeMillis();

            //每秒多少k
            long speed = 0L;
            //花费时间
            long useTime = 0L;
            //下载的长度
            long getLength = 0L;
            //接受的长度
            long receiveLen = 0L;
            boolean bufferLen = false;
            //单位时间下载的字节数
            long calcSpeedLen = 0L;
            //此次得到的长度
            long dataLength = httpEntity.getContentLength();
            //当前总长度
            long currentLength = mBreakPoint + dataLength;

            //更新数据
            updateReceiverLength( currentLength );
            //更新状态
            updateStatus( Status.downloading );

            byte[] buffer = new byte[1024];
            int count = 0;
            long currentTime = System.currentTimeMillis();

            if (!makeDir( mFile.getParentFile() )) {
                mDownloadCallback.onDownloadError( mItem, 1, "创建文件夹失败" );
            } else {
                fos = new FileOutputStream( mFile, true );
                bos = new BufferedOutputStream( fos );
                int length = 1;
                while ((length = inputStream.read( buffer )) != -1) {
                    //取消
                    if (mHttpRequest.isCancel()) {
                        mDownloadCallback.onDownloadError( mItem, 1, "用户取消了" );
                        return;
                    }
                    if (mHttpRequest.isPause()) {
                        mDownloadCallback.onDownloadError( mItem, 2, "用户暂停了" );
                        return;
                    }
                    bos.write( buffer, 0, length );
                    getLength += (long) length;
                    receiveLen += (long) length;
                    calcSpeedLen += (long) length;
                    ++count;
                    //10 20 30 更新一次
                    if (receiveLen * 10L / currentLength >= 1L || count >= 5000) {
                        currentTime = System.currentTimeMillis();
                        useTime = currentTime - startTime;
                        startTime = currentTime;
                        speed = 1000L * calcSpeedLen / useTime;
                        count = 0;
                        calcSpeedLen = 0L;
                        receiveLen = 0L;
                        updateDownloadLength( mBreakPoint + getLength, currentLength, speed );
                    }
                }
                bos.close();
                inputStream.close();
                if (dataLength != getLength) {
                    mDownloadCallback.onDownloadError( mItem, 3, "下载长度不相等" );
                } else {
                    updateDownloadLength( mBreakPoint + getLength, currentLength, speed );
                    mDownloadCallback.onDownloadSuccess( mItem.copy() );
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }

                if (httpEntity != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 更新状态
     */
    private void updateStatus(Status downloading) {
        mItem.setStatus( downloading );
        if (mDownloadCallback != null) {
            //拷贝一份
            final Item item = mItem.copy();
            synchronized (mDownloadCallback) {
                mHandler.post( new Runnable() {
                    @Override
                    public void run() {
                        mDownloadCallback.onDownloadStatusChanged( item );
                    }
                } );
            }
        }
    }

    /**
     * 更新接收的总长度
     */
    private void updateReceiverLength(long totalLength) {
        mItem.setCurrentLength( totalLength );
        if (mDownloadCallback != null) {
            //拷贝一份
            final Item item = mItem.copy();
            synchronized (mDownloadCallback) {
                mHandler.post( new Runnable() {
                    @Override
                    public void run() {
                        mDownloadCallback.onTotalLengthReceived( item );
                    }
                } );
            }
        }
    }

    /**
     * 更新下载成功的长度
     */
    private void updateDownloadLength(final long downlength, final long totalLength, final long speed) {
        mItem.setCurrentLength( downlength );
        if (mDownloadCallback != null) {
            //拷贝一份
            final Item item = mItem.copy();
            synchronized (mDownloadCallback) {
                mHandler.post( new Runnable() {
                    @Override
                    public void run() {
                        mDownloadCallback.onCurrentSizeChanged( item, downlength / totalLength, speed );
                    }
                } );
            }
        }
    }

    /**
     * 创建文件夹
     */
    private boolean makeDir(File parentFile) {
        return parentFile.exists() && !parentFile.isFile()
                ? parentFile.exists() && parentFile.isDirectory() :
                parentFile.mkdirs();
    }

    @Override
    public void onFail() {

    }


    @Override
    public void cancel() {

    }

    @Override
    public void pause() {

    }


}
