package com.hechuangwu.volley.http;

import com.hechuangwu.volley.http.helper.HttpTask;
import com.hechuangwu.volley.http.helper.json.JsonResponse;
import com.hechuangwu.volley.http.helper.json.JsonRequest;
import com.hechuangwu.volley.http.helper.RequestBody;
import com.hechuangwu.volley.http.helper.ThreadPool;
import com.hechuangwu.volley.http.helper.inter.IDataListener;
import com.hechuangwu.volley.http.helper.inter.IHttpResponse;
import com.hechuangwu.volley.http.helper.inter.IHttpRequest;

import java.util.concurrent.FutureTask;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能:
 */
public class Volley {
    private static final String TAG = Volley.class.getSimpleName();

    /**
     * @param <T> 请求参数
     * @param <M> 返回参数
     */
    public static <T,M> void sendRequest(String url,T requestInfo, Class<M> responseInfo, IDataListener<M> dataListener){
        RequestBody<T> requestBody = new RequestBody<>();
        requestBody.setUrl( url );
        requestBody.setRequestInfo( requestInfo );


        IHttpRequest request = new JsonRequest();
        requestBody.setHttpRequest( request );


        IHttpResponse response = new JsonResponse<>( dataListener, responseInfo );
        requestBody.setHttpResponse( response );

        HttpTask<T> httpTask = new HttpTask<>( requestBody );

        try {
            FutureTask<Object> objectFutureTask = new FutureTask<>( httpTask, null );
            ThreadPool.getInstance().execute( objectFutureTask );
        } catch (InterruptedException e) {
            dataListener.onFail();
        }

    }


}
