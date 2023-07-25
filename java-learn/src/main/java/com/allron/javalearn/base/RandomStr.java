package com.allron.javalearn.base;

import java.util.Random;

/**
 * @author Allron
 * @date 2020/5/28
 */
public class RandomStr {

    public static void main(String[] args)
    {
        //定义一个空字符串
        String result = "";
        //进行6次循环
        for(int i = 0 ; i < 6 ; i ++)
        {
            //生成一个97～122之间的int类型整数
            int intVal = (int)(Math.random() * 26 + 97);
            //将intValue强制转换为char类型后连接到result后面
            result = result + (char)intVal;
        }
        //输出随机字符串
        System.out.println(result);

        int intValue = 97;
        char charValue = (char)intValue;
        System.out.println("" + charValue);
        System.out.println((int)(Math.random() * 26));
        Random random = new Random();
        System.out.println("整数随机数：" + random.nextInt());
    }
}
