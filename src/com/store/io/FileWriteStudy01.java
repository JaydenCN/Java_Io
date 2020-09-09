package com.store.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteStudy01 {
    /*
    FileWrite 文件字符输出流 只能输出普通文本
     */
    public static void main(String[] args) {
        FileWriter file = null ;
        try {
            //每次写入清空文件
            //file = new FileWriter("myfile");
            //每次写入在末尾追加
            file = new FileWriter("myfile",true);
            String n = "我爱Java";
            char[]  chars = {'我','是','中','国','人','！'};
            file.write(chars);
            file.write(chars,0,2);
            file.write(n);
            file.write("\n");
            file.write("我是一名Java工程师");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
