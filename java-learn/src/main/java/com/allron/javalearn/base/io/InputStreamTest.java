package com.allron.javalearn.base.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 描述：TODO <br>
 * 作者：allron <br>
 * 修改日期：2021/11/11 14:29 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        method1();
    }

    /**
     * 一次读取一个字节
     */
    private static void method1() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.txt")) {
            int i = 0;
            for (; ; ) {
                int n = fileInputStream.read(); // 反复调用read()方法，直到返回-1
                if (n == -1) {
                    break;
                }
                System.out.println("第" + (++i) + "个字节：" + (char)n); // 打印byte的值
            }
        }
    }

    /**
     * 使用缓冲区，一次读取指定大小字节
     * @throws IOException
     */
    private static void method2() throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.txt")){
            // 定义1000个字节大小的缓冲区:
            byte[] buffer = new byte[100];
            int n;
            int i = 0;
            while ((n = fileInputStream.read(buffer)) != -1) { // 读取到缓冲区
                System.out.println("遍历次数：" + (++i));
                System.out.println("read " + n + " bytes.");
            }
        }
    }
}