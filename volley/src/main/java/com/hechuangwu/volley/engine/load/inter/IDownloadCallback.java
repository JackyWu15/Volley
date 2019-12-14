package com.hechuangwu.volley.engine.load.inter;

import com.hechuangwu.volley.engine.load.info.Item;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public interface IDownloadCallback {

    void onDownloadStatusChanged(Item item);

    void onTotalLengthReceived(Item item);

    void onCurrentSizeChanged(Item item, double length, long speed);

    void onDownloadSuccess(Item item);

    void onDownloadPause(Item item);

    void onDownloadError(Item item, int var2, String var3);
}
