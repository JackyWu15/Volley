package com.hechuangwu.volley.request.inter;

import java.util.Map;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能: 获取网络
 */
public interface IHttpRequest {

    /**
     * 设置url
     */
    void setUrl(String url);

    /**
     * 执行获取网络
     */
    void execute();

    /**
     * 设置处理接口
     */
    void setHttpResponse(IHttpResponse httpResponse);

    /**
     * 设置请求参数
     */
    void setRequestData(byte[] requestData);

    /**
     * 获取请求头
     */
    Map<String,String> getHttpHeadMap();


    void pause();

    boolean isPause();

    boolean cancel();

    boolean isCancel();
}
