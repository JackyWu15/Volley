package com.hechuangwu.volley.cache;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.hechuangwu.volley.request.image.BitmapRequest;
import com.hechuangwu.volley.util.disk.DiskLruCache;
import com.hechuangwu.volley.util.disk.IOUtil;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class DiskCache implements BitmapCache {
    private static DiskCache mDiskCache;
    //缓存路径
    private String mCacheDir = "image_cache";
    //1M
    private static final int MB = 1024 * 1024;
    //
    private DiskLruCache mDiskLruCache;


    public static DiskCache getInstance(Context context){
        if(mDiskCache == null){
            synchronized (DiskCache.class) {
                if(mDiskCache == null){
                    mDiskCache = new DiskCache(context);
                }
            }
        }
        return mDiskCache;
    }

    public DiskCache(Context context) {
        initDiskCache(context);
    }

    /**
     * 初始化缓存
     */
    private void initDiskCache(Context context) {
        File directory = getDiskCacheDir(mCacheDir,context);
        if(!directory.exists()){
            directory.mkdirs();
        }

        try {
            //每次缓存一张图片，容量50M
            mDiskLruCache = DiskLruCache.open(directory, getAppVersion(context), 1, 50 * MB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 存入文件
     */
    @Override
    public void put(BitmapRequest request, Bitmap bitmap) {
        DiskLruCache.Editor editor = null;
        OutputStream os = null;
        try {
            //写入key
            editor = mDiskLruCache.edit(request.getImageUriMD5());
            //0存一个文件
            os = editor.newOutputStream( 0 );
            //写入disk
            if(persistBitmap2Disk(bitmap, os)){
                editor.commit();
            }else{
                editor.abort();
            }
            mDiskLruCache.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            IOUtil.closeQuietly(os);
        }

    }

    /**
     * 写入disk
     */
    private boolean persistBitmap2Disk(Bitmap bitmap, OutputStream os) {
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(os);
            bitmap.compress( Bitmap.CompressFormat.JPEG, 100, bos);
            //清空缓存
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            IOUtil.closeQuietly(bos);
        }
        return true;
    }

    @Override
    public Bitmap get(BitmapRequest request) {
        InputStream is = null;
        try {
            //快照
            DiskLruCache.Snapshot snapshot = mDiskLruCache.get( request.getImageUriMD5() );
            if(snapshot!=null)
            {
                InputStream inputStream=snapshot.getInputStream(0);
                return BitmapFactory.decodeStream(inputStream);
            }
            return BitmapFactory.decodeStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            IOUtil.closeQuietly(is);
        }

        return null;
    }

    @Override
    public void remove(BitmapRequest request) {
        try {
            mDiskLruCache.remove(request.getImageUriMD5());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取应用的版本号
     * @param context
     * @return
     */
    private int getAppVersion(Context context) {
        try {
            PackageManager pm = context.getPackageManager();
            return pm.getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 1;
    }

    /**
     * 获取disk缓存
     */
    private File getDiskCacheDir(String mCacheDir, Context context) {
        //相对路径
        String cachePath;
        if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
            //外部存储
            cachePath = context.getExternalCacheDir().getPath();
        }else{
            //内部存储
            cachePath = context.getCacheDir().getPath();
        }
        return new File(cachePath + File.separatorChar + mCacheDir);
    }



}
