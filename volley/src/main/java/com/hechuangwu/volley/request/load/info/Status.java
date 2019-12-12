package com.hechuangwu.volley.request.load.info;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public enum  Status {
    waiting(0),
    starting(1),
    downloading(2),
    pause(3),
    finish(4),
    failed(5);

    private int value;
    private Status(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
