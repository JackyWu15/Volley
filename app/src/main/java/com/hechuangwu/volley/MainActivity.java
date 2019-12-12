package com.hechuangwu.volley;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hechuangwu.volley.http.Volley;
import com.hechuangwu.volley.http.helper.download.DownloadManager;
import com.hechuangwu.volley.http.helper.inter.IDataListener;
import com.hechuangwu.volley.http.model.News;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String url = "http://v.juhe.cn/toutiao/index?type=top&key=29da5e8be9ba88b932394b7261092f71";
    public static final String file = "https://05ca8257f7311d2e0d85bb77cc1965e0.dd.cdntips.com/imtt.dd.qq.com/16891/apk/574E6BE8FE169BBCD4C4633C50706231.apk?mkey=5ddf9292778be36d&f=1455&fsname=com.mojiebusiness.mobuz_3.0.001_64.apk&csr=1bbd&cip=119.139.197.152&proto=https";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        findViewById( R.id.bt_json ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Volley.sendRequest( url,null,  News.class, new IDataListener<News>() {
                    @Override
                    public void onSuccess(News news) {
                        Log.i( TAG, news.toString() );
                    }

                    @Override
                    public void onFail() {
                        Log.i( TAG, "onFail:>>>" );
                    }
                } );
            }
        } );


        findViewById( R.id.bt_download ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager downloadManager = new DownloadManager();
                downloadManager.down( file ,"yueqishe.apk");
            }
        } );

    }

}
