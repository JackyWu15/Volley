package com.hechuangwu.volley.engine;

import com.hechuangwu.volley.engine.inter.IHttpResponse;
import com.hechuangwu.volley.engine.inter.IHttpRequest;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能: 请求体封装
 */
public class RequestBody<T> {

    private IHttpRequest httpRequest;
    /**
     * 获取数据  回调结果的类
     */
    private IHttpResponse httpResponse;
    /**
     * 请求参数对应的实体
     */
    private T requestInfo;

    private String url;

    public IHttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(IHttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public IHttpResponse getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(IHttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }

    public T getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(T requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
