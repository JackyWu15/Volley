package com.hechuangwu.volley.http.helper.json;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.hechuangwu.volley.http.helper.inter.IDataListener;
import com.hechuangwu.volley.http.helper.inter.IHttpResponse;

import org.apache.http.HttpEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能: 响应数据处理类
 */
public class JsonResponse<M>  implements IHttpResponse {
    private static final String TAG = JsonResponse.class.getSimpleName();
    private IDataListener<M> mIDataListener;
    private Handler mHandler = new Handler( Looper.getMainLooper());
    private Gson mGson = new Gson();
    private Class<M> mClass;

    public JsonResponse(IDataListener<M> IDataListener, Class<M> aClass) {
        mIDataListener = IDataListener;
        mClass = aClass;
    }

    /**
     * 数据回调
     * @param httpEntity 返回体
     */
    @Override
    public void onSuccess(HttpEntity httpEntity) {
        InputStream inputStream=null;
        try {
            inputStream = httpEntity.getContent();
            String content = getContent(inputStream);
            final M m= mGson.fromJson(content,mClass);
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    mIDataListener.onSuccess(m);
                }
            });

        } catch (IOException e) {
            mIDataListener.onFail();
        }
    }

    @Override
    public void onFail() {
        mIDataListener.onFail();
    }

    @Override
    public void addHttpHeader(Map<String, String> headerMap) {

    }

    /**
     * 数据转json
     */
    private String getContent(InputStream inputStream) {
        String content=null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (IOException e) {
                mIDataListener.onFail();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }

            }
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
            mIDataListener.onFail();
        }
        return content;
    }


}
