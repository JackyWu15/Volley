package com.hechuangwu.volley.request.image.load;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.hechuangwu.volley.ImageLoader;
import com.hechuangwu.volley.cache.BitmapCache;
import com.hechuangwu.volley.config.DisplayConfig;
import com.hechuangwu.volley.request.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public abstract class AbstractLoader implements ILoader {

    private BitmapCache mCache = ImageLoader.getInstance().getConfig().getBitmapCache();
    private DisplayConfig mDisplayConfig = ImageLoader.getInstance().getConfig().getDisplayConfig();

    /**
     * 加载图片
     */
    @Override
    public void loadImage(BitmapRequest request) {
        Bitmap bitmap = mCache.get( request );
        if (bitmap == null) {
            //加载前显示的图片
            showLoadingImage( request );
            bitmap = onLoad(request);
            //缓存下来
            cacheBitmap(request,bitmap);
        }
        //显示
        displayImage( request,bitmap );
    }

    /**
     * 在主线程中显示
     */
    protected void displayImage(final BitmapRequest request, final Bitmap bitmap) {
        ImageView imageView = request.getImageView();
        imageView.post(new Runnable() {
            @Override
            public void run() {
                updateImageView(request, bitmap);
            }

        });
    }

    /**
     * 根据情况显示
     */
    private void updateImageView(final BitmapRequest request, final Bitmap bitmap) {
        ImageView imageView = request.getImageView();
        //正常显示
        if(bitmap != null && imageView.getTag().equals(request.getImageUri())){
            imageView.setImageBitmap(bitmap);
        }
        //有可能加载失败
        if(bitmap == null && hasFailedPlaceHolder()){
            imageView.setImageResource(mDisplayConfig.failedImg);
        }
        //回调
        if(request.getImageListener() != null){
            request.getImageListener().onComplete(imageView, bitmap, request.getImageUri());
        }
    }

    /**
     * 将图片进行缓存
     */
    private void cacheBitmap(BitmapRequest request, Bitmap bitmap) {
        if(request != null && bitmap != null){
            synchronized (mCache) {
                mCache.put(request,bitmap);
            }
        }
    }



    /**
     * 显示加载前图片
     */
    private void showLoadingImage(BitmapRequest request) {
        //指定了，显示配置
        if (hasLoadingPlaceHolder()) {
            final ImageView imageView = request.getImageView();
            imageView.post( new Runnable() {
                @Override
                public void run() {
                    imageView.setImageResource( mDisplayConfig.loadingImg );
                }
            } );
        }
    }

    protected boolean hasLoadingPlaceHolder(){
        return (mDisplayConfig != null && mDisplayConfig.loadingImg > 0);
    }

    protected boolean hasFailedPlaceHolder(){
        return (mDisplayConfig != null && mDisplayConfig.failedImg > 0);
    }

    //分策略加载
    protected abstract Bitmap onLoad(BitmapRequest request);
}