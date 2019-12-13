package com.hechuangwu.volley;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.hechuangwu.volley.cache.DoubleCache;
import com.hechuangwu.volley.config.ImageConfig;
import com.hechuangwu.volley.model.News;
import com.hechuangwu.volley.policy.ReversePolicy;
import com.hechuangwu.volley.request.inter.IDataListener;
import com.hechuangwu.volley.request.load.DownloadManager;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.Collections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String url = "http://v.juhe.cn/toutiao/index?type=top&key=29da5e8be9ba88b932394b7261092f71";
    public static final String file = "https://05ca8257f7311d2e0d85bb77cc1965e0.dd.cdntips.com/imtt.dd.qq.com/16891/apk/574E6BE8FE169BBCD4C4633C50706231.apk?mkey=5ddf9292778be36d&f=1455&fsname=com.mojiebusiness.mobuz_3.0.001_64.apk&csr=1bbd&cip=119.139.197.152&proto=https";
    private ImageLoader mImageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        //        request();
        image();
    }


    private void image() {
        setContentView( R.layout.activity_list );
        findViewById( R.id.bt_load ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RecyclerView recyclerView = findViewById( R.id.rl );
                recyclerView.setLayoutManager( new GridLayoutManager( MainActivity.this, 3, GridLayoutManager.VERTICAL, false ) );
                mImageLoader = ImageLoader.getInstance(
                        new ImageConfig.Builder()
                                .threadCount( 3 ) //线程数量
                                .loadPolicy( new ReversePolicy() ) //加载策略
                                .cache( new DoubleCache( MainActivity.this ) ) //缓存策略
                                .loadingPlaceHolder( R.drawable.loading )
                                .errorPlaceHolder( R.drawable.error )
                                .build());

                CommonAdapter commonAdapter = new CommonAdapter<String>( MainActivity.this, R.layout.item_list, getData() ) {
                    @Override
                    protected void convert(ViewHolder holder,  String imageUrl, final int position) {
                        mImageLoader.display( ((ImageView)holder.getView( R.id.image )), imageUrl );
                    }
                };
                recyclerView.setAdapter( commonAdapter );
            }
        } );

    }

    public final static String[] imageThumbUrls = new String[]{
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/pPEfy3NmdyAv9Ask.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/SqMQeKCtFw3kLZxk.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/tZAvJZdLfpAvPpUz.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/wxfaqLVdHQmknGat.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/yQL7MMOG7WtL9Db2.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/wlPmhNiIrC.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/cZXax35TaMa8IjWl.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/4aTIbvxk8F8mVLuw.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/vxKM8h8Hx2wWx3xW.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/pPEfy3NmdyAv9Ask.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/SqMQeKCtFw3kLZxk.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/tZAvJZdLfpAvPpUz.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/wxfaqLVdHQmknGat.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/yQL7MMOG7WtL9Db2.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/wlPmhNiIrC.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/cZXax35TaMa8IjWl.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/4aTIbvxk8F8mVLuw.jpg",
            "http://mobuz-live.oss-cn-hangzhou.aliyuncs.com/edu/vxKM8h8Hx2wWx3xW.jpg",
    };

    public static ArrayList<String> getData(){
        ArrayList arrayList = new ArrayList(  );
        for (int i = 0; i < 10; i++) {
            Collections.addAll( arrayList, imageThumbUrls );
        }
        return arrayList;
    }



    private void request() {
        setContentView( R.layout.activity_main );
        findViewById( R.id.bt_json ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Volley.sendRequest( url, null, News.class, new IDataListener<News>() {
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
                downloadManager.down( file, "yueqishe.apk" );
            }
        } );


    }

}
