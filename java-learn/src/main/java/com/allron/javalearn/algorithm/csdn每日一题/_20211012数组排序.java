package com.allron.javalearn.algorithm.csdn每日一题;

import java.util.Arrays;

/**
 * 描述：编写一个JavaApplication程序,将随机生成的无序数组使用冒泡排序,将这个混乱的数组变成一个从小到大排列的有序的数组并输出。 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/12 11:24 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211012数组排序 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 5, 4};
        boolean flag = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1 - i; j++){
                if(numbers[j] > numbers[j+1]){
                    flag = false;
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
            if(flag){
                // 一次比较如果没发生交换操作则说明，数组已经是正序了，直接跳出循环
                break;
            }
        }
    }

}
