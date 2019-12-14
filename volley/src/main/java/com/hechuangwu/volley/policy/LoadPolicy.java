package com.hechuangwu.volley.policy;

import com.hechuangwu.volley.engine.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public interface LoadPolicy {
    //对比优先级
    int compareTo(BitmapRequest request1, BitmapRequest request2);
}
