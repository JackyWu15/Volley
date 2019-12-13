package com.hechuangwu.volley.policy;

import com.hechuangwu.volley.request.image.BitmapRequest;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class SerialPolicy implements LoadPolicy {
    @Override
    public int compareTo(BitmapRequest request1, BitmapRequest request2) {
        return request1.getSerialNO()-request2.getSerialNO();
    }
}
