package com.allron.javalearn.algorithm.csdn每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：给定一个字符串“today is a special day”,长度任意，要求找出其出现次数最多的字符及计算次数。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/19 16:01 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211019找出出现次数最多的字符并计算次数 {

    
}


class java_256052 {
    public static void main(String[] args) {
        String string = "Thinking in Java";
        char[] ch = string.toCharArray();
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < ch.length; i++) {
            if (result.containsKey(ch[i])) {
                int count = result.get(ch[i]) + 1;
                result.put(ch[i], count);
            } else {
                result.put(ch[i], 1);
            }
        }
        Character maxChar = null;
        Integer maxCount = 0;
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("字符: " + maxChar + " 出现的字数最多,为 " + maxCount + " 次");
    }
}
