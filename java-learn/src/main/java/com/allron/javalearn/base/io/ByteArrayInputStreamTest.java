package com.allron.javalearn.base.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 描述：ByteArrayInputStream可以在内存中模拟一个InputStream <br>
 * 作者：allron <br>
 * 修改日期：2021/11/11 15:32 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class ByteArrayInputStreamTest {
    public static void main(String[] args) throws IOException {
        method2();
    }
    
    private static void method1() throws IOException{
        byte[] data = { 72, 101, 108, 108, 111, 33 };
        try (InputStream input = new ByteArrayInputStream(data)) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println((char)n);
            }
        }
    }
    
    private static void method2() throws IOException {
        String s;
        try (InputStream input = new FileInputStream("C:\\Users\\Administrator\\Desktop\\run.png")) {
            int n;
            StringBuilder sb = new StringBuilder();
            while ((n = input.read()) != -1) {
                sb.append((char) n);
            }
            s = sb.toString();
        }
        System.out.println(s);
    }
}
