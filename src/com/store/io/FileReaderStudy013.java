package com.store.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderStudy013 {
    /*
    FileReader 文件字符输入流，用于文本读取，一次一个字符
     */
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("myfile");
            char[] chars = new char[4];
            int readCount = 0;
            while( (readCount = file.read(chars))!=-1 ){
                System.out.println(new String(chars,0,readCount));
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
