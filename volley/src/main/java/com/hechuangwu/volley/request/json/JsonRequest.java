package com.hechuangwu.volley.request.json;

import com.hechuangwu.volley.request.inter.IHttpResponse;
import com.hechuangwu.volley.request.inter.IHttpRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.Map;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能: 请求执行类
 */
public class JsonRequest implements IHttpRequest {
    private static final String TAG = JsonRequest.class.getSimpleName();
    private HttpClient mHttpClient = new DefaultHttpClient();
    private Response mResponse = new Response();
    private IHttpResponse mIHttpResponse;
    private String mUrl;
    private byte[] mRequestDate;

    @Override
    public void setUrl(String url) {
        mUrl=url;
    }

    @Override
    public void setRequestData(byte[] requestData) {
        mRequestDate = requestData;
    }

    /**
     * 执行请求
     */
    @Override
    public void execute() {
        HttpPost httpPost = new HttpPost( mUrl );
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(mRequestDate);
        httpPost.setEntity( byteArrayEntity );
        try {
            mHttpClient.execute( httpPost,mResponse );
        } catch (IOException e) {
            mIHttpResponse.onFail();
            e.printStackTrace();
        }
    }

    @Override
    public void setHttpResponse(IHttpResponse httpResponse) {
        mIHttpResponse = httpResponse;
    }

    /**
     * 请求返回
     */
    private class Response extends BasicResponseHandler {
        @Override
        public String handleResponse(HttpResponse response) throws IOException {
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                mIHttpResponse.onSuccess( response.getEntity() );
            } else {
                mIHttpResponse.onFail();
            }
            return null;

        }
    }


    @Override
    public void pause() {

    }

    @Override
    public Map<String, String> getHttpHeadMap() {
        return null;
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

}
