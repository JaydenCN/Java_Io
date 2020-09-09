package com.store.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.FileInputStream
      以内存为参照物：
        1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
        2、字节的方式，完成输入的操作，完成读的操作（硬盘——>内存）
        3、
 */
public class FileInputStreamStudy01 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("E:/hello.java");
            while (true){
                //返回读取的字节大小，一次度一个位置，指针挪一下。
               int readFile =  file.read();
               if (readFile == -1){
                   break;
               }
                System.out.println("ASCII 阿斯克码："+readFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
