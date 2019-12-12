package com.hechuangwu.volley.request.load.info;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class Entity<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    public Entity() {}

    public T copy() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Object result = objectInputStream.readObject();
            return (T) result;
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException classNot) {
            classNot.printStackTrace();
        } finally {
            if(byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }

            if(objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }

        }

        return null;
    }

}
