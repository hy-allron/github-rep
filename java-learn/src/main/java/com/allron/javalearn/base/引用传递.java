package com.allron.javalearn.base;

/**
 * @date 19/7/22
 */
public class 引用传递 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = "hello";
        changeString(str);
        System.out.println(str);
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }

    public static void changeString(String str) {
        str = "world";
    }
}
