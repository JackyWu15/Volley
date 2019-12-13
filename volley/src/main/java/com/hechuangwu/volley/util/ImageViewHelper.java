package com.hechuangwu.volley.util;

import android.view.ViewGroup;
import android.widget.ImageView;

import java.lang.reflect.Field;

/**
 * Created by cwh on 2019/12/13 0013.
 * 功能:
 */
public class ImageViewHelper {
    //默认的图片宽高
    private static int DEFAULT_WIDTH = 200;
    private static int DEFAULT_HEIGHT = 200;

    public static int getWidth(ImageView imageView){
        if(imageView != null){
            ViewGroup.LayoutParams params = imageView.getLayoutParams();

            int width = 0;
            if(params != null && params.width != ViewGroup.LayoutParams.WRAP_CONTENT){
                width = imageView.getWidth();
            }

            if(width <= 0 && params != null){
                width = params.width;
            }

            if(width <= 0){
                width = getImageViewFieldValue(imageView,"mMaxWidth");
            }
            return width;
        }

        return DEFAULT_WIDTH;
    }

    public static int getHeight(ImageView imageView){
        if(imageView != null){
            ViewGroup.LayoutParams params = imageView.getLayoutParams();
            int height = 0;
            if(params != null && params.height != ViewGroup.LayoutParams.WRAP_CONTENT){
                height = imageView.getWidth();
            }

            if(height <= 0 && params != null){
                height = params.height;
            }

            if(height <= 0){
                height = getImageViewFieldValue(imageView,"mMaxHeight");
            }
            return height;
        }

        return DEFAULT_HEIGHT;
    }

    private static int getImageViewFieldValue(ImageView imageView,String fieldName) {
        try {
            Field field = ImageView.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            int fieldValue = (Integer)field.get(imageView);
            if(fieldValue > 0 && fieldValue < Integer.MAX_VALUE){
                return fieldValue;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
