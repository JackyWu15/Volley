package com.hechuangwu.volley.http.helper.download.inter;


import com.hechuangwu.volley.http.helper.inter.IHttpRequest;
import com.hechuangwu.volley.http.helper.inter.IHttpResponse;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public interface IDownResponse extends IHttpResponse {

    void httpService(IHttpRequest httpService);


    void  cancel();


    void  pause();
}
