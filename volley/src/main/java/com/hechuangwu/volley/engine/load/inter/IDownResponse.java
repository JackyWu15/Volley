package com.hechuangwu.volley.engine.load.inter;


import com.hechuangwu.volley.engine.inter.IHttpRequest;
import com.hechuangwu.volley.engine.inter.IHttpResponse;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public interface IDownResponse extends IHttpResponse {

    void httpService(IHttpRequest httpService);


    void  cancel();


    void  pause();
}
