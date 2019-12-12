package com.hechuangwu.volley.request.load.inter;


import com.hechuangwu.volley.request.inter.IHttpRequest;
import com.hechuangwu.volley.request.inter.IHttpResponse;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public interface IDownResponse extends IHttpResponse {

    void httpService(IHttpRequest httpService);


    void  cancel();


    void  pause();
}
