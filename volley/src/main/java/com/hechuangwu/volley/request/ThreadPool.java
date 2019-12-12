package com.hechuangwu.volley.request;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class ThreadPool {
    private static final String TAG = ThreadPool.class.getSimpleName();
    //线程阻塞队列
    private LinkedBlockingDeque<Future<?>> mBlockingDeque = new LinkedBlockingDeque<>(  );
    //线程池
    private final ThreadPoolExecutor mThreadPoolExecutor;

    private static ThreadPool mInstance;
    public static ThreadPool getInstance(){
        if(mInstance==null){
            synchronized (ThreadPool.class){
                if(mInstance==null){
                    mInstance = new ThreadPool();
                }
            }
        }
        return mInstance;
    }

    private ThreadPool(){
        mThreadPoolExecutor = new ThreadPoolExecutor( 4, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>( 4 ), mRejectedHandler );
        mThreadPoolExecutor.execute( mRunnable );
    }

    /**
     * 任务执行
     */
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {

            while (true){
                FutureTask take = null;
                try {
                    //阻塞
                    take = (FutureTask) mBlockingDeque.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(take!=null){
                    mThreadPoolExecutor.execute( take );
                }
            }
        }
    };

    /**
     * 任务加入队列
     */
    public <T> void execute(FutureTask<T> futureTask) throws InterruptedException {
        mBlockingDeque.put( futureTask );
    }

    /**
     * 如果超过了线程数则加入队列排队
     */
    private RejectedExecutionHandler mRejectedHandler = new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                mBlockingDeque.put( new FutureTask<Object>(runnable,null) {} );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };




}
