package com.store.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy01 {
    /*
    使用FileInputStream 和 FileOutPutStream 实现文件的Copy
    Copy过程应该是一边读一边写
    使用以上的字节流拷贝文件时，文件的类型随意，万能的
     */
    public static void main(String[] args) {
        //输入流 从硬盘到内存
        FileInputStream fileInput = null;
        //输出流 从内存到硬盘
        FileOutputStream fileOutPut = null;

        try {
            //创建一个输入流对象
            fileInput = new FileInputStream("E:\\壁纸\\88f667c9e073f84d89fb8b5a3eea6531.jpg");
            //创建一个输出流对象
            fileOutPut = new FileOutputStream("E:\\a.jpg");
            //最核心的：一边读一边写！
            byte[] byteCopy = new byte[1024 * 1024]; //(一次最多拷贝1M)
            int readCount = 0 ;
            while ((readCount = fileInput.read(byteCopy))!= -1){
                fileOutPut.write(byteCopy,0,readCount);
            }
            //最后要刷新输出流对象
            fileOutPut.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭输入流
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭输出流
            if (fileOutPut != null) {
                try {
                    fileOutPut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //创建一个输出流对象

    }
}
