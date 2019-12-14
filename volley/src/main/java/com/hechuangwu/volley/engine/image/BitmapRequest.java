package com.hechuangwu.volley.engine.image;

import android.widget.ImageView;

import com.hechuangwu.volley.ImageLoader;
import com.hechuangwu.volley.config.DisplayConfig;
import com.hechuangwu.volley.policy.LoadPolicy;
import com.hechuangwu.volley.util.MD5Utils;

import java.lang.ref.SoftReference;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 请求加载
 */
public class BitmapRequest implements Comparable<BitmapRequest> {

    private LoadPolicy mLoadPolicy = ImageLoader.getInstance().getConfig().getLoadPolicy();
    //优先级
    private int serialNO;
    //软引用
    private SoftReference<ImageView> mImageViewSoftReference;
    //路径
    private String mImageUri;
    //保证key合法
    private String mImageUriMD5;
    //显示配置
    private DisplayConfig mDisplayConfig = ImageLoader.getInstance().getConfig().getDisplayConfig();
    //监听
    private ImageLoader.ImageListener mImageListener;

    public BitmapRequest(ImageView imageView,String uri, DisplayConfig displayConfig, ImageLoader.ImageListener imageListener) {
        mImageViewSoftReference = new SoftReference<>( imageView );
        //规避错位
        imageView.setTag( uri );
        mImageUri = uri;
        mImageUriMD5 = MD5Utils.toMD5(mImageUri);
        mImageListener = imageListener;
        if(displayConfig!=null){
            mDisplayConfig = displayConfig;
        }
    }

    public String getImageUri() {
        return mImageUri;
    }

    public String getImageUriMD5() {
        return mImageUriMD5;
    }

    public ImageView getImageView() {
        return mImageViewSoftReference.get();
    }

    public ImageLoader.ImageListener getImageListener() {
        return mImageListener;
    }

    public int getSerialNO() {
        return serialNO;
    }

    public void setSerialNO(int serialNO) {
        this.serialNO = serialNO;
    }



    /**
     * 同策略同编号，说明是同一个请求
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mLoadPolicy == null) ? 0 : mLoadPolicy.hashCode());
        result = prime * result + serialNO;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BitmapRequest other = (BitmapRequest) obj;
        if (mLoadPolicy == null) {
            if (other.mLoadPolicy != null)
                return false;
        } else if (!mLoadPolicy.equals(other.mLoadPolicy))
            return false;
        if (serialNO != other.serialNO)
            return false;
        return true;
    }

    @Override
    public int compareTo(BitmapRequest bitmapRequest) {
        return mLoadPolicy.compareTo( this,bitmapRequest );
    }
}
