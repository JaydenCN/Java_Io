package com.store.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    FileInputStream其他常用方法：
        int available() 返回未读的字节数量 缺点：不适合太大的文件
        long skip()  跳过几个字节

 */
public class FileInputStreamStudy03 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/com/store/io/FileInputStreamStudy01.java");
            //返回未读的字节数量
            int allFile = file.available();
            //缺点：因为这里用到byte数组，其长度不能太大，所以不适合太大的文件
            byte[] by = new byte[allFile];
            System.out.println("总字节数量："+allFile);
            int all =file.read(by);
            System.out.println("本次读取字节数量："+all);
            System.out.println(new String(by));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
