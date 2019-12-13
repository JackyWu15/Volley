package com.hechuangwu.volley.config;

import com.hechuangwu.volley.cache.BitmapCache;
import com.hechuangwu.volley.cache.MemoryCache;
import com.hechuangwu.volley.policy.LoadPolicy;
import com.hechuangwu.volley.policy.SerialPolicy;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class ImageConfig {
    //缓存策略
    private BitmapCache mBitmapCache = new MemoryCache();
    //加载策略
    private LoadPolicy mLoadPolicy = new SerialPolicy();
    //Java虚拟机可用的处理器个数
    private int threadCount = Runtime.getRuntime().availableProcessors();
    //图片加载的显示配置
    private DisplayConfig displayConfig = new DisplayConfig();

    private ImageConfig() {
    }

    public BitmapCache getBitmapCache() {
        return mBitmapCache;
    }

    public DisplayConfig getDisplayConfig() {
        return displayConfig;
    }

    public LoadPolicy getLoadPolicy() {
        return mLoadPolicy;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public static class Builder {
        ImageConfig config;

        public Builder() {
            config = new ImageConfig();
        }

        /**
         * 设置缓存策略
         */
        public Builder cache(BitmapCache bitmapCache) {
            config.mBitmapCache = bitmapCache;
            return this;
        }

        /**
         * 设置加载策略
         */
        public Builder loadPolicy(LoadPolicy loadPolicy) {
            config.mLoadPolicy = loadPolicy;
            return this;
        }

        /**
         * 设置线程个数
         */
        public Builder threadCount(int count) {
            config.threadCount = count;
            return this;
        }

        /**
         * 图片加载过程中显示的图片
         *
         * @param resId
         * @return
         */
        public Builder loadingPlaceHolder(int resId) {
            config.displayConfig.loadingImg = resId;
            return this;
        }

        /**
         * 设置加载失败图片
         */
        public Builder errorPlaceHolder(int resID) {
            config.displayConfig.failedImg = resID;
            return this;
        }

        public ImageConfig build() {
            return config;
        }

    }


}
