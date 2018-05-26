package com.run.practice.suggest151.utils;

import java.io.*;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class SerializationUtils {
    private static String FILE_NAME = "d:/obj.bin";

    // 序列化
    public static void writeObject(Serializable s) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(s);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject() {
        Object obj = null;
        // 反序列化
        try {
            ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME));
            obj = input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
