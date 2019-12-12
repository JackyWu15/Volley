package com.hechuangwu.volley.request.inter;

import org.apache.http.HttpEntity;

import java.util.Map;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能: 处理回调
 */
public interface IHttpResponse {

    void onSuccess(HttpEntity httpEntity);

    void onFail();

    void addHttpHeader(Map<String,String> headerMap);
}
