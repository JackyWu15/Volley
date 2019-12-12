package com.hechuangwu.volley.http.helper.download.info;

import com.hechuangwu.volley.http.helper.HttpTask;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class Item extends Entity<Item>{

    private long currentLength;

    private long totalLength;

    private String url ;

    private String filePath;

    private Status status;

    private  transient HttpTask httpTask;

    public HttpTask getHttpTask() {
        return httpTask;
    }

    public void setHttpTask(HttpTask httpTask) {
        this.httpTask = httpTask;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Item(String url, String filePath) {
        this.url = url;
        this.filePath = filePath;
    }


    public long getCurrentLength() {
        return currentLength;
    }

    public void setCurrentLength(long currentLength) {
        this.currentLength = currentLength;
    }

    public long getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(long totalLength) {
        this.totalLength = totalLength;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
