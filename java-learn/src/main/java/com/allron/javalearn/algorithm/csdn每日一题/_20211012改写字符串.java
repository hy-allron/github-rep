package com.allron.javalearn.algorithm.csdn每日一题;

import java.util.Scanner;

/**
 * 描述：键盘录入一个字符串，将字符串中的大写改成小写，小写改成大写，数字改成*。例如heLLO123,输出后为HEllo*** <br>
 * 作者：allron <br>
 * 修改日期：2021/10/12 11:33 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211012改写字符串 {
    public static void main(String[] args) {
        String str = "";
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您想输入的字符串：");
        str = s.next();
        StringBuffer sb = new StringBuffer();
        int i;
        for (i = 0; i <= str.length() - 1; i++) {
            char ch;
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                // ASCII码 十进制
                ch = (char) (str.charAt(i) - 32);
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ch = (char) (str.charAt(i) + 32);
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ch = '*';
            } else {
                ch = str.charAt(i);
            }
            sb.append(ch);
        }
        String trStr = sb.toString();
        System.out.println(sb.toString());
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(('a' - 32));
        System.out.println((char) 65);
        System.out.println((char) ('a' - 32));
    }
}
