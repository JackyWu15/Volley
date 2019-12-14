package com.hechuangwu.volley.engine.image.load;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class LoaderManager {
    private static LoaderManager mInstance = new LoaderManager();
    private Map<String, ILoader> mLoaderMap = new HashMap();
    private NullLoader mNullLoader = new NullLoader();

    public static LoaderManager getInstance(){
        return mInstance;
    }

    private LoaderManager() {
        register("http", new UrlLoader());
        register("https", new UrlLoader());
        register("file", new LocalLoader());
    }

    public ILoader getLoader(String schema){
        if(mLoaderMap.containsKey(schema)){
            return mLoaderMap.get(schema);
        }
        return mNullLoader;
    }


    private void register(String schema, ILoader loader) {
        mLoaderMap.put(schema, loader);
    }
}
