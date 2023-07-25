package com.allron.javalearn.base.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出流
 *
 * @author allron
 * @date 2023/6/28 14:29
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException {
        try(FileOutputStream outputStream = new FileOutputStream("C:\\Users\\hyshi\\Desktop\\temp.txt")){
            String text = "hello";
            outputStream.write(text.getBytes());
        }
    }
}
