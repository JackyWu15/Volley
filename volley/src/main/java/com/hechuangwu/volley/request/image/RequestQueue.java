package com.hechuangwu.volley.request.image;

import android.util.Log;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class RequestQueue {
    private static final String TAG = RequestQueue.class.getSimpleName();
    //阻塞队列，根据优先级
    private BlockingQueue<BitmapRequest> mRequestQueue = new PriorityBlockingQueue();
    //编号分配会产生高并发，用AtomicInteger
    private AtomicInteger mAtomicInteger = new AtomicInteger(0);
    //核数
    private int mThreadCount;
    //分发线程
    private RequestDispatcher[] mRequestDispatchers;

    public RequestQueue(int threadCount) {
        mThreadCount = threadCount;
    }

    /**
     * 加入队列中
     */
    public void addRequest(BitmapRequest request){
        if(!mRequestQueue.contains(request)){
            request.setSerialNO(mAtomicInteger.incrementAndGet());
            mRequestQueue.add( request );
        }else {
            Log.i( TAG, "addRequest:>>>请求已存在"+request.getSerialNO());
        }
    }

    /**
     * 启动请求
     */
    public void start(){
        stop();
        //分发请求
        dispatchers();
    }

    /**
     * 停止请求
     */
    public void stop(){
        if(mRequestDispatchers != null && mRequestDispatchers.length > 0){
            for (int i = 0; i < mRequestDispatchers.length; i++) {
                //中断
                mRequestDispatchers[i].interrupt();
            }
        }

    }

    /**
     * 分发启动线程
     */
    private void dispatchers() {
        mRequestDispatchers = new RequestDispatcher[mThreadCount];
        for (int i = 0; i < mThreadCount; i++) {
            RequestDispatcher p = new RequestDispatcher(  mRequestQueue );
            mRequestDispatchers[i] = p;
            //启动线程
            mRequestDispatchers[i].start();
        }

    }



}
