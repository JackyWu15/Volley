package com.hechuangwu.volley.http.helper;

import com.google.gson.Gson;
import com.hechuangwu.volley.http.helper.inter.IHttpRequest;
import com.hechuangwu.volley.http.helper.inter.IHttpResponse;

import java.io.UnsupportedEncodingException;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能: 任务
 */
public class HttpTask<T> implements Runnable{
    private static final String TAG = HttpTask.class.getSimpleName();
    private IHttpRequest mIHttpRequest;
    private Gson mGson = new Gson();

    public HttpTask(RequestBody<T> requestBody){
        mIHttpRequest = requestBody.getHttpRequest();
        IHttpResponse httpResponse = requestBody.getHttpResponse();

        mIHttpRequest.setHttpResponse( httpResponse );
        mIHttpRequest.setUrl( requestBody.getUrl() );

        //添加请求头
        httpResponse.addHttpHeader( mIHttpRequest.getHttpHeadMap() );

        String requestParams = mGson.toJson( requestBody.getRequestInfo() );
        try {
            mIHttpRequest.setRequestData( requestParams.getBytes("UTF-8") );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        mIHttpRequest.execute();
    }
}
