package com.hechuangwu.volley.engine.image.load;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.hechuangwu.volley.bitmap.BitmapDecoder;
import com.hechuangwu.volley.engine.image.BitmapRequest;
import com.hechuangwu.volley.util.ImageViewHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能: 网络下载
 */
class UrlLoader extends AbstractLoader {
    @Override
    protected Bitmap onLoad(final BitmapRequest request) {
        //下载
        downloadImgByUrl( request.getImageUri(), getCache( request.getImageUriMD5() ) );

        //解码器
        BitmapDecoder bitmapDecoder = new BitmapDecoder() {
            @Override
            public Bitmap decodeBitmapWithOption(BitmapFactory.Options options) {

                return BitmapFactory.decodeFile( getCache( request.getImageUriMD5() ).getAbsolutePath(), options );
            }
        };
        //开始解码
        return bitmapDecoder.decodeBitmap( ImageViewHelper.getWidth( request.getImageView() ), ImageViewHelper.getHeight( request.getImageView() ) );
    }




    public static boolean downloadImgByUrl(String urlStr, File file) {
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            URL url = new URL( urlStr );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            is = conn.getInputStream();
            fos = new FileOutputStream( file );
            byte[] buf = new byte[512];
            int len = 0;
            while ((len = is.read( buf )) != -1) {
                fos.write( buf, 0, len );
            }
            fos.flush();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
            }

            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
            }
        }

        return false;

    }

    private File getCache(String unipue) {
        File file = new File( Environment.getExternalStorageDirectory(), "ImageLoader" );
        if (!file.exists()) {
            file.mkdir();
        }
        return new File( file, unipue );
    }
}
