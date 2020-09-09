package com.store.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamStudy01 {
    public static void main(String[] args) {
        FileOutputStream file = null;
        try {
            //下面的方式会把文件内容全部清空再写入！
            //file = new FileOutputStream("myfile");

            //构造方法 new FileOutputStream("myfile",true); true在文件末尾追加的方式写入
            file = new FileOutputStream("myfile",true);
            byte[] bytes = {97,98,99,100};

            //将数组的内容全部写出
            file.write(bytes);
            //将数组内容部分写出
            file.write(bytes,0,2);
            //将字符串转换成byte数组
            String name = "我是一个中国人我骄傲！";
            byte[] by = name.getBytes();
            file.write(by);
            //写完之后刷新
            file.flush();
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
