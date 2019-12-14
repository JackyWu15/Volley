package com.hechuangwu.volley.engine.load;

import android.util.Log;

import com.hechuangwu.volley.engine.inter.IHttpRequest;
import com.hechuangwu.volley.engine.inter.IHttpResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class DownloadRequest implements IHttpRequest {
    private static final String TAG = DownloadRequest.class.getSimpleName();

    //请求头，线程安全
    private Map<String, String> headerMap = Collections.synchronizedMap( new HashMap<String, String>() );
    private HttpClient mHttpClient = new DefaultHttpClient();
    private Response mResponse = new Response();
    private IHttpResponse mIHttpResponse;
    private String mUrl;
    private byte[] mRequestDate;


    @Override
    public void setUrl(String url) {
        mUrl = url;
    }


    @Override
    public void setRequestData(byte[] requestData) {
        mRequestDate = requestData;
    }

    @Override
    public Map<String, String> getHttpHeadMap() {
        return headerMap;
    }

    @Override
    public void pause() {

    }

    @Override
    public boolean isPause() {
        return false;
    }

    @Override
    public boolean cancel() {
        return false;
    }

    @Override
    public boolean isCancel() {
        return false;
    }


    @Override
    public void execute() {
        HttpGet httpGet = new HttpGet( mUrl );
        addHeader( httpGet );
        try {
            mHttpClient.execute( httpGet, mResponse );
        } catch (IOException e) {
            mIHttpResponse.onFail();
        }
    }

    @Override
    public void setHttpResponse(IHttpResponse httpResponse) {
        mIHttpResponse = httpResponse;
    }

    /**
     * 添加请求头
     */
    private void addHeader(HttpGet httpGet) {
        Iterator<String> iterator = headerMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = headerMap.get( key );
            Log.i( TAG, " 请求头信息  " + key + "  value " + value );
            httpGet.addHeader( key, value );
        }
    }


    private class Response extends BasicResponseHandler {
        @Override
        public String handleResponse(HttpResponse response) throws IOException {
            int statusCode = response.getStatusLine().getStatusCode();
            //断点下载为206
            if (statusCode == 200||206==statusCode) {
                mIHttpResponse.onSuccess( response.getEntity() );
            } else {
                mIHttpResponse.onFail();
            }
            return null;

        }
    }



}
