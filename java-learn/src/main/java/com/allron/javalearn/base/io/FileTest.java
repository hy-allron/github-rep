package com.allron.javalearn.base.io;

import java.io.File;

/**
 * 描述：请利用File对象列出指定目录下的所有子目录和文件，并按层次打印。 <br>
 * 例如，输出：
 * Documents/
 *   word/
 *     1.docx
 *     2.docx
 *     work/
 *       abc.doc
 *   ppt/
 *   other/
 * 
 * 作者：allron <br>
 * 修改日期：2021/11/12 11:35 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop");
        if(file.isDirectory()){
            File[] listFiles = file.listFiles();
            printFiles(listFiles, 0);
        }else{
            System.out.println(file.getName());
        }
        
    }
    
    private static void printFiles(File[] listFiles, int count){
        String space = "";
        // 子集空格
        if(count > 0){
            for(int i = 0;i<count;i++){
                space = space + " ";
            }
        }
        for (File listFile : listFiles) {
            if(listFile.isFile()){
                System.out.println(space + listFile.getName());
            }else{
                System.out.println(space + "/" + listFile.getName());
                printFiles(listFile.listFiles(), ++count);
            }
        }
    }
}
