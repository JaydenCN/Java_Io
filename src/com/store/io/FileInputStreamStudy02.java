package com.store.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamStudy02 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            //相对路径 IDEA中是以工程名为跟目！(project名)
            file = new FileInputStream("src/com/store/io/FileInputStreamStudy01.java");
            // 创建一个byte字节数组
            byte[] by = new byte[100];
            int readFile = 0;
            //01程序的重载方法，该方法返回读到的字节数量，同时将读到的内容存到byte数组中
            while((readFile=file.read(by))!=-1){
                //将读到的内容转换成String，String(byte,转换起始位置,结束位置)其中<结束位置>为read(byte[])返回的读取数量
                System.out.print(new String(by,0,readFile));
            }
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
