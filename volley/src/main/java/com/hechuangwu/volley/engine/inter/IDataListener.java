package com.hechuangwu.volley.engine.inter;

/**
 * Created by cwh on 2019/12/11 0011.
 * 功能: 响应数据
 */
public interface IDataListener<M> {
    void onSuccess(M m);
    void onFail();
}
