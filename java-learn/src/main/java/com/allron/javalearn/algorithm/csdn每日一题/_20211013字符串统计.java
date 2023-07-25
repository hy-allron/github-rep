package com.allron.javalearn.algorithm.csdn每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 * 编写一个程序，对于输入的一段英语文本，可以统计：
 * 1、该文本中有多少英语单词；
 * 2、该文本中有多少不同的英语单词。
 * 如，输入 I am a good student. I am in Zhengzhou.
 * 则可以统计出有9个英语单词、7个不同的英语单词。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/13 18:23 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211013字符串统计 {
}


class Tee {
    public static String formatInput(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[.|;|\\?]", " ");
    }
    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        if (input == null || input.length() == 0) {
            return result;
        }
        String[] split = input.split(" ");
        if (split == null || split.length == 0) {
            return result;
        }
        for (String value : split) {
            if (result.containsKey(value)) {
                result.put(value, result.get(value) + 1);
            } else {
                result.put(value, 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String value = "I am a good student.I am in Zhengzhou.Ha?";
        String format = formatInput(value);
        System.out.println(format);
        Map<String, Integer> r = countWords(format);
        System.out.println(r.toString());
    }
}
