package com.store.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy02 {
    /*
    利用FileReder 和 FileWrite实现 普通文本 的Copy
    此方法只能用于 普通文本
     */
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            //创建输入流
            fileReader = new FileReader("src\\com\\store\\io\\FileCopy01.java");
            //创建输出流
            fileWriter = new FileWriter("FileCopy01.java");
            //媒介 每次读取八个字符
            char[] chars = new char[8];
            int readCount = 0;
            while ( (readCount = fileReader.read(chars)) != -1){
                fileWriter.write(chars,0,readCount);
            }
            //刷新写入流/输出流
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
